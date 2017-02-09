/**
//**********************************************************************
//Step3
//**********************************************************************

//Select the installation type: standard or custom
 * 
 */
package de.scopevisio.importer.wizard;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.freixas.jwizard.JWizardPanel;

/**
 * @author dirk.kohnen
 *
 */
public class Step3 extends JWizardPanel{

	public Step3() {
	 setStepTitle("Select Installation Type");

	 JPanel contentPane = getContentPane();
	 contentPane.setLayout(new BorderLayout());

	 JRadioButton standard = new JRadioButton("Standard (Recommended)");
	 standard.setSelected(standardInstall);
	 standard.addItemListener(
		new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
		    if (e.getStateChange() == ItemEvent.SELECTED) {
			standardInstall = true;
		    }
		}
		});
	 JRadioButton custom = new JRadioButton("Custom");
	 custom.setSelected(!standardInstall);
	 custom.addItemListener(
		new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
		    if (e.getStateChange() == ItemEvent.SELECTED) {
			standardInstall = false;
		    }
		}
		});

	 ButtonGroup group = new ButtonGroup();
	 group.add(standard);
	 group.add(custom);

	 JPanel radioBox = new JPanel(new GridLayout(2, 1));
	 radioBox.add(standard);
	 radioBox.add(custom);

	 contentPane.add(radioBox, BorderLayout.NORTH);

	 // Set the previous and next steps. The next step will change if
	 // the user selects "Custom" installation

	 setBackStep(2);
	 setNextStep(5);
	}

	//Override the next() method so we can decide whether to go to step 4
	//(custom installation) or 5 (standard installation)

	protected void
	next()
	{
	 // If we have a custom installation, go to step 4, rather than 5

	 if (!standardInstall) {
		setNextStep(4);
	 }
	 super.next();
	}

}
