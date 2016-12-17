package de.scopevisio.importer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class SV_ImporterGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SV_ImporterGUI window = new SV_ImporterGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SV_ImporterGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		JMenuItem openMenuItem = new JMenuItem("\u00D6ffnen");
		openMenuItem.setIcon(new ImageIcon(SV_ImporterGUI.class.getResource("/de/scopevisio/importer/images/folder_page.png")));
		mnDatei.add(openMenuItem);
		
		JMenuItem startMenuItem = new JMenuItem("Start");
		startMenuItem.setIcon(new ImageIcon(SV_ImporterGUI.class.getResource("/de/scopevisio/importer/images/control_play_blue.png")));
		mnDatei.add(startMenuItem);
		
		JMenuItem exitMenuItem = new JMenuItem("Beenden");
		exitMenuItem.setIcon(new ImageIcon(SV_ImporterGUI.class.getResource("/de/scopevisio/importer/images/door_in.png")));
		mnDatei.add(exitMenuItem);
		
		JMenu mnScopevisio = new JMenu("Scopevisio");
		menuBar.add(mnScopevisio);
		
		JMenuItem propertiesMenuItem = new JMenuItem("Einstellungen");
		propertiesMenuItem.setIcon(new ImageIcon(SV_ImporterGUI.class.getResource("/de/scopevisio/importer/images/information.png")));
		mnScopevisio.add(propertiesMenuItem);
		
		JMenuItem connectMenuItem = new JMenuItem("Verbinden");
		connectMenuItem.setIcon(new ImageIcon(SV_ImporterGUI.class.getResource("/de/scopevisio/importer/images/database_connect.png")));
		mnScopevisio.add(connectMenuItem);
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton propertiesToolbarButton = new JButton("");
		propertiesToolbarButton.setIcon(new ImageIcon(SV_ImporterGUI.class.getResource("/de/scopevisio/importer/images/information.png")));
		toolBar.add(propertiesToolbarButton);
		
		JButton connectToolbarButton = new JButton("");
		connectToolbarButton.setIcon(new ImageIcon(SV_ImporterGUI.class.getResource("/de/scopevisio/importer/images/database_connect.png")));
		toolBar.add(connectToolbarButton);
		
		JButton openToolbarButton = new JButton("");
		openToolbarButton.setIcon(new ImageIcon(SV_ImporterGUI.class.getResource("/de/scopevisio/importer/images/folder_page.png")));
		toolBar.add(openToolbarButton);
	}

}
