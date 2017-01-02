package de.scopevisio.importer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;


public class ImporterGui implements ActionListener {

    static private final String newline = "\n";
	public JFrame frmScopevisioImporter;
	private JTextField textField;
	private JMenuBar menuBar;
	private JMenu mnDatei, mnScopevisio;
	private JMenuItem openMenuItem, startMenuItem, exitMenuItem, propertiesConnectMenuItem, connectMenuItem;
	private JToolBar toolBar;
	private JButton propertiesConnectToolbarButton, connectToolbarButton, openToolbarButton, startToolbarButton;
	private JTextArea log;
	private JLabel lblStatus;
	private JButton openButton;
	private JFileChooser fc = new JFileChooser();;
	public File fileCSV;
	public Properties prop;
	private String reply;
	private JMenuItem propertiesContactMenuItem;
	private JButton propertiesContactToolbarButton;

	/**
	 * Create the application.
	 */
	public ImporterGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScopevisioImporter = new JFrame();
		frmScopevisioImporter.setTitle("Scopevisio Importer");
		frmScopevisioImporter.setBounds(100, 100, 450, 300);
		frmScopevisioImporter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.menuBar = new JMenuBar();
		this.frmScopevisioImporter.setJMenuBar(this.menuBar);
		
		this.mnDatei = new JMenu("Datei");
		this.menuBar.add(this.mnDatei);
		
		this.openMenuItem = new JMenuItem("\u00D6ffnen");
		this.openMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/folder_page.png")));
		this.openMenuItem.addActionListener(this);
		this.mnDatei.add(this.openMenuItem);
		
		this.startMenuItem = new JMenuItem("Start");
		this.startMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/control_play_blue.png")));
		this.startMenuItem.addActionListener(this);
		
		this.connectMenuItem = new JMenuItem("Verbinden");
		mnDatei.add(connectMenuItem);
		this.connectMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/database_connect.png")));
		this.connectMenuItem.addActionListener(this);
		this.mnDatei.add(this.startMenuItem);
		
		this.exitMenuItem = new JMenuItem("Beenden");
		this.exitMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/door_in.png")));
		this.exitMenuItem.addActionListener(this);
		this.mnDatei.add(this.exitMenuItem);
		
		this.mnScopevisio = new JMenu("Einstellungen");
		this.menuBar.add(this.mnScopevisio);
		
		this.propertiesConnectMenuItem = new JMenuItem("Verbindung");
		this.propertiesConnectMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/cog_edit.png")));
		this.propertiesConnectMenuItem.addActionListener(this);
		this.mnScopevisio.add(this.propertiesConnectMenuItem);
		
		this.propertiesContactMenuItem = new JMenuItem("Kontaktimport");
		this.propertiesContactMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/vcard_edit.png")));
		this.propertiesContactMenuItem.addActionListener(this);
		this.mnScopevisio.add(propertiesContactMenuItem);
		this.frmScopevisioImporter.getContentPane().setLayout(new MigLayout("", "[434px,grow]", "[25px][][grow][][][][][]"));
		
		this.toolBar = new JToolBar();
		this.frmScopevisioImporter.getContentPane().add(toolBar, "cell 0 0,growx,aligny top");
		
		this.propertiesConnectToolbarButton = new JButton("");
		this.propertiesConnectToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/cog_edit.png")));
		this.propertiesConnectToolbarButton.addActionListener(this);
		this.toolBar.add(this.propertiesConnectToolbarButton);
		
		this.connectToolbarButton = new JButton("");
		this.connectToolbarButton.setToolTipText("Verbindung testen");
		this.connectToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/database_connect.png")));
		this.connectToolbarButton.addActionListener(this);
		
		this.propertiesContactToolbarButton = new JButton("");
		this.propertiesContactToolbarButton.setToolTipText("Einstellungen Kontaktimport");
		this.propertiesContactToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/vcard_edit.png")));
		this.propertiesContactToolbarButton.addActionListener(this);
		this.toolBar.add(propertiesContactToolbarButton);
		this.toolBar.add(this.connectToolbarButton);
				
		this.openToolbarButton = new JButton("");
		this.openToolbarButton.setToolTipText("Datei \u00F6ffnen");
		this.openToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/folder_page.png")));
		this.openToolbarButton.addActionListener(this);
		this.toolBar.add(this.openToolbarButton);
		
