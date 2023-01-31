import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArrivalPage {

ChromeDriver driver;
	
	@FindBy(xpath="logo xpath") WebElement typeFilterOption;
	
	
	public NewArrivalPage(ChromeDriver x) {
		
		driver = x;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFirstProduct() {
		Helper.click(driver.findElement(By.xpath("xpath of first")));
	}
}
