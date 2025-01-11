package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@name='name_on_card']")
	private WebElement txtNameOnCard;

	@FindBy(xpath = "//input[@name='card_number']")
	private WebElement txtCardNumber;

	@FindBy(xpath = "//input[@placeholder='ex. 311']")
	private WebElement txtCvcNumber;

	@FindBy(xpath = "//input[@placeholder='MM']")
	private WebElement txtMonth;

	@FindBy(xpath = "//input[@placeholder='YYYY']")
	private WebElement txtYear;

	@FindBy(xpath = "//button[@id='submit']")
	private WebElement buttonPayAndConfirmOrder;

	@FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
	private WebElement ConfirmedMessagOfPlacedOrder;

	@FindBy(xpath = "//a[normalize-space()='Download Invoice']")
	private WebElement buttonDownloadInvoice;

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement buttonContinue;
	
	
	public void setPayment(String name, String cardNumber, String cvc, String month, String year) {
		txtNameOnCard.sendKeys(name);
		txtCardNumber.sendKeys(cardNumber);
		txtCvcNumber.sendKeys(cvc);
		txtMonth.sendKeys(month);
		txtYear.sendKeys(year);
		buttonPayAndConfirmOrder.click();
	}

	public boolean isCongratulateMessageDisplayed() {
		boolean congratulationMessage = ConfirmedMessagOfPlacedOrder.isDisplayed();
		return congratulationMessage;
	}
}
