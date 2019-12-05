package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.selenium.SeleniumWebDriver;

public class HandleiFrame {
	
	
	public static void main(String[] args) {
		
		SeleniumWebDriver.openBrowser("chrome", "https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		SeleniumWebDriver.driver.switchTo().frame("frame1");
		
		SeleniumWebDriver.driver.switchTo().frame("frame3");
		
		SeleniumWebDriver.click(By.xpath("//input[@id='a']"));
		
		SeleniumWebDriver.driver.switchTo().parentFrame();
		
		//SeleniumWebDriver.driver.switchTo().frame("frame1");
		
		SeleniumWebDriver.type(By.xpath("//input[@type='text']"), "Abndndb");
		
		SeleniumWebDriver.driver.switchTo().defaultContent();
		SeleniumWebDriver.driver.switchTo().frame("frame2");
		
		SeleniumWebDriver.selctUsingValue(By.id("animals"), "babycat");
		
		SeleniumWebDriver.driver.close();
		SeleniumWebDriver.driver.quit();
		

		
	}

}
