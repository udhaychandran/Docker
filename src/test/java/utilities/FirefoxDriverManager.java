package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class FirefoxDriverManager extends DriverManager {

	@Override
	protected void createWebDriver() {
		
	FirefoxOptions options = new FirefoxOptions();
	this.driver = new FirefoxDriver(options);
		
	}

	
}
