package org.eclipse.papyrus.openapi2arrowhead.codegen;

import org.eclipse.core.internal.resources.File;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class JsonUploadToArrowheadDialog extends Dialog{
	
	private Text txtClientSystemName;
	private Text txtClientSystemAddress;
	private Text txtClientSystemPort;
	//path of file
	private String inputFilePath;
	private String inputFileName;
	
	//Arrowhead Papyrus Consumer Informations
	private String clientSystemName ;
	private String clientSystemAddress ;
	private String clientSystemPort ;
	
	//service Registry informations
	private String orchPortNumber;
	private String orchIpAddress;
	
	public JsonUploadToArrowheadDialog(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}
//	public void create(Class clazz, boolean client) {
//	
//        super.create();
//        setTitle("Arrowhead and client Configuration");
//        setMessage("localhost configurations will by used by default !");
//  
//    }
	protected Control createDialogArea(Composite parent){
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(3, false);
        GridData data = new GridData();
        data.horizontalSpan = 3;
        
        container.setLayout(layout);
        container.setData(data);
      //Informations about the Arrowhead Orchestrator = Port Number + IP Address
        Label lblInfo = new Label(container, SWT.NONE);
        lblInfo.setText("Informations about the Arrowhead Orchestrator :");
        data.horizontalSpan = 2;
       
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        
        //Port Number
        Label lblportNumber = new Label(container, SWT.NONE);
        lblportNumber.setText("Orchestrator Port Number : ");
        Text portNumberText;
        portNumberText = new Text(container, SWT.BORDER);
        portNumberText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        portNumberText.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            orchPortNumber = textWidget.getText();
        });
        
        new Label(container, SWT.NONE);

      //Ip Address 
        Label lblIpAddress = new Label(container, SWT.NONE);
        lblIpAddress.setText("Orchestrator IP Address : ");
        Text ipAdressText;
        ipAdressText = new Text(container, SWT.BORDER);
        ipAdressText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        ipAdressText.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            orchIpAddress = textWidget.getText();
        });
        
        
        new Label(container, SWT.NONE);
        
        
        //clientSystemInfo + Name + address + port
        Label lblClientInfo = new Label(container, SWT.NONE);
        lblClientInfo.setText("Informations about the Papyrus Customer :                  ");
        data.horizontalSpan = 2;
        
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        //Client system Name
        Label lblclientSystemName = new Label(container, SWT.NONE);
        lblclientSystemName.setText("System Name : ");
        Text nameText;
        nameText = new Text(container, SWT.BORDER);
        nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        nameText.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            clientSystemName = textWidget.getText();
        });
        
        new Label(container, SWT.NONE);

      //client system Address 
        Label lblClientSystemAddress = new Label(container, SWT.NONE);
        lblClientSystemAddress.setText("System Address : ");
        Text clientSystemAddressText;
        clientSystemAddressText = new Text(container, SWT.BORDER);
        clientSystemAddressText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        clientSystemAddressText.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            clientSystemAddress = textWidget.getText();
        });
        
        
        new Label(container, SWT.NONE);

      //client system port 
        Label lblClientSystemPort = new Label(container, SWT.NONE);
        lblClientSystemPort.setText("System Port : ");
        Text clientSystemPortText;
        clientSystemPortText = new Text(container, SWT.BORDER);
        clientSystemPortText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        clientSystemPortText.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            clientSystemPort = textWidget.getText();
        });
        
        
        
        
//        Group clientSystemInfo = new Group(container, SWT.NONE);
//        clientSystemInfo.setText("Client System informations");
//        GridLayout gridLayout = new GridLayout();
//        gridLayout.numColumns = 2;
//        clientSystemInfo.setLayout(gridLayout);
//        GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
//        gridData.horizontalSpan = 2;
//        clientSystemInfo.setLayoutData(gridData);
//        //Client System name
//        Label lblClientSystemName = new Label(clientSystemInfo, SWT.NONE);
//        lblClientSystemName.setText("Client System Name:");
//        txtClientSystemName = new Text(clientSystemInfo, SWT.BORDER);
//        txtClientSystemName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
//        txtClientSystemName.setText(clientSystemName);
//        txtClientSystemName.addModifyListener(e -> {
//            Text textWidget = (Text) e.getSource();
//            String contactNameText = textWidget.getText();
//            clientSystemName = contactNameText;
//        });
        
        
		return parent;
	}

	@SuppressWarnings("restriction")
	public void init(File selectionFirst) {
		// TODO Auto-generated method stub
		inputFilePath = selectionFirst.getRawLocation().toString();
		inputFileName = selectionFirst.getName();
	}
	public String getOrchPortNumber() {
		return orchPortNumber;
	}
	public String getOrchIpAddress() {
		return orchIpAddress;
	}
	public String getClientSystemPort() {
		return clientSystemPort;
	}
	public String getClientSystemAddress() {
		return clientSystemAddress;
	}
	public String getClientSystemName() {
		return clientSystemName;
	}
	public String getInputFileName() {
		return inputFileName;
	}
	public String getInputFilePath() {
		return inputFilePath;
	}
	
}

