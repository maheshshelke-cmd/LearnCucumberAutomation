package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {

		FileInputStream fis = new FileInputStream( System.getProperty("user.dir")+"//src//test//resources//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String browser_properties = prop.getProperty("browser");
		String terminal_properties = System.getProperty("browser");
		
		String browser = terminal_properties!= null ? terminal_properties : browser_properties;

		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome"))
			{
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-infobars"); // Remove "controlled by automation" banner
				options.addArguments("--start-maximized"); // Maximize the browser
				// options.setHeadless(true); // Uncomment only for headless mode
				driver = new ChromeDriver(options);
				driver.get(prop.getProperty("QAUrl"));
				driver.manage().window().maximize();
			}

			if (browser.equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver();
				driver.get(prop.getProperty("QAUrl"));
				driver.manage().window().maximize();
			}

		}

		return driver;
	}

}
