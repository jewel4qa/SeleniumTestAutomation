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
	
	
	
  @Test(priority=0)
  public void verifyUserAbleTologin() throws InterruptedException {
		SeleniumWebDriver.startTestCase("verifyUserAbleTologin");
		SeleniumWebDriver.type(By.name("userName"), "salma11");
		SeleniumWebDriver.type(By.name("password"), "test4321");
		SeleniumWebDriver.click(By.xpath("//input[@name='login']"));


  }

  @Test(priority=2)
  public void verifyUserAbleTosearchOnewayFlight() throws InterruptedException {
	  SeleniumWebDriver.startTestCase("verifyUserAbleTosearchOnewayFlight");
	  SeleniumWebDriver.click(By.xpath("//*[@value='oneway']"));
	  SeleniumWebDriver.selctUsingValue(By.name("passCount"), "3");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  	  
  }
  
  
  @Test(priority=1)
  public void verifyUserAbleToSearchRoundtripFlight() {
	  SeleniumWebDriver.startTestCase("verifyUserAbleToSearchRoundtripFlight");
	  SeleniumWebDriver.click(By.xpath("//*[@value='roundtrip']"));
	  SeleniumWebDriver.selctUsingValue(By.name("passCount"), "1");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  
  
  @AfterTest
  public void tearDown() {
	  SeleniumWebDriver.driver.quit();
  }
  
}
