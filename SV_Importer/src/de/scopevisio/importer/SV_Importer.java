/**
 * 
 */
package de.scopevisio.importer;

import java.awt.EventQueue;

/**
 * @author dirk.kohnen
 *
 */
public class SV_Importer {

	/**
	 * @param args
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

}
