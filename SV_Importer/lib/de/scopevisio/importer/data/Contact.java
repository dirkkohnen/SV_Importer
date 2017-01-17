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

	
	// {{ Getter und Setter
	/**
	 * @return the ist_Firmenkontakt
	 */
	public String getIst_Firmenkontakt() {
		return this.attributesList[this.attributesNameList.indexOf("Ist_Firmenkontakt")];
	}

	/**
	 * @param ist_Firmenkontakt
	 *            the ist_Firmenkontakt to set
	 */
	public void setIst_Firmenkontakt(String ist_Firmenkontakt) {
		this.attributesList[this.attributesNameList.indexOf("Ist_Firmenkontakt")] = ist_Firmenkontakt;
	}

//	/**
//	 * @return the vorname
//	 */
//	public String getVorname() {
//		return Vorname;
//	}
//
//	/**
//	 * @param vorname
//	 *            the vorname to set
//	 */
//	public void setVorname(String vorname) {
//		Vorname = vorname;
//	}
//
//	/**
//	 * @return the name_Gesellschaftsname
//	 */
//	public String getName_Gesellschaftsname() {
//		return Name_Gesellschaftsname;
//	}
//
//	/**
//	 * @param name_Gesellschaftsname
//	 *            the name_Gesellschaftsname to set
//	 */
//	public void setName_Gesellschaftsname(String name_Gesellschaftsname) {
//		Name_Gesellschaftsname = name_Gesellschaftsname;
//	}
//
//	/**
//	 * @return the interessent
//	 */
//	public String getInteressent() {
//		return Interessent;
//	}
//
//	/**
//	 * @param interessent
//	 *            the interessent to set
//	 */
//	public void setInteressent(String interessent) {
//		Interessent = interessent;
//	}
//
//	/**
//	 * @return the lead
//	 */
//	public String getLead() {
//		return Lead;
//	}
//
//	/**
//	 * @param lead
//	 *            the lead to set
//	 */
//	public void setLead(String lead) {
//		Lead = lead;
//	}
//
//	/**
//	 * @return the kunde
//	 */
//	public String getKunde() {
//		return Kunde;
//	}
//
//	/**
//	 * @param kunde
//	 *            the kunde to set
//	 */
//	public void setKunde(String kunde) {
//		Kunde = kunde;
//	}
//
//	/**
//	 * @return the anrede
//	 */
//	public String getAnrede() {
//		return Anrede;
//	}
//
//	/**
//	 * @param anrede
//	 *            the anrede to set
//	 */
//	public void setAnrede(String anrede) {
//		Anrede = anrede;
//	}
//
//	/**
//	 * @return the telefon_1
//	 */
//	public String getTelefon_1() {
//		return Telefon_1;
//	}
//
//	/**
//	 * @param telefon_1
//	 *            the telefon_1 to set
//	 */
//	public void setTelefon_1(String telefon_1) {
//		Telefon_1 = telefon_1;
//	}
//
//	/**
//	 * @return the telefon_2
//	 */
//	public String getTelefon_2() {
//		return Telefon_2;
//	}
//
//	/**
//	 * @param telefon_2
//	 *            the telefon_2 to set
//	 */
//	public void setTelefon_2(String telefon_2) {
//		Telefon_2 = telefon_2;
//	}
//
//	/**
//	 * @return the telefon_3
//	 */
//	public String getTelefon_3() {
//		return Telefon_3;
//	}
//
//	/**
//	 * @param telefon_3
//	 *            the telefon_3 to set
//	 */
//	public void setTelefon_3(String telefon_3) {
//		Telefon_3 = telefon_3;
//	}
//
//	/**
//	 * @return the telefon_4
//	 */
//	public String getTelefon_4() {
//		return Telefon_4;
//	}
//
//	/**
//	 * @param telefon_4
//	 *            the telefon_4 to set
//	 */
//	public void setTelefon_4(String telefon_4) {
//		Telefon_4 = telefon_4;
//	}
//
//	/**
//	 * @return the telefon_5
//	 */
//	public String getTelefon_5() {
//		return Telefon_5;
//	}
//
//	/**
//	 * @param telefon_5
//	 *            the telefon_5 to set
//	 */
//	public void setTelefon_5(String telefon_5) {
//		Telefon_5 = telefon_5;
//	}
//
//	/**
//	 * @return the telefon_6
//	 */
//	public String getTelefon_6() {
//		return Telefon_6;
//	}
//
//	/**
//	 * @param telefon_6
//	 *            the telefon_6 to set
//	 */
//	public void setTelefon_6(String telefon_6) {
//		Telefon_6 = telefon_6;
//	}
//
//	/**
//	 * @return the mobiltelefon_1
//	 */
//	public String getMobiltelefon_1() {
//		return Mobiltelefon_1;
//	}
//
//	/**
//	 * @param mobiltelefon_1
//	 *            the mobiltelefon_1 to set
//	 */
//	public void setMobiltelefon_1(String mobiltelefon_1) {
//		Mobiltelefon_1 = mobiltelefon_1;
//	}
//
//	/**
//	 * @return the mobiltelefon_2
//	 */
//	public String getMobiltelefon_2() {
//		return Mobiltelefon_2;
//	}
//
//	/**
//	 * @param mobiltelefon_2
//	 *            the mobiltelefon_2 to set
//	 */
//	public void setMobiltelefon_2(String mobiltelefon_2) {
//		Mobiltelefon_2 = mobiltelefon_2;
//	}
//
//	/**
//	 * @return the mobiltelefon_3
//	 */
//	public String getMobiltelefon_3() {
//		return Mobiltelefon_3;
//	}
//
//	/**
//	 * @param mobiltelefon_3
//	 *            the mobiltelefon_3 to set
//	 */
//	public void setMobiltelefon_3(String mobiltelefon_3) {
//		Mobiltelefon_3 = mobiltelefon_3;
//	}
//
//	/**
//	 * @return the mobiltelefon_4
//	 */
//	public String getMobiltelefon_4() {
//		return Mobiltelefon_4;
//	}
//
//	/**
//	 * @param mobiltelefon_4
//	 *            the mobiltelefon_4 to set
//	 */
//	public void setMobiltelefon_4(String mobiltelefon_4) {
//		Mobiltelefon_4 = mobiltelefon_4;
//	}
//
//	/**
//	 * @return the mobiltelefon_5
//	 */
//	public String getMobiltelefon_5() {
//		return Mobiltelefon_5;
//	}
//
//	/**
//	 * @param mobiltelefon_5
//	 *            the mobiltelefon_5 to set
//	 */
//	public void setMobiltelefon_5(String mobiltelefon_5) {
//		Mobiltelefon_5 = mobiltelefon_5;
//	}
//
//	/**
//	 * @return the mobiltelefon_6
//	 */
//	public String getMobiltelefon_6() {
//		return Mobiltelefon_6;
//	}
//
//	/**
//	 * @param mobiltelefon_6
//	 *            the mobiltelefon_6 to set
//	 */
//	public void setMobiltelefon_6(String mobiltelefon_6) {
//		Mobiltelefon_6 = mobiltelefon_6;
//	}
//
//	/**
//	 * @return the e_Mail_1
//	 */
//	public String getE_Mail_1() {
//		return E_Mail_1;
//	}
//
//	/**
//	 * @param e_Mail_1
//	 *            the e_Mail_1 to set
//	 */
//	public void setE_Mail_1(String e_Mail_1) {
//		E_Mail_1 = e_Mail_1;
//	}
//
//	/**
//	 * @return the e_Mail_2
//	 */
//	public String getE_Mail_2() {
//		return E_Mail_2;
//	}
//
//	/**
//	 * @param e_Mail_2
//	 *            the e_Mail_2 to set
//	 */
//	public void setE_Mail_2(String e_Mail_2) {
//		E_Mail_2 = e_Mail_2;
//	}
//
//	/**
//	 * @return the e_Mail_3
//	 */
//	public String getE_Mail_3() {
//		return E_Mail_3;
//	}
//
//	/**
//	 * @param e_Mail_3
//	 *            the e_Mail_3 to set
//	 */
//	public void setE_Mail_3(String e_Mail_3) {
//		E_Mail_3 = e_Mail_3;
//	}
//
//	/**
//	 * @return the e_Mail_4
//	 */
//	public String getE_Mail_4() {
//		return E_Mail_4;
//	}
//
//	/**
//	 * @param e_Mail_4
//	 *            the e_Mail_4 to set
//	 */
//	public void setE_Mail_4(String e_Mail_4) {
//		E_Mail_4 = e_Mail_4;
//	}
//
//	/**
//	 * @return the e_Mail_5
//	 */
//	public String getE_Mail_5() {
//		return E_Mail_5;
//	}
//
//	/**
//	 * @param e_Mail_5
//	 *            the e_Mail_5 to set
//	 */
//	public void setE_Mail_5(String e_Mail_5) {
//		E_Mail_5 = e_Mail_5;
//	}
//
//	/**
//	 * @return the e_Mail_6
//	 */
//	public String getE_Mail_6() {
//		return E_Mail_6;
//	}
//
//	/**
//	 * @param e_Mail_6
//	 *            the e_Mail_6 to set
//	 */
//	public void setE_Mail_6(String e_Mail_6) {
//		E_Mail_6 = e_Mail_6;
//	}
//
//	/**
//	 * @return the webseite
//	 */
//	public String getWebseite() {
//		return Webseite;
//	}
//
//	/**
//	 * @param webseite
//	 *            the webseite to set
//	 */
//	public void setWebseite(String webseite) {
//		Webseite = webseite;
//	}
//
//	/**
//	 * @return the fax_1
//	 */
//	public String getFax_1() {
//		return Fax_1;
//	}
//
//	/**
//	 * @param fax_1
//	 *            the fax_1 to set
//	 */
//	public void setFax_1(String fax_1) {
//		Fax_1 = fax_1;
//	}
//
//	/**
//	 * @return the fax_2
//	 */
//	public String getFax_2() {
//		return Fax_2;
//	}
//
//	/**
//	 * @param fax_2
//	 *            the fax_2 to set
//	 */
//	public void setFax_2(String fax_2) {
//		Fax_2 = fax_2;
//	}
//
//	/**
//	 * @return the fax_3
//	 */
//	public String getFax_3() {
//		return Fax_3;
//	}
//
//	/**
//	 * @param fax_3
//	 *            the fax_3 to set
//	 */
//	public void setFax_3(String fax_3) {
//		Fax_3 = fax_3;
//	}
//
//	/**
//	 * @return the fax_4
//	 */
//	public String getFax_4() {
//		return Fax_4;
//	}
//
//	/**
//	 * @param fax_4
//	 *            the fax_4 to set
//	 */
//	public void setFax_4(String fax_4) {
//		Fax_4 = fax_4;
//	}
//
//	/**
//	 * @return the fax_5
//	 */
//	public String getFax_5() {
//		return Fax_5;
//	}
//
//	/**
//	 * @param fax_5
//	 *            the fax_5 to set
//	 */
//	public void setFax_5(String fax_5) {
//		Fax_5 = fax_5;
//	}
//
//	/**
//	 * @return the fax_6
//	 */
//	public String getFax_6() {
//		return Fax_6;
//	}
//
//	/**
//	 * @param fax_6
//	 *            the fax_6 to set
//	 */
//	public void setFax_6(String fax_6) {
//		Fax_6 = fax_6;
//	}
//
//	/**
//	 * @return the kundennummer
//	 */
//	public String getKundennummer() {
//		return Kundennummer;
//	}
//
//	/**
//	 * @param kundennummer
//	 *            the kundennummer to set
//	 */
//	public void setKundennummer(String kundennummer) {
//		Kundennummer = kundennummer;
//	}
//
//	/**
//	 * @return the gesetzlicher_Vertreter
//	 */
//	public String getGesetzlicher_Vertreter() {
//		return Gesetzlicher_Vertreter;
//	}
//
//	/**
//	 * @param gesetzlicher_Vertreter
//	 *            the gesetzlicher_Vertreter to set
//	 */
//	public void setGesetzlicher_Vertreter(String gesetzlicher_Vertreter) {
//		Gesetzlicher_Vertreter = gesetzlicher_Vertreter;
//	}
//
//	/**
//	 * @return the gesetzlicher_Vertreter_2
//	 */
//	public String getGesetzlicher_Vertreter_2() {
//		return Gesetzlicher_Vertreter_2;
//	}
//
//	/**
//	 * @param gesetzlicher_Vertreter_2
//	 *            the gesetzlicher_Vertreter_2 to set
//	 */
//	public void setGesetzlicher_Vertreter_2(String gesetzlicher_Vertreter_2) {
//		Gesetzlicher_Vertreter_2 = gesetzlicher_Vertreter_2;
//	}
//
//	/**
//	 * @return the gesetzlicher_Vertreter_3
//	 */
//	public String getGesetzlicher_Vertreter_3() {
//		return Gesetzlicher_Vertreter_3;
//	}
//
//	/**
//	 * @param gesetzlicher_Vertreter_3
//	 *            the gesetzlicher_Vertreter_3 to set
//	 */
//	public void setGesetzlicher_Vertreter_3(String gesetzlicher_Vertreter_3) {
//		Gesetzlicher_Vertreter_3 = gesetzlicher_Vertreter_3;
//	}
//
//	/**
//	 * @return the gesetzlicher_Vertreter_4
//	 */
//	public String getGesetzlicher_Vertreter_4() {
//		return Gesetzlicher_Vertreter_4;
//	}
//
//	/**
//	 * @param gesetzlicher_Vertreter_4
//	 *            the gesetzlicher_Vertreter_4 to set
//	 */
//	public void setGesetzlicher_Vertreter_4(String gesetzlicher_Vertreter_4) {
//		Gesetzlicher_Vertreter_4 = gesetzlicher_Vertreter_4;
//	}
//
//	/**
//	 * @return the gesetzlicher_Vertreter_5
//	 */
//	public String getGesetzlicher_Vertreter_5() {
//		return Gesetzlicher_Vertreter_5;
//	}
//
//	/**
//	 * @param gesetzlicher_Vertreter_5
//	 *            the gesetzlicher_Vertreter_5 to set
//	 */
//	public void setGesetzlicher_Vertreter_5(String gesetzlicher_Vertreter_5) {
//		Gesetzlicher_Vertreter_5 = gesetzlicher_Vertreter_5;
//	}
//
//	/**
//	 * @return the gesetzlicher_Vertreter_6
//	 */
//	public String getGesetzlicher_Vertreter_6() {
//		return Gesetzlicher_Vertreter_6;
//	}
//
//	/**
//	 * @param gesetzlicher_Vertreter_6
//	 *            the gesetzlicher_Vertreter_6 to set
//	 */
//	public void setGesetzlicher_Vertreter_6(String gesetzlicher_Vertreter_6) {
//		Gesetzlicher_Vertreter_6 = gesetzlicher_Vertreter_6;
//	}
//
//	/**
//	 * @return the ansprechpartner_1
//	 */
//	public String getAnsprechpartner_1() {
//		return Ansprechpartner_1;
//	}
//
//	/**
//	 * @param ansprechpartner_1
//	 *            the ansprechpartner_1 to set
//	 */
//	public void setAnsprechpartner_1(String ansprechpartner_1) {
//		Ansprechpartner_1 = ansprechpartner_1;
//	}
//
//	/**
//	 * @return the ansprechpartner_2
//	 */
//	public String getAnsprechpartner_2() {
//		return Ansprechpartner_2;
//	}
//
//	/**
//	 * @param ansprechpartner_2
//	 *            the ansprechpartner_2 to set
//	 */
//	public void setAnsprechpartner_2(String ansprechpartner_2) {
//		Ansprechpartner_2 = ansprechpartner_2;
//	}
//
//	/**
//	 * @return the ansprechpartner_3
//	 */
//	public String getAnsprechpartner_3() {
//		return Ansprechpartner_3;
//	}
//
//	/**
//	 * @param ansprechpartner_3
//	 *            the ansprechpartner_3 to set
//	 */
//	public void setAnsprechpartner_3(String ansprechpartner_3) {
//		Ansprechpartner_3 = ansprechpartner_3;
//	}
//
//	/**
//	 * @return the ansprechpartner_4
//	 */
//	public String getAnsprechpartner_4() {
//		return Ansprechpartner_4;
//	}
//
//	/**
//	 * @param ansprechpartner_4
//	 *            the ansprechpartner_4 to set
//	 */
//	public void setAnsprechpartner_4(String ansprechpartner_4) {
//		Ansprechpartner_4 = ansprechpartner_4;
//	}
//
//	/**
//	 * @return the ansprechpartner_5
//	 */
//	public String getAnsprechpartner_5() {
//		return Ansprechpartner_5;
//	}
//
//	/**
//	 * @param ansprechpartner_5
//	 *            the ansprechpartner_5 to set
//	 */
//	public void setAnsprechpartner_5(String ansprechpartner_5) {
//		Ansprechpartner_5 = ansprechpartner_5;
//	}
//
//	/**
//	 * @return the ansprechpartner_6
//	 */
//	public String getAnsprechpartner_6() {
//		return Ansprechpartner_6;
//	}
//
//	/**
//	 * @param ansprechpartner_6
//	 *            the ansprechpartner_6 to set
//	 */
//	public void setAnsprechpartner_6(String ansprechpartner_6) {
//		Ansprechpartner_6 = ansprechpartner_6;
//	}
//
//	/**
//	 * @return the titel
//	 */
//	public String getTitel() {
//		return Titel;
//	}
//
//	/**
//	 * @param titel
//	 *            the titel to set
//	 */
//	public void setTitel(String titel) {
//		Titel = titel;
//	}
//
//	/**
//	 * @return the alt_Klassifikation
//	 */
//	public String getAlt_Klassifikation() {
//		return Alt_Klassifikation;
//	}
//
//	/**
//	 * @param alt_Klassifikation
//	 *            the alt_Klassifikation to set
//	 */
//	public void setAlt_Klassifikation(String alt_Klassifikation) {
//		Alt_Klassifikation = alt_Klassifikation;
//	}
//
//	/**
//	 * @return the stelle
//	 */
//	public String getStelle() {
//		return Stelle;
//	}
//
//	/**
//	 * @param stelle
//	 *            the stelle to set
//	 */
//	public void setStelle(String stelle) {
//		Stelle = stelle;
//	}
//
//	/**
//	 * @return the geburtsdatum
//	 */
//	public String getGeburtsdatum() {
//		return Geburtsdatum;
//	}
//
//	/**
//	 * @param geburtsdatum
//	 *            the geburtsdatum to set
//	 */
//	public void setGeburtsdatum(String geburtsdatum) {
//		Geburtsdatum = geburtsdatum;
//	}
//
//	/**
//	 * @return the abteilung
//	 */
//	public String getAbteilung() {
//		return Abteilung;
//	}
//
//	/**
//	 * @param abteilung
//	 *            the abteilung to set
//	 */
//	public void setAbteilung(String abteilung) {
//		Abteilung = abteilung;
//	}
//
//	/**
//	 * @return the notiz
//	 */
//	public String getNotiz() {
//		return Notiz;
//	}
//
//	/**
//	 * @param notiz
//	 *            the notiz to set
//	 */
//	public void setNotiz(String notiz) {
//		Notiz = notiz;
//	}
//
//	/**
//	 * @return the position
//	 */
//	public String getPosition() {
//		return Position;
//	}
//
//	/**
//	 * @param position
//	 *            the position to set
//	 */
//	public void setPosition(String position) {
//		Position = position;
//	}
//
//	/**
//	 * @return the strasse_1
//	 */
//	public String getStrasse_1() {
//		return Strasse_1;
//	}
//
//	/**
//	 * @param strasse_1
//	 *            the strasse_1 to set
//	 */
//	public void setStrasse_1(String strasse_1) {
//		Strasse_1 = strasse_1;
//	}
//
//	/**
//	 * @return the stadt_1
//	 */
//	public String getStadt_1() {
//		return Stadt_1;
//	}
//
//	/**
//	 * @param stadt_1
//	 *            the stadt_1 to set
//	 */
//	public void setStadt_1(String stadt_1) {
//		Stadt_1 = stadt_1;
//	}
//
//	/**
//	 * @return the postleitzahl_1
//	 */
//	public String getPostleitzahl_1() {
//		return Postleitzahl_1;
//	}
//
//	/**
//	 * @param postleitzahl_1
//	 *            the postleitzahl_1 to set
//	 */
//	public void setPostleitzahl_1(String postleitzahl_1) {
//		Postleitzahl_1 = postleitzahl_1;
//	}
//
//	/**
//	 * @return the bundesland_1
//	 */
//	public String getBundesland_1() {
//		return Bundesland_1;
//	}
//
//	/**
//	 * @param bundesland_1
//	 *            the bundesland_1 to set
//	 */
//	public void setBundesland_1(String bundesland_1) {
//		Bundesland_1 = bundesland_1;
//	}
//
//	/**
//	 * @return the land_1
//	 */
//	public String getLand_1() {
//		return Land_1;
//	}
//
//	/**
//	 * @param land_1
//	 *            the land_1 to set
//	 */
//	public void setLand_1(String land_1) {
//		Land_1 = land_1;
//	}
//
//	/**
//	 * @return the zeitzone_1
//	 */
//	public String getZeitzone_1() {
//		return Zeitzone_1;
//	}
//
//	/**
//	 * @param zeitzone_1
//	 *            the zeitzone_1 to set
//	 */
//	public void setZeitzone_1(String zeitzone_1) {
//		Zeitzone_1 = zeitzone_1;
//	}
//
//	/**
//	 * @return the adresszeile_co_1
//	 */
//	public String getAdresszeile_co_1() {
//		return Adresszeile_co_1;
//	}
//
//	/**
//	 * @param adresszeile_co_1
//	 *            the adresszeile_co_1 to set
//	 */
//	public void setAdresszeile_co_1(String adresszeile_co_1) {
//		Adresszeile_co_1 = adresszeile_co_1;
//	}
//
//	/**
//	 * @return the strasse_2
//	 */
//	public String getStrasse_2() {
//		return Strasse_2;
//	}
//
//	/**
//	 * @param strasse_2
//	 *            the strasse_2 to set
//	 */
//	public void setStrasse_2(String strasse_2) {
//		Strasse_2 = strasse_2;
//	}
//
//	/**
//	 * @return the stadt_2
//	 */
//	public String getStadt_2() {
//		return Stadt_2;
//	}
//
//	/**
//	 * @param stadt_2
//	 *            the stadt_2 to set
//	 */
//	public void setStadt_2(String stadt_2) {
//		Stadt_2 = stadt_2;
//	}
//
//	/**
//	 * @return the postleitzahl_2
//	 */
//	public String getPostleitzahl_2() {
//		return Postleitzahl_2;
//	}
//
//	/**
//	 * @param postleitzahl_2
//	 *            the postleitzahl_2 to set
//	 */
//	public void setPostleitzahl_2(String postleitzahl_2) {
//		Postleitzahl_2 = postleitzahl_2;
//	}
//
//	/**
//	 * @return the bundesland_2
//	 */
//	public String getBundesland_2() {
//		return Bundesland_2;
//	}
//
//	/**
//	 * @param bundesland_2
//	 *            the bundesland_2 to set
//	 */
//	public void setBundesland_2(String bundesland_2) {
//		Bundesland_2 = bundesland_2;
//	}
//
//	/**
//	 * @return the land_2
//	 */
//	public String getLand_2() {
//		return Land_2;
//	}
//
//	/**
//	 * @param land_2
//	 *            the land_2 to set
//	 */
//	public void setLand_2(String land_2) {
//		Land_2 = land_2;
//	}
//
//	/**
//	 * @return the zeitzone_2
//	 */
//	public String getZeitzone_2() {
//		return Zeitzone_2;
//	}
//
//	/**
//	 * @param zeitzone_2
//	 *            the zeitzone_2 to set
//	 */
//	public void setZeitzone_2(String zeitzone_2) {
//		Zeitzone_2 = zeitzone_2;
//	}
//
//	/**
//	 * @return the adresszeile_co_2
//	 */
//	public String getAdresszeile_co_2() {
//		return Adresszeile_co_2;
//	}
//
//	/**
//	 * @param adresszeile_co_2
//	 *            the adresszeile_co_2 to set
//	 */
//	public void setAdresszeile_co_2(String adresszeile_co_2) {
//		Adresszeile_co_2 = adresszeile_co_2;
//	}
//
//	/**
//	 * @return the strasse_3
//	 */
//	public String getStrasse_3() {
//		return Strasse_3;
//	}
//
//	/**
//	 * @param strasse_3
//	 *            the strasse_3 to set
//	 */
//	public void setStrasse_3(String strasse_3) {
//		Strasse_3 = strasse_3;
//	}
//
//	/**
//	 * @return the stadt_3
//	 */
//	public String getStadt_3() {
//		return Stadt_3;
//	}
//
//	/**
//	 * @param stadt_3
//	 *            the stadt_3 to set
//	 */
//	public void setStadt_3(String stadt_3) {
//		Stadt_3 = stadt_3;
//	}
//
//	/**
//	 * @return the postleitzahl_3
//	 */
//	public String getPostleitzahl_3() {
//		return Postleitzahl_3;
//	}
//
//	/**
//	 * @param postleitzahl_3
//	 *            the postleitzahl_3 to set
//	 */
//	public void setPostleitzahl_3(String postleitzahl_3) {
//		Postleitzahl_3 = postleitzahl_3;
//	}
//
//	/**
//	 * @return the bundesland_3
//	 */
//	public String getBundesland_3() {
//		return Bundesland_3;
//	}
//
//	/**
//	 * @param bundesland_3
//	 *            the bundesland_3 to set
//	 */
//	public void setBundesland_3(String bundesland_3) {
//		Bundesland_3 = bundesland_3;
//	}
//
//	/**
//	 * @return the land_3
//	 */
//	public String getLand_3() {
//		return Land_3;
//	}
//
//	/**
//	 * @param land_3
//	 *            the land_3 to set
//	 */
//	public void setLand_3(String land_3) {
//		Land_3 = land_3;
//	}
//
//	/**
//	 * @return the zeitzone_3
//	 */
//	public String getZeitzone_3() {
//		return Zeitzone_3;
//	}
//
//	/**
//	 * @param zeitzone_3
//	 *            the zeitzone_3 to set
//	 */
//	public void setZeitzone_3(String zeitzone_3) {
//		Zeitzone_3 = zeitzone_3;
//	}
//
//	/**
//	 * @return the adresszeile_co_3
//	 */
//	public String getAdresszeile_co_3() {
//		return Adresszeile_co_3;
//	}
//
//	/**
//	 * @param adresszeile_co_3
//	 *            the adresszeile_co_3 to set
//	 */
//	public void setAdresszeile_co_3(String adresszeile_co_3) {
//		Adresszeile_co_3 = adresszeile_co_3;
//	}
//
//	/**
//	 * @return the strasse_4
//	 */
//	public String getStrasse_4() {
//		return Strasse_4;
//	}
//
//	/**
//	 * @param strasse_4
//	 *            the strasse_4 to set
//	 */
//	public void setStrasse_4(String strasse_4) {
//		Strasse_4 = strasse_4;
//	}
//
//	/**
//	 * @return the stadt_4
//	 */
//	public String getStadt_4() {
//		return Stadt_4;
//	}
//
//	/**
//	 * @param stadt_4
//	 *            the stadt_4 to set
//	 */
//	public void setStadt_4(String stadt_4) {
//		Stadt_4 = stadt_4;
//	}
//
//	/**
//	 * @return the postleitzahl_4
//	 */
//	public String getPostleitzahl_4() {
//		return Postleitzahl_4;
//	}
//
//	/**
//	 * @param postleitzahl_4
//	 *            the postleitzahl_4 to set
//	 */
//	public void setPostleitzahl_4(String postleitzahl_4) {
//		Postleitzahl_4 = postleitzahl_4;
//	}
//
//	/**
//	 * @return the bundesland_4
//	 */
//	public String getBundesland_4() {
//		return Bundesland_4;
//	}
//
//	/**
//	 * @param bundesland_4
//	 *            the bundesland_4 to set
//	 */
//	public void setBundesland_4(String bundesland_4) {
//		Bundesland_4 = bundesland_4;
//	}
//
//	/**
//	 * @return the land_4
//	 */
//	public String getLand_4() {
//		return Land_4;
//	}
//
//	/**
//	 * @param land_4
//	 *            the land_4 to set
//	 */
//	public void setLand_4(String land_4) {
//		Land_4 = land_4;
//	}
//
//	/**
//	 * @return the zeitzone_4
//	 */
//	public String getZeitzone_4() {
//		return Zeitzone_4;
//	}
//
//	/**
//	 * @param zeitzone_4
//	 *            the zeitzone_4 to set
//	 */
//	public void setZeitzone_4(String zeitzone_4) {
//		Zeitzone_4 = zeitzone_4;
//	}
//
//	/**
//	 * @return the adresszeile_co_4
//	 */
//	public String getAdresszeile_co_4() {
//		return Adresszeile_co_4;
//	}
//
//	/**
//	 * @param adresszeile_co_4
//	 *            the adresszeile_co_4 to set
//	 */
//	public void setAdresszeile_co_4(String adresszeile_co_4) {
//		Adresszeile_co_4 = adresszeile_co_4;
//	}
//
//	/**
//	 * @return the strasse_5
//	 */
//	public String getStrasse_5() {
//		return Strasse_5;
//	}
//
//	/**
//	 * @param strasse_5
//	 *            the strasse_5 to set
//	 */
//	public void setStrasse_5(String strasse_5) {
//		Strasse_5 = strasse_5;
//	}
//
//	/**
//	 * @return the stadt_5
//	 */
//	public String getStadt_5() {
//		return Stadt_5;
//	}
//
//	/**
//	 * @param stadt_5
//	 *            the stadt_5 to set
//	 */
//	public void setStadt_5(String stadt_5) {
//		Stadt_5 = stadt_5;
//	}
//
//	/**
//	 * @return the postleitzahl_5
//	 */
//	public String getPostleitzahl_5() {
//		return Postleitzahl_5;
//	}
//
//	/**
//	 * @param postleitzahl_5
//	 *            the postleitzahl_5 to set
//	 */
//	public void setPostleitzahl_5(String postleitzahl_5) {
//		Postleitzahl_5 = postleitzahl_5;
//	}
//
//	/**
//	 * @return the bundesland_5
//	 */
//	public String getBundesland_5() {
//		return Bundesland_5;
//	}
//
//	/**
//	 * @param bundesland_5
//	 *            the bundesland_5 to set
//	 */
//	public void setBundesland_5(String bundesland_5) {
//		Bundesland_5 = bundesland_5;
//	}
//
//	/**
//	 * @return the land_5
//	 */
//	public String getLand_5() {
//		return Land_5;
//	}
//
//	/**
//	 * @param land_5
//	 *            the land_5 to set
//	 */
//	public void setLand_5(String land_5) {
//		Land_5 = land_5;
//	}
//
//	/**
//	 * @return the zeitzone_5
//	 */
//	public String getZeitzone_5() {
//		return Zeitzone_5;
//	}
//
//	/**
//	 * @param zeitzone_5
//	 *            the zeitzone_5 to set
//	 */
//	public void setZeitzone_5(String zeitzone_5) {
//		Zeitzone_5 = zeitzone_5;
//	}
//
//	/**
//	 * @return the adresszeile_co_5
//	 */
//	public String getAdresszeile_co_5() {
//		return Adresszeile_co_5;
//	}
//
//	/**
//	 * @param adresszeile_co_5
//	 *            the adresszeile_co_5 to set
//	 */
//	public void setAdresszeile_co_5(String adresszeile_co_5) {
//		Adresszeile_co_5 = adresszeile_co_5;
//	}
//
//	/**
//	 * @return the strasse_6
//	 */
//	public String getStrasse_6() {
//		return Strasse_6;
//	}
//
//	/**
//	 * @param strasse_6
//	 *            the strasse_6 to set
//	 */
//	public void setStrasse_6(String strasse_6) {
//		Strasse_6 = strasse_6;
//	}
//
//	/**
//	 * @return the stadt_6
//	 */
//	public String getStadt_6() {
//		return Stadt_6;
//	}
//
//	/**
//	 * @param stadt_6
//	 *            the stadt_6 to set
//	 */
//	public void setStadt_6(String stadt_6) {
//		Stadt_6 = stadt_6;
//	}
//
//	/**
//	 * @return the postleitzahl_6
//	 */
//	public String getPostleitzahl_6() {
//		return Postleitzahl_6;
//	}
//
//	/**
//	 * @param postleitzahl_6
//	 *            the postleitzahl_6 to set
//	 */
//	public void setPostleitzahl_6(String postleitzahl_6) {
//		Postleitzahl_6 = postleitzahl_6;
//	}
//
//	/**
//	 * @return the bundesland_6
//	 */
//	public String getBundesland_6() {
//		return Bundesland_6;
//	}
//
//	/**
//	 * @param bundesland_6
//	 *            the bundesland_6 to set
//	 */
//	public void setBundesland_6(String bundesland_6) {
//		Bundesland_6 = bundesland_6;
//	}
//
//	/**
//	 * @return the land_6
//	 */
//	public String getLand_6() {
//		return Land_6;
//	}
//
//	/**
//	 * @param land_6
//	 *            the land_6 to set
//	 */
//	public void setLand_6(String land_6) {
//		Land_6 = land_6;
//	}
//
//	/**
//	 * @return the zeitzone_6
//	 */
//	public String getZeitzone_6() {
//		return Zeitzone_6;
//	}
//
//	/**
//	 * @param zeitzone_6
//	 *            the zeitzone_6 to set
//	 */
//	public void setZeitzone_6(String zeitzone_6) {
//		Zeitzone_6 = zeitzone_6;
//	}
//
//	/**
//	 * @return the adresszeile_co_6
//	 */
//	public String getAdresszeile_co_6() {
//		return Adresszeile_co_6;
//	}
//
//	/**
//	 * @param adresszeile_co_6
//	 *            the adresszeile_co_6 to set
//	 */
//	public void setAdresszeile_co_6(String adresszeile_co_6) {
//		Adresszeile_co_6 = adresszeile_co_6;
//	}
//
//	/**
//	 * @return the aktiv
//	 */
//	public String getAktiv() {
//		return Aktiv;
//	}
//
//	/**
//	 * @param aktiv
//	 *            the aktiv to set
//	 */
//	public void setAktiv(String aktiv) {
//		Aktiv = aktiv;
//	}
//
//	/**
//	 * @return the kontaktinhaber
//	 */
//	public String getKontaktinhaber() {
//		return Kontaktinhaber;
//	}
//
//	/**
//	 * @param kontaktinhaber
//	 *            the kontaktinhaber to set
//	 */
//	public void setKontaktinhaber(String kontaktinhaber) {
//		Kontaktinhaber = kontaktinhaber;
//	}
//
//	/**
//	 * @return the zahlungsart
//	 */
//	public String getZahlungsart() {
//		return Zahlungsart;
//	}
//
//	/**
//	 * @param zahlungsart
//	 *            the zahlungsart to set
//	 */
//	public void setZahlungsart(String zahlungsart) {
//		Zahlungsart = zahlungsart;
//	}
//
//	/**
//	 * @return the branche
//	 */
//	public String getBranche() {
//		return Branche;
//	}
//
//	/**
//	 * @param branche
//	 *            the branche to set
//	 */
//	public void setBranche(String branche) {
//		Branche = branche;
//	}
//
//	/**
//	 * @return the rechtsform_der_Organisation
//	 */
//	public String getRechtsform_der_Organisation() {
//		return Rechtsform_der_Organisation;
//	}
//
//	/**
//	 * @param rechtsform_der_Organisation
//	 *            the rechtsform_der_Organisation to set
//	 */
//	public void setRechtsform_der_Organisation(String rechtsform_der_Organisation) {
//		Rechtsform_der_Organisation = rechtsform_der_Organisation;
//	}
//
//	/**
//	 * @return the art_der_Organisation
//	 */
//	public String getArt_der_Organisation() {
//		return Art_der_Organisation;
//	}
//
//	/**
//	 * @param art_der_Organisation
//	 *            the art_der_Organisation to set
//	 */
//	public void setArt_der_Organisation(String art_der_Organisation) {
//		Art_der_Organisation = art_der_Organisation;
//	}
//
//	/**
//	 * @return the standardwaehrung
//	 */
//	public String getStandardwaehrung() {
//		return Standardwaehrung;
//	}
//
//	/**
//	 * @param standardwaehrung
//	 *            the standardwaehrung to set
//	 */
//	public void setStandardwaehrung(String standardwaehrung) {
//		Standardwaehrung = standardwaehrung;
//	}
//
//	/**
//	 * @return the mitarbeiteranzahl_circa
//	 */
//	public String getMitarbeiteranzahl_circa() {
//		return Mitarbeiteranzahl_circa;
//	}
//
//	/**
//	 * @param mitarbeiteranzahl_circa
//	 *            the mitarbeiteranzahl_circa to set
//	 */
//	public void setMitarbeiteranzahl_circa(String mitarbeiteranzahl_circa) {
//		Mitarbeiteranzahl_circa = mitarbeiteranzahl_circa;
//	}
//
//	/**
//	 * @return the jahresumsatz_Euro_circa
//	 */
//	public String getJahresumsatz_Euro_circa() {
//		return Jahresumsatz_Euro_circa;
//	}
//
//	/**
//	 * @param jahresumsatz_Euro_circa
//	 *            the jahresumsatz_Euro_circa to set
//	 */
//	public void setJahresumsatz_Euro_circa(String jahresumsatz_Euro_circa) {
//		Jahresumsatz_Euro_circa = jahresumsatz_Euro_circa;
//	}
//
//	/**
//	 * @return the marktanteil_circa
//	 */
//	public String getMarktanteil_circa() {
//		return Marktanteil_circa;
//	}
//
//	/**
//	 * @param marktanteil_circa
//	 *            the marktanteil_circa to set
//	 */
//	public void setMarktanteil_circa(String marktanteil_circa) {
//		Marktanteil_circa = marktanteil_circa;
//	}
//
//	/**
//	 * @return the geschlecht
//	 */
//	public String getGeschlecht() {
//		return Geschlecht;
//	}
//
//	/**
//	 * @param geschlecht
//	 *            the geschlecht to set
//	 */
//	public void setGeschlecht(String geschlecht) {
//		Geschlecht = geschlecht;
//	}
//
//	/**
//	 * @return the geburtsname
//	 */
//	public String getGeburtsname() {
//		return Geburtsname;
//	}
//
//	/**
//	 * @param geburtsname
//	 *            the geburtsname to set
//	 */
//	public void setGeburtsname(String geburtsname) {
//		Geburtsname = geburtsname;
//	}
//
//	/**
//	 * @return the familienstatus
//	 */
//	public String getFamilienstatus() {
//		return Familienstatus;
//	}
//
//	/**
//	 * @param familienstatus
//	 *            the familienstatus to set
//	 */
//	public void setFamilienstatus(String familienstatus) {
//		Familienstatus = familienstatus;
//	}
//
//	/**
//	 * @return the anzahl_Kinder
//	 */
//	public String getAnzahl_Kinder() {
//		return Anzahl_Kinder;
//	}
//
//	/**
//	 * @param anzahl_Kinder
//	 *            the anzahl_Kinder to set
//	 */
//	public void setAnzahl_Kinder(String anzahl_Kinder) {
//		Anzahl_Kinder = anzahl_Kinder;
//	}
//
//	/**
//	 * @return the beruf
//	 */
//	public String getBeruf() {
//		return Beruf;
//	}
//
//	/**
//	 * @param beruf
//	 *            the beruf to set
//	 */
//	public void setBeruf(String beruf) {
//		Beruf = beruf;
//	}
//
//	/**
//	 * @return the arbeitgeber
//	 */
//	public String getArbeitgeber() {
//		return Arbeitgeber;
//	}
//
//	/**
//	 * @param arbeitgeber
//	 *            the arbeitgeber to set
//	 */
//	public void setArbeitgeber(String arbeitgeber) {
//		Arbeitgeber = arbeitgeber;
//	}
//
//	/**
//	 * @return the dienststelle
//	 */
//	public String getDienststelle() {
//		return Dienststelle;
//	}
//
//	/**
//	 * @param dienststelle
//	 *            the dienststelle to set
//	 */
//	public void setDienststelle(String dienststelle) {
//		Dienststelle = dienststelle;
//	}
//
//	/**
//	 * @return the ansprechpartner
//	 */
//	public String getAnsprechpartner() {
//		return Ansprechpartner;
//	}
//
//	/**
//	 * @param ansprechpartner
//	 *            the ansprechpartner to set
//	 */
//	public void setAnsprechpartner(String ansprechpartner) {
//		Ansprechpartner = ansprechpartner;
//	}
//
//	/**
//	 * @return the hauspostadresse
//	 */
//	public String getHauspostadresse() {
//		return Hauspostadresse;
//	}
//
//	/**
//	 * @param hauspostadresse
//	 *            the hauspostadresse to set
//	 */
//	public void setHauspostadresse(String hauspostadresse) {
//		Hauspostadresse = hauspostadresse;
//	}
//
//	/**
//	 * @return the aBC_Kunde
//	 */
//	public String getABC_Kunde() {
//		return ABC_Kunde;
//	}
//
//	/**
//	 * @param aBC_Kunde
//	 *            the aBC_Kunde to set
//	 */
//	public void setABC_Kunde(String aBC_Kunde) {
//		ABC_Kunde = aBC_Kunde;
//	}
//
//	/**
//	 * @return the kundengruppe
//	 */
//	public String getKundengruppe() {
//		return Kundengruppe;
//	}
//
//	/**
//	 * @param kundengruppe
//	 *            the kundengruppe to set
//	 */
//	public void setKundengruppe(String kundengruppe) {
//		Kundengruppe = kundengruppe;
//	}
//
//	/**
//	 * @return the kundenstatus
//	 */
//	public String getKundenstatus() {
//		return Kundenstatus;
//	}
//
//	/**
//	 * @param kundenstatus
//	 *            the kundenstatus to set
//	 */
//	public void setKundenstatus(String kundenstatus) {
//		Kundenstatus = kundenstatus;
//	}
//
//	/**
//	 * @return the sprache
//	 */
//	public String getSprache() {
//		return Sprache;
//	}
//
//	/**
//	 * @param sprache
//	 *            the sprache to set
//	 */
//	public void setSprache(String sprache) {
//		Sprache = sprache;
//	}
//
//	/**
//	 * @return the iMEI
//	 */
//	public String getIMEI() {
//		return IMEI;
//	}
//
//	/**
//	 * @param iMEI
//	 *            the iMEI to set
//	 */
//	public void setIMEI(String iMEI) {
//		IMEI = iMEI;
//	}
//
//	/**
//	 * @return the bevorzugte_Kontaktart
//	 */
//	public String getBevorzugte_Kontaktart() {
//		return Bevorzugte_Kontaktart;
//	}
//
//	/**
//	 * @param bevorzugte_Kontaktart
//	 *            the bevorzugte_Kontaktart to set
//	 */
//	public void setBevorzugte_Kontaktart(String bevorzugte_Kontaktart) {
//		Bevorzugte_Kontaktart = bevorzugte_Kontaktart;
//	}
//
//	/**
//	 * @return the iM_Adresse
//	 */
//	public String getIM_Adresse() {
//		return IM_Adresse;
//	}
//
//	/**
//	 * @param iM_Adresse
//	 *            the iM_Adresse to set
//	 */
//	public void setIM_Adresse(String iM_Adresse) {
//		IM_Adresse = iM_Adresse;
//	}
//
//	/**
//	 * @return the skype_ID
//	 */
//	public String getSkype_ID() {
//		return Skype_ID;
//	}
//
//	/**
//	 * @param skype_ID
//	 *            the skype_ID to set
//	 */
//	public void setSkype_ID(String skype_ID) {
//		Skype_ID = skype_ID;
//	}
//
//	/**
//	 * @return the xing
//	 */
//	public String getXing() {
//		return Xing;
//	}
//
//	/**
//	 * @param xing
//	 *            the xing to set
//	 */
//	public void setXing(String xing) {
//		Xing = xing;
//	}
//
//	/**
//	 * @return the linkedIn
//	 */
//	public String getLinkedIn() {
//		return LinkedIn;
//	}
//
//	/**
//	 * @param linkedIn
//	 *            the linkedIn to set
//	 */
//	public void setLinkedIn(String linkedIn) {
//		LinkedIn = linkedIn;
//	}
//
//	/**
//	 * @return the link_Map
//	 */
//	public String getLink_Map() {
//		return Link_Map;
//	}
//
//	/**
//	 * @param link_Map
//	 *            the link_Map to set
//	 */
//	public void setLink_Map(String link_Map) {
//		Link_Map = link_Map;
//	}
//
//	/**
//	 * @return the bundesanzeiger
//	 */
//	public String getBundesanzeiger() {
//		return Bundesanzeiger;
//	}
//
//	/**
//	 * @param bundesanzeiger
//	 *            the bundesanzeiger to set
//	 */
//	public void setBundesanzeiger(String bundesanzeiger) {
//		Bundesanzeiger = bundesanzeiger;
//	}
//
//	/**
//	 * @return the handelsregister
//	 */
//	public String getHandelsregister() {
//		return Handelsregister;
//	}
//
//	/**
//	 * @param handelsregister
//	 *            the handelsregister to set
//	 */
//	public void setHandelsregister(String handelsregister) {
//		Handelsregister = handelsregister;
//	}
//
//	/**
//	 * @return the handelsregisternummer
//	 */
//	public String getHandelsregisternummer() {
//		return Handelsregisternummer;
//	}
//
//	/**
//	 * @param handelsregisternummer
//	 *            the handelsregisternummer to set
//	 */
//	public void setHandelsregisternummer(String handelsregisternummer) {
//		Handelsregisternummer = handelsregisternummer;
//	}
//
//	/**
//	 * @return the unternehmensgegenstand
//	 */
//	public String getUnternehmensgegenstand() {
//		return Unternehmensgegenstand;
//	}
//
//	/**
//	 * @param unternehmensgegenstand
//	 *            the unternehmensgegenstand to set
//	 */
//	public void setUnternehmensgegenstand(String unternehmensgegenstand) {
//		Unternehmensgegenstand = unternehmensgegenstand;
//	}
//
//	/**
//	 * @return the betriebsnummer
//	 */
//	public String getBetriebsnummer() {
//		return Betriebsnummer;
//	}
//
//	/**
//	 * @param betriebsnummer
//	 *            the betriebsnummer to set
//	 */
//	public void setBetriebsnummer(String betriebsnummer) {
//		Betriebsnummer = betriebsnummer;
//	}
//
//	/**
//	 * @return the berufsgenossenschaft
//	 */
//	public String getBerufsgenossenschaft() {
//		return Berufsgenossenschaft;
//	}
//
//	/**
//	 * @param berufsgenossenschaft
//	 *            the berufsgenossenschaft to set
//	 */
//	public void setBerufsgenossenschaft(String berufsgenossenschaft) {
//		Berufsgenossenschaft = berufsgenossenschaft;
//	}
//
//	/**
//	 * @return the eBay_ID
//	 */
//	public String geteBay_ID() {
//		return eBay_ID;
//	}
//
//	/**
//	 * @param eBay_ID
//	 *            the eBay_ID to set
//	 */
//	public void seteBay_ID(String eBay_ID) {
//		this.eBay_ID = eBay_ID;
//	}
//
//	/**
//	 * @return the finanzamt
//	 */
//	public String getFinanzamt() {
//		return Finanzamt;
//	}
//
//	/**
//	 * @param finanzamt
//	 *            the finanzamt to set
//	 */
//	public void setFinanzamt(String finanzamt) {
//		Finanzamt = finanzamt;
//	}
//
//	/**
//	 * @return the steuernummer
//	 */
//	public String getSteuernummer() {
//		return Steuernummer;
//	}
//
//	/**
//	 * @param steuernummer
//	 *            the steuernummer to set
//	 */
//	public void setSteuernummer(String steuernummer) {
//		Steuernummer = steuernummer;
//	}
//
//	/**
//	 * @return the uSt_IdNr
//	 */
//	public String getUSt_IdNr() {
//		return USt_IdNr;
//	}
//
//	/**
//	 * @param uSt_IdNr
//	 *            the uSt_IdNr to set
//	 */
//	public void setUSt_IdNr(String uSt_IdNr) {
//		USt_IdNr = uSt_IdNr;
//	}
//
//	/**
//	 * @return the waehrung
//	 */
//	public String getWaehrung() {
//		return Waehrung;
//	}
//
//	/**
//	 * @param waehrung
//	 *            the waehrung to set
//	 */
//	public void setWaehrung(String waehrung) {
//		Waehrung = waehrung;
//	}
//
//	/**
//	 * @return the gemeinnuetzigkeit
//	 */
//	public String getGemeinnuetzigkeit() {
//		return Gemeinnuetzigkeit;
//	}
//
//	/**
//	 * @param gemeinnuetzigkeit
//	 *            the gemeinnuetzigkeit to set
//	 */
//	public void setGemeinnuetzigkeit(String gemeinnuetzigkeit) {
//		Gemeinnuetzigkeit = gemeinnuetzigkeit;
//	}
//
//	/**
//	 * @return the art_der_Gemeinnuetzigkeit
//	 */
//	public String getArt_der_Gemeinnuetzigkeit() {
//		return Art_der_Gemeinnuetzigkeit;
//	}
//
//	/**
//	 * @param art_der_Gemeinnuetzigkeit
//	 *            the art_der_Gemeinnuetzigkeit to set
//	 */
//	public void setArt_der_Gemeinnuetzigkeit(String art_der_Gemeinnuetzigkeit) {
//		Art_der_Gemeinnuetzigkeit = art_der_Gemeinnuetzigkeit;
//	}
//
//	/**
//	 * @return the foerderzweck
//	 */
//	public String getFoerderzweck() {
//		return Foerderzweck;
//	}
//
//	/**
//	 * @param foerderzweck
//	 *            the foerderzweck to set
//	 */
//	public void setFoerderzweck(String foerderzweck) {
//		Foerderzweck = foerderzweck;
//	}
//
//	/**
//	 * @return the vIP
//	 */
//	public String getVIP() {
//		return VIP;
//	}
//
//	/**
//	 * @param vIP
//	 *            the vIP to set
//	 */
//	public void setVIP(String vIP) {
//		VIP = vIP;
//	}
//
//	/**
//	 * @return the kurzname
//	 */
//	public String getKurzname() {
//		return Kurzname;
//	}
//
//	/**
//	 * @param kurzname
//	 *            the kurzname to set
//	 */
//	public void setKurzname(String kurzname) {
//		Kurzname = kurzname;
//	}
//
//	/**
//	 * @return the nationalitaet
//	 */
//	public String getNationalitaet() {
//		return Nationalitaet;
//	}
//
//	/**
//	 * @param nationalitaet
//	 *            the nationalitaet to set
//	 */
//	public void setNationalitaet(String nationalitaet) {
//		Nationalitaet = nationalitaet;
//	}
//
//	/**
//	 * @return the zielgruppe
//	 */
//	public String getZielgruppe() {
//		return Zielgruppe;
//	}
//
//	/**
//	 * @param zielgruppe
//	 *            the zielgruppe to set
//	 */
//	public void setZielgruppe(String zielgruppe) {
//		Zielgruppe = zielgruppe;
//	}
//
//	/**
//	 * @return the bildungsstand
//	 */
//	public String getBildungsstand() {
//		return Bildungsstand;
//	}
//
//	/**
//	 * @param bildungsstand
//	 *            the bildungsstand to set
//	 */
//	public void setBildungsstand(String bildungsstand) {
//		Bildungsstand = bildungsstand;
//	}
//
//	/**
//	 * @return the einkommensklasse
//	 */
//	public String getEinkommensklasse() {
//		return Einkommensklasse;
//	}
//
//	/**
//	 * @param einkommensklasse
//	 *            the einkommensklasse to set
//	 */
//	public void setEinkommensklasse(String einkommensklasse) {
//		Einkommensklasse = einkommensklasse;
//	}
//
//	/**
//	 * @return the einstellung
//	 */
//	public String getEinstellung() {
//		return Einstellung;
//	}
//
//	/**
//	 * @param einstellung
//	 *            the einstellung to set
//	 */
//	public void setEinstellung(String einstellung) {
//		Einstellung = einstellung;
//	}
//
//	/**
//	 * @return the arbeitstyp
//	 */
//	public String getArbeitstyp() {
//		return Arbeitstyp;
//	}
//
//	/**
//	 * @param arbeitstyp
//	 *            the arbeitstyp to set
//	 */
//	public void setArbeitstyp(String arbeitstyp) {
//		Arbeitstyp = arbeitstyp;
//	}
//
//	/**
//	 * @return the kaufverhalten
//	 */
//	public String getKaufverhalten() {
//		return Kaufverhalten;
//	}
//
//	/**
//	 * @param kaufverhalten
//	 *            the kaufverhalten to set
//	 */
//	public void setKaufverhalten(String kaufverhalten) {
//		Kaufverhalten = kaufverhalten;
//	}
//
//	/**
//	 * @return the lebensstil
//	 */
//	public String getLebensstil() {
//		return Lebensstil;
//	}
//
//	/**
//	 * @param lebensstil
//	 *            the lebensstil to set
//	 */
//	public void setLebensstil(String lebensstil) {
//		Lebensstil = lebensstil;
//	}
//
//	/**
//	 * @return the risikoeinstellung
//	 */
//	public String getRisikoeinstellung() {
//		return Risikoeinstellung;
//	}
//
//	/**
//	 * @param risikoeinstellung
//	 *            the risikoeinstellung to set
//	 */
//	public void setRisikoeinstellung(String risikoeinstellung) {
//		Risikoeinstellung = risikoeinstellung;
//	}
//
//	/**
//	 * @return the kaeuferloyalitaet
//	 */
//	public String getKaeuferloyalitaet() {
//		return Kaeuferloyalitaet;
//	}
//
//	/**
//	 * @param kaeuferloyalitaet
//	 *            the kaeuferloyalitaet to set
//	 */
//	public void setKaeuferloyalitaet(String kaeuferloyalitaet) {
//		Kaeuferloyalitaet = kaeuferloyalitaet;
//	}
//
//	/**
//	 * @return the vertriebsquelle
//	 */
//	public String getVertriebsquelle() {
//		return Vertriebsquelle;
//	}
//
//	/**
//	 * @param vertriebsquelle
//	 *            the vertriebsquelle to set
//	 */
//	public void setVertriebsquelle(String vertriebsquelle) {
//		Vertriebsquelle = vertriebsquelle;
//	}
//
//	/**
//	 * @return the vertriebsweg
//	 */
//	public String getVertriebsweg() {
//		return Vertriebsweg;
//	}
//
//	/**
//	 * @param vertriebsweg
//	 *            the vertriebsweg to set
//	 */
//	public void setVertriebsweg(String vertriebsweg) {
//		Vertriebsweg = vertriebsweg;
//	}
//
//	/**
//	 * @return the vertriebsbeauftragter
//	 */
//	public String getVertriebsbeauftragter() {
//		return Vertriebsbeauftragter;
//	}
//
//	/**
//	 * @param vertriebsbeauftragter
//	 *            the vertriebsbeauftragter to set
//	 */
//	public void setVertriebsbeauftragter(String vertriebsbeauftragter) {
//		Vertriebsbeauftragter = vertriebsbeauftragter;
//	}
//
//	/**
//	 * @return the vertriebsorganisation
//	 */
//	public String getVertriebsorganisation() {
//		return Vertriebsorganisation;
//	}
//
//	/**
//	 * @param vertriebsorganisation
//	 *            the vertriebsorganisation to set
//	 */
//	public void setVertriebsorganisation(String vertriebsorganisation) {
//		Vertriebsorganisation = vertriebsorganisation;
//	}
//
//	/**
//	 * @return the nielsenbezirke
//	 */
//	public String getNielsenbezirke() {
//		return Nielsenbezirke;
//	}
//
//	/**
//	 * @param nielsenbezirke
//	 *            the nielsenbezirke to set
//	 */
//	public void setNielsenbezirke(String nielsenbezirke) {
//		Nielsenbezirke = nielsenbezirke;
//	}
//
//	/**
//	 * @return the vertriebsregionen
//	 */
//	public String getVertriebsregionen() {
//		return Vertriebsregionen;
//	}
//
//	/**
//	 * @param vertriebsregionen
//	 *            the vertriebsregionen to set
//	 */
//	public void setVertriebsregionen(String vertriebsregionen) {
//		Vertriebsregionen = vertriebsregionen;
//	}
//
//	/**
//	 * @return the vertriebsrisiko
//	 */
//	public String getVertriebsrisiko() {
//		return Vertriebsrisiko;
//	}
//
//	/**
//	 * @param vertriebsrisiko
//	 *            the vertriebsrisiko to set
//	 */
//	public void setVertriebsrisiko(String vertriebsrisiko) {
//		Vertriebsrisiko = vertriebsrisiko;
//	}
//
//	/**
//	 * @return the vertriebsprioritaet
//	 */
//	public String getVertriebsprioritaet() {
//		return Vertriebsprioritaet;
//	}
//
//	/**
//	 * @param vertriebsprioritaet
//	 *            the vertriebsprioritaet to set
//	 */
//	public void setVertriebsprioritaet(String vertriebsprioritaet) {
//		Vertriebsprioritaet = vertriebsprioritaet;
//	}
//
//	/**
//	 * @return the nachfrageverhalten
//	 */
//	public String getNachfrageverhalten() {
//		return Nachfrageverhalten;
//	}
//
//	/**
//	 * @param nachfrageverhalten
//	 *            the nachfrageverhalten to set
//	 */
//	public void setNachfrageverhalten(String nachfrageverhalten) {
//		Nachfrageverhalten = nachfrageverhalten;
//	}
//
//	/**
//	 * @return the vertriebsstatus
//	 */
//	public String getVertriebsstatus() {
//		return Vertriebsstatus;
//	}
//
//	/**
//	 * @param vertriebsstatus
//	 *            the vertriebsstatus to set
//	 */
//	public void setVertriebsstatus(String vertriebsstatus) {
//		Vertriebsstatus = vertriebsstatus;
//	}
//
//	/**
//	 * @return the kundengruppe2
//	 */
//	public String getKundengruppe2() {
//		return Kundengruppe2;
//	}
//
//	/**
//	 * @param kundengruppe2
//	 *            the kundengruppe2 to set
//	 */
//	public void setKundengruppe2(String kundengruppe2) {
//		Kundengruppe2 = kundengruppe2;
//	}
//
//	/**
//	 * @return the auslieferprioritaet
//	 */
//	public String getAuslieferprioritaet() {
//		return Auslieferprioritaet;
//	}
//
//	/**
//	 * @param auslieferprioritaet
//	 *            the auslieferprioritaet to set
//	 */
//	public void setAuslieferprioritaet(String auslieferprioritaet) {
//		Auslieferprioritaet = auslieferprioritaet;
//	}
//
//	/**
//	 * @return the komplettlieferung
//	 */
//	public String getKomplettlieferung() {
//		return Komplettlieferung;
//	}
//
//	/**
//	 * @param komplettlieferung
//	 *            the komplettlieferung to set
//	 */
//	public void setKomplettlieferung(String komplettlieferung) {
//		Komplettlieferung = komplettlieferung;
//	}
//
//	/**
//	 * @return the incoterms
//	 */
//	public String getIncoterms() {
//		return Incoterms;
//	}
//
//	/**
//	 * @param incoterms
//	 *            the incoterms to set
//	 */
//	public void setIncoterms(String incoterms) {
//		Incoterms = incoterms;
//	}
//
//	/**
//	 * @return the incoterms_Ort
//	 */
//	public String getIncoterms_Ort() {
//		return Incoterms_Ort;
//	}
//
//	/**
//	 * @param incoterms_Ort
//	 *            the incoterms_Ort to set
//	 */
//	public void setIncoterms_Ort(String incoterms_Ort) {
//		Incoterms_Ort = incoterms_Ort;
//	}
//
//	/**
//	 * @return the schlagworte
//	 */
//	public String getSchlagworte() {
//		return Schlagworte;
//	}
//
//	/**
//	 * @param schlagworte
//	 *            the schlagworte to set
//	 */
//	public void setSchlagworte(String schlagworte) {
//		Schlagworte = schlagworte;
//	}
//
//	/**
//	 * @return the iD_Vorsystem
//	 */
//	public String getID_Vorsystem() {
//		return ID_Vorsystem;
//	}
//
//	/**
//	 * @param iD_Vorsystem
//	 *            the iD_Vorsystem to set
//	 */
//	public void setID_Vorsystem(String iD_Vorsystem) {
//		ID_Vorsystem = iD_Vorsystem;
//	}
//
//	/**
//	 * @return the benutzerfeld_1
//	 */
//	public String getBenutzerfeld_1() {
//		return Benutzerfeld_1;
//	}
//
//	/**
//	 * @param benutzerfeld_1
//	 *            the benutzerfeld_1 to set
//	 */
//	public void setBenutzerfeld_1(String benutzerfeld_1) {
//		Benutzerfeld_1 = benutzerfeld_1;
//	}
//
//	/**
//	 * @return the benutzerfeld_2
//	 */
//	public String getBenutzerfeld_2() {
//		return Benutzerfeld_2;
//	}
//
//	/**
//	 * @param benutzerfeld_2
//	 *            the benutzerfeld_2 to set
//	 */
//	public void setBenutzerfeld_2(String benutzerfeld_2) {
//		Benutzerfeld_2 = benutzerfeld_2;
//	}
//
//	/**
//	 * @return the benutzerfeld_3
//	 */
//	public String getBenutzerfeld_3() {
//		return Benutzerfeld_3;
//	}
//
//	/**
//	 * @param benutzerfeld_3
//	 *            the benutzerfeld_3 to set
//	 */
//	public void setBenutzerfeld_3(String benutzerfeld_3) {
//		Benutzerfeld_3 = benutzerfeld_3;
//	}
//
//	/**
//	 * @return the benutzerfeld_4
//	 */
//	public String getBenutzerfeld_4() {
//		return Benutzerfeld_4;
//	}
//
//	/**
//	 * @param benutzerfeld_4
//	 *            the benutzerfeld_4 to set
//	 */
//	public void setBenutzerfeld_4(String benutzerfeld_4) {
//		Benutzerfeld_4 = benutzerfeld_4;
//	}
//
//	/**
//	 * @return the benutzerfeld_5
//	 */
//	public String getBenutzerfeld_5() {
//		return Benutzerfeld_5;
//	}
//
//	/**
//	 * @param benutzerfeld_5
//	 *            the benutzerfeld_5 to set
//	 */
//	public void setBenutzerfeld_5(String benutzerfeld_5) {
//		Benutzerfeld_5 = benutzerfeld_5;
//	}
//
//	/**
//	 * @return the benutzerfeld_6
//	 */
//	public String getBenutzerfeld_6() {
//		return Benutzerfeld_6;
//	}
//
//	/**
//	 * @param benutzerfeld_6
//	 *            the benutzerfeld_6 to set
//	 */
//	public void setBenutzerfeld_6(String benutzerfeld_6) {
//		Benutzerfeld_6 = benutzerfeld_6;
//	}
//
//	/**
//	 * @return the benutzerfeld_7
//	 */
//	public String getBenutzerfeld_7() {
//		return Benutzerfeld_7;
//	}
//
//	/**
//	 * @param benutzerfeld_7
//	 *            the benutzerfeld_7 to set
//	 */
//	public void setBenutzerfeld_7(String benutzerfeld_7) {
//		Benutzerfeld_7 = benutzerfeld_7;
//	}
//
//	/**
//	 * @return the benutzerfeld_8
//	 */
//	public String getBenutzerfeld_8() {
//		return Benutzerfeld_8;
//	}
//
//	/**
//	 * @param benutzerfeld_8
//	 *            the benutzerfeld_8 to set
//	 */
//	public void setBenutzerfeld_8(String benutzerfeld_8) {
//		Benutzerfeld_8 = benutzerfeld_8;
//	}
//
//	/**
//	 * @return the benutzerfeld_9
//	 */
//	public String getBenutzerfeld_9() {
//		return Benutzerfeld_9;
//	}
//
//	/**
//	 * @param benutzerfeld_9
//	 *            the benutzerfeld_9 to set
//	 */
//	public void setBenutzerfeld_9(String benutzerfeld_9) {
//		Benutzerfeld_9 = benutzerfeld_9;
//	}
//
//	/**
//	 * @return the benutzerfeld_10
//	 */
//	public String getBenutzerfeld_10() {
//		return Benutzerfeld_10;
//	}
//
//	/**
//	 * @param benutzerfeld_10
//	 *            the benutzerfeld_10 to set
//	 */
//	public void setBenutzerfeld_10(String benutzerfeld_10) {
//		Benutzerfeld_10 = benutzerfeld_10;
//	}
	//}}

	
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
