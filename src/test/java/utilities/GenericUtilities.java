package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtilities {

	public WebDriver driver;

	public GenericUtilities(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToChildWindow() {

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
	}

}
