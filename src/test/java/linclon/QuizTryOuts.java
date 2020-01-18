package linclon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.selenium.SeleniumWebDriver;

public class QuizTryOuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");
		SeleniumWebDriver.click(By.xpath("//a[contains(text(),'REGISTER')]"));
		SeleniumWebDriver.driver.navigate().back();
		SeleniumWebDriver.driver.navigate().forward();
		SeleniumWebDriver.driver.getCurrentUrl();
		String mytitle = SeleniumWebDriver.driver.getTitle();
		System.out.println(mytitle);
		String color = SeleniumWebDriver.driver.findElement(By.xpath("//font[contains(text(),'User')]")).getCssValue("color");
		String backcolor = SeleniumWebDriver.driver.findElement(By.xpath("//font[contains(text(),'User')]")).getCssValue("background-color");
		System.out.println(color);
		System.out.println(backcolor);
		/*	1. ASK ABOUT RIGHT CLICK 
		 *  2. ASK DRAG AND DROP OPTION ALSO 
		 * 	3. 
		 * 
		 * Actions act = new Actions(Chrome); // where driver is WebDriver type
		 */

		 
		
/*		
		System.setProperty("Chrome", "/gmail/src/test/driver/chromedriver.exe");
		WebDriver Driver = new chromedriver(); 
		
		
		 SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");

Actions act = new Actions(SeleniumWebDriver); // where driver is WebDriver type
 
 act.moveToElement(webElement).perform();
 
 act.contextClick().perform();
		
		
		
		
		Alert alt = driver.switchTo().alert(); // to move control to alert popup
		 
		 alt.accept(); // to click on ok.
		 
		 alt.dismiss(); // to click on cancel.
		 
		 //Then move the control back to main web page-
		 
		 driver.switchTo().window(mainPage);
		
		
		
		*/
	}

}
