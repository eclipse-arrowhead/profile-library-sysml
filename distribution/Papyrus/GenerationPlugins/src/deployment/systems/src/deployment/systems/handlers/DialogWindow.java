package deployment.systems.handlers;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
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

import common.dto.APXLocalCloudDesignDescription;
import common.parsing.workspace.ParsingUtils;

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
	
	// =================================================================================================
	// attributes
	
	private static Boolean badDirectory = false;
	private static String disk = "";
	private static String name = "";
	private static String language = "";
	private static Boolean mandatorySys = false;
	private static Boolean supportSys = false;
	private static String os = "";
	
	private Text txtDirectory;
	private String directory = "";
	private GridData gridData_1;
	private ArrayList<APXLocalCloudDesignDescription> localClouds = new ArrayList<APXLocalCloudDesignDescription>();
	private int selectedLC;
	private String selectedLCName = "";
	private String[] selectedSys = null;
	private int[] selectedSysType = null;
	private Text text;
	private IProject[] projects = null;
	private String selectedProject = null; // TODO Not Used
	private String workDirectory = "";
	

	// =================================================================================================
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
		GridData gd_container = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd_container.widthHint = 609;
		gd_container.heightHint = 450;
		container.setLayoutData(gd_container);
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);

		// Selection of Directory Dialog
		Label lbldescription = new Label(container, SWT.NONE);
		lbldescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lbldescription.setText("Directory:");

		txtDirectory = new Text(container, SWT.BORDER);
		txtDirectory.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtDirectory.setText(workDirectory);
		directory = workDirectory;
		txtDirectory.addModifyListener(e -> {
			Text textWidget = (Text) e.getSource();
			String descriptionText = textWidget.getText();
			directory = descriptionText;
		});

		// Definition of Directory Name
		Label lblName = new Label(container, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name:");

		text = new Text(container, SWT.BORDER);
		GridData gd_text = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text.widthHint = 438;
		text.setLayoutData(gd_text);
		text.addModifyListener(e -> {
			Text textWidget = (Text) e.getSource();
			String descriptionText = textWidget.getText();
			name = descriptionText;
		});

		// Obtain Local Cloud names
		String[] lcNames = new String[localClouds.size()];
		for (int i = 0; i < localClouds.size(); i++)
			lcNames[i] = localClouds.get(i).getName();

		// Selection of Local Cloud
		Label lbltitle = new Label(container, SWT.NONE);
		lbltitle.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		lbltitle.setText("Local Cloud:");

		List list = new List(container, SWT.BORDER | SWT.V_SCROLL);
		list.setItems(lcNames);
		GridData gd_list = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_list.widthHint = 332;
		gd_list.heightHint = 100;
		list.setLayoutData(gd_list);

		// Selection of Systems
		Label lblSystems = new Label(container, SWT.NONE);
		lblSystems.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		lblSystems.setText("Systems:");
		List listsys = new List(container, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
		String[] items = {"", ""};
		listsys.setItems(items);
		
		GridData gd_listsys = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_listsys.widthHint = 331;
		gd_listsys.heightHint = 100;
		listsys.setLayoutData(gd_listsys);

		// Obtain system names
		list.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				selectedLC = list.getSelectionIndex();
				selectedLCName = lcNames[selectedLC];
				text.setText(selectedLCName);
				listsys.removeAll();

				for (String deployedEntity :  localClouds.get(selectedLC).getDeployedEntities().keySet()) {
					listsys.add(ParsingUtils.toCamelCase(deployedEntity));
				}

			}
		});

		listsys.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				selectedSys = listsys.getSelection();
			}
		});
		
		// For space purposes
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		// Selection of Programming Language
		Group grpLanguage = new Group(container, SWT.NULL);
		grpLanguage.setText("Programming Language");
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		grpLanguage.setLayout(gridLayout);
		gridData_1 = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData_1.widthHint = 359;
		gridData_1.verticalAlignment = SWT.TOP;
		gridData_1.horizontalAlignment = SWT.LEFT;
		gridData_1.heightHint = 31;
		grpLanguage.setLayoutData(gridData_1);

		Button btnRadioButton_3 = new Button(grpLanguage, SWT.RADIO);
		btnRadioButton_3.setText("Java");

		Button btnRadioButton_4 = new Button(grpLanguage, SWT.RADIO);
		btnRadioButton_4.setEnabled(false);
		btnRadioButton_4.setText("C++");
		new Label(grpLanguage, SWT.NONE);
		
		// For space purposes
		new Label(container, SWT.NONE);

		// Selection of operating system
		Group device = new Group(container, SWT.NONE);
		device.setText("Operating System");
		GridLayout gridLayout2 = new GridLayout();
		gridLayout2.numColumns = 3;
		device.setLayout(gridLayout2);

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
		

		btnRadioButton_3.setSelection(true); // Java by default
		btnRadioButton.setSelection(true); // Windows by default
		os = "windows";

		return container;
	}

	//-------------------------------------------------------------------------------------------------
	@Override
	protected void okPressed() {

		Shell shell = new Shell();
		if (directory == null || directory.isEmpty()) {
			MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
			messageBox.setMessage("Please enter directory" + directory);
			messageBox.open();
		} else {
			if (isValidDirectory(directory)) {
				MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_WORKING);
				messageBox.setText("Info");
				messageBox.setMessage(directory);
				messageBox.open();
				badDirectory = false;
			} else {
				MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
				messageBox.setMessage("Directory no correct:" + directory);
				messageBox.open();
				badDirectory = true;

			}

		}

		super.okPressed();
	}


	// =================================================================================================
	// auxiliary methods

	//-------------------------------------------------------------------------------------------------
	DialogWindow(Shell parentShell) { super(parentShell); }
	
	//-------------------------------------------------------------------------------------------------
	public String getOs() { return os; }
	public String getDirectory() { return directory; }
	public String getName() { return name; }
	public String getLanguage() { return language; }
	public Boolean getMandatorySys() { return mandatorySys; }
	public Boolean getSupportSys() { return supportSys; }
	public ArrayList<APXLocalCloudDesignDescription> getLocalClouds() { return localClouds; }
	public int[] getSelectedSysType() { return selectedSysType; }
	public String[] getSelectedSys() { return selectedSys; }
	public int getSelectedLC() { return selectedLC; }
	public String getSelectedLCName() { return selectedLCName; }
	public String getDisk() { return disk; }
	public Boolean getBadDirectory() { return badDirectory; }
	public IProject[] getProjects() { return projects; }

	//-------------------------------------------------------------------------------------------------
	public void setLocalClouds(ArrayList<APXLocalCloudDesignDescription> localClouds) { this.localClouds = localClouds; }
	public void setSelectedSysType(int[] selectedSysType) { this.selectedSysType = selectedSysType; }
	public void setSelectedSys(String[] selectedSys) { this.selectedSys = selectedSys; }
	public void setSelectedLC(int selectedLC) { this.selectedLC = selectedLC; }
	public void setSelectedLCName(String selectedLCName) { this.selectedLCName = selectedLCName; }
	public void setProjects(IProject[] projects) { this.projects = projects; }
	public void setWorkDirectory(String workDirectory) { this.workDirectory = workDirectory; }

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
				} catch (Exception e) {
					System.err.println("ERROR: No Path");
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
	
}
