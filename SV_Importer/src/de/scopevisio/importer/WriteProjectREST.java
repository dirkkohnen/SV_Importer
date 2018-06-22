package de.scopevisio.importer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import de.scopevisio.importer.data.Project;

public class WriteProjectREST implements IServiceREST {
	HttpURLConnection conn;
	String output;
	String msg;
	
	
	private HttpURLConnection getConnection(){
		try {
		URL url = new URL("https://appload.scopevisio.com/rest/project/new");
		conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("Content-Type", "application/json");
//		conn.setRequestProperty("authorization", "Bearer 93f9ab00-7e9d7822-5a5c-44ee-8ce8-543c3a060b01");	// Token Artur
//		conn.setRequestProperty("authorization", "Bearer afb95da4-62cf1acf-5f8e-43a5-aee8-dea6862a861e");	// Token Test
		conn.setRequestProperty("authorization", "Bearer fa0fbbb2-0704a637-ba21-4548-9f9e-3d20aa72872e");	// Token P3
		return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WriteProjectREST(){
	}

	public String postREST(Project p) {
		String input = p.getJSONRest();
		conn = getConnection();

		System.out.println(input);
		try {
			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();

			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
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
		}
		return "Fehler";
	}

	@Override
	public String postREST() {
		// TODO Auto-generated method stub
		return null;
	}

}
