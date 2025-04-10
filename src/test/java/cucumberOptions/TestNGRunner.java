package cucumberOptions;

import org.testng.annotations.DataProvider;

//import com.google.common.base.Objects;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", tags="@checkout", monochrome = true, plugin = {
		"pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json"}, dryRun = false, publish = true, snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

	//when we want to run parallel execution then use below code
	//we are calling scenario method from AbstractTestNGCucumberTests class using super keyword (when we user supe then parents class methods gets called)
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
