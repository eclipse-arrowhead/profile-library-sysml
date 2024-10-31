package setup.registry.handlers;

import java.sql.DriverManager;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.MessageBox;

/**
 * 
 * User Interface dialog window for the selection of rules deployment
 * 
 * @author fernand0labra
 *
 */
public class DialogWindow extends TitleAreaDialog {

	// =================================================================================================
	// attributes

	private static String rootUser = "root";
	private static String rootPassword = "";

	private static String user = "arrowhead";
	private static String host = "localhost";
	private static String password = "";

	private Text txtRootUser;
	private Text txtRootPassword;

	private Text txtUser;
	private Text txtHost;
	private Text txtPassword;

	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	@Override
	public void create() {
		super.create();
		setTitle("Arrowhead Database Setup");
		setMessage("Select the configuration.", IMessageProvider.INFORMATION);
	}

	// -------------------------------------------------------------------------------------------------
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(2, false));

		GridData gd_container = new GridData(SWT.FILL, SWT.FILL, true, true);
		container.setLayoutData(gd_container);
		gd_container.heightHint = 250;

		new Label(container, SWT.NONE).setText("Root DB Configuration");
		new Label(container, SWT.NONE); // For space purposes

		// Root DB Configuration
		Label lblRootUser = new Label(container, SWT.NONE);
		lblRootUser.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		lblRootUser.setText("Root User:");

		txtRootUser = new Text(container, SWT.BORDER);
		txtRootUser.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtRootUser.setText(rootUser);
		txtRootUser.addModifyListener(e -> {
			Text textWidget = (Text) e.getSource();
			String text = textWidget.getText();
			rootUser = text;
		});

		Label lblRootPassword = new Label(container, SWT.NONE);
		lblRootPassword.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		lblRootPassword.setText("Root Password:");

		txtRootPassword = new Text(container, SWT.PASSWORD);
		txtRootPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtRootPassword.setText(rootPassword);
		txtRootPassword.addModifyListener(e -> {
			Text textWidget = (Text) e.getSource();
			String text = textWidget.getText();
			rootPassword = text;
		});

		new Label(container, SWT.NONE).setText("Arrowhead DB Configuration");
		new Label(container, SWT.NONE); // For space purposes

		// Arrowhead DB Configuration
		Label lblUser = new Label(container, SWT.NONE);
		lblUser.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		lblUser.setText("User:");

		txtUser = new Text(container, SWT.BORDER);
		txtUser.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtUser.setText(user);
		txtUser.addModifyListener(e -> {
			Text textWidget = (Text) e.getSource();
			String text = textWidget.getText();
			user = text;
		});

		Label lblHost = new Label(container, SWT.NONE);
		lblHost.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		lblHost.setText("Host:");

		txtHost = new Text(container, SWT.BORDER);
		txtHost.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtHost.setText(host);
		txtHost.addModifyListener(e -> {
			Text textWidget = (Text) e.getSource();
			String text = textWidget.getText();
			host = text;
		});

		Label lblPassword = new Label(container, SWT.NONE);
		lblPassword.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		lblPassword.setText("Password:");

		txtPassword = new Text(container, SWT.PASSWORD);
		txtPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtPassword.addModifyListener(e -> {
			Text textWidget = (Text) e.getSource();
			String text = textWidget.getText();
			password = text;
		});

		return container;
	}

	// -------------------------------------------------------------------------------------------------
	@Override
	protected void okPressed() {

		Shell shell = new Shell();

		try { // Connect and check if root user is correct
			DriverManager.getConnection("jdbc:mysql://" + host + ":3306/mysql", rootUser, rootPassword);
		} catch (Exception e) {
			MessageBox messageBox = new MessageBox(shell, SWT.ERROR);
			messageBox.setMessage(e.getMessage());
			messageBox.setText("Error during database connection");
			messageBox.open();
		}

		super.okPressed();
	}

	// =================================================================================================
	// auxiliary methods

	// -------------------------------------------------------------------------------------------------
	DialogWindow(Shell parentShell) { super(parentShell); }

	// -------------------------------------------------------------------------------------------------
	public static String getUser() { return user; }
	public static String getHost() { return host; }
	public static String getPassword() { return password; }
	public static String getRootUser() { return rootUser; }
	public static String getRootPassword() { return rootPassword; }

}
