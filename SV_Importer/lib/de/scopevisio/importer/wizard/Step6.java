/**
 * 
 */
package de.scopevisio.importer.wizard;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.freixas.jwizard.JWizardPanel;

/**
 * @author dirk.kohnen
 *
 */
public class Step6 extends JWizardPanel {

	private JTextField field;
	
	public Step6() {
		 setStepTitle("Installation Complete!");
		
		 JPanel contentPane = getContentPane();
		 contentPane.setLayout(new BorderLayout());
		
		 JLabel label =	new JLabel("The Example1 installation is complete.");
		
		 contentPane.add(label, BorderLayout.NORTH);
		
		 // There's nothing more to do and there's no point going back a
		 // step either
		 setBackStep(-1);
		 setNextStep(-1);
	}

}
