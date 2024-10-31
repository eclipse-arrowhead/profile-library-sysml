package deployment.coresystems.handlers;

import java.io.File;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;

/**
 * 
 * User Interface dialog window for the selection of systems deployment
 * 
 * @author cripan
 *
 */
public class DialogWindow extends TitleAreaDialog {
	
	//=================================================================================================
	// attributes
	
	private Text txtDirectory;
	private String directory = "";
	private static String os = "";
	private static String language = "";
	private static String disk = "";
	private static Boolean mandatorySys = true;
	private static Boolean supportSys = false;
	private static Boolean skipTest = true;
	private static Boolean badDirectory = false;
	private static String workspace = "";

	
	//=================================================================================================
	// methods

	//-------------------------------------------------------------------------------------------------
	@Override
	public void create() {
		super.create();
		setTitle("Arrowhead Deployment Generation Plugin");
		setMessage("Select the configuration.", IMessageProvider.INFORMATION);
	}

	//-------------------------------------------------------------------------------------------------
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(3, false));
		GridData gd_container = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd_container.heightHint = 322;
		container.setLayoutData(gd_container);

		// Selection of Directory Dialog
		Label lbldescription = new Label(container, SWT.NONE);
		lbldescription.setAlignment(SWT.RIGHT);
		GridData gd_lbldescription = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lbldescription.widthHint = 54;
		lbldescription.setLayoutData(gd_lbldescription);
		lbldescription.setText("Directory:");

		txtDirectory = new Text(container, SWT.BORDER);
		txtDirectory.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtDirectory.setText(workspace);
		directory = workspace;
		txtDirectory.addModifyListener(e -> {
			Text textWidget = (Text) e.getSource();
			String descriptionText = textWidget.getText();
			directory = descriptionText;
		});
		
		// For space purposes
		new Label(container, SWT.NONE);
		
		// Selection of Systems Dialog
		Label lbltitle = new Label(container, SWT.NONE);
		lbltitle.setAlignment(SWT.RIGHT);
		GridData gd_lbltitle = new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1);
		gd_lbltitle.widthHint = 55;
		gd_lbltitle.heightHint = 24;
		lbltitle.setLayoutData(gd_lbltitle);
		lbltitle.setText("Systems:");

		List list = new List(container, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL);
		list.setItems(new String[] { "Mandatory Core Systems", "Mandatory and Support Core Systems" });
		list.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				String selectedSys = list.getSelection()[0];

				if (selectedSys.equalsIgnoreCase("Mandatory Core Systems")) {
					mandatorySys = true;
					supportSys = false;

				}
				if (selectedSys.equalsIgnoreCase("Mandatory and Support Core Systems")) {
					mandatorySys = false;
					supportSys = true;
				}

			}
		});
		
		list.select(0); // Mandatory Core Systems by default
		
		// For space purposes
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		// Selection of Operating System
		Group device = new Group(container, SWT.NULL);
		device.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		device.setText("Operating System");
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		device.setLayout(gridLayout);

		Button btnRadioButton = new Button(device, SWT.RADIO);
		btnRadioButton.setText("Windows");

		Button btnRadioButton_1 = new Button(device, SWT.RADIO);
		btnRadioButton_1.setText("Linux");

		Button btnRadioButton_2 = new Button(device, SWT.RADIO);
		btnRadioButton_2.setText("Mac");

		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				super.widgetSelected(e);
				if (btnRadioButton.getSelection()) {
					os = "windows";
				}
			}
		});
		btnRadioButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				super.widgetSelected(e);
				if (btnRadioButton_1.getSelection()) {
					os = "linux";
				}
			}
		});
		btnRadioButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				super.widgetSelected(e);
				if (btnRadioButton_2.getSelection()) {
					os = "mac";
				}
			}
		});

		btnRadioButton.setSelection(true); // Windows by default
		os = "windows";
		
		// Selection of Programming Language
		Group grpLanguage = new Group(container, SWT.NULL);
		grpLanguage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 2));
		grpLanguage.setText("Programming Language");
		gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		grpLanguage.setLayout(gridLayout);

		Button btnRadioButton_3 = new Button(grpLanguage, SWT.RADIO);
		btnRadioButton_3.setText("Java");

		Button btnRadioButton_4 = new Button(grpLanguage, SWT.RADIO);
		btnRadioButton_4.setEnabled(false);
		btnRadioButton_4.setText("C++");
		new Label(grpLanguage, SWT.NONE);
		
		btnRadioButton_3.setSelection(true); // Java by deafult
		
		// For space purposes
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		// Selection of Maven Skip Compilation Tests
		Button btnCheckButton = new Button(container, SWT.CHECK);
		GridData gd_btnCheckButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnCheckButton.widthHint = 297;
		btnCheckButton.setLayoutData(gd_btnCheckButton);
		btnCheckButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if (btnCheckButton.getSelection()) {
					skipTest = true;
				} else {
					skipTest = false;
				}

			}
		});
		btnCheckButton.setText("Skip Compilation Tests");
		
		btnCheckButton.setSelection(true); // Skip compilation tests by deafult
		
		// For space purposes
		new Label(container, SWT.NONE);

		return container;
	}

	//-------------------------------------------------------------------------------------------------
	@Override
	protected void okPressed() {
		Shell shell = new Shell();
		System.out.println("directory: " + directory); // TODO Remove Trace
		if (directory == null || directory.isEmpty()) {
			MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
			messageBox.setMessage("Please enter directory" + directory);
			messageBox.open();
		} else {
			if (isValidDirectory(directory)) {
				if (skipTest)
					System.out.println("Skipping tests"); // TODO Remove Trace
				MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_WORKING);
				messageBox.setText("Info");
				messageBox.setMessage(directory);
				messageBox.open();
				badDirectory = false;
			} else {
				MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
				messageBox.setMessage("Directory no correct:" + directory); // TODO Remove Trace
				messageBox.open();
				badDirectory = true;

			}

		}
		super.okPressed();
	}

	
	//=================================================================================================
	// auxiliary methods
	
	//-------------------------------------------------------------------------------------------------
	public DialogWindow(Shell parentShell) { super(parentShell); }

	//-------------------------------------------------------------------------------------------------
	public String getDirectory() { return directory; }
	public String getOs() { return os; }
	public String getLanguage() { return language; }
	public Boolean getMandatorySys() { return mandatorySys; }
	public Boolean getSupportSys() { return supportSys; }
	public String getDisk() { return disk; }
	public Boolean getSkipTest() { return skipTest; }
	public Boolean getBadDirectory() { return badDirectory; }
	public  String getWorkspace() { return workspace; }
	
	//-------------------------------------------------------------------------------------------------
	public void setWorkspace(String workspace) { DialogWindow.workspace = workspace; }
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Check the validity of the file path for directory compliance
	 * 
	 * @param directory The path to the directory
	 * @return The validity of the path
	 */
	public boolean isValidDirectory(String directory) {
		File file = new File(directory);
		
		// If the file is not a directory
		if (!file.isDirectory()) { return false; }
		
		// If the file exists
		else if (file.exists()) {
				String cannonicalPath = "";
				try {
					cannonicalPath = file.getCanonicalPath();
					System.out.println("PATH:" + cannonicalPath); // TODO Remove Trace
				} catch (Exception e) {
					System.err.println("ERROR: No Path");
				}

				if (cannonicalPath.matches("[\n\r\t\0\f\'?*<>|\"/:]*")) {
					return false;

				} else {
					disk = cannonicalPath.substring(0, 2);
					System.out.println("DISK:" + disk); // TODO Remove Trace
					return true;
				}
		}
		return false;
	}
}
