package de.scopevisio.importer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ImporterGui implements ActionListener{

    static private final String newline = "\n";
	public JFrame frame;
	private JTextField textField;
	private JMenuBar menuBar;
	private JMenu mnDatei, mnScopevisio;
	private JMenuItem openMenuItem, startMenuItem, exitMenuItem, propertiesMenuItem, connectMenuItem;
	private JToolBar toolBar;
	private JButton propertiesToolbarButton, connectToolbarButton, openToolbarButton, startToolbarButton;
	private JTextArea log;
	private JLabel lblStatus;
	private JButton openButton;
	private JFileChooser fc = new JFileChooser();;
	public File fileCSV;
	public Properties prop;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.menuBar = new JMenuBar();
		this.frame.setJMenuBar(this.menuBar);
		
		this.mnDatei = new JMenu("Datei");
		this.menuBar.add(this.mnDatei);
		
		this.openMenuItem = new JMenuItem("\u00D6ffnen");
		this.openMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/folder_page.png")));
		this.openMenuItem.addActionListener(this);
		this.mnDatei.add(this.openMenuItem);
		
		this.startMenuItem = new JMenuItem("Start");
		this.startMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/control_play_blue.png")));
		this.startMenuItem.addActionListener(this);
		this.mnDatei.add(this.startMenuItem);
		
		this.exitMenuItem = new JMenuItem("Beenden");
		this.exitMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/door_in.png")));
		this.exitMenuItem.addActionListener(this);
		this.mnDatei.add(this.exitMenuItem);
		
		this.mnScopevisio = new JMenu("Scopevisio");
		this.menuBar.add(this.mnScopevisio);
		
		this.propertiesMenuItem = new JMenuItem("Einstellungen");
		this.propertiesMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/information.png")));
		this.propertiesMenuItem.addActionListener(this);
		this.mnScopevisio.add(this.propertiesMenuItem);
		
		this.connectMenuItem = new JMenuItem("Verbinden");
		this.connectMenuItem.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/database_connect.png")));
		this.connectMenuItem.addActionListener(this);
		this.mnScopevisio.add(this.connectMenuItem);
		this.frame.getContentPane().setLayout(new MigLayout("", "[434px,grow]", "[25px][][grow][][][][][]"));
		
		this.toolBar = new JToolBar();
		this.frame.getContentPane().add(toolBar, "cell 0 0,growx,aligny top");
		
		this.propertiesToolbarButton = new JButton("");
		this.propertiesToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/information.png")));
		this.propertiesToolbarButton.addActionListener(this);
		this.toolBar.add(this.propertiesToolbarButton);
		
		this.connectToolbarButton = new JButton("");
		this.connectToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/database_connect.png")));
		this.connectToolbarButton.addActionListener(this);
		this.toolBar.add(this.connectToolbarButton);
				
		this.openToolbarButton = new JButton("");
		this.openToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/folder_page.png")));
		this.openToolbarButton.addActionListener(this);
		this.toolBar.add(this.openToolbarButton);
		
		this.startToolbarButton = new JButton("");
		this.startToolbarButton.setIcon(new ImageIcon(ImporterGui.class.getResource("/de/scopevisio/importer/images/control_play_blue.png")));
		this.startToolbarButton.addActionListener(this);
		this.toolBar.add(this.startToolbarButton);
		
		this.textField = new JTextField();
		this.frame.getContentPane().add(this.textField, "flowx,cell 0 1,growx");
		this.textField.setColumns(10);
		
		this.log = new JTextArea();
		this.frame.getContentPane().add(this.log, "cell 0 2 1 5,grow");
		
		this.lblStatus = new JLabel("Status ...");
		this.frame.getContentPane().add(this.lblStatus, "cell 0 7,growx,aligny bottom");
		
		this.openButton = new JButton("\u00D6ffnen");
		this.openButton.addActionListener(this);
		this.frame.getContentPane().add(this.openButton, "cell 0 1");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        //Handle open button action.
        if (e.getSource() == this.openButton || e.getSource() == this.openMenuItem || e.getSource() == this.openToolbarButton) {
            int returnVal = fc.showOpenDialog(this.frame);
 
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                fileCSV = fc.getSelectedFile();
                //This is where a real application would open the file.
                log.append("Opening: " + fileCSV.getName() + "." + newline);
            } else {
                log.append("Open command cancelled by user." + newline);
            }
            log.setCaretPosition(log.getDocument().getLength());
 
        //Handle save button action.
        } else if (e.getSource() == this.propertiesMenuItem || e.getSource() == this.propertiesToolbarButton) {
    		JTextField kundennummerTextField = new JTextField(this.prop.getProperty("customer"));
    		JTextField benutzernameTextField = new JTextField(this.prop.getProperty("user"));
    		JTextField passwortTextField = new JTextField(this.prop.getProperty("pass"));
    		JTextField spracheTextField = new JTextField(this.prop.getProperty("language"));
    		JTextField gesellschaftTextField = new JTextField(this.prop.getProperty("organisation"));
                   Object[] message = {"Kundennummer", kundennummerTextField, "Benutzername", benutzernameTextField, "Passwort", passwortTextField, "Sprache", spracheTextField, "Gesellschaft", gesellschaftTextField};

                    JOptionPane pane = new JOptionPane( message, 
                                                    JOptionPane.PLAIN_MESSAGE, 
                                                    JOptionPane.OK_CANCEL_OPTION);
                    pane.createDialog(null, "Einstellungen").setVisible(true);

                    Object selectedValue = pane.getValue();
                    int n = -1;


                    if(selectedValue == null)
                        n = JOptionPane.CLOSED_OPTION;      
                    else
                        n = Integer.parseInt(selectedValue.toString());


                    
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
        }
	}

}
