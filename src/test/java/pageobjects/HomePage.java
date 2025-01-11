package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@href='/products']")
	private WebElement productsItem;

	@FindBy(xpath = "//a[normalize-space()='Cart']")
	private WebElement cartItem;

	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	private WebElement signUp_login;

	@FindBy(xpath = "//p[@class='fc-button-label' and text()='Consent']")
	private WebElement consentButton;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement logoutLink;

	public void clickonConsentButton() {
		consentButton.click();
	}

	public void clickonLogout() {
		logoutLink.click();
	}

	public void clickonProducts() {
		productsItem.click();
	}

	public void clickonCart() {
		cartItem.click();
	}

	public void clickonsignUp_login() {
		signUp_login.click();
	}

}
