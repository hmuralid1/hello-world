// package hello.Integration;

// import org.junit.Assert;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// import static org.hamcrest.Matchers.equalTo;
// import static org.hamcrest.Matchers.is;

// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(classes = ITConfig.class)
// public class IndexOne {

//     @Autowired
//     private WebDriver driver;

//     @Test
//     public void visitIndexPage() throws Exception {
    
//         System.out.println("-- testScript() BEGIN --");
// 		driver.get("https://saucelabs.com/test/guinea-pig");
// 		System.out.println("title of page is: " + driver.getTitle());	 	
// 	 	assertEquals("I am a page title - Sauce Labs", driver.getTitle());
// 	    driver.quit();
// 		System.out.println("-- testScript() END --");
//     }
// }