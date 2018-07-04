package de.scopevisio.importer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import de.scopevisio.importer.data.Project;

public class WriteProjectREST implements IServiceREST {
	HttpURLConnection conn;
	String output;
	String msg;
	private ObjectMapper objectMapper;
	
	
	private HttpURLConnection getConnection(){
		try {
		URL url = new URL("https://appload.scopevisio.com/rest/project/new");
		conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("Content-Type", "application/json");
		return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WriteProjectREST(){
	}

	public String postREST(Project p, String accessToken, ImporterGui ig, ObjectMapper objectMapper) {
        try {
        this.objectMapper = objectMapper;

        JsonNode projectNode = objectMapper.readTree(p.getJSONRest());
        
        HttpResult result = HttpUtil.httpCall(ImporterGui.BASE_URL + "/project/new", 
                new String[][] {
                    { "Content-Type", "application/json" },
                    { "Authorization", "Bearer " + accessToken }
                },
                objectMapper.writeValueAsBytes(projectNode)
                );

		ig.request(objectMapper.writeValueAsString(p.getJSONRest()), result);
        
        JsonNode json = result.getData() != null ? objectMapper.readValue(result.getData(), JsonNode.class) : null;
        ig.response(json != null ? objectMapper.writeValueAsString(json) : null, result);
        
        if (result.getCode() == 200 && result.getData() != null) {
				return "erfolgreich";
        }

        } catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		/*
		String input = p.getJSONRest();
		conn = getConnection();

		System.out.println(input);
		try {
			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			
			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				System.out.println(conn.getHeaderFields().toString());
				System.out.println(conn.getInputStream().toString());
				System.out.println(conn.getResponseMessage());
				System.out.println(conn.getResponseCode());
				System.out.println(conn.getErrorStream().toString());
				conn.disconnect();
				throw new RuntimeException("Failed : HTTP error code : ");
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				msg += output;
			}
			conn.disconnect();
			return msg;

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		return "Fehler";
		
	}

	@Override
	public String postREST() {
		// TODO Auto-generated method stub
		return null;
	}

}
