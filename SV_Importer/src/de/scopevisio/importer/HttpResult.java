/*
 * (c) 2018 Scopevisio AG
 */

package de.scopevisio.importer;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;


/**
 * Result of a web-service call. This simple structure
 * contains the http-code and an optional response in binary form.
 */
public class HttpResult {
    private final URL url;
    private final String requestMethod;
    private final Map<String, List<String>> requestProperties;
	private final int code;
	private final byte[] data;
	private final Map<String, List<String>> headerFields;
	
	public HttpResult(URL url, String requestMethod, Map<String, List<String>> requestProperties, int code, byte[] data, Map<String, List<String>> headerFields) {
	    this.url = url;
	    this.requestMethod = requestMethod;
	    this.requestProperties = requestProperties;
		this.code = code;
		this.data = data == null ? null : data.clone();
		this.headerFields = headerFields;
	}
	
	public String getDataAsString(String encoding) throws UnsupportedEncodingException {
		return data == null ? null : new String(data, encoding);
	}

	public int getCode() {
		return code;
	}
	
	public byte[] getData() {
		return data == null ? null : data.clone();
	}
		
    public Map<String, List<String>> getHeaderFields() {
        return Collections.unmodifiableMap(headerFields);
    }
    
    public URL getUrl() {
        return url;
    }
    
    public String getRequestMethod() {
        return requestMethod;
    }
    
    public Map<String, List<String>> getRequestProperties() {
        return Collections.unmodifiableMap(requestProperties);
    }
    
}
