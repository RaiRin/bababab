import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndTest extends BaseTest {

	@Test
	public static void main(String[] args) {
		
		HomePage hp = new HomePage(driver);
		hp.verifyHomePageLogo();//verify logo
		hp.hoverOverMenMenu();
		NewArrivalPage np = hp.clickOnNewArrival();
		np.clickOnFirstProduct();
		
	}
	@Test
	public void buyAJwelery() {
		
		HomePage hp = new HomePage(driver);
		hp.hoverOverWomenMenu();
		WomenJewlery wj = hp.clickOnJewlery();
		wj.clickOnFilterType();
	}
}
