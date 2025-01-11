package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@data-qa='login-email']")
	private WebElement txtEmail;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement buttonLogin;

	@FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
	private WebElement errorMassage;

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void clearEmail() {
		txtEmail.clear();
	}

	public void clickonlogin() {

		buttonLogin.click();

	}
	public boolean isErrorMessageDisplayed() {
		boolean errMassage=errorMassage.isDisplayed();
		return errMassage;
		
	}
}
