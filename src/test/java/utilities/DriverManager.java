package utilities;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;

/**
 * Unit test for simple App.
 */
public abstract class DriverManager 
{
   
	protected WebDriver driver;
	protected abstract void createWebDriver();
	
	public void quitdriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}
	
	public WebDriver getWebDriver() {
		if(driver==null)
		{
			createWebDriver();
		}
		return driver;
		
	}
}
