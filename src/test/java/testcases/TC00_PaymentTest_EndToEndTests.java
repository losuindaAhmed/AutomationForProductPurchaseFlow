package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.CheckoutProcessPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.PaymentPage;
import pageobjects.ProductsPage;

public class TC00_PaymentTest_EndToEndTests extends BaseTest {

	ProductsPage productpage;
	HomePage homepage;
	LoginPage loginPage;
	CheckoutProcessPage checkout;

	PaymentPage paymentpage;

	
	
	 // Test case 1: Verify Add Product to Cart and Checkout
	@Test(priority = 1)
	public void verifyAddProductToCartAndCheckout() {
		homepage = new HomePage(driver);
		homepage.clickonConsentButton();
		homepage.clickonsignUp_login();
		loginPage = new LoginPage(driver);
		loginPage.setEmail(p.getProperty("username"));
		loginPage.setPassword(p.getProperty("passsword"));
		loginPage.clickonlogin();
		productpage = new ProductsPage(driver);
		productpage.clickonProducts();
		productpage.selectProductItem();
		productpage.clickonViewCart();
		String titlePage = driver.getTitle();
		String actualTitle = "Automation Exercise - Checkout";
		Assert.assertEquals(titlePage, actualTitle, "Testcases Passed");

	}

	 // Test case 2: Verify Checkout Process
	@Test(priority = 2)
	public void verifyCheckoutProcess() {
		checkout = new CheckoutProcessPage(driver);
		checkout.clickoncheckoutProcessed();
		checkout.clickOnPlaceOrder();
		String expectedTitlePage = driver.getTitle();
		String actualTitle = "Automation Exercise - Payment";
		Assert.assertEquals(expectedTitlePage, actualTitle, "Testcases Passed");

	}

	
	 // Test case 3: Verify Payment Method
	@Test(priority = 3)
	public void verfiyPaymentMethod() {
		paymentpage = new PaymentPage(driver);
		paymentpage.setPayment(p.getProperty("name"), p.getProperty("number"), p.getProperty("cvc"),p.getProperty("month"),p.getProperty("year"));
		boolean resultMassege = paymentpage.isCongratulateMessageDisplayed();
		if (resultMassege == true) {
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

	}

}
