package common.dialog;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * 
 * Model Selection Window
 * 
 * @author cripan
 *
 */
public class ModelSelectWindow extends TitleAreaDialog {

	//=================================================================================================
	// attributes
	
	//-------------------------------------------------------------------------------------------------	
	private String selectedModel = null;
	private String selectedPath = null;
	private String pathModel = null;
	private Boolean extensionFlag = false;

	
	//=================================================================================================
	// methods

	//-------------------------------------------------------------------------------------------------
	@Override
	public void create() {
		super.create();
		setTitle("Model Selection");
		setMessage("Select the UML model. Only .uml extension supported.", IMessageProvider.INFORMATION);

	}

	//-------------------------------------------------------------------------------------------------
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		
		GridData gd_container = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd_container.widthHint = 400;
		gd_container.heightHint = 350;
		container.setLayoutData(gd_container);
		
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		new Label(container, SWT.NONE); // For space purposes

		// Display models as a tree
		Label lblProjects = new Label(container, SWT.NONE);
		GridData gd_lblProjects = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblProjects.heightHint = 16;
		lblProjects.setLayoutData(gd_lblProjects);
		lblProjects.setText("Projects:");
		new Label(container, SWT.NONE); // For space purposes

		final Map<String, TreeItem> nodes = new HashMap<>();
		Map<TreeItem, ArrayList<String>> children = new HashMap<>();

		Tree tree = new Tree(container, SWT.BORDER | SWT.FULL_SELECTION);
		GridData gd_tree = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_tree.widthHint = 357;
		gd_tree.heightHint = 300;
		tree.setLayoutData(gd_tree);

		Path path = FileSystems.getDefault().getPath(pathModel, new String[] {});
		try {
			Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
					TreeItem parent = nodes.get(dir.getParent().toString());
					TreeItem item = parent == null ? new TreeItem(tree, SWT.NONE) : new TreeItem(parent, SWT.NONE);
					item.setText(dir.getFileName().toString());
					nodes.put(dir.toString(), item);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path dir, BasicFileAttributes attrs) {
					TreeItem parent = nodes.get(dir.getParent().toString());

					if (children.get(parent) == null)
						children.put(parent, new ArrayList<String>());

					children.get(parent).add(dir.getFileName().toString());

					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (TreeItem parentTree : children.keySet()) {
			for (String child : children.get(parentTree)) {
				TreeItem item = new TreeItem(parentTree, SWT.NONE);
				item.setText(child);
			}

		}

		tree.layout();
		tree.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				selectedPath = buildTreePath(tree);
			}
		});

		return container;
	}

	@Override
	protected void okPressed() {

		Shell shell = new Shell();
		if (selectedPath.endsWith(".uml")) {
			extensionFlag = true;
		} else {
			MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
			messageBox.setMessage("File not correct. Only .uml supported ");
			messageBox.open();
			extensionFlag = false;
		}

		super.okPressed();
	}

	
	//=================================================================================================
	// auxiliary methods
	
	//-------------------------------------------------------------------------------------------------	
	public ModelSelectWindow(Shell parentShell) {
		super(parentShell);
	}
	
	//-------------------------------------------------------------------------------------------------
	public Boolean getExtensionFlag() { return extensionFlag; }
	public String getSelectedModel() { return selectedModel; }
	public String getPathModel() { return pathModel; }
	public String getSelectedPath() { return selectedPath; }

	//-------------------------------------------------------------------------------------------------
	public void setExtensionFlag(Boolean extensionFlag) { this.extensionFlag = extensionFlag; }
	public void setSelectedModel(String selectedModel) { this.selectedModel = selectedModel; }
	public void setPathModel(String pathModel) { this.pathModel = pathModel; }
	public void setSelectedPath(String selectedPath) { this.selectedPath = selectedPath; }

	//-------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Builds path to the model based on the selected tree object
	 * 
	 * @param tree The tree object of the window
	 * @return The path of the model
	 */
	public String buildTreePath(Tree tree) {
		String path = "";

		if (tree.getSelection()[0] != null && tree.getSelection()[0].getText().endsWith(".uml")) {
			TreeItem item = tree.getSelection()[0];

			path = item.getText();
			item = item.getParentItem();

			while (!pathModel.endsWith(item.getText())) {
				path = item.getText() + "/" + path;
				item = item.getParentItem();
			}
		}

		return path;
	}

}
