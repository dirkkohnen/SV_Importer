/**
 * Step1
 * Auswahl der Importart
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
public class Step1 extends JWizardPanel{
		public Properties prop;
		private Importart art = Importart.KONTAKT;

		public Step1(Properties prop) {
			this.prop = prop;
			setStepTitle("Importart");
			
			JPanel contentPane = getContentPane();
			contentPane.setLayout(new BorderLayout());
			
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

	     	JCheckBox journalCheckBox = new JCheckBox("Protokoll");
	     	if (this.prop.getProperty("protokoll").compareTo("true") == 0)  journalCheckBox.setSelected(true);
			
/*			 JCheckBox checkbox = new JCheckBox("I agree.");
			 checkbox.addItemListener(
				new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
				    if (e.getStateChange() == ItemEvent.SELECTED) {
					setNextStep(2);
				    }
				    else {
					setNextStep(-1);
				    }
				}});
*/			
			 contentPane.add(new JLabel("Importart"));
			 contentPane.add(contactRadioButton);
			 contentPane.add(contactRelationRadioButton);
			 contentPane.add(contactPropertyRadioButton);
			 contentPane.add(journalCheckBox, BorderLayout.SOUTH);
			
			 // Set the previous and next steps. Note that we don't have a next
			 // step until the user agrees to the license terms
			 setBackStep(0);
			 setNextStep(2);
		}
	}
