package testNGSample1;

	
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {
			
			
			
				
			driver.get("https://google.co.in/"); 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title = driver.getTitle();				 
			AssertJUnit.assertTrue(title.contains("Google")); 		
			System.out.println("Test Success");
		}	
		@BeforeTest
		public void beforeTest() {	
//			System.setProperty("webdriver.gecko.driver", "resources/geckodriver");					
//		       driver= new FirefoxDriver();		
			
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
			driver = new ChromeDriver();
		    driver.manage().window().maximize();	  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}
