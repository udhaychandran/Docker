package scenarios;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.DriverFactory;
import org.testng.annotations.Test;

import functions.Functions;
import functions.setUpTearDown;



public class Docker extends setUpTearDown {

	Functions func = new Functions();	
	@Test
	public void dockerPage(){
		
		WebElement element = driver.findElement(By.xpath("//input[@value='store']"));
		
		element.click();
//		func.waitTime();
		System.out.println("Wait paniyachu");
		if(element.isSelected()==true) {
			System.out.println("Great! The link is selected");
		}
		else {
			System.out.println("Unaku lam coding oru keda ?");
		}
		
		//bef2d9b9f1d6441da90673bb512073d5
		
	}
	}
		