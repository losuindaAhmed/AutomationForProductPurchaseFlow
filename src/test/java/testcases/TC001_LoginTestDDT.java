package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import utilities.DataProviders;

public class TC001_LoginTestDDT extends BaseTest {
	HomePage homepage;

	@Test(priority = 1)

	public void testHomePage() {
		try {
			HomePage homepage = new HomePage(driver);
			homepage.clickonConsentButton();
			homepage.clickonsignUp_login();
		} catch (Exception e) {
			System.err.println("Error in HomePage test: " + e.getMessage());
			Assert.fail("HomePage actions failed.");
		}

	}

	@Test(priority = 2, dataProvider = "LoginDataProvider", dataProviderClass = DataProviders.class)
	public void verify_loginDDT(String email, String password, String exp) {
		LoginPage loginpage = new LoginPage(driver);
		try {
			loginpage.setEmail(email);
			loginpage.setPassword(password);
			loginpage.clickonlogin();

			if (exp.equalsIgnoreCase("Valid")) {
				homepage = new HomePage(driver);
				Assert.assertTrue(true);
				homepage.clickonLogout();
			} else if (exp.equalsIgnoreCase("Invalid")) {
				Assert.assertTrue(loginpage.isErrorMessageDisplayed(),"Error message should be displayed for invalid login.");
				loginpage.clearEmail();
			} else {
				Assert.fail("Invalid expected result value: " + exp);
			}
		} catch (Exception e) {
			System.err.println("Error during login verification: " + e.getMessage());
			Assert.fail("Login test failed.");
		}
	}

//		if (exp.equalsIgnoreCase("Valid")) {
//
//			homepage = new HomePage(driver);
//			homepage.clickonLogout();
//			Assert.assertTrue(true);
//
//		}
//		if (exp.equalsIgnoreCase("Invalid")) {
//
//			loginpage.clearEmail();
//			Assert.assertTrue(true);
//
//		}
}
