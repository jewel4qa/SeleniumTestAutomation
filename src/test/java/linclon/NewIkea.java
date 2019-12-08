package linclon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.selenium.SeleniumWebDriver;

public class NewIkea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeleniumWebDriver.openBrowser("chrome", "https://www.ikea.com/us/en/");
		
		SeleniumWebDriver.click(By.xpath("/html[1]/body[1]/header[1]/div[3]/div[1]/nav[1]/div[1]/ul[1]/li[3]/button[1]/span[1]"));
		
		SeleniumWebDriver.click(By.xpath("//a[contains(text(),'Home office')]"));
		
		SeleniumWebDriver.type(By.xpath("//input[@name='q']"), "office table");
		
		SeleniumWebDriver.click(By.xpath("//a[contains(text(),'Office desks')]"));
		
		SeleniumWebDriver.click(By.xpath("//button[contains(text(),'Price')]"));
		
		//does not clear out old data
		//SeleniumWebDriver.type(By.xpath("//input[@placeholder]"), "200");
		
		//SeleniumWebDriver.click(By.xpath("//input[@placeholder]")).sendKeys(Keys.BACK_SPACE);
		
		SeleniumWebDriver.click(By.xpath("//input[@placeholder='179']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
