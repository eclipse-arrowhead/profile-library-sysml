package validation.systems.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;


/**
 * 
 * Shell execution of the plugin
 * 
 * @author fernand0labra
 *
 */
public class PluginDeployment extends AbstractHandler {
	
	//=================================================================================================
	// attributes
	
	protected Shell shell;
	
	
	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		PluginExecution window = new PluginExecution();

			try {
				window.execute(shell);
			} catch (Exception e) {
				e.printStackTrace();
			}
	  
		return null;
	}
}

