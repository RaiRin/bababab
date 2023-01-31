import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstShirtpage {

ChromeDriver driver;
	
	public FirstShirtpage(ChromeDriver x) {
		
		driver = x;
	}
	
	public void clickOnSize() {
		Helper.click(driver.findElement(By.xpath("xpath of size")));
	}
	public void clickOnColor() {
		Helper.click(driver.findElement(By.xpath("xpath of color")));
	}
	public void clickOnAddToCart() {
		Helper.click(driver.findElement(By.xpath("xpath of cart")));
	}
}
