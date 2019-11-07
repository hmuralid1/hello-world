package hello;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value = GreetingController.class, secure = false)
public class GreetingControllerTestIT {
    
//     WebDriver driver;
    
// 	  public static final String USERNAME = "kkhadkek";
// 	  public static final String ACCESS_KEY = "645af159-0360-4d45-a79c-4fe7766f408b";
// 	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	  
//       @Before
//     	public void setUp() throws MalformedURLException{
//     	System.out.println("-- Setup() BEGIN --");
//     	DesiredCapabilities caps = DesiredCapabilities.firefox();
//     	caps.setCapability("platform", "LINUX");
//     	caps.setCapability("version", "latest");
//     	caps.setCapability("name", "SampleSauceTest");
//     	driver = new RemoteWebDriver(new URL(URL), caps);
//     	System.out.println("Driver is : "+driver);
//     	System.out.println("-- Setup() END --");
//       }

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private GreetingService greetingService;

	@Test
	public void GreetingTest() throws Exception {
	    Greeting greeting = new Greeting(2,"Hello, World !");
		System.out.println("This is GreetingTest method");
		Mockito.when(greetingService.greeting(Mockito.anyString())).thenReturn(greeting);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/greeting").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse().getContentAsString());
		String expected = "{id:2,content:'Hello, World!'}";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
		
	}
	
	@Test
	public void GreetingName() throws Exception {
		Greeting greeting = new Greeting(1,"Hello, Murali !");
		System.out.println("This is greetingTest() test method");
		Mockito.when(greetingService.greeting(Mockito.anyString())).thenReturn(greeting);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/greeting?name=Murali").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse().getContentAsString());
		String expected = "{id:1,content:'Hello, Murali!'}";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}
	
// 	@Test
// 	public void testScript() {
// 		System.out.println("-- testScript() BEGIN --");
// 		driver.get("https://saucelabs.com/test/guinea-pig");
// 		System.out.println("title of page is: " + driver.getTitle());	 	
// 	 	assertEquals("I am a page title - Sauce Labs", driver.getTitle());
// 	    driver.quit();
// 		System.out.println("-- testScript() END --");
// 	}
	 


}
// public class GreetingControllerTest {

// 	@Autowired
// 	private MockMvc mockMvc;

	
// 	@Test
// 	public void GreetingTest() throws Exception {

// 		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
// 				"/greeting").accept(
// 				MediaType.APPLICATION_JSON);

// 		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

// 		System.out.println(result.getResponse());
// 		String expected = "{id:1,content:'Hello, World!'}";
// 		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
// 	}

// }