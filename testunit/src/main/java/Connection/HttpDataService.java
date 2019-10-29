package Connection;

import java.io.IOException;

import org.apache.http.client.fluent.Request;


public class HttpDataService {
	
	public static String url = "http://jsonip.com";

	public String getJsonIp() {
		try {
			return Request.Get(url).execute().returnContent().toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getJsonIp(String url) {
		try {
			return Request.Get(url).execute().returnContent().toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
