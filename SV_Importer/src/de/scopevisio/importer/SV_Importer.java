/**
 * 
 */
package de.scopevisio.importer;

import java.awt.EventQueue;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author dirk.kohnen
 *
 */
public class SV_Importer{
	// Debuglevel: 0=Fehler, 1=Warnungen, 2=Meldungen
	public static final int debugLevel = 2;
	private static Properties properties;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImporterGui window = new ImporterGui();
					loadProperties();
					window.prop = properties;
					window.frmScopevisioImporter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static void loadProperties(){
		properties = new Properties();
		BufferedInputStream stream;
		try {
			stream = new BufferedInputStream(new FileInputStream("./config.properties"));
			properties.load(stream);
			stream.close();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

		}
	}
}
