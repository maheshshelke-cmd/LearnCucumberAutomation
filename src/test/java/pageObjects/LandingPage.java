package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("//input[@type='search']");
	By product = By.xpath("//*[@class='product-name']");
	By offersLink = By.xpath("//a[@class='cart-header-navlink']");
	By productQuantity = By.xpath("//input[@class='quantity']");
	By addToCartButton = By.xpath("//button[text()='ADD TO CART']");
	By cartLink = By.xpath("//a[@class='cart-icon']");
	By proceedToCheckOutButton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");

	// Action methods for each webElements on Landing Page

	public void searchItem(String shortName) {
		driver.findElement(search).sendKeys(shortName);
	}

	public String searchedProductText() {
		return driver.findElement(product).getText().split("-")[0].trim();
	}

	public void clickOffersPageLink() {
		driver.findElement(offersLink).click();
	}

	public void enterProductQuantity(String quantity) {
		driver.findElement(productQuantity).clear();
		driver.findElement(productQuantity).sendKeys(quantity);
	}

	public void clickOnAddtoCartButton() {
		driver.findElement(addToCartButton).click();
	}

	public void clickCartLink() {
		driver.findElement(cartLink).click();
	}

	public void clickProceedToCheckOutButton() {
		driver.findElement(proceedToCheckOutButton).click();
	}

}
