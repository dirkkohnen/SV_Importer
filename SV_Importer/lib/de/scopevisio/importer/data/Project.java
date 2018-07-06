package de.scopevisio.importer.data;

import java.util.ArrayList;
import java.util.List;

public class Project {

	/**
	 *  Variablen
	 */
	private List<Object> attributesNameList = new ArrayList<Object>();
	private String[] attributesList;

	
	/**
	 * Kontruktor
	 */
	public Project() {
		this.initalize();
	}

	
	/**
	 * Methode zur Initialisierung der Klasse. Wird im Konstruktor aufgerufen
	 * @return void
	 */
	private void initalize() {
		this.attributesNameList.add("number");
		this.attributesNameList.add("name");
		this.attributesNameList.add("contactId");
		this.attributesNameList.add("initiatorContactId");
		this.attributesNameList.add("contactPerson");
		this.attributesNameList.add("ownerUid");
		this.attributesNameList.add("workdays");
		this.attributesNameList.add("description");
		this.attributesNameList.add("type");
		this.attributesNameList.add("language");
		this.attributesNameList.add("currency");
		this.attributesNameList.add("startTs");
		this.attributesNameList.add("endTs");
		this.attributesNameList.add("decisionTs");
		this.attributesNameList.add("estimatedHoursMode");
		this.attributesNameList.add("estimatedHours");
		this.attributesNameList.add("billable");
		this.attributesNameList.add("timeRecordable");
		this.attributesNameList.add("timeRecordType");
		this.attributesNameList.add("hoursPerDay");
		this.attributesNameList.add("category");
		this.attributesNameList.add("type2");
		this.attributesNameList.add("phase");
		this.attributesNameList.add("status");
		this.attributesNameList.add("priority");
		this.attributesNameList.add("ownerName");
		this.attributesNameList.add("risk");
		this.attributesNameList.add("riskDescription");
		this.attributesNameList.add("workdaysDisplay");
		this.attributesNameList.add("dimensionNumber");
		this.attributesNameList.add("dimensionName");
		this.attributesNameList.add("mail");
		this.attributesNameList.add("Projektkoordinator");
		this.attributesNameList.add("Führungskraft");
		this.attributesNameList.add("Projektboxen");
		this.attributesNameList.add("Themenfeld");
		this.attributesNameList.add("Betriebsstätte");
		this.attributesNameList.add("Fremdleistung?");
		this.attributesNameList.add("Firmenname der Fremdfirma");
		this.attributesNameList.add("customfield_id_1");
		this.attributesNameList.add("customfield_id_2");
		this.attributesNameList.add("customfield_id_3");
		this.attributesNameList.add("customfield_id_4");
		this.attributesNameList.add("customfield_id_5");
		this.attributesNameList.add("customfield_id_6");
		this.attributesNameList.add("customfield_id_7");
		this.attributesNameList.add("customfield_id_8");
		this.attributesNameList.add("customfield_id_9");
		this.attributesNameList.add("customfield_id_10");
		this.attributesNameList.add("customfield_id_11");
		this.attributesNameList.add("customfield_id_12");
		this.attributesNameList.add("customfield_id_13");
		this.attributesNameList.add("customfield_id_14");
		this.attributesNameList.add("customfield_id_15");
		this.attributesNameList.add("customfield_id_16");
		this.attributesNameList.add("customfield_id_17");
		this.attributesNameList.add("customfield_id_18");
		this.attributesNameList.add("customfield_id_19");
		this.attributesNameList.add("customfield_id_20");
		this.attributesNameList.add("customfield_id_21");
		this.attributesNameList.add("customfield_id_22");
		this.attributesNameList.add("customfield_id_23");
		this.attributesNameList.add("customfield_id_24");
		this.attributesNameList.add("customfield_id_25");
		this.attributesNameList.add("customfield_id_26");
		this.attributesNameList.add("customfield_id_27");
		this.attributesNameList.add("customfield_id_28");
		this.attributesNameList.add("customfield_id_29");
		this.attributesNameList.add("customfield_id_30");
		//System.out.println(this.attributesNameList.size());
		this.attributesList = new String[this.attributesNameList.size()];
		//System.out.println(this.attributesList.length);
	}

	
	public String getJSONSOAP(){
		String jsonString = "{";
		if (this.attributesList[this.attributesNameList.indexOf("name")] != null) jsonString = jsonString + "\"name\":\"" + this.attributesList[this.attributesNameList.indexOf("name")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactId")] != null) jsonString = jsonString + "\"contactId\":\"" + this.attributesList[this.attributesNameList.indexOf("contactId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("description")] != null) jsonString = jsonString + "\"description\":\"" + this.attributesList[this.attributesNameList.indexOf("description")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("type")] != null) jsonString = jsonString + "\"type\":\"" + this.attributesList[this.attributesNameList.indexOf("type")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("language")] != null) jsonString = jsonString + "\"language\":\"" + this.attributesList[this.attributesNameList.indexOf("language")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("currency")] != null) jsonString = jsonString + "\"currency\":\"" + this.attributesList[this.attributesNameList.indexOf("currency")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("startTs")] != null) jsonString = jsonString + "\"startTs\":\"" + this.attributesList[this.attributesNameList.indexOf("startTs")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("endTs")] != null) jsonString = jsonString + "\"endTs\":\"" + this.attributesList[this.attributesNameList.indexOf("endTs")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("decisionTs")] != null) jsonString = jsonString + " decisionTs\":\"" + this.attributesList[this.attributesNameList.indexOf("decisionTs")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("billable")] != null) jsonString = jsonString + "\"billable\":\"" + this.attributesList[this.attributesNameList.indexOf("billable")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("timeRecordable")] != null) jsonString = jsonString + "\"timeRecordable\":\"" + this.attributesList[this.attributesNameList.indexOf("timeRecordable")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("timeRecordType")] != null) jsonString = jsonString + "\"timeRecordType\":\"" + this.attributesList[this.attributesNameList.indexOf("timeRecordType")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("hoursPerDay")] != null) jsonString = jsonString + "\"hoursPerDay\":\"" + this.attributesList[this.attributesNameList.indexOf("hoursPerDay")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("category")] != null) jsonString = jsonString + "\"category\":\"" + this.attributesList[this.attributesNameList.indexOf("category")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("type2")] != null) jsonString = jsonString + "\"type2\":\"" + this.attributesList[this.attributesNameList.indexOf("type2")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("phase")] != null) jsonString = jsonString + "\"phase\":\"" + this.attributesList[this.attributesNameList.indexOf("phase")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("status")] != null) jsonString = jsonString + "\"status\":\"" + this.attributesList[this.attributesNameList.indexOf("status")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("priority")] != null) jsonString = jsonString + "\"priority\":\"" + this.attributesList[this.attributesNameList.indexOf("priority")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("ownerName")] != null) jsonString = jsonString + "\"ownerName\":\"" + this.attributesList[this.attributesNameList.indexOf("ownerName")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("risk")] != null) jsonString = jsonString + " risk\":\"" + this.attributesList[this.attributesNameList.indexOf("risk")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("riskDescription")] != null) jsonString = jsonString + "\"riskDescription\":\"" + this.attributesList[this.attributesNameList.indexOf("riskDescription")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("workdaysDisplay")] != null) jsonString = jsonString + "\"workdaysDisplay\":\"" + this.attributesList[this.attributesNameList.indexOf("workdaysDisplay")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("dimensionNumber")] != null) jsonString = jsonString + "\"dimensionNumber\":\"" + this.attributesList[this.attributesNameList.indexOf("dimensionNumber")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("dimensionName")] != null) jsonString = jsonString + "\"dimensionName\":\"" + this.attributesList[this.attributesNameList.indexOf("dimensionName")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_1")] != null) jsonString = jsonString + "\"customfield_id_1\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_1")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_2")] != null) jsonString = jsonString + "\"customfield_id_2\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_2")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_3")] != null) jsonString = jsonString + "\"customfield_id_3\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_3")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_4")] != null) jsonString = jsonString + "\"customfield_id_4\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_4")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_5")] != null) jsonString = jsonString + "\"customfield_id_5\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_5")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_6")] != null) jsonString = jsonString + "\"customfield_id_6\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_6")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_7")] != null) jsonString = jsonString + "\"customfield_id_7\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_7")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_8")] != null) jsonString = jsonString + "\"customfield_id_8\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_8")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_9")] != null) jsonString = jsonString + "\"customfield_id_9\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_9")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_10")] != null) jsonString = jsonString + "\"customfield_id_10\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_10")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_11")] != null) jsonString = jsonString + "\"customfield_id_11\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_11")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_12")] != null) jsonString = jsonString + "\"customfield_id_12\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_12")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_13")] != null) jsonString = jsonString + "\"customfield_id_13\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_13")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_14")] != null) jsonString = jsonString + "\"customfield_id_14\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_14")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_15")] != null) jsonString = jsonString + "\"customfield_id_15\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_15")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_16")] != null) jsonString = jsonString + "\"customfield_id_16\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_16")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_17")] != null) jsonString = jsonString + "\"customfield_id_17\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_17")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_18")] != null) jsonString = jsonString + "\"customfield_id_18\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_18")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_19")] != null) jsonString = jsonString + "\"customfield_id_19\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_19")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_20")] != null) jsonString = jsonString + "\"customfield_id_20\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_20")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_21")] != null) jsonString = jsonString + "\"customfield_id_21\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_21")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_22")] != null) jsonString = jsonString + "\"customfield_id_22\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_22")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_23")] != null) jsonString = jsonString + "\"customfield_id_23\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_23")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_24")] != null) jsonString = jsonString + "\"customfield_id_24\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_24")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_25")] != null) jsonString = jsonString + "\"customfield_id_25\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_25")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_26")] != null) jsonString = jsonString + "\"customfield_id_26\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_26")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_27")] != null) jsonString = jsonString + "\"customfield_id_27\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_27")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_28")] != null) jsonString = jsonString + "\"customfield_id_28\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_28")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_29")] != null) jsonString = jsonString + "\"customfield_id_29\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_29")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("customfield_id_30")] != null) jsonString = jsonString + "\"customfield_id_30\":\"" + this.attributesList[this.attributesNameList.indexOf("customfield_id_30")] + "\",";
		jsonString = jsonString.substring(0, jsonString.length()-1);
		jsonString = jsonString +"}";
		return jsonString;
	}
	
	public String getJSONRest(){
		String jsonString = "{";
		if (this.attributesList[this.attributesNameList.indexOf("number")] != null) jsonString = jsonString + "\"number\":\"" + this.attributesList[this.attributesNameList.indexOf("number")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("name")] != null) jsonString = jsonString + "\"name\":\"" + this.attributesList[this.attributesNameList.indexOf("name")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("category")] != null) jsonString = jsonString + "\"category\":\"" + this.attributesList[this.attributesNameList.indexOf("category")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("type")] != null) jsonString = jsonString + "\"type\":\"" + this.attributesList[this.attributesNameList.indexOf("type")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("type2")] != null) jsonString = jsonString + "\"type2\":\"" + this.attributesList[this.attributesNameList.indexOf("type2")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("description")] != null) jsonString = jsonString + "\"description\":\"" + this.attributesList[this.attributesNameList.indexOf("description")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactId")] != null) jsonString = jsonString + "\"contactId\":\"" + this.attributesList[this.attributesNameList.indexOf("contactId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("initiatorContactId")] != null) jsonString = jsonString + "\"initiatorContactId\":\"" + this.attributesList[this.attributesNameList.indexOf("initiatorContactId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactPerson")] != null) jsonString = jsonString + "\"contactPerson\":\"" + this.attributesList[this.attributesNameList.indexOf("contactPerson")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("ownerUid")] != null) jsonString = jsonString + "\"ownerUid\":\"" + this.attributesList[this.attributesNameList.indexOf("ownerUid")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("workdays")] != null) jsonString = jsonString + "\"workdays\":\"" + this.attributesList[this.attributesNameList.indexOf("workdays")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("startTs")] != null) jsonString = jsonString + "\"startTs\":\"" + this.attributesList[this.attributesNameList.indexOf("startTs")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("endTs")] != null) jsonString = jsonString + "\"endTs\":\"" + this.attributesList[this.attributesNameList.indexOf("endTs")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("decisionTs")] != null) jsonString = jsonString + " decisionTs\":\"" + this.attributesList[this.attributesNameList.indexOf("decisionTs")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("estimatedHoursMode")] != null) jsonString = jsonString + " estimatedHoursMode\":\"" + this.attributesList[this.attributesNameList.indexOf("estimatedHoursMode")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("estimatedHours")] != null) jsonString = jsonString + " estimatedHours\":\"" + this.attributesList[this.attributesNameList.indexOf("estimatedHours")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("dimensionNumber")] != null) jsonString = jsonString + "\"dimensionNumber\":\"" + this.attributesList[this.attributesNameList.indexOf("dimensionNumber")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("dimensionName")] != null) jsonString = jsonString + "\"dimensionName\":\"" + this.attributesList[this.attributesNameList.indexOf("dimensionName")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("phase")] != null) jsonString = jsonString + "\"phase\":\"" + this.attributesList[this.attributesNameList.indexOf("phase")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("status")] != null) jsonString = jsonString + "\"status\":\"" + this.attributesList[this.attributesNameList.indexOf("status")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("priority")] != null) jsonString = jsonString + "\"priority\":\"" + this.attributesList[this.attributesNameList.indexOf("priority")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("risk")] != null) jsonString = jsonString + " risk\":\"" + this.attributesList[this.attributesNameList.indexOf("risk")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("riskDescription")] != null) jsonString = jsonString + "\"riskDescription\":\"" + this.attributesList[this.attributesNameList.indexOf("riskDescription")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("billable")] != null) jsonString = jsonString + "\"billable\":\"" + this.attributesList[this.attributesNameList.indexOf("billable")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("timeRecordable")] != null) jsonString = jsonString + "\"timeRecordable\":\"" + this.attributesList[this.attributesNameList.indexOf("timeRecordable")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("timeRecordType")] != null) jsonString = jsonString + "\"timeRecordType\":\"" + this.attributesList[this.attributesNameList.indexOf("timeRecordType")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("hoursPerDay")] != null) jsonString = jsonString + "\"hoursPerDay\":\"" + this.attributesList[this.attributesNameList.indexOf("hoursPerDay")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("mail")] != null) jsonString = jsonString + "\"mail\":\"" + this.attributesList[this.attributesNameList.indexOf("mail")] + "\",";
		jsonString = jsonString + "\"customFields\": [";
		if (this.attributesList[this.attributesNameList.indexOf("Projektkoordinator")] != null) {
			jsonString = jsonString + "{\"customFieldName\":\"customText2\",";
			jsonString = jsonString + "\"customFieldValue\":\"" + this.attributesList[this.attributesNameList.indexOf("Projektkoordinator")] + "\"},";
		}
		if (this.attributesList[this.attributesNameList.indexOf("Führungskraft")] != null) {
			jsonString = jsonString + "{\"customFieldName\":\"customText1\",";
			jsonString = jsonString + "\"customFieldValue\":\"" + this.attributesList[this.attributesNameList.indexOf("Führungskraft")] + "\"},";
		}
		if (this.attributesList[this.attributesNameList.indexOf("Projektboxen")] != null) {
			jsonString = jsonString + "{\"customFieldName\":\"customText3\",";
			jsonString = jsonString + "\"customFieldValue\":\"" + this.attributesList[this.attributesNameList.indexOf("Projektboxen")] + "\"},";
		}
		if (this.attributesList[this.attributesNameList.indexOf("Themenfeld")] != null) {
			jsonString = jsonString + "{\"customFieldName\":\"customText4\",";
			jsonString = jsonString + "\"customFieldValue\":\"" + this.attributesList[this.attributesNameList.indexOf("Themenfeld")] + "\"},";
		}
		if (this.attributesList[this.attributesNameList.indexOf("Betriebsstätte")] != null) {
			jsonString = jsonString + "{\"customFieldName\":\"customText5\",";
			jsonString = jsonString + "\"customFieldValue\":\"" + this.attributesList[this.attributesNameList.indexOf("Betriebsstätte")] + "\"},";
		}
		if (this.attributesList[this.attributesNameList.indexOf("Fremdleistung?")] != null) {
			jsonString = jsonString + "{\"customFieldName\":\"customText17\",";
			jsonString = jsonString + "\"customFieldValue\":\"" + this.attributesList[this.attributesNameList.indexOf("Fremdleistung?")] + "\"},";
		}
		if (this.attributesList[this.attributesNameList.indexOf("Firmenname der Fremdfirma")] != null) {
			jsonString = jsonString + "{\"customFieldName\":\"customText16\",";
			jsonString = jsonString + "\"customFieldValue\":\"" + this.attributesList[this.attributesNameList.indexOf("Firmenname der Fremdfirma")] + "\"},";
		}
		jsonString = jsonString.substring(0, jsonString.length()-1);
		jsonString = jsonString +"],";
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
}
