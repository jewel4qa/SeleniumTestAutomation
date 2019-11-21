package salma;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class CreateAnAccount {
	
	public static void main(String[] args) {
		SeleniumWebDriver.openBrowser("chrome", "https://www.jobstreet.com/");
		SeleniumWebDriver.click(By.id("malaysia"));

		//SeleniumWebDriver.click(By.id("header-signup-button"));
		
		SeleniumWebDriver.clickWithJS(By.id("header-signup-button"));
    	SeleniumWebDriver.type(By.id("first_name"),"noman");
		SeleniumWebDriver.type(By.id("last_name"),"siddik2");
		SeleniumWebDriver.type(By.id("email"),"salma.siddiki123@gmail.com");
		SeleniumWebDriver.type(By.id("password"),"noman123");
		SeleniumWebDriver.click(By.id("promotion"));
	SeleniumWebDriver.click(By.id("signup_btn"));
	

//		SeleniumWebDriver.click(By.id("header-signup-button"));
		
	}
		
	}
	
	


