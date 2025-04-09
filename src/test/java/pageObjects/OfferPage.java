package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	WebDriver driver;

	public OfferPage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.id("search-field");
	By productName = By.xpath("//table[@class='table table-bordered']//tbody//td");

	// Action methods for each webElements on offer Page

	public void searchItem(String shortName) {
		driver.findElement(search).sendKeys(shortName);
	}

	public String getProductName(String shortName) {
		return driver.findElement(productName).getText();
	}

}
