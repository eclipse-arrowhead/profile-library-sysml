package common.utils;
/*
 *  Copyright (c) 2018 AITIA International Inc.
 *
 *  This work is part of the Productive 4.0 innovation project, which receives grants from the
 *  European Commissions H2020 research and innovation programme, ECSEL Joint Undertaking
 *  (project no. 737459), the free state of Saxony, the German Federal Ministry of Education and
 *  national funding authorities from involved countries.
 */



import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Properties;
import java.util.ServiceConfigurationError;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;

/**
 * Utils for reading and parsing files and class types
 * 
 * @author AITIA International Inc.
 *
 */
public final class CodgenUtil {

	// =================================================================================================
	// methods

	private CodgenUtil() throws AssertionError {
		throw new AssertionError("Arrowhead Common: Utility is a non-instantiable class");
	}

	//-------------------------------------------------------------------------------------------------
	/**
	 * Reads the workspace configuration properties
	 * 
	 * @param fileName The name of the configuration file
	 * @return A properties object with the parsed information
	 */
	public static Properties getProperties(String fileName) {
		Properties prop = new Properties();
		try {
			IPath path = ResourcesPlugin.getWorkspace().getRoot().getLocation();
			String workspacePath = path.toString();
			File file = new File(workspacePath + File.separator + ".config" + File.separator + fileName);
			FileInputStream inputStream = new FileInputStream(file);
			prop.load(inputStream);
		} catch (FileNotFoundException ex) {
			throw new ServiceConfigurationError(fileName
					+ " file not found, make sure you have the correct working directory set! (directory where the config folder can be found)",
					ex);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return prop;
	}
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Get the class type based on the string value
	 * 
	 * @param type The type of the object
	 * @return The class of the object
	 */
	public static Type getType(String type) {
		Type t;

		if (type.equalsIgnoreCase("String"))
			t = String.class;
		else if (type.equalsIgnoreCase("Boolean"))
			t = Boolean.class;
		else if (type.equalsIgnoreCase("Integer") || type.equalsIgnoreCase("int"))
			t = int.class;
		else if (type.equalsIgnoreCase("Byte"))
			t = Byte.class;
		else if (type.equalsIgnoreCase("Double"))
			t = double.class;
		else if (type.equalsIgnoreCase("Float") || type.equalsIgnoreCase("Real"))
			t = float.class;
		else if (type.equalsIgnoreCase("Short"))
			t = short.class;
		else if (type.equalsIgnoreCase("Long"))
			t = long.class;
		else if (type.equalsIgnoreCase("Single"))
			t = Object.class;
		else if (type.startsWith("List")) {
			// ParameterizedTypeName ListType =ParameterizedTypeName.get(List.class, Object.class);
			t = List.class;
		}
		else
			t = Object.class;
		
		return t; // TODO Add more types
	}

	//-------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Get the complex class type based on the string value
	 * 
	 * @param name The name of the complex type
	 * @param type The complex type of the object
	 * @return The class of the object
	 */
	public static TypeName getComplexType(String name, String type) {
		TypeName t;
		String Name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length());

		if (type.equalsIgnoreCase("List"))
			t = ParameterizedTypeName.get(ClassName.get(List.class), TypeVariableName.get(name));
		else if (type.equalsIgnoreCase("single"))
			t = TypeVariableName.get(Name);
		else
			t = TypeVariableName.get(Name);

		return t; // TODO Add more complex names
	}
}
