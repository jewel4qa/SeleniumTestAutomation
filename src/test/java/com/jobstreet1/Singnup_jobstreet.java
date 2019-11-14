package com.jobstreet1;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class Singnup_jobstreet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SeleniumWebDriver.openBrowser("chrome", "C:\\github\\SeleniumTestAutomation");
	
	SeleniumWebDriver.click(By.id("philippines"));
	
	SeleniumWebDriver.clickWithJS(By.id("header-signup-button"));
	
	
	}

}
