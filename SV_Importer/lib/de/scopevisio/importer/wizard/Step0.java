/**
//**********************************************************************
// Step0
// Willkommensbildschirm
 * 
 */
package de.scopevisio.importer.wizard;

import java.awt.BorderLayout;
import java.util.Properties;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.freixas.jwizard.JWizardPanel;

/**
 * @author dirk.kohnen
 *
 */
public class Step0 extends JWizardPanel {
	public Properties prop;

	public Step0(Properties prop){
		this.prop = prop;
		setStepTitle("Willkommen zum Scopevisio-Importer!");
		
		JPanel contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("<html>Der Scopevisio-Impoter ermöglicht es Daten aus Dateien in Scopevisio zu importieren</html>");
		
		contentPane.add(label, BorderLayout.NORTH);
		
		// Set the previous (none) and next steps
		setBackStep(-1);
		setNextStep(1);
	}
}
