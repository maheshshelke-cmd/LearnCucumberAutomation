package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utilities.TestContextSetup;

public class landingPageStepDefinition {

	TestContextSetup tcSetup;
	public PageObjectManager pageObjectManager;
	public LandingPage landingPage;

	public landingPageStepDefinition(TestContextSetup tcSetup) {
		this.tcSetup = tcSetup;
		this.landingPage = tcSetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on the landing page")
	public void user_is_on_the_landing_page() throws IOException {

	}

	@And("^User serach the product with shortname (.+) and extracted actual name of the product$")
	public void user_search_the_product_with_short_name_tom_and_extracted_actual_name_of_the_product(String shortName)
			throws InterruptedException {

		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		landingPage.searchedProductText();
		tcSetup.landingPageProductName = landingPage.searchedProductText();
		System.out.println(tcSetup.landingPageProductName + ": is exptracted from Landing Page");

	}


	@Given("^User select quantity as (.+) and add product to cart$")
	public void user_select_quantity_as_and_add_product_to_cart(String quantity) {
		landingPage.enterProductQuantity(quantity);
		landingPage.clickOnAddtoCartButton();
		landingPage.clickCartLink();
		landingPage.clickProceedToCheckOutButton();

	}



	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step definition");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step definition");
	}

	@When("I complete action")
	public void i_complete_action() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step definition");
	}

	@When("some other action")
	public void some_other_action() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step definition");
	}

	@When("yet another action")
	public void yet_another_action() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step definition");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step definition");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step definition");
	}

	@Given("User launch home page")
	public void user_launch_home_page() {
		// Code to launch the home page
	}

	@When("^User login to application using (.+) and (.+)$")
	public void user_login_to_application_using_user_name_and_password(String userName, String password) {
		// Code to login to the application using userName and password
	}

	@Then("user able to select product")
	public void user_able_to_select_product() {
		// Code to verify user is able to select product
	}

	@Given("I am on landing page")
	public void i_am_on_landing_page() {
		// Code to navigate to the landing page
	}

	@When("fill the application form")
	public void fill_the_application_form(DataTable dataTable) {
		List<Map<String, String>> formData = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : formData) {
			String name = data.get("Name");
			String sirname = data.get("Sirname");
			String email = data.get("Email");
			String phone = data.get("Phone");
			System.out.println("Name: " + name);
			System.out.println("Sirname: " + sirname);
			System.out.println("Email: " + email);
			System.out.println("Phone: " + phone);

		}
	}

	@Then("I save the application form")
	public void i_save_the_application_form() {
		// Code to save the application form
	}
}
