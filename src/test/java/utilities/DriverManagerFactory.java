package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.CaseFormat;

public class DriverManagerFactory {

	public static DriverManager getDriverManager(DriverType type) {
		
		DriverManager driverManager = null;
		
		switch (type) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavie\\Desktop\\Automation\\dockk\\lib\\chromedriver.exe");
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\bavie\\Desktop\\Automation\\dockk\\lib\\geckodriver.exe");
			driverManager = new ChromeDriverManager();
			break;
			
		case EDGE:
			System.setProperty("webdriver.EDGE.driver", "C:\\Users\\bavie\\Desktop\\Automation\\dockk\\lib\\msedgedriver.exe");
			driverManager = new ChromeDriverManager();
			break;
			
		default:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavie\\Desktop\\Automation\\dockk\\lib");
			driverManager = new IEDriverManager();
			break;
		}
		
		
		return driverManager;
		
		
		
		
	}
	
	
	
}
