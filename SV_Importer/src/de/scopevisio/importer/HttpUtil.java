/*
 * (c) 2018 Scopevisio AG
 */

package de.scopevisio.importer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Utility methods for using the API.
 */
public class HttpUtil {
	private static final Logger logger = Logger.getLogger(HttpUtil.class.getName());
	
	
	/**
	 * Contructs encoded form-data from a an array of key-values pairs eg parameters.
	 * 
	 * @param formParameters the key value pairs as an array of string-arrays of length2
	 * @return utf-8 encoded form-data string
	 */
	public static byte[] makeFormData(String[][] formParameters) throws Exception {
		StringBuilder sb = new StringBuilder();
		for (String[] formParameter : formParameters) {
			if (sb.length() > 0) {
				sb.append("&");
			}
			String key = formParameter[0];
			String value = formParameter[1];
			sb.append(URLEncoder.encode(key, "UTF-8"))
				.append("=")
				.append(URLEncoder.encode(value, "UTF-8"));
		}
		return sb.toString().getBytes("UTF-8");
	}
	

	/**
	 * Helper Method. Reads the givne input stream into a byte-array.
	 * @param is the input stream to read
	 * @return the bytes
	 */
	public static byte[] readFile(InputStream is) throws Exception {
		byte[] buffer = new byte[16384];
		int c;
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		while ((c = is.read(buffer, 0, buffer.length)) > 0) {
			os.write(buffer, 0, c);
		}
		return os.toByteArray();
	}

	
	/**
	 * Calls a http resource and returns a result.
	 * 
	 * @param url the url to call
	 * @param headers optional array of headers, each header is a string-array of length 2s
	 * @param body optional bodys
	 * @return the result structure or <code>null</code> if calling failed very early.
	 */
	public static HttpResult httpCall(String url, String[][] headers, byte[] body) {
	    return httpCall(url, body == null ? "GET" : "POST", headers, body);
	}

    /**
     * Calls a http resource and returns a result.
     * 
     * @param url the url to call
     * @param requestMethod the request method
     * @param headers optional array of headers, each header is a string-array of length 2s
     * @param body optional bodys
     * @return the result structure or <code>null</code> if calling failed very early.
     */	
	public static HttpResult httpCall(String url, String requestMethod, String[][] headers, byte[] body) {
		HttpResult r = null;
		try {
	        URL urlurl = new URL(url);
	        HttpURLConnection conn = (HttpURLConnection) urlurl.openConnection();
	        conn.setRequestMethod(requestMethod);
	        
	        boolean chunked = false;
	        if (headers != null) {
	            for (int i = 0; i < headers.length; i++) {
	                String key = headers[i][0];
					String value = headers[i][1];
					conn.addRequestProperty(key, value);
	                if (key.equalsIgnoreCase("Transfer-Encoding") && value.equalsIgnoreCase("chunked")) {
	                	chunked = true;
	                }
	                	
	            }
	        }

	        Map<String, List<String>> requestProperties = conn.getRequestProperties();
	        
	        // if we have a body, do a post and send the body
	        if (body != null && body.length > 0) {
	        	if (chunked) {
	        		conn.setChunkedStreamingMode(0);
	        	}

	            conn.setDoOutput(true);
	            conn.getOutputStream().write(body);;
	            conn.getOutputStream().close();
	        }

	        int code = HttpURLConnection.HTTP_OK;
	        if (conn instanceof HttpURLConnection) {
	            try {
	                code = ((HttpURLConnection) conn).getResponseCode();
	            } catch (IOException ex) {
	                // If the return code is 503 or something, we don't get this, but an IOException instead
	                code = HttpURLConnection.HTTP_INTERNAL_ERROR;
	            }
	        }

	         // Get the response
	        byte[] output = null;
            if ((conn instanceof HttpURLConnection) && (code == HttpURLConnection.HTTP_NOT_FOUND)) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) conn;
                output = readFile(httpURLConnection.getErrorStream());
            } else {
                try {
                    output = readFile(conn.getInputStream());
                } catch (Exception ex) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) conn;
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null)
                    	output = readFile(errorStream);
                }
            }
            
            r = new HttpResult(conn.getURL(), conn.getRequestMethod(), requestProperties,
                    code, output, conn.getHeaderFields());
		} catch (Exception e) {
			logger.log(Level.SEVERE, "failed to invoke url \"" + url + "\"", e);
		}
		return r;
	}
	
	

}
