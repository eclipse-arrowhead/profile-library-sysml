package common.dialog;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Label;

/**
 * 
 * Project Selection Window
 * 
 * @author cripan
 *
 */
public class ProjectSelectWindow extends TitleAreaDialog {

	//=================================================================================================
	// attributes
	
	//-------------------------------------------------------------------------------------------------	
	private IProject[] projects = null;
	private IProject selectedProject = null;

	
	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public void create() {
		super.create();
		setTitle("Project Selection");
		setMessage("Select the working project.", IMessageProvider.INFORMATION);

	}

	//-------------------------------------------------------------------------------------------------
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		
		GridData gd_container = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd_container.widthHint = 330;
		gd_container.heightHint = 200;
		container.setLayoutData(gd_container);
		
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		new Label(container, SWT.NONE); // For space purposes

		Label lblProjects = new Label(container, SWT.NONE);
		GridData gd_lblProjects = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblProjects.heightHint = 16;
		lblProjects.setLayoutData(gd_lblProjects);
		lblProjects.setText("Projects:");
		new Label(container, SWT.NONE); // For space purposes

		// Read projects from workspace
		String[] projectNames = new String[projects.length];
		for (int i = 0; i < projects.length; i++) {
			IProject project = projects[i];
			projectNames[i] = project.getName();
		}

		List list = new List(container, SWT.BORDER);
		list.setItems(projectNames);
		GridData gd_list = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_list.heightHint = 104;
		gd_list.widthHint = 400;
		list.setLayoutData(gd_list);

		list.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				int selectedP = list.getSelectionIndex();
				selectedProject = projects[selectedP];

			}
		});

		return container;
	}
	
	
	//=================================================================================================
	// auxiliary methods

	//-------------------------------------------------------------------------------------------------
	public ProjectSelectWindow(Shell parentShell) {
		super(parentShell);
	}
	
	//-------------------------------------------------------------------------------------------------
	public IProject[] getProjects() { return projects; }
	public IProject getSelectedProject() { return selectedProject; }

	//-------------------------------------------------------------------------------------------------
	public void setProjects(IProject[] projects) { this.projects = projects; }
	public void setSelectedProject(IProject selectedProject) { this.selectedProject = selectedProject; }
}
