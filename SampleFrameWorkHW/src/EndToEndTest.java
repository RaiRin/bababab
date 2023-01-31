import org.junit.Test;

public class EndToEndTest extends BaseTest{

	@Test
	public void buyMaturnityShirt() {
		HomePage hp = new HomePage(driver);
		hp.verifyHomePageLogo();
		hp.hoverOverWomenMenu();
		MaturnityPage mp = hp.clickOnMaturnity();
		FirstProductPage fpp = mp.clickOnFirstProduct();
		fpp.clickOnSize();
		fpp.clickOnColor();
		fpp.clickOnAddToCart();
	}
	
}
