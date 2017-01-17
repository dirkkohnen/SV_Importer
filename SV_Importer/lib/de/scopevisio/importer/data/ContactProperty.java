package de.scopevisio.importer.data;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Datenklasse Allgemeine Information</b></br>
 * Stell eine Allgemeine Information für einen Kontakt in Scopevisio dar. Die Klasse beinhaltet alle Argumente in Scopevisio.
 * Bietet die Möglichkeit Argumente einzeln über Getter und Setter zu setzen oder mit der Mehtode setAttribute einzelne Attribute zu setzen.</br>
 * Bietet die Möglichkeit eine Allgemeine Information in CSV-Format für den Webservice "ContactProperty.create" aufzubereiten.</br>
 * </br>
 * <i>Beispiel:</i></br>
 * {@code ContactProperty cp = new ContactProperty()}
 * 
 * @see {@https://openscope.de/api.html#import-von-allgemeinen-kontakt-informationen}
 *  
 * @author dirk.kohnen
 * @version 0.1
 * 
 */
public class ContactProperty {

	// {{  Variablen
	private List<Object> attributesNameList = new ArrayList<Object>();
	private String[] attributesList;
// }}
	
	
	// {{ Konstruktor
	/**
	 * Kontruktor
	 */
	public ContactProperty() {
		this.initalize();
	}
	// }}

	

	
	// {{ Methoden
	/**
	 * Methode zur Initialisierung der Klasse. Wird im Konstruktor aufgerufen
	 * @return void
	 */
	private void initalize() {
		this.attributesNameList.add("id");						// ID der allgemeinen Information
		this.attributesNameList.add("contactid");				// Master-ID des zugehörigen Kontaktes
		this.attributesNameList.add("legacycontactid");			// Nummer des Kontaktes im Vorsystem, falls die Master-ID nicht bekannt ist
		this.attributesNameList.add("description");				// Beschreibung
		this.attributesNameList.add("type");					// Art der Information, muss im System-Katalog "Art der Informationen" existieren
		this.attributesNameList.add("subtype");					// Untergruppierung, muss für die o. a. Art exitieren
		this.attributesNameList.add("validfrom");				// Gültig von (Format: TT.MM.JJJJ)
		this.attributesNameList.add("validtill");				// Gültig bis (Format: TT.MM.JJJJ)
		this.attributesNameList.add("spheres");					// Kommaseparierte Liste von Kontaktrollen, in denen die Information sichtbar sein soll
		this.attributesNameList.add("employerids");				// Kommaseparierte Liste von Master-IDs für Arbeitgeber-Kontakte, bei denen die Information angezeigt werden soll. Nur anwendbar für Mitarbeiterkontakte
		this.attributesNameList.add("employeedomain");			// Es handelt sich um eine Information zum Arbeitnehmer. Nur anwendbar für Mitarbeiterkontakte
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
	

	public String getCSVByColumns(String colList){
		String[] cols = colList.split(",");
		String csvString = "";
			for (String str : cols){
				if (str != null){
					//System.out.println(str);
					csvString = csvString + this.attributesList[this.attributesNameList.indexOf(str)] + ";";
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
			try{
				this.attributesList[this.attributesNameList.indexOf(attr)] = value;
			} catch  (Exception e) {
				System.out.println("Kann Attribut " + attr + " nicht setzen.");
			}
		}
	}
	// }}

}
