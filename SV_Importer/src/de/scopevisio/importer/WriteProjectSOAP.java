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
import de.scopevisio.importer.data.Project;

/**
 * @author dirk.kohnen
 *
 */
public class WriteProjectSOAP implements IService{

    static private final String newline = "\n";
	private final String url = "https://appload.scopevisio.com/api/soap/accounting/Project.write";
	public Properties prop;
	private MessageFactory mf;
	private SOAPMessage request;
	private SOAPBody body;
	private SOAPElement requestElement, authnElement, configElement, req;
	private PostResult result;
	private List<Project> projects;
	private String data = "";

	

	
	public WriteProjectSOAP(Properties p){
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
	        
	        this.configElement = req.addChildElement("args");
	        
	    } catch (Exception e2) {
	        // handle error
	        e2.printStackTrace();
	    }
		
	}
	
	public void setProject(List<Project> p){
		this.projects = p;
		this.data = "[";
        for (Project pr : this.projects){
        	this.data = this.data + pr.getJSONSOAP() + "," + newline;
        }
        this.data = this.data.substring(0, this.data.length()-2);
		this.data = this.data + "]";
		//this.data.replaceAll("&", "&").replaceAll("<", "<").replaceAll(">", ">").replaceAll("\"", "\"");


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
