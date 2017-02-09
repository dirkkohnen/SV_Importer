/**
//**********************************************************************
//Step4
//**********************************************************************

//If the user wanted a custom installation, select the components to
//install
 * 
 */
package de.scopevisio.importer.wizard;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.freixas.jwizard.JWizardPanel;

/**
 * @author dirk.kohnen
 *
 */
public class Step4 extends JWizardPanel{

private JCheckBox program;
private JCheckBox documentation;
private JCheckBox examples;

public Step4() {
 setStepTitle("Select Components to Install");

 JPanel contentPane = getContentPane();
 contentPane.setLayout(new BorderLayout());

 program = new JCheckBox("Install program (890K)");
 program.setSelected(installProgram);
 documentation = new JCheckBox("Install documentation (500K)");
 documentation.setSelected(installDocumentation);
 examples = new JCheckBox("Install examples (103K)");
 examples.setSelected(installExamples);

 JPanel choices = new JPanel(new GridLayout(3, 1));
 choices.add(program);
 choices.add(documentation);
 choices.add(examples);

 contentPane.add(choices, BorderLayout.NORTH);

 // Set the previous and next steps
 setBackStep(3);
 setNextStep(5);
}

//We override the next() method just to determine what the user
//selected
protected void next(){
 installProgram = program.isSelected();
 installDocumentation = documentation.isSelected();
 installExamples = examples.isSelected();
 super.next();
}
}
