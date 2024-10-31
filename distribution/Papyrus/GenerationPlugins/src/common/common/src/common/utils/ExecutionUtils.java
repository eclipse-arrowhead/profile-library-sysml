package common.utils;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * 
 * Utils for the execution of scripts
 * 
 * @author cripan
 *
 */
public class ExecutionUtils {

	// =================================================================================================
	// methods
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Executes a .bat windows file
	 * 
	 * @param directory The path to the file
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void executebat(String directory) throws InterruptedException, IOException {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command(directory);

		try {
			Process process = processBuilder.start();
			executor.submit(new ProcessTask(process.getInputStream()));
		} finally {
			executor.shutdown();
		}

	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Executes a .sh linux file
	 * 
	 * @param directory The path to the file
	 * @param file The name of the file
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void executesh(String directory, String file) throws InterruptedException, IOException {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("sh", "-c", "sh ./" + file + ".sh");
		processBuilder.directory(new File(directory));

		try {
			Process process = processBuilder.start();
			executor.submit(new ProcessTask(process.getInputStream()));
		} finally {
			executor.shutdown();
		}

	}
	
	
	// =================================================================================================
	// auxiliary classes
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Thread process task for the parallel execution of scripts
	 * 
	 * @author cripan
	 *
	 */
	private static class ProcessTask implements Callable<List<String>> {

		// =================================================================================================
		// attributes
		
		private InputStream inputStream;

		
		// =================================================================================================
		// methods

		// -------------------------------------------------------------------------------------------------
		@Override
		public List<String> call() {
			return new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.toList());
		}
		
		
		// =================================================================================================
		// auxiliary methods
		
		// -------------------------------------------------------------------------------------------------
		public ProcessTask(InputStream inputStream) { this.inputStream = inputStream; }
	}
	
}
