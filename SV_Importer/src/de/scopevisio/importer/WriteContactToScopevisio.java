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
import de.scopevisio.importer.data.Kontakt;

/**
 * @author dirk.kohnen
 *
 */
public class WriteContactToScopevisio implements Service{

    static private final String newline = "\n";
	private final String url = "https://appload.scopevisio.com/api/soap/contact/Contact.importExtendedCSV";
	public Properties prop;
	private MessageFactory mf;
	private SOAPMessage request;
	private SOAPBody body;
	private  SOAPElement requestElement, authnElement, configElement, req;
	private PostResult result;
	private List<Kontakt> contacts;
	private String data = "";

	

	
	public WriteContactToScopevisio(Properties p){
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
	        this.configElement.addChildElement("conflictDetectionByEmail").setTextContent("true");
	        this.configElement.addChildElement("conflictAction").setTextContent("skip");
	    } catch (Exception e2) {
	        // handle error
	        e2.printStackTrace();
	    }
		
	}
	
	public void setContacts(List<Kontakt> c){
		this.contacts = c;
        for (Kontakt k : this.contacts){
        	this.data = this.data + k.getCSV() + newline;
        }
	        try {
				this.configElement.addChildElement("data").setTextContent(data);
			} catch (DOMException | SOAPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	@Override
	public String postSoap(){
		String msg = "Fehler";
		try {
			result = new URLPost().postSoap(url, request);
			msg = result.getReply();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return msg;
	}

}
