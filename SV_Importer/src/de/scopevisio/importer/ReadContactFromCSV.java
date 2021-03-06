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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import de.scopevisio.importer.data.Contact;

/**
 * @author dirk.kohnen
 *
 */
public class ReadContactFromCSV {
	
	private List<String> cols = new ArrayList<String>();
	private List<Contact> contacts = new ArrayList<Contact>();
	private static final Logger LOGGER = LogManager.getLogger(SV_Importer.class.getName());
	
	public ReadContactFromCSV(File csv){
		this.parseCsvFile(csv);
	}
	
	// TODO Zeichensatz auswählbar machen
    /**
     * Lese CSV Datei und verarbeite zeilenweise.
     */
    public void parseCsvFile(File csv) {
    	InputStream inputStream;
		try {
			inputStream = new FileInputStream(csv);
			final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "Cp1252"));
			String current = reader.readLine();
			//System.out.println(current);
			String[] firstRow = current.split(";");
			for (int i = 0 ; i < firstRow.length ; i++){
				cols.add(firstRow[i]);
			}
			int z = 1;
	        current = reader.readLine();
        	//System.out.println(current);

	        while (current != null) {
	            String[] fields = current.split(";");
	            if (fields.length > 1){
		            Contact k = new Contact();
	
		            for ( int i = 0; i < fields.length ; i++) {
		            	//LOGGER.debug(cols.get(i) + " = " + fields[i]);
		                k.setAttribute(cols.get(i),fields[i]);
		            }
		            
		            this.contacts.add(k);
//		            LOGGER.debug(z + ". Kontakt hinzugefügt");
		            z++;
		            current = reader.readLine();
	            }
	        }
//	        System.out.println(this.contacts.size());
	        reader.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    
    public int countContacts(){
    	return this.contacts.size();
    }
    
    public List<Contact> getContacts(){
    	return this.contacts;
    }

}