		this.startToolbarButton = new JButton("");
		this.startToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/control_play_blue.png")));
		this.startToolbarButton.addActionListener(this);
		this.toolBar.add(this.startToolbarButton);
		
		this.textField = new JTextField();
		this.frmScopevisioImporter.getContentPane().add(this.textField, "flowx,cell 0 1,growx");
		this.textField.setColumns(10);
		
		this.log = new JTextArea();
		this.frmScopevisioImporter.getContentPane().add(this.log, "cell 0 2 1 5,grow");
		
		this.lblStatus = new JLabel("Status ...");
		this.frmScopevisioImporter.getContentPane().add(this.lblStatus, "cell 0 7,growx,aligny bottom");
		
		this.openButton = new JButton("\u00D6ffnen");
		this.openButton.addActionListener(this);
		this.frmScopevisioImporter.getContentPane().add(this.openButton, "cell 0 1");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        //Handle open button action.
        if (e.getSource() == this.openButton || e.getSource() == this.openMenuItem || e.getSource() == this.openToolbarButton) {
            int returnVal = fc.showOpenDialog(this.frmScopevisioImporter);
 
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                fileCSV = fc.getSelectedFile();
                //This is where a real application would open the file.
                log.append("Opening: " + fileCSV.getAbsolutePath() + "." + newline);
            } else {
                log.append("Open command cancelled by user." + newline);
            }
            log.setCaretPosition(log.getDocument().getLength());
 
