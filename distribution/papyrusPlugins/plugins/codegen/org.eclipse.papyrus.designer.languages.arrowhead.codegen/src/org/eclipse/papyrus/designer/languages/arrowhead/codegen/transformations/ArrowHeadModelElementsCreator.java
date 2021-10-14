/*******************************************************************************
 * Copyright (c) 2021 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *    Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr
 *    Fadwa Tmar (CEA LIST) fadwa.tmar@cea.fr 
 *    HUANG Yining (CEA LIST) yining.huang@cea.fr
 *******************************************************************************/

package org.eclipse.papyrus.designer.languages.arrowhead.codegen.transformations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription;
import org.eclipse.papyrus.designer.languages.arrowhead.codegen.xtend.*;
import org.eclipse.papyrus.designer.languages.common.base.HierarchyLocationStrategy;
import org.eclipse.papyrus.designer.languages.common.base.ModelElementsCreator;
import org.eclipse.papyrus.designer.languages.common.base.file.FileSystemAccessFactory;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class ArrowHeadModelElementsCreator extends ModelElementsCreator {

	private static final String OPENAPI_LANG = "yaml";
	public static Set<Classifier> systems = new HashSet<>();

	protected String yamlExt;
	protected String jsonExt;

	/**
	 * Constructor
	 * 
	 * @param project
	 * 
	 *                The project in which the generated code should be placed.
	 */

	public ArrowHeadModelElementsCreator(IProject project) {
		this(project, OPENAPI_LANG);
	}

	public ArrowHeadModelElementsCreator(IProject project, String language) {
		super(FileSystemAccessFactory.create(project, "openapi-gen"), new HierarchyLocationStrategy(), language);
		this.project = project;
		yamlExt = "yaml";
		jsonExt = "json";
	}

	@Override
	protected void createPackageableElementFile(PackageableElement packageableElement, IProgressMonitor monitor) {
		if (packageableElement instanceof Classifier) {
			Classifier classifier = (Classifier) packageableElement;

			if (classifier instanceof Class) {

				LocalCLoudDesignDescription lc = UMLUtil.getStereotypeApplication(classifier, LocalCLoudDesignDescription.class);
				if (lc != null) {
					
					JsonResult jsonResult = new JsonResult();
					String arguments = "lang=fr";	
					jsonResult.setArguments(arguments);
					
					EList<Property> system_parts = classifier.getAllAttributes();

					// 1. Generate a JSON file to configure Studio4Education

					// String jsonresult = "{ "; //$NON-NLS-1$
					// Set comment description property for each block
					for (Property system_part : system_parts) {
						//DeployedEntity depSys = UMLUtil.getStereotypeApplication(system_part, DeployedEntity.class);
						//if (depSys != null) {
							//String id = depSys.getIdentifier();
							// We use the name as id of the deployed system
						    String id = system_part.getName();
							String name = system_part.getName();
							String description = "";
							for (Iterator<Comment> iterator = system_part.getOwnedComments().iterator(); iterator.hasNext();) {
								
								Comment comment = iterator.next();
								description += comment.getBody();
							}
														
							JsonComponent comp = new JsonComponent();
							if (id != null && id.length() > 0) {
									comp.setId(id);
							}
							if (name != null && name.length() > 0) {
									comp.setName(name);
									//System.err.println(comp.toString());
							}
							comp.setDescription(description);
							// Set levels property for each block
							String levels = "1";
							comp.setLevels(levels);
							
							jsonResult.getJsonComponents().add(comp);
						//}
					}

					String jsonfileName = "";
					if (classifier.getName() != null) {

						jsonfileName = classifier.getName().replace(" ", "") + "ST4Econfig." + jsonExt;
					} else
						jsonfileName = "ST4Econfig." + jsonExt;
					
					
					//System.out.println(idlist.toString());
					String finalResult = new Gson().toJson(jsonResult);
					GsonBuilder builder = new GsonBuilder();
				    builder.disableHtmlEscaping();
				    builder.setPrettyPrinting();
					Gson gsonPrettyPrinting = builder.create();
					JsonParser jsonParser = new JsonParser();
					JsonElement jsonElement = jsonParser.parse(finalResult);
					String prettyJsonString = gsonPrettyPrinting.toJson(jsonElement);

					fileSystemAccess.generateFile(jsonfileName, prettyJsonString);

					// 2. Generate opeanapi files
					for (Property system_part : system_parts) {
						// DeployedSystem depSys = UMLUtil.getStereotypeApplication(system_part,
						// DeployedSystem.class);

						// TODO get address and port values
						Classifier system = (Classifier) system_part.getType();
						EList<Property> atts = system.getAttributes();
						boolean isService = false;
						boolean isClient = false;
						if (systems.add(system)) {
							for (Property att : atts) {
								if (att instanceof Port) {
									if (!((Port) att).isConjugated()) {
										isService = true;
									} else {
										/*
										 * final String fileNameAH = locStrategy.getFolder((NamedElement) att)+
										 * att.getType().getName() + "_client." + yamlExt; //$NON-NLS-1$ String result =
										 * ""; //$NON-NLS-1$ result = OpenAPIGenerator.generateOpenAPIClientyaml((Class)
										 * system,(Class)att.getType()).toString();
										 * fileSystemAccess.generateFile(fileNameAH, result);
										 */
										isClient = true;
									}
								}
							}
							if (isService) {
								final String fileNameAH = locStrategy.getFileName((NamedElement) system) + "_service." //$NON-NLS-1$
										+ yamlExt;
								String result = ""; //$NON-NLS-1$
								result = OpenAPIGenerator.generateOpenAPIyaml((Class) system).toString();
								//
								fileSystemAccess.generateFile(fileNameAH, result);
							}
							if (isClient) {
								final String fileNameAH = locStrategy.getFileName((NamedElement) system) + "_client." //$NON-NLS-1$
										+ yamlExt;
								String result = ""; //$NON-NLS-1$
								result = OpenAPIGenerator.generateOpenAPIClientyaml((Class) system).toString();
								fileSystemAccess.generateFile(fileNameAH, result);
							}
						}
					}
				}

			}

		}
	}

	@Override
	protected boolean noCodeGen(Element element) {
		return false;
	}
	public class JsonResult {
		private String arguments;
		private List<JsonComponent> jsonComponents = new ArrayList<JsonComponent>();
		public String getArguments() {
			return arguments;
		}
		public void setArguments(String arguments) {
			this.arguments = arguments;
		}
		public List<JsonComponent> getJsonComponents() {
			return jsonComponents;
		}
		public void setJsonComponents(List<JsonComponent> jsonComponents) {
			this.jsonComponents = jsonComponents;
		}
	}
	
	public class JsonComponent {
		private String id;
		private String name;
		private String description;
		private String levels;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLevels() {
			return levels;
		}

		public void setLevels(String levels) {
			this.levels = levels;
		}

	}
}
