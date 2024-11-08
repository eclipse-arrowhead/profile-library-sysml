package deployment.systems.generator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import common.dto.APXInterfaceDesignDescription;
import common.parsing.workspace.ParsingUtils;
import common.utils.CodgenUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.lang.model.element.Modifier;

/**
 *
 * Generate simple class with constructor, getters, setters and toString methods
 *
 * @author cripan
 * 
 */
public class DTOBuilder {

	// =================================================================================================
	// attributes

	private String directory = "";
	private String system = "";
	private String foldername = "";

	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	/**
	 * Build simple constructor method
	 * 
	 * @return Constructor object
	 */
	public MethodSpec constructor() {
		MethodSpec consructor = MethodSpec.constructorBuilder().addModifiers(Modifier.PUBLIC).build();
		return consructor;
	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * Build full constructor method
	 * 
	 * @param payload List of attributes of the class
	 * @param className Name of the class
	 * @return Constructor object
	 */
	public MethodSpec fullConstructor(ArrayList<APXInterfaceDesignDescription.APXServiceDescription.APXPayload> payload, String className) {

		MethodSpec.Builder fullConstructor = MethodSpec.constructorBuilder().addModifiers(Modifier.PUBLIC);

		for (APXInterfaceDesignDescription.APXServiceDescription.APXPayload element : payload) {
			String name = element.getName();
			String type = element.getType();

			fullConstructor.addParameter(CodgenUtil.getType(type), name).addStatement("this.$N = $N", name, name);
			
			/*
			if (name.equals("Newclass")) { // TODO Check what this is
				var.add(new String[] {name, type});
				if (type.equalsIgnoreCase("single") || type.startsWith("List")) {
					TypeName t = CodgenUtil.getComplexType(name, type);
					fullConstructor.addParameter(t, name).addStatement("this.$N = $N", name, name);
				} else
					fullConstructor.addParameter(CodgenUtil.getType(type), name).addStatement("this.$N = $N", name, name);
				
			} else if (!name.equals("child") && !name.equals("child:Newclass") && !name.equals("StopClass")) {
				var.add(new String[] {name, type});
				fullConstructor.addParameter(CodgenUtil.getType(type), name).addStatement("this.$N = $N", name, name);
			}
			*/
		}

		return fullConstructor.build();
	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * Build get method
	 * 
	 * @param name Name of the attribute
	 * @param type Type of the attribute (single/List)
	 * @return Get method object
	 */
	public MethodSpec get(String name, String type) {

		// Add method definition
		MethodSpec.Builder get = MethodSpec.methodBuilder("get" + name).addModifiers(Modifier.PUBLIC);

		// Add return type
		if (type.equalsIgnoreCase("single") || type.startsWith("List"))
			get.returns(CodgenUtil.getComplexType(name, type)).addStatement("return " + name);
		else
			get.returns(CodgenUtil.getType(type)).addStatement("return " + name);

		return get.build();
	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Build toString operation
	 * 
	 * @param payload Class attributes
	 * @return ToString method object
	 */
	public MethodSpec toString(ArrayList<APXInterfaceDesignDescription.APXServiceDescription.APXPayload> payload) {

		String s = "";

		// Build method content
		for (APXInterfaceDesignDescription.APXServiceDescription.APXPayload element : payload) {
			s = s + "+ \"" + element.getName() + "=\" + " + element.getName();
			
			/*
			if (name.equals("Newclass")) {
				name = element.getType();
				S = S + "+ \"" + name + "=\" + " + name;
			} else if (!name.equals("child") && !name.equals("child:Newclass") && !name.equals("StopClass")) {
				S = S + "+ \"" + name + "=\" + " + name + "+ \",  \"";
			}
			*/
		}

		// Add annotations and return type
		MethodSpec toString = MethodSpec.methodBuilder("toString").addModifiers(Modifier.PUBLIC).addAnnotation(Override.class)
				.returns(String.class).addStatement("return \"ProviderPayload{\" $L +\"}\"", s).build();

		return toString;
	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Build set method
	 * 
	 * @param name Name of the attribute
	 * @param type Type of the attribute
	 * @return Set method object
	 */
	public MethodSpec set(String name, String type) {

		// Add method definition
		MethodSpec.Builder set = MethodSpec.methodBuilder("set" + name).addModifiers(Modifier.PUBLIC);

		// Add assign sentences
		if (type.equalsIgnoreCase("single") || type.startsWith("List"))
			set.addParameter(CodgenUtil.getComplexType(name, type), name).addStatement("this." + name + "=" + name);
		else
			set.addParameter(CodgenUtil.getType(type), name).addStatement("this." + name + "=" + name);

		return set.build();
	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Generate simple class with constructor, getters, setters and toString methods
	 * 
	 * @param payload List of payload elements
	 * @param className Name of the class
	 * @param workspace Path of the file
	 * @param localCloud Name of the folder
	 * @param systemType Name of the system
	 * @return
	 */
	public void classGen(ArrayList<APXInterfaceDesignDescription.APXServiceDescription.APXPayload> payload, String className, String workspace, String localCloud, String systemType) {

		directory = workspace;
		foldername = localCloud;
		system = systemType;

		String ClassName = className.substring(0, 1).toUpperCase() + className.substring(1, className.length());

		MethodSpec constructor = constructor(); // Generate simple constructor
		MethodSpec fullConstructor = fullConstructor(payload, ClassName); // Generate full constructor
		MethodSpec toString = toString(payload); // Generate toString

		AnnotationSpec jackson = AnnotationSpec.builder(JsonIgnoreProperties.class).addMember("ignoreUnknown", "true").build();
		
		// Add generated methods
		TypeSpec.Builder builder = TypeSpec.classBuilder(ClassName).addModifiers(Modifier.PUBLIC).addAnnotation(jackson)
				.addMethod(constructor).addMethod(fullConstructor).addMethod(toString);

		for (APXInterfaceDesignDescription.APXServiceDescription.APXPayload element : payload) { // For each of the elements of the payload
			String name = element.getName();
			String type = element.getType();

			MethodSpec methodget = get(name, type); // Generate getter method
			MethodSpec methodset = set(name, type); // Generate setter method
			
			builder.addField(CodgenUtil.getType(type), name, Modifier.PRIVATE).addMethod(methodget).addMethod(methodset);
			
			/*
			if (name.equals("Newclass")) {
				name = payload.get(i)[1];
				type = payload.get(i)[2];

				MethodSpec methodget = get(name, type); // Generate getter method
				MethodSpec methodset = set(name, type); // Generate setter method
				
				// Add generated methods
				if (type.equalsIgnoreCase("single") || type.startsWith("List")) {
					TypeName t = CodgenUtil.getComplexType(name, type);
					BclassGen.addField(t, name, Modifier.PRIVATE).addMethod(methodget).addMethod(methodset);
				} else {
					Type T = CodgenUtil.getType(type);
					BclassGen.addField(T, name, Modifier.PRIVATE).addMethod(methodget).addMethod(methodset);
				}

			} else if (!name.equals("child") && !name.equals("child:Newclass") && !name.equals("StopClass")) {
				MethodSpec methodget = get(name, type); // Generate  getter method for attribute
				MethodSpec methodset = set(name, type); // Generate setter method for attribute
				
				// Add generated methods
				Type T = CodgenUtil.getType(type);
				BclassGen.addField(T, name, Modifier.PRIVATE).addMethod(methodget).addMethod(methodset);
			}
			*/
		}

		// Create and write the new class
		TypeSpec typeSpec = builder.build();
		String packageName = "eu.arrowhead." + system.split("-")[system.split("-").length - 1] + ".dto";
		JavaFile javaFile = JavaFile.builder(packageName, typeSpec).addFileComment("Auto generated").build();
		
		try {
			javaFile.writeTo(Paths.get(directory + File.separator +"arrowhead" + File.separator + foldername + File.separator + "cloud-systems" + File.separator +  ParsingUtils.toKebabCase(system) + File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator ));
		} catch (IOException ex) {
			System.err.print("ERROR:" + ex.getMessage());
		}
	}

	
	// =================================================================================================
	// auxiliary methods

	// -------------------------------------------------------------------------------------------------
	public DTOBuilder() { }
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * Generate dummy object definition
	 * 
	 * @param name Name of the object
	 * @param var List of attributes of the object
	 * @return A string with the definition of the object
	 */
	public String objectGen(String name, ArrayList<APXInterfaceDesignDescription.APXServiceDescription.APXPayload> payload) {

		String s = "" + name + " OBJ" + name + " = new " + name + "( ";
		boolean isList = false;
		int index = 0;
		int listIndex = 0;
		
		for (APXInterfaceDesignDescription.APXServiceDescription.APXPayload element : payload) {
			isList = element.getType().startsWith("List");
			
			if (element.getType().equalsIgnoreCase("String"))
				s = s + " \"" + element.getName() + "\"";
			else if (element.getType().equalsIgnoreCase("Double") || element.getType().equalsIgnoreCase("Float"))
				s = s + "" + 0.0 + "";
			else if (element.getType().equalsIgnoreCase("Integer") || element.getType().equalsIgnoreCase("Short") || element.getType().equalsIgnoreCase("Long"))
				s = s + "" + 0 + "";
			else if (element.getType().equalsIgnoreCase("Boolean"))
				s = s + "" + true + "";
			else if (isList) {
				s = s + "ListObject";
				listIndex = index;
			}
			else
				s = s + "OBJ" + element.getName() + "";

			if ((index + 1) < payload.size())
				s = s + " , ";
			
			index++;
		}
		s = s + ")";

		if (isList)
			s = "List<" + payload.get(listIndex).getName() + "> ListObject=new ArrayList<>(); \n ListObject.add(OBJ" + payload.get(listIndex).getName() + "); \n" + s;
		
		return s;
	}
	
}
