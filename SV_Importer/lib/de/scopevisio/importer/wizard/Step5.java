/**
//**********************************************************************
//Step5
//**********************************************************************

//Summarize the installation -- the user can proceed or cancel. * 
 */
package de.scopevisio.importer.wizard;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.freixas.jwizard.JWizardPanel;

import de.scopevisio.importer.Importart;

/**
 * @author dirk.kohnen
 *
 */
public class Step5 extends JWizardPanel{
		public Properties prop;

private JLabel label;

public Step5(){
 setStepTitle("Installation Summary");

 JPanel contentPane = getContentPane();
 contentPane.setLayout(new BorderLayout());

 label = new JLabel();
 contentPane.add(label, BorderLayout.NORTH);

 // Set the previous and next steps

 setBackStep(standardInstall ? 3 : 4 );
 setNextStep(6);
	}
}