package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Functions {
	
	WebDriver driver;
	public static WebDriverWait wait;
	public static int implictyWaitTime = 10;
	public static int expWaitTime = 90;
	public static int theadSleep = 5000;
	
	public void waitTime() {
		wait = new WebDriverWait(driver, expWaitTime);
	}
	
}
