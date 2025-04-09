package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.TestContextSetup;

public class hooks {


	TestContextSetup tcSetup;
	public hooks(TestContextSetup tcSetup) {
		this.tcSetup = tcSetup;
	}



	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario");
	}

	@After
	public void afterScenario() throws IOException, InterruptedException {

		System.out.println("After Scenario");
		Thread.sleep(2000);
		tcSetup.testBase.WebDriverManager().quit();

	}


	//Cucumber hooks to take screenshot if step is failed
	@AfterStep
	public void TakeScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = tcSetup.testBase.WebDriverManager();
		if(scenario.isFailed()) {
		 File scre = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


		byte[] filecontent= FileUtils.readFileToByteArray(scre);
		scenario.attach(filecontent,"imapge/png","image");

		}
	}

}
