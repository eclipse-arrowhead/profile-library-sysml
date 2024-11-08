package common.parsing.workspace;

import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

import com.google.common.base.CaseFormat;

/**
 * This class offers a set of utils for the reading of files and folders.
 * 
 * @author fernand0labra
 *
 */
public class ParsingUtils {
	
	//=================================================================================================
	// methods
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Read workspace projects
	 * 
	 * @return List of the workspace projects
	 */
	public static IProject[] readWorkspace() {
		// Get the root of the workspace
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		
		IWorkspaceRoot root = workspace.getRoot();
		
		// Get all projects in the workspace
		return root.getProjects();
	}
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Reads the workspace defined by the path and returns the folders or files
	 * in the given directory
	 * 
	 * @param path The path to the directory
	 * @param directoryCheck Check the folders when True
	 * @return A list of files or folders in the given directory
	 */
	public static String[] readWorkspace(String path, boolean directoryCheck)  {
		File file = new File(path);
		return directoryCheck
		
			? file.list(new FilenameFilter() { // Return a list of directories if directoryCheck
				@Override
				public boolean accept(File current, String name) {
					return new File(current, name).isDirectory();
				}
			})
					
			: file.list(); // Return a list of files if !directoryCheck
	}
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Creates a new folder in the workspace
	 * 
	 * @param Directory The path to the directory
	 * @param FolderName The name of the folder
	 */
	public static void newFolder(String Directory, String FolderName) {
		String path = Directory + "/" + FolderName;
		File f1 = new File(path); // Instantiate the File class
		boolean bool = f1.mkdir(); // Creating a folder using mkdir() method
	}
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Check the validity of the file path for directory compliance
	 * 
	 * @param directory The path to the directory
	 * @param disk The disk where the workspace is located
	 * @return The validity of the path
	 */
	public static boolean isValidDirectory(String directory, String disk) {
		File file = new File(directory);
		
		// If the file is not a directory
		if (!file.isDirectory()) { return false; }
		
		// If the file exists
		else if (file.exists()) {
				String cannonicalPath = "";
				try {
					cannonicalPath = file.getCanonicalPath();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}

				if (cannonicalPath.matches("[\n\r\t\0\f\'?*<>|\"/:]*")) {
					return false;

				} else {
					disk = cannonicalPath.substring(0, 2);
					return true;
				}
		}
		return false;
	}
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Transforms a string from UpperCamel to kebab-case
	 * 
	 * @param str The string to transform
	 * @return The transformed string
	 */
	public static String toKebabCase(String str) {
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, str);
	}
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Transforms a string from kebab-case to snake_case
	 * 
	 * @param str The string to transform
	 * @return The transformed string
	 */
	public static String toSnakeCase(String str) {
		return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_UNDERSCORE, str);
	}	
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Transforms a string from kebab-case to CamelCase
	 * 
	 * @param str The string to transform
	 * @return The transformed string
	 */
	public static String toCamelCase(String str) {
		return CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, str);
	}	
}
