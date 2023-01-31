import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstProductPage {

ChromeDriver driver;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[7]/div/div[5]/button") WebElement size;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[5]/div/div[2]/a[2]") WebElement color;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[8]/div[3]/button") WebElement addToCart;
	
	public FirstProductPage(ChromeDriver x) {
		
		driver = x;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSize() {
		Utility.click(size);
	}
	public void clickOnColor() {
		Utility.click(color);
	}
	public void clickOnAddToCart() {
		Utility.click(addToCart);
	}
}
