/**
 * 
 */
package de.scopevisio.importer;

import java.awt.EventQueue;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author dirk.kohnen
 * @author artur.koenig
 */
public class SV_Importer{
	/*
	 * 
	 	Priorität	Beschreibung
		FINEST		detailliertere Ausgabe als FINER (zum Beispiel Start und Ende jeder Methode)
		FINER		detailliertere Ausgabe als FINE
		FINE		Ausgabe von wichtigen Schritten im Programmfluss
		CONFIG		Ausgabe von Information über eine Konfiguration (zum Beispiel die Art des Betriebssystems oder des CPU-Typs)
		INFO		allgemeine Informationen (zum Beispiel wurde eine wichtige Aktion erfolgreich abgeschlossen)
		WARNING		es ist ein Fehler aufgetreten (zum Beispiel wurde eine Exception gefangen und nun behandelt)
		SEVERE		kritischer Fehler, der dazu führt, dass das Programm nicht ordnungsgemäß fortgesetzt werden kann, eventuell Programmabbruch
	 */
    private static final Logger LOGGER = LogManager.getLogger(SV_Importer.class.getName());
	private static Properties properties;
	private static String configDatei = "./config.properties";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Configurator.setLevel(LOGGER.getName(), Level.INFO);
					LOGGER.debug("Programm gestartet");
					initProperties();
//					Wizard wiz = new Wizard(properties);
					
					ImporterGui window = new ImporterGui();
					window.prop = properties;
					window.frmScopevisioImporter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static void initProperties(){
		LOGGER.info("Methode loadProperties() aufgerufen");
		properties = new Properties();
		BufferedInputStream stream;
		try {
			LOGGER.info("Beginne Config-Datei einzulesen: " + configDatei);
			stream = new BufferedInputStream(new FileInputStream(configDatei));
			properties.load(stream);
			stream.close();
			LOGGER.info("Config-Datei erfolgreich eingelesen:" + configDatei);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

		}
	}
	
}
