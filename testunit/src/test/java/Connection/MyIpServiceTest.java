package Connection;

import static org.junit.Assert.*;

import org.junit.*;
import org.mockito.*;

import com.google.gson.JsonSyntaxException;

public class MyIpServiceTest {

	private HttpDataService httpDataServiceMock;
	
	@Before
	public void init() {
		httpDataServiceMock = Mockito.mock(HttpDataService.class);
	}
	
	// public String getMyIp()
	
		// Null parameters
	
	@Test
	public void getMyIp_getJsonIpNull() {
		Mockito.when(httpDataServiceMock.getJsonIp()).thenReturn(null);
		MyIpService myIpservice = new MyIpService(httpDataServiceMock);
		
		assertEquals(null, myIpservice.getMyIp());
	}
	
		// String format problem
	
	@Test (expected = JsonSyntaxException.class)
	public void getMyIp_getJsonIpWrongJsonFormat() {
		Mockito.when(httpDataServiceMock.getJsonIp())
		.thenReturn("\"ip\":\"92.154.66.22\""
				+ ",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\""
				+ ",\"reject-fascism\":"
				+ "\"Support Planned Parenthood: "
				+ "https://www.plannedparenthood.org/get-involved\"");
		MyIpService myIpservice = new MyIpService(httpDataServiceMock);
		myIpservice.getMyIp();
	}
	
	@Test (expected = JsonSyntaxException.class)
	public void getMyIp_getJsonIpWrongJsonFormatSimpleIp() {
		Mockito.when(httpDataServiceMock.getJsonIp())
		.thenReturn("ip:92.154.66.22");
		MyIpService myIpservice = new MyIpService(httpDataServiceMock);
		myIpservice.getMyIp();
	}
	
		// Others
	
	@Test
	public void getMyIp_CorrectResult() {
		Mockito.when(httpDataServiceMock.getJsonIp())
		.thenReturn("{\"ip\":\"92.154.66.22\""
				+ ",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\""
				+ ",\"reject-fascism\":"
				+ "\"Support Planned Parenthood: "
				+ "https://www.plannedparenthood.org/get-involved\"}");
		MyIpService myIpservice = new MyIpService(httpDataServiceMock);
		
		assertEquals("92.154.66.22", myIpservice.getMyIp());
	}

}
