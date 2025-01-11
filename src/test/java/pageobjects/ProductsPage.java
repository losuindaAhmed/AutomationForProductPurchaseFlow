package pageobjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@href='/products']")
	private WebElement products;

	@FindBy(xpath = "//a[@data-product-id='2' and contains(@class, 'add-to-cart')]")
	private WebElement productItems;

	@FindBy(xpath = "//p[@class='text-center']//a[@href='/view_cart']")
	private WebElement viewCartLink;

	public void clickonProducts() {
		products.click();
	}

	public void selectProductItem() {
		productItems.click();
	}
//	public void selectProductItem() {
//		for (int i = 0; i < productItems.size(); i++) {
//			productItems.get(i).click();
//
//		}

	// }

	public void clickonViewCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", viewCartLink);
		viewCartLink.click();
	}

}
