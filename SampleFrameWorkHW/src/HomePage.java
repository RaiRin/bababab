import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

ChromeDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/a/img") WebElement homePageLogo;
	@FindBy(xpath="//*[@id=\"raven-header-mega-menu\"]/nav/ol/li[1]/a") WebElement womanMeueCatgory;
	@FindBy(xpath="//*[@id=\"root-Women\"]/ol[4]/li[1]/ol/li[4]/a") WebElement matirnityCatagory;
	
	public HomePage(ChromeDriver x) {
		
		driver = x;
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePageLogo() {
		boolean result = Utility.verifyElement(homePageLogo);
	}
	
	public void hoverOverWomenMenu() {
		Utility.hoverOverElement(driver, womanMeueCatgory);
	}
	
	public MaturnityPage clickOnMaturnity() {
		Utility.click(matirnityCatagory);
		return new MaturnityPage(driver);
	}
}
