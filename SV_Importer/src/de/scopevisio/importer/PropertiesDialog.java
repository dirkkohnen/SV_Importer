package de.scopevisio.importer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class PropertiesDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField kundennummerTextField;
	private JTextField benutzernameTextField;
	private JTextField passwortTextField;
	private JTextField spracheTextField;
	private JTextField gesellschaftTextField;


	/**
	 * Create the dialog.
	 */
	public PropertiesDialog() {
		setTitle("Einstellungen");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PropertiesDialog.class.getResource("/de/scopevisio/importer/images/information.png")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[][grow]", "[][][][][]"));
		{
			JLabel lblKundennummer = new JLabel("Kundennummer");
			contentPanel.add(lblKundennummer, "cell 0 0,alignx trailing");
		}
		{
			kundennummerTextField = new JTextField();
			contentPanel.add(kundennummerTextField, "cell 1 0,growx");
			kundennummerTextField.setColumns(10);
		}
		{
			JLabel lblBenutzername = new JLabel("Benutzername");
			contentPanel.add(lblBenutzername, "cell 0 1,alignx trailing");
		}
		{
			benutzernameTextField = new JTextField();
			contentPanel.add(benutzernameTextField, "cell 1 1,growx");
			benutzernameTextField.setColumns(10);
		}
		{
			JLabel lblPasswort = new JLabel("Passwort");
			contentPanel.add(lblPasswort, "cell 0 2,alignx trailing");
		}
		{
			passwortTextField = new JTextField();
			contentPanel.add(passwortTextField, "cell 1 2,growx");
			passwortTextField.setColumns(10);
		}
		{
			JLabel lblSprache = new JLabel("Sprache");
			contentPanel.add(lblSprache, "cell 0 3,alignx trailing");
		}
		{
			spracheTextField = new JTextField();
			contentPanel.add(spracheTextField, "cell 1 3,growx");
			spracheTextField.setColumns(10);
		}
		{
			JLabel lblGesellschaft = new JLabel("Gesellschaft");
			contentPanel.add(lblGesellschaft, "cell 0 4,alignx trailing");
		}
		{
			gesellschaftTextField = new JTextField();
			contentPanel.add(gesellschaftTextField, "cell 1 4,growx");
			gesellschaftTextField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
