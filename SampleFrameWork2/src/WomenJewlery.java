import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenJewlery {

ChromeDriver driver;
	
	@FindBy(xpath="logo xpath") WebElement typeFilterOption;
	
	
	public WomenJewlery(ChromeDriver x) {
		
		driver = x;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFilterType() {
		Helper.click(typeFilterOption);
	}
}
