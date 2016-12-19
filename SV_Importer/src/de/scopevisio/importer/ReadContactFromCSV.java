/**
 * 
 */
package de.scopevisio.importer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

import de.scopevisio.importer.data.Kontakt;

/**
 * @author dirk.kohnen
 *
 */
public class ReadContactFromCSV {
	
	private List<String> cols = new ArrayList<String>();
	private List<Kontakt> contacts = new ArrayList<Kontakt>();
	
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
			StringTokenizer firstRow = new StringTokenizer(current, ";");
			while (firstRow.hasMoreTokens()){
				cols.add(firstRow.nextToken());
			}
			int z = 1;
	        current = reader.readLine();
	        while (current != null) {
	            final StringTokenizer st = new StringTokenizer(current, ";");
	            if (st.countTokens() > 2){
		            Kontakt k = new Kontakt();
	
		            for ( int i = 0; i < st.countTokens() ; i++) {
		                k.setAttribute(cols.get(i), st.nextToken());
		            }
		            this.contacts.add(k);
		            if (SV_Importer.debugLevel > 1){
		            	System.out.println(z + ". Kontakt hinzugefügt");
		            }		            
		            z++;
		            current = reader.readLine();
	            }
	        }
	        reader.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    
    public int countKontakte(){
    	return this.contacts.size();
    }

}
