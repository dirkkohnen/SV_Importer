/**
 * 
 */
package de.scopevisio.importer;

import java.util.Properties;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPMessage;

import de.scopevisio.importer.URLPost.PostResult;

/**
 * @author dirk.kohnen
 *
 */
public class PingPong implements IService{
	
	private final String url = "https://appload.scopevisio.com/api/soap/accounting/Ping.ping";
	public Properties prop;
	private MessageFactory mf;
	private SOAPMessage request;
	private SOAPBody body;
	private  SOAPElement requestElement, authnElement, req;
	private PostResult result;
	

	
	public PingPong(Properties p){
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
	    } catch (Exception e2) {
	        // handle error
	        e2.printStackTrace();
	    }
		
	}
	
	@Override
	public String postSoap(){
		String msg = "Fehler";
		try {
			result = new URLPost().postSoap(this.url, request);
			msg = result.getReply();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return msg;
	}

}
