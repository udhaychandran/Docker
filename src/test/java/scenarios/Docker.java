package scenarios;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.DriverFactory;
import org.testng.annotations.Test;

import functions.setUpTearDown;

public class Docker extends setUpTearDown {

	
	@Test
	public void dockerPage(){
		
		WebElement element = driver.findElement(By.xpath("//input[@value='store']"));
		element.click();
		
		if(element.isSelected()==true) {
			System.out.println("Great! The link is selected");
		}
		else {
			System.out.println("Unaku lam coding oru keda ?");
		}
		
		
		
	}
	}
		