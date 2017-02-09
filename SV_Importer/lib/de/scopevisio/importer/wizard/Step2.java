/**
//**********************************************************************
//Step2
//**********************************************************************

//Select the installation location
 * 
 */
package de.scopevisio.importer.wizard;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.freixas.jwizard.JWizardPanel;

/**
 * @author dirk.kohnen
 *
 */
public class Step2 extends JWizardPanel {

	private JTextField field;
	
	public Step2() {
		 setStepTitle("Select Installation Location");
		
		 JPanel contentPane = getContentPane();
		 contentPane.setLayout(new BorderLayout());
		
		 // Field to enter install location
		 field = new JTextField("C:\\Program Files\\Example1");
		
		 // Browse button for browsing to install location
		 final JButton browse = new JButton("Browse");
		 browse.addActionListener(
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    File defaultDir = new File("C:\\Program Files");
			    JFileChooser chooser = new JFileChooser(defaultDir);
			    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    int result = chooser.showDialog(browse, "Select");
			    if (result == JFileChooser.APPROVE_OPTION) {
				field.setText(chooser.getSelectedFile().getAbsolutePath());
			    }
			}
			});
		
		 JPanel filePanel = new JPanel(new BorderLayout());
		 filePanel.add(field);
		 filePanel.add(browse, BorderLayout.EAST);
		
		 contentPane.add(filePanel, BorderLayout.NORTH);
		
		 // Set the previous and next steps
		 setBackStep(1);
		 setNextStep(3);
	}
	
	//We're going to override the next button so we can check if the
	//specified directory exists. If it does, we go on to the next step.
	//If not, we ask whether we should create it. If the answer is No or
	//if we can't create it, we remain on the current step
	protected void next(){
		 String folderName = field.getText().trim();
		 installationFolder = new File(folderName);
		
		 // If valid, go on to next step
		 if (installationFolder.isDirectory()) {
			super.next();
			return;
		 }
		
		 // If it exists, check that it is a folder and not a file
		 if (installationFolder.exists()) {
			JOptionPane.showMessageDialog(Step2.this, "The given path points to a file, not a folder!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		 }
		
		 // If nothing was entered, report an error
		 if (folderName.length() < 1) {
			JOptionPane.showMessageDialog(Step2.this, "Please enter a folder name.", "Error", JOptionPane.ERROR_MESSAGE);
		 }
		
		 // If it doesn't exist, query whether we should create it
		 int response = JOptionPane.showConfirmDialog(Step2.this, installationFolder.getName() + " does not exist. Create?", "Create Folder", JOptionPane.OK_CANCEL_OPTION);
		 if (response == JOptionPane.OK_OPTION) {
		//This is what we'd do if we were really creating the folder
		//	try {
		//	    installationFolder.mkdirs();
		//	}
		
		//	// Unsuccessful creation, report error
		
		//	catch (Exception e) {
		//	    JOptionPane.showMessageDialog(
		//		Step2.this,
		//		e.getMessage(),
		//		"Error",
		//		JOptionPane.ERROR_MESSAGE);
		//	    return;
		//	}
		
			// Successful creation, continue to next step
		
			super.next();
			return;
	 }
	}

}
