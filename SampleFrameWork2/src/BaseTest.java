import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

static ChromeDriver driver = null;
	
   @Before
	public static void openBroweser() {
		driver = new ChromeDriver();
		driver.get("http://express.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	@After
	public static void closeBrowser() {
		driver.quit();
	}
}
