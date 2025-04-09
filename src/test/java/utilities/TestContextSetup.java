package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

//dependency injection with picocontainer
public class TestContextSetup {

	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public String checkoutPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtilities genericUtilities;

	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtilities = new GenericUtilities(testBase.WebDriverManager());
	}

}
