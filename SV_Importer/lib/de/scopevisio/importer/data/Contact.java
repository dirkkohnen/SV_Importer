package de.scopevisio.importer.data;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Datenklasse Kontakt</b></br>
 * Stell einen Kontakt in Scopevisio dar. Die Klasse beinhaltet alle Argumente in Scopevisio.
 * Bietet die Möglichkeit Argumente einzeln über Getter und Setter zu setzen oder mit der Mehtode setAttribute einzelne Attribute zu setzen.</br>
 * Bietet die Möglichkeit einen Kontakt in CSV-Format für den Webservice "Contact.importExtendedCsv" aufzubereiten.</br>
 * </br>
 * <i>Beispiel:</i></br>
 * {@code Kontakt k = new Kontakt()}
 * 
 * @see {@link https://www.openscope.de/api.html#importieren-von-kontakten}
 *  
 * @author dirk.kohnen
 * @version 0.1
 * 
 */
public class Contact {

	// {{  Variablen
	private List<Object> attributesNameList = new ArrayList<Object>();
	private String[] attributesList;
// }}
	
	
	// {{ Konstruktor
	/**
	 * Kontruktor
	 */
	public Contact() {
		this.initalize();
	}
	// }}

	
	// {{ Methoden
	/**
	 * Methode zur Initialisierung der Klasse. Wird im Konstruktor aufgerufen
	 * @return void
	 */
	private void initalize() {
		this.attributesNameList.add("Ist_Firmenkontakt");
		this.attributesNameList.add("Vorname");
		this.attributesNameList.add("Name_Gesellschaftsname");
		this.attributesNameList.add("Interessent");
		this.attributesNameList.add("Lead");
		this.attributesNameList.add("Kunde");
		this.attributesNameList.add("Anrede");
		this.attributesNameList.add("Telefon_1");
		this.attributesNameList.add("Telefon_2");
		this.attributesNameList.add("Telefon_3");
		this.attributesNameList.add("Telefon_4");
		this.attributesNameList.add("Telefon_5");
		this.attributesNameList.add("Telefon_6");
		this.attributesNameList.add("Mobiltelefon_1");
		this.attributesNameList.add("Mobiltelefon_2");
		this.attributesNameList.add("Mobiltelefon_3");
		this.attributesNameList.add("Mobiltelefon_4");
		this.attributesNameList.add("Mobiltelefon_5");
		this.attributesNameList.add("Mobiltelefon_6");
		this.attributesNameList.add("E_Mail_1");
		this.attributesNameList.add("E_Mail_2");
		this.attributesNameList.add("E_Mail_3");
		this.attributesNameList.add("E_Mail_4");
		this.attributesNameList.add("E_Mail_5");
		this.attributesNameList.add("E_Mail_6");
		this.attributesNameList.add("Webseite");
		this.attributesNameList.add("Fax_1");
		this.attributesNameList.add("Fax_2");
		this.attributesNameList.add("Fax_3");
		this.attributesNameList.add("Fax_4");
		this.attributesNameList.add("Fax_5");
		this.attributesNameList.add("Fax_6");
		this.attributesNameList.add("Kundennummer");
		this.attributesNameList.add("Gesetzlicher_Vertreter");
		this.attributesNameList.add("Gesetzlicher_Vertreter_2");
		this.attributesNameList.add("Gesetzlicher_Vertreter_3");
		this.attributesNameList.add("Gesetzlicher_Vertreter_4");
		this.attributesNameList.add("Gesetzlicher_Vertreter_5");
		this.attributesNameList.add("Gesetzlicher_Vertreter_6");
		this.attributesNameList.add("Ansprechpartner_1");
		this.attributesNameList.add("Ansprechpartner_2");
		this.attributesNameList.add("Ansprechpartner_3");
		this.attributesNameList.add("Ansprechpartner_4");
		this.attributesNameList.add("Ansprechpartner_5");
		this.attributesNameList.add("Ansprechpartner_6");
		this.attributesNameList.add("Titel");
		this.attributesNameList.add("Alt_Klassifikation");
		this.attributesNameList.add("Stelle");
		this.attributesNameList.add("Geburtsdatum");
		this.attributesNameList.add("Abteilung");
		this.attributesNameList.add("Notiz");
		this.attributesNameList.add("Position");
		this.attributesNameList.add("Strasse_1");
		this.attributesNameList.add("Stadt_1");
		this.attributesNameList.add("Postleitzahl_1");
		this.attributesNameList.add("Bundesland_1");
		this.attributesNameList.add("Land_1");
		this.attributesNameList.add("Zeitzone_1");
		this.attributesNameList.add("Adresszeile_co_1");
		this.attributesNameList.add("Strasse_2");
		this.attributesNameList.add("Stadt_2");
		this.attributesNameList.add("Postleitzahl_2");
		this.attributesNameList.add("Bundesland_2");
		this.attributesNameList.add("Land_2");
		this.attributesNameList.add("Zeitzone_2");
		this.attributesNameList.add("Adresszeile_co_2");
		this.attributesNameList.add("Strasse_3");
		this.attributesNameList.add("Stadt_3");
		this.attributesNameList.add("Postleitzahl_3");
		this.attributesNameList.add("Bundesland_3");
		this.attributesNameList.add("Land_3");
		this.attributesNameList.add("Zeitzone_3");
		this.attributesNameList.add("Adresszeile_co_3");
		this.attributesNameList.add("Strasse_4");
		this.attributesNameList.add("Stadt_4");
		this.attributesNameList.add("Postleitzahl_4");
		this.attributesNameList.add("Bundesland_4");
		this.attributesNameList.add("Land_4");
		this.attributesNameList.add("Zeitzone_4");
		this.attributesNameList.add("Adresszeile_co_4");
		this.attributesNameList.add("Strasse_5");
		this.attributesNameList.add("Stadt_5");
		this.attributesNameList.add("Postleitzahl_5");
		this.attributesNameList.add("Bundesland_5");
		this.attributesNameList.add("Land_5");
		this.attributesNameList.add("Zeitzone_5");
		this.attributesNameList.add("Adresszeile_co_5");
		this.attributesNameList.add("Strasse_6");
		this.attributesNameList.add("Stadt_6");
		this.attributesNameList.add("Postleitzahl_6");
		this.attributesNameList.add("Bundesland_6");
		this.attributesNameList.add("Land_6");
		this.attributesNameList.add("Zeitzone_6");
		this.attributesNameList.add("Adresszeile_co_6");
		this.attributesNameList.add("Aktiv");
		this.attributesNameList.add("Kontaktinhaber");
		this.attributesNameList.add("Zahlungsart");
		this.attributesNameList.add("Branche");
		this.attributesNameList.add("Rechtsform_der_Organisation");
		this.attributesNameList.add("Art_der_Organisation");
		this.attributesNameList.add("Standardwaehrung");
		this.attributesNameList.add("Mitarbeiteranzahl_circa");
		this.attributesNameList.add("Jahresumsatz_Euro_circa");
		this.attributesNameList.add("Marktanteil_circa");
		this.attributesNameList.add("Geschlecht");
		this.attributesNameList.add("Geburtsname");
		this.attributesNameList.add("Familienstatus");
		this.attributesNameList.add("Anzahl_Kinder");
		this.attributesNameList.add("Beruf");
		this.attributesNameList.add("Arbeitgeber");
		this.attributesNameList.add("Dienststelle");
		this.attributesNameList.add("Ansprechpartner");
		this.attributesNameList.add("Hauspostadresse");
		this.attributesNameList.add("ABC_Kunde");
		this.attributesNameList.add("Kundengruppe");
		this.attributesNameList.add("Kundenstatus");
		this.attributesNameList.add("Sprache");
		this.attributesNameList.add("IMEI");
		this.attributesNameList.add("Bevorzugte_Kontaktart");
		this.attributesNameList.add("IM_Adresse");
		this.attributesNameList.add("Skype_ID");
		this.attributesNameList.add("Xing");
		this.attributesNameList.add("LinkedIn");
		this.attributesNameList.add("Link_Map");
		this.attributesNameList.add("Bundesanzeiger");
		this.attributesNameList.add("Handelsregister");
		this.attributesNameList.add("Handelsregisternummer");
		this.attributesNameList.add("Unternehmensgegenstand");
		this.attributesNameList.add("Betriebsnummer");
		this.attributesNameList.add("Berufsgenossenschaft");
		this.attributesNameList.add("eBay_ID");
		this.attributesNameList.add("Finanzamt");
		this.attributesNameList.add("Steuernummer");
		this.attributesNameList.add("USt_IdNr");
		this.attributesNameList.add("Waehrung");
		this.attributesNameList.add("Gemeinnuetzigkeit");
		this.attributesNameList.add("Art_der_Gemeinnuetzigkeit");
		this.attributesNameList.add("Foerderzweck");
		this.attributesNameList.add("VIP");
		this.attributesNameList.add("Kurzname");
		this.attributesNameList.add("Nationalitaet");
		this.attributesNameList.add("Zielgruppe");
		this.attributesNameList.add("Bildungsstand");
		this.attributesNameList.add("Einkommensklasse");
		this.attributesNameList.add("Einstellung");
		this.attributesNameList.add("Arbeitstyp");
		this.attributesNameList.add("Kaufverhalten");
		this.attributesNameList.add("Lebensstil");
		this.attributesNameList.add("Risikoeinstellung");
		this.attributesNameList.add("Kaeuferloyalitaet");
		this.attributesNameList.add("Vertriebsquelle");
		this.attributesNameList.add("Vertriebsweg");
		this.attributesNameList.add("Vertriebsbeauftragter");
		this.attributesNameList.add("Vertriebsorganisation");
		this.attributesNameList.add("Nielsenbezirke");
		this.attributesNameList.add("Vertriebsregionen");
		this.attributesNameList.add("Vertriebsrisiko");
		this.attributesNameList.add("Vertriebsprioritaet");
		this.attributesNameList.add("Nachfrageverhalten");
		this.attributesNameList.add("Vertriebsstatus");
		this.attributesNameList.add("Kundengruppe2");
		this.attributesNameList.add("Auslieferprioritaet");
		this.attributesNameList.add("Komplettlieferung");
		this.attributesNameList.add("Incoterms");
		this.attributesNameList.add("Incoterms_Ort");
		this.attributesNameList.add("Schlagworte");
		this.attributesNameList.add("ID_Vorsystem");
		this.attributesNameList.add("Benutzerfeld_1");
		this.attributesNameList.add("Benutzerfeld_2");
		this.attributesNameList.add("Benutzerfeld_3");
		this.attributesNameList.add("Benutzerfeld_4");
		this.attributesNameList.add("Benutzerfeld_5");
		this.attributesNameList.add("Benutzerfeld_6");
		this.attributesNameList.add("Benutzerfeld_7");
		this.attributesNameList.add("Benutzerfeld_8");
		this.attributesNameList.add("Benutzerfeld_9");
		this.attributesNameList.add("Benutzerfeld_10");
		this.attributesNameList.add("Lieferant");
		this.attributesNameList.add("ID Vorsystem");
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
