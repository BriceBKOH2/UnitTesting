package Connection;

import java.util.Map;

import com.google.gson.*;

public class MyIpService {

	private HttpDataService httpDataService;
	
	public MyIpService(HttpDataService httpDataService) {
		this.httpDataService = httpDataService;
	}
	
	public String getMyIp()	throws IllegalStateException{
		Gson gson = new Gson();
		
		String jsonip = httpDataService.getJsonIp();
		if (jsonip != null) {
			Map<String, String> map = gson.<Map<String, String>>fromJson(jsonip, Map.class);
			return map.get("ip").split(",")[0];
		}
		
		return null;
	}

}
