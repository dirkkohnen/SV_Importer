/**
 * 
 */
package de.scopevisio.importer;

import java.util.List;
import java.util.Properties;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.w3c.dom.DOMException;
import de.scopevisio.importer.URLPost.PostResult;
import de.scopevisio.importer.data.ContactProperty;

/**
 * @author dirk.kohnen
 *
 */
public class WriteContactPropertyToScopevisio implements IService{

    static private final String newline = "\n";
	private final String url = "https://appload.scopevisio.com/api/soap/contact/Contact.importExtendedCSV";
	public Properties prop;
	private MessageFactory mf;
	private SOAPMessage request;
	private SOAPBody body;
	private  SOAPElement requestElement, authnElement, configElement, req;
	private PostResult result;
	private List<ContactProperty> properties;
	private String data = "";

	

	
	public WriteContactPropertyToScopevisio(Properties p){
		this.prop = p;
		initialize();
	}
	
	
	private void initialize() {
	    try {
	    	
	        // prepare SOAP
	        this.mf = MessageFactory.newInstance();
	        this.request = mf.createMessage();
	        this.body = request.getSOAPBody();
	        this.requestElement = body.addChildElement("req", "ns1", "http://www.scopevisio.com/");
	
	        // authorization tag
	        this.authnElement = requestElement.addChildElement("authn");
	        this.authnElement.addChildElement("customer").setTextContent(this.prop.getProperty("customer"));
	        this.authnElement.addChildElement("user").setTextContent(this.prop.getProperty("user"));
	        this.authnElement.addChildElement("pass").setTextContent(this.prop.getProperty("pass"));
	        this.authnElement.addChildElement("language").setTextContent(this.prop.getProperty("language"));
	        this.authnElement.addChildElement("organisation").setTextContent(this.prop.getProperty("organisation"));
	        this.req = (SOAPElement) body.getChildElements().next();
	        
	        // args/data tag
	        this.configElement = req.addChildElement("args");
        	if (this.prop.getProperty("conflictDetectionByName").compareTo("true") == 0)  this.configElement.addChildElement("conflictDetectionByName").setTextContent("true");
        	if (this.prop.getProperty("conflictDetectionByEmail").compareTo("true") == 0)  this.configElement.addChildElement("conflictDetectionByEmail").setTextContent("true");
        	if (this.prop.getProperty("conflictDetectionByType").compareTo("true") == 0)  this.configElement.addChildElement("conflictDetectionByType").setTextContent("true");
        	if (this.prop.getProperty("conflictDetectionByLegacyId").compareTo("true") == 0)  this.configElement.addChildElement("conflictDetectionByLegacyId").setTextContent("true");
	        String tmp = this.prop.getProperty("conflictAction");
	        this.configElement.addChildElement("conflictAction").setTextContent(tmp);
	        
	        if (this.prop.getProperty("columns").length() > 0)  this.configElement.addChildElement("columns").setTextContent(this.prop.getProperty("columns"));
	    } catch (Exception e2) {
	        // handle error
	        e2.printStackTrace();
	    }
		
	}
	
	public void setContactProperties(List<ContactProperty> p){
		this.properties = p;
        for (ContactProperty cp : this.properties){
        	if (this.prop.getProperty("columns").length() > 1) {
        		this.data = this.data + cp.getCSVByColumns(this.prop.getProperty("columns")) + newline;
        	} else {
        		this.data = this.data + cp.getCSV() + newline;
        	}
        }
	        try {
				this.configElement.addChildElement("data").setTextContent(data);
			} catch (DOMException | SOAPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	/*
	 * (non-Javadoc)
	 * @see de.scopevisio.importer.IService#postSoap()
	 */
	
	@Override
	public String postSoap(){
		String msg = "Fehler";
		try {
			request.writeTo(System.out);
			result = new URLPost().postSoap(url, request);
			msg = result.getReply();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return msg;
	}

}
