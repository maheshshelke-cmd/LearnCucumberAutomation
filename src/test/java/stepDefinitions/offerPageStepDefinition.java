package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utilities.TestContextSetup;

public class offerPageStepDefinition {

	TestContextSetup tcSetup;
	public PageObjectManager pageObjectManager;
	public OfferPage offerPage;
	public LandingPage landingPage;

	public offerPageStepDefinition(TestContextSetup tcSetup) {

		this.tcSetup = tcSetup;
		this.offerPage = tcSetup.pageObjectManager.getOfferPage();
		this.landingPage = tcSetup.pageObjectManager.getLandingPage();
	}

	@Then("^User serach the same shortname (.+) on the offers page to check if product exist$")
	public void user_search_the_same_shortname_on_the_offers_page_to_check_if_product_exist(String shortName)
			throws InterruptedException {

		switchToOfferPage();

		offerPage.searchItem(shortName);
		Thread.sleep(2000);
		tcSetup.offerPageProductName = offerPage.getProductName(shortName);

	}

	public void switchToOfferPage() {

		landingPage.clickOffersPageLink();

		tcSetup.genericUtilities.switchToChildWindow();

	}

	@Then("validate product name on offers page matched with landing page")
	public void validate_product_name_on_offers_page_matched_with_landing_page() {

		Assert.assertEquals(tcSetup.landingPageProductName, tcSetup.offerPageProductName);

	}

}
