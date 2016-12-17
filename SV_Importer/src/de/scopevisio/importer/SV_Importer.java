/**
 * 
 */
package de.scopevisio.importer;

import java.awt.EventQueue;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author dirk.kohnen
 *
 */
public class SV_Importer {
	
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
					window.frame.setVisible(true);
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
