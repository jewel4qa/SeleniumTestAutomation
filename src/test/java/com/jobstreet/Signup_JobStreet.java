package com.jobstreet;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class Signup_JobStreet {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		SeleniumWebDriver.openBrowser("chrome", "https://www.jobstreet.com/");
		
		SeleniumWebDriver.click(By.id("malaysia"));
		
		SeleniumWebDriver.clickWithJS(By.id("header-signup-button"));

		//SeleniumWebDriver.
	}

}
