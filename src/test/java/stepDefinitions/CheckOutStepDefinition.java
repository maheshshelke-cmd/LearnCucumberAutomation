package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckOutPage;
import pageObjects.PageObjectManager;
import utilities.TestContextSetup;

public class CheckOutStepDefinition {

	TestContextSetup tcSetup;
	public PageObjectManager pageObjectManager;
	public CheckOutPage checkoutPage;

	public CheckOutStepDefinition(TestContextSetup tcSetup) {
		this.tcSetup = tcSetup;
		this.checkoutPage = tcSetup.pageObjectManager.getcheckOutPage();
	}


	@Then("^User check (.+) products exist on checkout page$")
	public void user_check_products_exist_on_checkout_page(String productName) {

		tcSetup.checkoutPageProductName = checkoutPage.getProductName(productName);
		System.out.println(tcSetup.checkoutPageProductName);
		Assert.assertEquals(tcSetup.landingPageProductName, tcSetup.checkoutPageProductName);

	}

	@Then("User apply promotion and place the order")
	public void user_apply_promotion_and_place_the_order() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(checkoutPage.applyButtonDisplayed());
		Assert.assertTrue(checkoutPage.placeOrderButtonDisplayed());


	}

}
