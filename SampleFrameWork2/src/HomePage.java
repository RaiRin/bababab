import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	ChromeDriver driver;
	
	@FindBy(xpath="logo xpath") WebElement homePageLogo;
	@FindBy(xpath="men xpath") WebElement manMeueCatgory;
	@FindBy(xpath="women xpath") WebElement womanMeueCatgory;
	
	public HomePage(ChromeDriver x) {
		
		driver = x;
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePageLogo() {
		boolean result = Helper.verifyElement(homePageLogo);
	}
	
	public void hoverOverMenMenu() {
		Helper.hoverOverElement(driver, manMeueCatgory);
	}
	
	public NewArrivalPage clickOnNewArrival() {
		Helper.click(driver.findElement(By.xpath("xpath of new arrival sub menue")));
		return new NewArrivalPage(driver);
	}
	
	public void hoverOverWomenMenu() {
		Helper.hoverOverElement(driver, womanMeueCatgory);
	}
	
	public WomenJewlery clickOnJewlery() {
		Helper.click(driver.findElement(By.xpath("xpath of new arrival sub menue")));
		return new WomenJewlery(driver);
	}
	
}
