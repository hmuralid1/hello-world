// package hello.Integration;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.env.Environment;

// import java.net.MalformedURLException;
// import java.net.URL;

// @Configuration
// public class ITConfig {

//     @Autowired
//     private Environment env;

//     @Bean
//     public WebDriver webDriver() throws MalformedURLException {
//         return new RemoteWebDriver(getRemoteUrl(), getDesiredCapabilities());
//     }

//     private DesiredCapabilities getDesiredCapabilities() {

//         final DesiredCapabilities caps = DesiredCapabilities.firefox();
// 		caps.setCapability("platform", "LINUX");
// 		caps.setCapability("version", "latest");
// 		caps.setCapability("name", "SampleSauceTest");
//         return caps;
//     }

//     private URL getRemoteUrl() throws MalformedURLException {
//         String USERNAME = "kusum2560";
//         String ACCESS_KEY = "85204798-74de-474a-840c-b79174e5499e";
//         return new URL("https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub");
    
//     }
// }//java file