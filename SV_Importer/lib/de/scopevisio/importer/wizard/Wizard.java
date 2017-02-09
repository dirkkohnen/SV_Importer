package de.scopevisio.importer.wizard;

import java.io.File;
import java.net.URL;
import java.util.Properties;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.freixas.jwizard.*;

import de.scopevisio.importer.Importart;

/**
* This class simulates an installation Wizard using the FLib JWizard
* component.
* <hr>
* This program is free software; you can redistribute it and/or
* modify it under the terms of the Artistic License. You should have
* received a copy of the Artistic License along with this program. If
* not, a copy is available at
* <a href="http://opensource.org/licenses/artistic-license.php">
* opensource.org</a>.
*
* @author Antonio Freixas
*/

public class Wizard extends JWizardDialog {

private File installationFolder;
private boolean standardInstall = true;
private boolean installProgram = true;
private boolean installDocumentation = true;
private boolean installExamples = true;

public Properties prop;
private Step0 step0;
private Step1 step1;


/**
* Create an instance of Example1. Note that this class is a subclass
* of JWizardDialog.
*/

public Wizard(Properties prop) {
	this.prop = prop;
	step0 = new Step0(this.prop);
	step1 = new Step1(this.prop);
	 setModal(true);
	 setTitle("Install Example1");
	
	 // Set the logo image
	 // URL url = getClass().getResource("Example1.gif");
	 // setWizardIcon(new ImageIcon(url));

	 step1.prop = this.prop;
	 
	 // Create each step
	 addWizardPanel(step0);
	 addWizardPanel(step1);
	
	 // We don't want to have the cancel button enabled when we're done
	 disableCancelAtEnd();
	
	 // Make the dialog visible
	 pack();
	 setVisible(true);
}

	/**
	* If the user presses cancel, we want to give him/her the option of
	* continuing with the installation.
	*/
	protected void cancel() {
		 int response =	JOptionPane.showConfirmDialog(this, "Assistenten abbrechen?", "Abbrechen", JOptionPane.OK_CANCEL_OPTION);
		
		 if (response == JOptionPane.OK_OPTION) {
			super.cancel();
		 }
	}

	//We need to set the label text when the panel is displayed, not when
	//the panel is constructed
	protected void makingVisible(){
/*		 label.setText(
			"<html>" +
			"<b>Installation Summary:</b><br><br>" +
			"Installation folder: " +
			installationFolder.getAbsolutePath() +
			"<br>" +
			(standardInstall ?
			 "Standard installation<br><br>" :
			 "Custom installation<ul>" +
			 (installProgram ? "<li>Install program</li>" : "") +
			 (installDocumentation ? "<li>Install documentation</li>" : "") +
			 (installExamples ? "<li>Install examples</li>" : "") +
			 "</ul>") +
			"Press <b>Next</b> to start installing.");
*/	}
}
