package de.scopevisio.importer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.CharacterData;
import org.xml.sax.InputSource;

import de.scopevisio.importer.data.Contact;
import de.scopevisio.importer.data.Project;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ImporterGui implements ActionListener {

    private static final Logger LOGGER = LogManager.getLogger(SV_Importer.class.getName());
    private Importart art = Importart.KONTAKT;
    private APIart api = APIart.REST;
	static private final String newline = "\n";
	public JFrame frmScopevisioImporter;
	private JTextField textField;
	private JMenuBar menuBar;
	private JMenu mnDatei, mnScopevisio;
	private JMenuItem openMenuItem, startMenuItem, exitMenuItem, propertiesConnectMenuItem, connectMenuItem;
	private JToolBar toolBar;
	private JButton connectToolbarButton, openToolbarButton, startToolbarButton;
	private JTextArea log;
	private JLabel lblStatus;
	private JButton openButton;
	private JFileChooser fc = new JFileChooser();;
	public File fileCSV;
	public Properties prop;
	private String reply;
	private JMenuItem propertiesContactMenuItem;
	private JMenuItem propertiesContactRelationMenuItem;
	private JMenuItem propertiesGeneralMenuItem;
	private JMenuItem propertiesContactPropertyMenuItem;
	private JMenuItem propertiesProjectMenuItem;

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
		this.mnDatei.add(connectMenuItem);
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
		
		this.propertiesGeneralMenuItem = new JMenuItem("Allgemein");
		this.propertiesGeneralMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/database_edit.png")));
		this.propertiesGeneralMenuItem.addActionListener(this);
		this.mnScopevisio.add(this.propertiesGeneralMenuItem);
		this.mnScopevisio.add(this.propertiesConnectMenuItem);
		
		this.propertiesContactMenuItem = new JMenuItem("Import Kontakte");
		this.propertiesContactMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/vcard_edit.png")));
		this.propertiesContactMenuItem.addActionListener(this);
		this.mnScopevisio.add(this.propertiesContactMenuItem);
		
		this.propertiesContactRelationMenuItem = new JMenuItem("Import Kontaktbeziehungen");
		this.propertiesContactRelationMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/group_edit.png")));
		this.propertiesContactRelationMenuItem.addActionListener(this);
		this.mnScopevisio.add(this.propertiesContactRelationMenuItem);
		
		this.propertiesContactPropertyMenuItem = new JMenuItem("Import Allgemeine Informationen");
		this.propertiesContactPropertyMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/note_edit.png")));
		this.propertiesContactPropertyMenuItem.addActionListener(this);
		this.mnScopevisio.add(this.propertiesContactPropertyMenuItem);
		
/*		this.propertiesProjectMenuItem = new JMenuItem("Import Projekte");
		this.propertiesProjectMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/layout_edit.png")));
		this.propertiesProjectMenuItem.addActionListener(this);
		this.mnScopevisio.add(propertiesProjectMenuItem);*/
		this.frmScopevisioImporter.getContentPane().setLayout(new MigLayout("", "[434px,grow]", "[25px][][grow][][][][][]"));
		
		this.toolBar = new JToolBar();
		this.frmScopevisioImporter.getContentPane().add(toolBar, "cell 0 0,growx,aligny top");
		
		this.connectToolbarButton = new JButton("");
		this.connectToolbarButton.setToolTipText("Verbindung testen");
		this.connectToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/database_connect.png")));
		this.connectToolbarButton.addActionListener(this);
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

	private void printJournalHeader(){
		Date zeitstempel = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		LOGGER.log(Level.forName("JOURNAL", 50), "Import gestartet:");
		LOGGER.log(Level.forName("JOURNAL", 50), "\t" + simpleDateFormat.format(zeitstempel));
		LOGGER.log(Level.forName("JOURNAL", 50), "####################");
		LOGGER.log(Level.forName("JOURNAL", 50), "# Quelle:          #");
		LOGGER.log(Level.forName("JOURNAL", 50), "####################");
		LOGGER.log(Level.forName("JOURNAL", 50), "\tDatei:" + this.fileCSV.getName()+"\n");
		LOGGER.log(Level.forName("JOURNAL", 50), "####################");
		LOGGER.log(Level.forName("JOURNAL", 50), "# Ziel             #");
		LOGGER.log(Level.forName("JOURNAL", 50), "####################");
		LOGGER.log(Level.forName("JOURNAL", 50), "\tKundennummer: " + this.prop.getProperty("customer"));
		LOGGER.log(Level.forName("JOURNAL", 50), "\tGesellschaft: " + this.prop.getProperty("organisation"));
		LOGGER.log(Level.forName("JOURNAL", 50), "\tBenutzername: " + this.prop.getProperty("user")+"\n");
		LOGGER.log(Level.forName("JOURNAL", 50), "####################");
		LOGGER.log(Level.forName("JOURNAL", 50), "# Einstellungen    #");
		LOGGER.log(Level.forName("JOURNAL", 50), "####################");
		switch (this.art){
		 	case KONTAKT:
				LOGGER.log(Level.forName("JOURNAL", 50), "Art der importierten Daten:\n");
				LOGGER.log(Level.forName("JOURNAL", 50), "\tKontakte");
				LOGGER.log(Level.forName("JOURNAL", 50), "Duplikatserkannung durch:");
				if (this.prop.getProperty("conflictDetectionByName").compareTo("true") == 0)  LOGGER.log(Level.forName("JOURNAL", 50), "\tName");
				if (this.prop.getProperty("conflictDetectionByEmail").compareTo("true") == 0)  LOGGER.log(Level.forName("JOURNAL", 50), "\tE-Mail");
				if (this.prop.getProperty("conflictDetectionByType").compareTo("true") == 0)  LOGGER.log(Level.forName("JOURNAL", 50), "\tTyp");
				if (this.prop.getProperty("conflictDetectionByLegacyId").compareTo("true") == 0)  LOGGER.log(Level.forName("JOURNAL", 50), "\tVorsystem-ID");
				LOGGER.log(Level.forName("JOURNAL", 50), "Verhalten bei Duplikaten:");
	        	if (this.prop.getProperty("conflictAction").compareTo("overwrite") == 0) LOGGER.log(Level.forName("JOURNAL", 50), "\tÜberschreiben");
	        	if (this.prop.getProperty("conflictAction").compareTo("fillin") == 0) LOGGER.log(Level.forName("JOURNAL", 50), "\tAuffüllen");
	        	if (this.prop.getProperty("conflictAction").compareTo("skip") == 0) LOGGER.log(Level.forName("JOURNAL", 50), "\tÜberspringen");
				if (this.prop.getProperty("columns").length()>0){
		        	LOGGER.log(Level.forName("JOURNAL", 50), "Spaltenkonfiguration:");
					LOGGER.log(Level.forName("JOURNAL", 50), "\t" + this.prop.getProperty("columns"));
				}
				
			break;
			case KONTAKTBEZIEHUNG:
				LOGGER.log(Level.forName("JOURNAL", 50), "Art der importierten Daten: Kontaktbeziehungen");
				break;
			case ALLGEMEINE_INFORMATION:
				LOGGER.log(Level.forName("JOURNAL", 50), "Art der importierten Daten: Allgemeine Informationen");
				break;
			default:
				break;
		}
		
	}

	private void printJournalFooter(String reply){
		 try{
			LOGGER.log(Level.forName("JOURNAL", 50), "####################");
			LOGGER.log(Level.forName("JOURNAL", 50), "# Ergebnis:         #");
			LOGGER.log(Level.forName("JOURNAL", 50), "####################");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		 	DocumentBuilder db = dbf.newDocumentBuilder();
		    InputSource is = new InputSource();
		    is.setCharacterStream(new StringReader(reply));

		    Document doc = db.parse(is);
		    
		    // get Insertcount
		    NodeList nodes = doc.getElementsByTagName("insertCount");
		    Element element = (Element) nodes.item(0);
			LOGGER.log(Level.forName("JOURNAL", 50), "Anzahl Importierter Kontakte:\t" + getCharacterDataFromElement(element));
			
			// get Updatecount
		    nodes = doc.getElementsByTagName("updateCount");
		    element = (Element) nodes.item(0);
			LOGGER.log(Level.forName("JOURNAL", 50), "Anzahl aktuallisierten Kontakte:\t" + getCharacterDataFromElement(element));
		    
			// get Errors
		    nodes = doc.getElementsByTagName("error");
			LOGGER.log(Level.forName("JOURNAL", 50), "Anzahl Fehler:\t" + nodes.getLength());
	        for (int i = 0; i < nodes.getLength(); i++) {
	        	element = (Element) nodes.item(i);
				LOGGER.log(Level.forName("JOURNAL", 50), "Fehler " + i + " :\t" + getCharacterDataFromElement(element));
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }		
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
 
         }
        //Handle General properties button action.
        else if (e.getSource() == this.propertiesGeneralMenuItem) {
        	ButtonGroup group = new ButtonGroup();
        	JRadioButton contactRadioButton = new JRadioButton("Kontakte");
        	if (this.art == Importart.KONTAKT)  contactRadioButton.setSelected(true);
        	group.add(contactRadioButton);
        	JRadioButton contactRelationRadioButton = new JRadioButton("Kontaktbeziehungen");
        	if (this.art == Importart.KONTAKTBEZIEHUNG)  contactRelationRadioButton.setSelected(true);
        	group.add(contactRelationRadioButton);
        	JRadioButton contactPropertyRadioButton = new JRadioButton("Allgemeine Informationen");
        	if (this.art == Importart.ALLGEMEINE_INFORMATION)  contactPropertyRadioButton.setSelected(true);
        	group.add(contactPropertyRadioButton);
        	JRadioButton projectRadioButton = new JRadioButton("Projekt");
        	if (this.art == Importart.PROJEKT)  projectRadioButton.setSelected(true);
        	group.add(projectRadioButton);

        	JCheckBox journalCheckBox = new JCheckBox("Protokoll");
        	if (this.prop.getProperty("protokoll").compareTo("true") == 0)  journalCheckBox.setSelected(true);

        	ButtonGroup group2 = new ButtonGroup();
        	JRadioButton restRadioButton = new JRadioButton("REST");
        	if (this.api == APIart.REST)  restRadioButton.setSelected(true);
        	group2.add(restRadioButton);
        	JRadioButton soapRadioButton = new JRadioButton("SOAP");
        	if (this.api == APIart.SOAP)  soapRadioButton.setSelected(true);
        	group2.add(soapRadioButton);
        	
        	
    		Object[] message = {"Zu importierende Daten ...", contactRadioButton, contactRelationRadioButton, contactPropertyRadioButton, projectRadioButton, "Protokollierung ...", journalCheckBox,"API",restRadioButton, soapRadioButton};

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
            	if (contactRadioButton.isSelected()){
            		this.art = Importart.KONTAKT;
            	} else if (contactRelationRadioButton.isSelected()){
            		this.art = Importart.KONTAKTBEZIEHUNG;
            	} else if (contactPropertyRadioButton.isSelected()){
            		this.art = Importart.ALLGEMEINE_INFORMATION;
            	} else if (projectRadioButton.isSelected()){
            		this.art = Importart.PROJEKT;
            	}
            	
            	if (journalCheckBox.isSelected()){
            		this.prop.setProperty("protokoll", "true");
            	} else {
            		this.prop.setProperty("protokoll", "false");
            	}
            	
            	if (restRadioButton.isSelected()){
            		this.api = APIart.REST;
            	} else if (soapRadioButton.isSelected()){
            		this.api = APIart.SOAP;
            	}
            } 

        }
        //Handle Contact properties button action.
        else if (e.getSource() == this.propertiesContactMenuItem) {
        	JCheckBox detectNameCheckBox = new JCheckBox("Name");
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
       		JTextField columnsTextField = new JTextField(this.prop.getProperty("columns"));
        	
    		Object[] message = {"Duplikatserkannung durch ...", detectNameCheckBox, detectEmailCheckBox, detectTypeCheckBox, detectLegacyIDCheckBox, "Verhalten bei Duplikaten", overwriteRadioButton, fillRadioButton, skipRadioButton,"Spalten",columnsTextField};

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
            	if (detectEmailCheckBox.isSelected()){
            		this.prop.setProperty("conflictDetectionByEmail", "true");
            	} else {
            		this.prop.setProperty("conflictDetectionByEmail", "false");
            	}
            	if (detectTypeCheckBox.isSelected()){
            		this.prop.setProperty("conflictDetectionByType", "true");
            	} else {
            		this.prop.setProperty("conflictDetectionByType", "false");
            	}
            	if (detectLegacyIDCheckBox.isSelected()){
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
 
            	this.prop.setProperty("columns", columnsTextField.getText());
            	 
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

        }
        //Handle Contactrelation properties button action.
        else if (e.getSource() == this.propertiesContactRelationMenuItem) {
        	ButtonGroup typeGroup = new ButtonGroup();
        	JRadioButton employeeRadioButton = new JRadioButton("Mitarbeiter");
        	if (this.prop.getProperty("type").compareTo("employee") == 0)  employeeRadioButton.setSelected(true);
        	typeGroup.add(employeeRadioButton);
        	JRadioButton parentcompanyRadioButton = new JRadioButton("Mutterunternehmen");
        	if (this.prop.getProperty("type").compareTo("parentcompany") == 0)  parentcompanyRadioButton.setSelected(true);
        	typeGroup.add(parentcompanyRadioButton);
        	JRadioButton childcompanyRadioButton = new JRadioButton("Tochterunternehmen");
        	if (this.prop.getProperty("type").compareTo("childcompany") == 0)  childcompanyRadioButton.setSelected(true);
        	typeGroup.add(childcompanyRadioButton);
        	JRadioButton bosscontactRadioButton = new JRadioButton("Gesellsch.Vertreter");
        	if (this.prop.getProperty("type").compareTo("employee") == 0)  bosscontactRadioButton.setSelected(true);
        	typeGroup.add(bosscontactRadioButton);
        	JRadioButton salescontactRadioButton = new JRadioButton("Ansprechpartner");
        	if (this.prop.getProperty("type").compareTo("parentcompany") == 0)  salescontactRadioButton.setSelected(true);
        	typeGroup.add(bosscontactRadioButton);
        	JRadioButton partnerRadioButton = new JRadioButton("Gesellschafter");
        	if (this.prop.getProperty("type").compareTo("childcompany") == 0)  partnerRadioButton.setSelected(true);
        	typeGroup.add(partnerRadioButton);

        	ButtonGroup idtypeGroup = new ButtonGroup();
        	JRadioButton idRadioButton = new JRadioButton("Master-ID");
        	if (this.prop.getProperty("idtype").compareTo("id") == 0)  idRadioButton.setSelected(true);
        	idtypeGroup.add(idRadioButton);
        	JRadioButton legacyRadioButton = new JRadioButton("Vorsystem-ID");
        	if (this.prop.getProperty("idtype").compareTo("legacy") == 0)  legacyRadioButton.setSelected(true);
        	idtypeGroup.add(legacyRadioButton);
        	
        	JCheckBox incrementalCheckBox = new JCheckBox("");
        	if (this.prop.getProperty("incremental").compareTo("true") == 0)  incrementalCheckBox.setSelected(true);
        	
    		Object[] message = {"Typ der Beziehungen  ...", employeeRadioButton, parentcompanyRadioButton, childcompanyRadioButton, bosscontactRadioButton, bosscontactRadioButton, partnerRadioButton, 
    				"Art der IDs ", idRadioButton, legacyRadioButton, "Inkrementeller Import", incrementalCheckBox};

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
            	if (incrementalCheckBox.isSelected()){
            		this.prop.setProperty("incremental", "true");
            	} else {
            		this.prop.setProperty("incremental", "false");
            	}

            	if (employeeRadioButton.isSelected()){
            		this.prop.setProperty("type", "employee");
            	} else if (parentcompanyRadioButton.isSelected()){
            		this.prop.setProperty("type", "parentcompany");
               	} else if (childcompanyRadioButton.isSelected()){
            		this.prop.setProperty("type", "childcompany");
            	} else if (bosscontactRadioButton.isSelected()){
            		this.prop.setProperty("type", "fillin");
               	} else if (partnerRadioButton.isSelected()){
            		this.prop.setProperty("type", "skip");
               	}

            	if (idRadioButton.isSelected()){
            		this.prop.setProperty("idtype", "id");
            	} else if (legacyRadioButton.isSelected()){
            		this.prop.setProperty("idtype", "legacy");
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

        }
        //Handle Contactproperty properties button action.
        else if (e.getSource() == this.propertiesContactPropertyMenuItem) {
        	ButtonGroup formatGroup = new ButtonGroup();
        	JRadioButton jsonRadioButton = new JRadioButton("JSON");
        	if (this.prop.getProperty("format").compareTo("json") == 0)  jsonRadioButton.setSelected(true);
        	formatGroup.add(jsonRadioButton);
        	JRadioButton xmlRadioButton = new JRadioButton("XML");
        	if (this.prop.getProperty("format").compareTo("xml") == 0)  xmlRadioButton.setSelected(true);
        	formatGroup.add(xmlRadioButton);
       	
    		Object[] message = {"Format  ...", jsonRadioButton, xmlRadioButton};

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
            	if (jsonRadioButton.isSelected()){
            		this.prop.setProperty("format", "json");
            	} else if (xmlRadioButton.isSelected()){
            		this.prop.setProperty("format", "xml");
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
        }
        //Handle Connect properties button action.
        else if (e.getSource() == this.propertiesConnectMenuItem) {
    		JTextField kundennummerTextField = new JTextField(this.prop.getProperty("customer"));
    		JTextField benutzernameTextField = new JTextField(this.prop.getProperty("user"));
    		JTextField passwortTextField = new JTextField(this.prop.getProperty("pass"));
    		JTextField spracheTextField = new JTextField(this.prop.getProperty("language"));
    		JTextField gesellschaftTextField = new JTextField(this.prop.getProperty("organisation"));
    		JTextField packageSizeTextField = new JTextField(this.prop.getProperty("packagesize"));
            
    		Object[] message = {"Kundennummer", kundennummerTextField, "Benutzername", benutzernameTextField, "Passwort", passwortTextField, "Sprache", spracheTextField, "Gesellschaft", gesellschaftTextField, "Packetgröße", packageSizeTextField};

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
            	this.prop.setProperty("packagesize", packageSizeTextField.getText());
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
        }
        //Handle Exit button action.
        else if (e.getSource() == this.exitMenuItem) {
            System.exit(0);
        }
        //Handle Connect button action.
        else if (e.getSource() == this.connectMenuItem || e.getSource() == this.connectToolbarButton){
        		PingPong p = new PingPong(this.prop);
        		reply = p.postSoap();
        		if(reply.contains("pong")){
		        	this.log.append("Connect erfolgreich" + newline);
		        }
        }
        //Handle Start button action.
        else if (e.getSource() == this.startMenuItem || e.getSource() == this.startToolbarButton){
        	if (this.fileCSV == null){
	        	this.log.append("Fehler: Keine CSV-Datei ausgewählt" + newline);
        		return;
        	} else {
        		if (this.prop.getProperty("protokoll").compareTo("true") == 0) this.printJournalHeader();
        		switch (this.art){
        			case KONTAKT:
		        		ReadContactFromCSV rcfc = new ReadContactFromCSV(this.fileCSV);
		        		List<Contact> contacts = rcfc.getContacts();
		        		int countContacts = contacts.size(); 
		        		int packageSize = Integer.parseInt(this.prop.getProperty("packagesize"));
		        		int packages = (countContacts / packageSize) + 1;
/*		        		System.out.println(countContacts);
		        		System.out.println(packageSize);
		        		System.out.println(packages);*/
		        		WriteContactToScopevisio wcts;
		        		for (int i = 0 ; i < packages ; i++){
			        		wcts = new WriteContactToScopevisio(this.prop);
		        			int start = i * packageSize;
		        			int end = (i + 1) * packageSize;
	        				List<Contact> subList;
		        			if (end <= countContacts){
		        				subList = contacts.subList(start, end-1);
				        		System.out.println("1: " + start + ", " + (end-1));
		        			} else {
		        				subList = contacts.subList(start, countContacts);
				        		System.out.println("2: " + start + ", " + (countContacts));
		        			}
		        			wcts.setContacts(subList);
		        			reply = wcts.postSoap();
//		        			System.out.println(reply);
		        		}
		        		break;
        			case KONTAKTBEZIEHUNG:
		        		ReadContactRelationFromCSV rcrfc = new ReadContactRelationFromCSV(this.fileCSV);
		        		WriteContactRelationToScopevisio wcrts = new WriteContactRelationToScopevisio(this.prop);
		        		wcrts.setContactRelations(rcrfc.getContactRelations());
		        		reply = wcrts.postSoap();
		        		System.out.println(reply);
		        		break;
        			case ALLGEMEINE_INFORMATION:
		        		ReadContactPropertyFromCSV rcpfc = new ReadContactPropertyFromCSV(this.fileCSV);
		        		WriteContactPropertyToScopevisio wcpts = new WriteContactPropertyToScopevisio(this.prop);
		        		wcpts.setContactProperties(rcpfc.getContactProperties());
		        		reply = wcpts.postSoap();
		        		System.out.println(reply);
		        		break;
        			case PROJEKT:
		        		ReadProjectFromCSV rpfc = new ReadProjectFromCSV(this.fileCSV);
		        		if (this.api == APIart.REST) {
			        		WriteProjectREST wpts = new WriteProjectREST();
			        		List<Project> projects = rpfc.getProjects();
			                for (Project pr : projects){
			                	reply = wpts.postREST(pr);
			                }
		        		}
		        		System.out.println(reply);
		        		break;
					default:
						break;
        		}
        		
          		JOptionPane.showMessageDialog(frmScopevisioImporter, "Import abgeschlossen");
        	}
        	this.printJournalFooter(reply);
        }
	}

	
	  public static String getCharacterDataFromElement(Element e) {
	    Node child = e.getFirstChild();
	    if (child instanceof CharacterData) {
	       CharacterData cd = (CharacterData) child;
	       return cd.getData();
	    }
	    return "?";
	  }
}
