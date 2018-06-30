package de.scopevisio.importer.data;

import java.util.ArrayList;
import java.util.List;

public class Task {

	// {{  Variablen
	private List<Object> attributesNameList = new ArrayList<Object>();
	private String[] attributesList;
// }}
	
	// {{ Konstruktor
	/**
	 * Kontruktor
	 */
	public Task() {
		this.initalize();
	}
	// }}

	
	// {{ Methoden
	/**
	 * Methode zur Initialisierung der Klasse. Wird im Konstruktor aufgerufen
	 * @return void
	 */
	private void initalize() {
		this.attributesNameList.add("topic");
		this.attributesNameList.add("priority");
		this.attributesNameList.add("contactId");
		this.attributesNameList.add("contactLegacyId");
		this.attributesNameList.add("contactSphere");
		this.attributesNameList.add("description");
		this.attributesNameList.add("startDateTS");
		this.attributesNameList.add("dueDateTS");
		this.attributesNameList.add("responsibleContactId");
		this.attributesNameList.add("reminderDateTS");
		this.attributesNameList.add("status");
		this.attributesNameList.add("projectId");
		this.attributesNameList.add("outgoingInvoiceId");
		this.attributesNameList.add("tags");
		this.attributesNameList.add("employeeDomain");
		this.attributesNameList.add("setEstimatedHoursManually");
		this.attributesNameList.add("estimatedHours");
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
		if (this.attributesList[this.attributesNameList.indexOf("topic")] != null) jsonString = jsonString + "\"topic\":\"" + this.attributesList[this.attributesNameList.indexOf("topic")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("priority")] != null) jsonString = jsonString + "\"priority\":\"" + this.attributesList[this.attributesNameList.indexOf("priority")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactId")] != null) jsonString = jsonString + "\"contactId\":\"" + this.attributesList[this.attributesNameList.indexOf("contactId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactLegacyId")] != null) jsonString = jsonString + "\"contactLegacyId\":\"" + this.attributesList[this.attributesNameList.indexOf("contactLegacyId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactSphere")] != null) jsonString = jsonString + "\"contactSphere\":\"" + this.attributesList[this.attributesNameList.indexOf("contactSphere")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("description")] != null) jsonString = jsonString + "\"description\":\"" + this.attributesList[this.attributesNameList.indexOf("description")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("startDateTS")] != null) jsonString = jsonString + "\"startDateTS\":\"" + this.attributesList[this.attributesNameList.indexOf("startDateTS")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("dueDateTS")] != null) jsonString = jsonString + "\"dueDateTS\":\"" + this.attributesList[this.attributesNameList.indexOf("dueDateTS")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("responsibleContactId")] != null) jsonString = jsonString + " responsibleContactId\":\"" + this.attributesList[this.attributesNameList.indexOf("responsibleContactId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("reminderDateTS")] != null) jsonString = jsonString + "\"reminderDateTS\":\"" + this.attributesList[this.attributesNameList.indexOf("reminderDateTS")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("status")] != null) jsonString = jsonString + "\"status\":\"" + this.attributesList[this.attributesNameList.indexOf("status")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("projectId")] != null) jsonString = jsonString + "\"projectId\":\"" + this.attributesList[this.attributesNameList.indexOf("projectId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("outgoingInvoiceId")] != null) jsonString = jsonString + "\"outgoingInvoiceId\":\"" + this.attributesList[this.attributesNameList.indexOf("outgoingInvoiceId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("tags")] != null) jsonString = jsonString + "\"tags\":\"" + this.attributesList[this.attributesNameList.indexOf("tags")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("employeeDomain")] != null) jsonString = jsonString + "\"employeeDomain\":\"" + this.attributesList[this.attributesNameList.indexOf("employeeDomain")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("setEstimatedHoursManually")] != null) jsonString = jsonString + "\"setEstimatedHoursManually\":\"" + this.attributesList[this.attributesNameList.indexOf("setEstimatedHoursManually")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("estimatedHours")] != null) jsonString = jsonString + "\"estimatedHours\":\"" + this.attributesList[this.attributesNameList.indexOf("estimatedHours")] + "\",";
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
		if (this.attributesList[this.attributesNameList.indexOf("topic")] != null) jsonString = jsonString + "\"topic\":\"" + this.attributesList[this.attributesNameList.indexOf("topic")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("priority")] != null) jsonString = jsonString + "\"priority\":\"" + this.attributesList[this.attributesNameList.indexOf("priority")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactId")] != null) jsonString = jsonString + "\"contactId\":\"" + this.attributesList[this.attributesNameList.indexOf("contactId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactLegacyId")] != null) jsonString = jsonString + "\"contactLegacyId\":\"" + this.attributesList[this.attributesNameList.indexOf("contactLegacyId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("contactSphere")] != null) jsonString = jsonString + "\"contactSphere\":\"" + this.attributesList[this.attributesNameList.indexOf("contactSphere")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("description")] != null) jsonString = jsonString + "\"description\":\"" + this.attributesList[this.attributesNameList.indexOf("description")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("startDateTS")] != null) jsonString = jsonString + "\"startDateTS\":\"" + this.attributesList[this.attributesNameList.indexOf("startDateTS")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("dueDateTS")] != null) jsonString = jsonString + "\"dueDateTS\":\"" + this.attributesList[this.attributesNameList.indexOf("dueDateTS")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("responsibleContactId")] != null) jsonString = jsonString + "\"responsibleContactId\":\"" + this.attributesList[this.attributesNameList.indexOf("responsibleContactId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("reminderDateTS")] != null) jsonString = jsonString + "\"reminderDateTS\":\"" + this.attributesList[this.attributesNameList.indexOf("reminderDateTS")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("status")] != null) jsonString = jsonString + "\"status\":\"" + this.attributesList[this.attributesNameList.indexOf("status")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("projectId")] != null) jsonString = jsonString + "\"projectId\":\"" + this.attributesList[this.attributesNameList.indexOf("projectId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("outgoingInvoiceId")] != null) jsonString = jsonString + "\"outgoingInvoiceId\":\"" + this.attributesList[this.attributesNameList.indexOf("outgoingInvoiceId")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("tags")] != null) jsonString = jsonString + "\"tags\":\"" + this.attributesList[this.attributesNameList.indexOf("tags")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("employeeDomain")] != null) jsonString = jsonString + "\"employeeDomain\":\"" + this.attributesList[this.attributesNameList.indexOf("employeeDomain")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("setEstimatedHoursManually")] != null) jsonString = jsonString + "\"setEstimatedHoursManually\":\"" + this.attributesList[this.attributesNameList.indexOf("setEstimatedHoursManually")] + "\",";
		if (this.attributesList[this.attributesNameList.indexOf("estimatedHours")] != null) jsonString = jsonString + "\"estimatedHours\":\"" + this.attributesList[this.attributesNameList.indexOf("estimatedHours")] + "\",";
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
