package de.scopevisio.importer.data;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Datenklasse Kontaktbeziehung</b></br>
 * Stell einen Kontaktbeziehung in Scopevisio dar. Die Klasse beinhaltet alle Argumente in Scopevisio.
 * Bietet die Möglichkeit Argumente einzeln über Getter und Setter zu setzen oder mit der Mehtode setAttribute einzelne Attribute zu setzen.</br>
 * Bietet die Möglichkeit einen Kontaktbeziehung in CSV-Format für den Webservice "Contact.importRelation" aufzubereiten.</br>
 * </br>
 * <i>Beispiel:</i></br>
 * {@code ContactRelation r = new ContactRelation()}
 * 
 * @see {@link https://www.openscope.de/api.html#import-von-kontakt-beziehungen}
 *  
 * @author dirk.kohnen
 * @version 0.1
 * 
 */
public class ContactRelation {

	// {{  Variablen
	private List<Object> attributesNameList = new ArrayList<Object>();
	private String[] attributesList;
// }}
	
	
	// {{ Konstruktor
	/**
	 * Kontruktor
	 */
	public ContactRelation() {
		this.initalize();
	}
	// }}

	
	// Getter und Setter


	
	// {{ Methoden
	/**
	 * Methode zur Initialisierung der Klasse. Wird im Konstruktor aufgerufen
	 * @return void
	 */
	private void initalize() {
		this.attributesNameList.add("ID-Ursprung ");
		this.attributesNameList.add("ID-Ziel");
		this.attributesNameList.add("Parameter");
		//System.out.println(this.attributesNameList.size());
		this.attributesList = new String[this.attributesNameList.size()];
		//System.out.println(this.attributesList.length);
	}

	
	public String getCSV(){
		String csvString = "";
			for (String str : this.attributesList){
				if (str != null){
					//System.out.println(str);
					csvString = csvString + str + ";";
				} else {
					//System.out.println("null");
					csvString = csvString + ";";
				}
			}
		return csvString;
	}
	
	
	/**
	 * Methode zum Setzen eines Attributes eines Kontaktes.
	 * @param attr Name des Attributs
	 * @param value Wert des Attributs
	 */
	public void setAttribute(String attr, String value) {
		if (attr.compareTo("unused") != 0){
			this.attributesList[this.attributesNameList.indexOf(attr)] = value;
		}
	}
	// }}

}
