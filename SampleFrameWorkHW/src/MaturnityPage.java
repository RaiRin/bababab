import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaturnityPage {

ChromeDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div[2]/div[2]/a[1]") WebElement firstProduct;
	
	public MaturnityPage(ChromeDriver x) {
		
		driver = x;
		PageFactory.initElements(driver, this);
	}
	
	public FirstProductPage clickOnFirstProduct() {
		Utility.click(firstProduct);
		return new FirstProductPage(driver);
	}
}
