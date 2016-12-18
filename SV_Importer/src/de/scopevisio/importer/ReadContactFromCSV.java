/**
 * 
 */
package de.scopevisio.importer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author dirk.kohnen
 *
 */
public class ReadContactFromCSV {
	
	public ReadContactFromCSV(File csv){
		this.parseCsvFile(csv);
	}
	
    /**
     * Lese CSV Datei und verarbeite zeilenweise.
     */
    public void parseCsvFile(File csv) {
    	InputStream inputStream;
		try {
			inputStream = new FileInputStream(csv);
			final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
			String current = reader.readLine();
	        while (current != null) {
	            System.out.println(current);
	        	//processCsvLine(current);
	            current = reader.readLine();
	        }
	        reader.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }

    /**
     * Verarbeite eine einzelne Zeile.
     */
    public void processCsvLine(final String data) {
        System.out.println("-------------------------- Neue Zeile:");
        final StringTokenizer st = new StringTokenizer(data, ";");
        while (st.hasMoreTokens()) {
            // Anstatt die Daten einfach nur auszugeben, würde hier eine sinnvolle Verarbeitung erfolgen:
            System.out.println("Nächste Spalte:" + st.nextToken());
        }
    }

}
