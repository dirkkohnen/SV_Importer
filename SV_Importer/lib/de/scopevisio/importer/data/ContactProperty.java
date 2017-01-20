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

	
	public String getJSON(){
		// 27722\"type\":\"Informationen zum Kontakt\",\"subtype\":\"a\",\"description\":\"abc\",\"validfrom\":\"23.05.2016\",\"spheres\":\"Kontakt\",\"employerids\":\"1009,1723\",\"employeedomain\":true},
		String jsonString = "{";
		if (this.attributesList[this.attributesNameList.indexOf("id")] != null) jsonString = jsonString + "\"id\":\"" + this.attributesList[this.attributesNameList.indexOf("id")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactid")] != null) jsonString = jsonString + "\"contactid\":\"" + this.attributesList[this.attributesNameList.indexOf("contactid")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("legacycontactid")] != null) jsonString = jsonString + "\"legacycontactid\":\"" + this.attributesList[this.attributesNameList.indexOf("legacycontactid")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("type")] != null) jsonString = jsonString + "\"type\":\"" + this.attributesList[this.attributesNameList.indexOf("type")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("subtype")] != null) jsonString = jsonString + "\"subtype\":\"" + this.attributesList[this.attributesNameList.indexOf("subtype")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("description")] != null) jsonString = jsonString + "\"description\":\"" + this.attributesList[this.attributesNameList.indexOf("description")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("validfrom")] != null) jsonString = jsonString + "\"validfrom\":\"" + this.attributesList[this.attributesNameList.indexOf("validfrom")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("validtill")] != null) jsonString = jsonString + "\"validtill\":\"" + this.attributesList[this.attributesNameList.indexOf("validtill")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("spheres")] != null) jsonString = jsonString + " spheres\":\"" + this.attributesList[this.attributesNameList.indexOf("spheres")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("employerids")] != null) jsonString = jsonString + "\"employerids\":\"" + this.attributesList[this.attributesNameList.indexOf("employerids")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("employeedomain")] != null) jsonString = jsonString + "\"employeedomain\":\"" + this.attributesList[this.attributesNameList.indexOf("employeedomain")] + "\",";
		jsonString = jsonString.substring(0, jsonString.length()-1);
		jsonString = jsonString +"}";
		return jsonString;
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