        //Handle properties button action.
        } else if (e.getSource() == this.propertiesContactToolbarButton || e.getSource() == this.propertiesContactMenuItem) {
        	JCheckBox detectNameCheckBox = new JCheckBox("Name");
        	System.out.println(this.prop.getProperty("conflictDetectionByName"));
        	if (this.prop.getProperty("conflictDetectionByName").compareTo("true") == 0)  detectNameCheckBox.setSelected(true);
        	JCheckBox detectEmailCheckBox = new JCheckBox("E-Mail");
        	if (this.prop.getProperty("conflictDetectionByEmail").compareTo("true") == 0)  detectEmailCheckBox.setSelected(true);
        	JCheckBox detectTypeCheckBox = new JCheckBox("Typ");
        	if (this.prop.getProperty("conflictDetectionByType").compareTo("true") == 0)  detectTypeCheckBox.setSelected(true);
        	JCheckBox detectLegacyIDCheckBox = new JCheckBox("Vorsystem-ID");
        	if (this.prop.getProperty("conflictDetectionByLegacyId").compareTo("true") == 0)  detectLegacyIDCheckBox.setSelected(true);
        	ButtonGroup group = new ButtonGroup();
        	JRadioButton overwriteRadioButton = new JRadioButton("Überschreiben");
        	if (this.prop.getProperty("conflictAction").compareTo("overwrite") == 0)  overwriteRadioButton.setSelected(true);
        	group.add(overwriteRadioButton);
        	JRadioButton fillRadioButton = new JRadioButton("Auffüllen");
        	if (this.prop.getProperty("conflictAction").compareTo("fillin") == 0)  fillRadioButton.setSelected(true);
        	group.add(fillRadioButton);
        	JRadioButton skipRadioButton = new JRadioButton("Überspringen");
        	if (this.prop.getProperty("conflictAction").compareTo("skip") == 0)  skipRadioButton.setSelected(true);
        	group.add(skipRadioButton);
        	
    		Object[] message = {"Duplikatserkannung durch ...", detectNameCheckBox, detectEmailCheckBox, detectTypeCheckBox, detectLegacyIDCheckBox, "Verhalten bei Duplikaten", overwriteRadioButton, fillRadioButton, skipRadioButton};

            JOptionPane pane = new JOptionPane( message, JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
            pane.createDialog(null, "Einstellungen").setVisible(true);

            Object selectedValue = pane.getValue();
            int n = -1;

            if(selectedValue == null) {
                n = JOptionPane.CLOSED_OPTION;      
            } else {
                n = Integer.parseInt(selectedValue.toString());
            }
            
            if (n == JOptionPane.OK_OPTION){
            	if (detectNameCheckBox.isSelected()){
            		this.prop.setProperty("conflictDetectionByName", "true");
            	} else {
            		this.prop.setProperty("conflictDetectionByName", "false");
            	}
            	if (detectNameCheckBox.isSelected()){
            		this.prop.setProperty("conflictDetectionByEmail", "true");
            	} else {
            		this.prop.setProperty("conflictDetectionByEmail", "false");
            	}
            	if (detectNameCheckBox.isSelected()){
            		this.prop.setProperty("conflictDetectionByType", "true");
            	} else {
            		this.prop.setProperty("conflictDetectionByType", "false");
            	}
            	if (detectNameCheckBox.isSelected()){
            		this.prop.setProperty("conflictDetectionByLegacyId", "true");
            	} else {
            		this.prop.setProperty("conflictDetectionByLegacyId", "false");
            	}

            	if (overwriteRadioButton.isSelected()){
            		this.prop.setProperty("conflictAction", "overwrite");
            	} else if (fillRadioButton.isSelected()){
            		this.prop.setProperty("conflictAction", "fillin");
               	} else if (skipRadioButton.isSelected()){
            		this.prop.setProperty("conflictAction", "skip");
            	}
 
            	FileOutputStream out;
				try {
					out = new FileOutputStream("config.properties");
					this.prop.store(out, null);
					log.append("Einstellungen gespeichert" + newline);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            } 

        } else if (e.getSource() == this.propertiesConnectMenuItem || e.getSource() == this.propertiesConnectToolbarButton) {
    		JTextField kundennummerTextField = new JTextField(this.prop.getProperty("customer"));
    		JTextField benutzernameTextField = new JTextField(this.prop.getProperty("user"));
    		JTextField passwortTextField = new JTextField(this.prop.getProperty("pass"));
    		JTextField spracheTextField = new JTextField(this.prop.getProperty("language"));
    		JTextField gesellschaftTextField = new JTextField(this.prop.getProperty("organisation"));
            
    		Object[] message = {"Kundennummer", kundennummerTextField, "Benutzername", benutzernameTextField, "Passwort", passwortTextField, "Sprache", spracheTextField, "Gesellschaft", gesellschaftTextField};

            JOptionPane pane = new JOptionPane( message, JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
            pane.createDialog(null, "Einstellungen").setVisible(true);

            Object selectedValue = pane.getValue();
            int n = -1;

            if(selectedValue == null) {
                n = JOptionPane.CLOSED_OPTION;      
            } else {
                n = Integer.parseInt(selectedValue.toString());
            }
            
            if (n == JOptionPane.OK_OPTION){
            	this.prop.setProperty("customer", kundennummerTextField.getText());
            	this.prop.setProperty("user", benutzernameTextField.getText());
            	this.prop.setProperty("pass", passwortTextField.getText());
            	this.prop.setProperty("language", spracheTextField.getText());
            	this.prop.setProperty("organisation", gesellschaftTextField.getText());
            	FileOutputStream out;
				try {
					out = new FileOutputStream("config.properties");
					this.prop.store(out, null);
					log.append("Einstellungen gespeichert" + newline);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            } 
        } else if (e.getSource() == this.exitMenuItem) {
            System.exit(0);
        } else if (e.getSource() == this.connectMenuItem || e.getSource() == this.connectToolbarButton){
        		PingPong p = new PingPong(this.prop);
        		reply = p.postSoap();
        		if(reply.contains("pong")){
		        	this.log.append("Connect erfolgreich" + newline);
		        }
//		        this.log.append("responseCode: " + result.getResponseCode() + newline);
//		        this.log.append("reply: " + reply + newline);
        } else if (e.getSource() == this.startMenuItem || e.getSource() == this.startToolbarButton){
        	if (this.fileCSV == null){
	        	this.log.append("Fehler: Keine CSV-Datei ausgewählt" + newline);
        		return;
        	} else {
        		ReadContactFromCSV rcfc = new ReadContactFromCSV(this.fileCSV);
        		WriteContactToScopevisio wcts = new WriteContactToScopevisio(this.prop);
        		wcts.setContacts(rcfc.getContacts());
        		reply = wcts.postSoap();
        		System.out.println(reply);
        	}
        	
        }
	}

}
