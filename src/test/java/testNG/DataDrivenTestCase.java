package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

public class DataDrivenTestCase {

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");
	}

	@Test(dataProvider = "userLoginInfo")
	public void f(String sd, String password,String tripType, String departure,String arrival) {
	
		SeleniumWebDriver.type(By.name("userName"), sd);
		SeleniumWebDriver.type(By.name("password"), password);
		SeleniumWebDriver.click(By.xpath("//input[@name='login']"));
		//SeleniumWebDriver.click(By.xpath("//a[text()='SIGN-OFF']"));
		
		if(tripType.contentEquals("One Way")) {
			SeleniumWebDriver.click(By.xpath("//input[@value='oneway']"));
		}else {
			SeleniumWebDriver.click(By.xpath("//input[@value='roundtrip']"));
		}
		
		SeleniumWebDriver.selctUsingValue(By.name("fromPort"), departure);
		SeleniumWebDriver.selctUsingValue(By.name("toPort"), arrival);
		
		SeleniumWebDriver.click(By.xpath("//a[text()='SIGN-OFF']"));
		
	}
	
	
	@AfterTest(alwaysRun=true)
	public void afterTest() {
		SeleniumWebDriver.tearDown();
	}


	@DataProvider
	public Object[][] userLoginInfo() {
/*		return new Object[][] {
			new Object[] { "salma11", "test4321","One Way","New York","London" },
			new Object[] { "ahlink", "121212","Round Trip","London","New York" },
		};*/
		
		return new Object[][] {{ "salma11", "test4321","One Way","New York","London" },{ "ahlink", "121212","Round Trip","London","New York" }};
	}
}
