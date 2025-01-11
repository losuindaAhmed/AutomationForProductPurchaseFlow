package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutProcessPage extends BasePage {

	public CheckoutProcessPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
	private WebElement proceedCheckoutButton;

	@FindBy(xpath = "//a[normalize-space()='Place Order']")
	private WebElement placeOrderButton;

	public void clickoncheckoutProcessed() {
		proceedCheckoutButton.click();
	}

	public void clickOnPlaceOrder() {
		placeOrderButton.click();
	}

}
