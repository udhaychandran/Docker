package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utilities.DriverManager;
import utilities.DriverManagerFactory;
import utilities.DriverType;

public class setUpTearDown {

	DriverManager driverManager;
	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		
		driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
		driver = driverManager.getWebDriver();
		driver.get("https://hub.docker.com/search?type=image");
		String titleString = driver.getTitle();
		System.out.println(titleString);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
