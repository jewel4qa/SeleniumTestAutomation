package testNG;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewtoursLogin {
	@BeforeTest
	public void openAppication() {
		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");
	}
	
	
	
  @Test
  public void verifyUserAbleTologin() throws InterruptedException {
		

		SeleniumWebDriver.type(By.name("userName"), "salma11");

		
		SeleniumWebDriver.type(By.name("password"), "test4321");

		SeleniumWebDriver.click(By.xpath("//input[@name='login']"));


  }
  @Test
  public void verifyUserAbleTosearchOnewayFlight() throws InterruptedException {
	  SeleniumWebDriver.click(By.xpath("//*[@value='oneway']"));
	  SeleniumWebDriver.selctUsingValue(By.name("passCount"), "3");
	  	  
  }
  
  
  @Test
  public void verifyUserAbleToSearchRoundtripFlight() {
	  
  }
  
  
  @AfterTest
  public void tearDown() {
	  SeleniumWebDriver.driver.quit();
  }
  
}
