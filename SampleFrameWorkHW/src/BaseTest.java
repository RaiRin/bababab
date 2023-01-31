import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static ChromeDriver driver = null;
	
		@BeforeClass
		
	   @Before
		public static void openBroweser() {
			driver = new ChromeDriver();
			driver.get("http://express.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		}
		@AfterClass
		 
		@After
		public static void closeBrowser() {
			driver.quit();
		}
}
