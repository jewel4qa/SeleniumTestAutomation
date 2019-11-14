package salma;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class CreateAnAccount {
	
	public static void main(String[] args) {
		SeleniumWebDriver.openBrowser("chrome", "https://www.jobstreet.com/");
		SeleniumWebDriver.click(By.id("malaysia"));
		//SeleniumWebDriver.click(By.id("header-signup-button"));
		
		SeleniumWebDriver.clickWithJS(By.id("header-signup-button"));
		
		
		
	}
	
}
