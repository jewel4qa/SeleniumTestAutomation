package linclon;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class JobstreetOpenAnAccount {

		public static void main(String[] args) {
			SeleniumWebDriver.openBrowser("chrome", "https://www.jobstreet.com/");
			SeleniumWebDriver.click(By.id("malaysia"));
			SeleniumWebDriver.clickWithJS(By.id("header-signup-button"));
			
			SeleniumWebDriver.type(By.id("first_name"), "Aha");
			SeleniumWebDriver.type(By.id("last_name"), "Links");
			SeleniumWebDriver.type(By.id("email"), "habib_links@yahoo.com");
			SeleniumWebDriver.type(By.id("password"), "Idontknow123");
			SeleniumWebDriver.click(By.id("promotion"));
			SeleniumWebDriver.click(By.id("signup-btn"));
			
			
	}

}
