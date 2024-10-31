package validation.registry.handlers;

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
public class Generation extends AbstractHandler {

	//=================================================================================================
	// attributes

	protected Shell shell;


	//=================================================================================================
	// methods

	//-------------------------------------------------------------------------------------------------
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ScriptDeployment window = new ScriptDeployment();
		try {
			window.execute(shell);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}