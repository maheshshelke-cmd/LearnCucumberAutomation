package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	public WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}


	By productName = By.xpath("//p[@class='product-name']");
	By placeOrderButton = By.xpath("//button[text()='Place Order']");
	By applyButton = By.cssSelector(".promoBtn");


	// Action methods for each webElements on offer Page


	public String getProductName(String shortName) {
		return driver.findElement(productName).getText().split("-")[0].trim();
	}

	public void clickApplyButton() {
		driver.findElement(applyButton).click();
	}

	public void clickPlaceOrderButton() {
		driver.findElement(placeOrderButton).click();
	}

	public Boolean placeOrderButtonDisplayed() {
		return driver.findElement(applyButton).isDisplayed();
	}

	public Boolean applyButtonDisplayed() {
		return driver.findElement(placeOrderButton).isDisplayed();
	}

}
