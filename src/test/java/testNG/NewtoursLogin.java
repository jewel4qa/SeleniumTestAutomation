package testNG;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;
import org.testng.annotations.Test;

public class NewtoursLogin {
  @Test
  public void verifyUserAbleTologin() throws InterruptedException {
		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");

		SeleniumWebDriver.type(By.name("userName"), "salma11");

		
		SeleniumWebDriver.type(By.name("password"), "test4321");

		SeleniumWebDriver.click(By.xpath("//input[@name='login']"));

	//	SeleniumWebDriver.driver.close();

		//SeleniumWebDriver.driver.quit();
  }
  @Test
  public void verifyUserAbleTosearchOnewayFlight() throws InterruptedException {
	  SeleniumWebDriver.click(By.xpath("//*[@value='oneway']"));
	  SeleniumWebDriver.selctUsingValue(By.name("passCount"), "9");
	  	
	  SeleniumWebDriver.driver.quit(); 
	  
  }
  
}
