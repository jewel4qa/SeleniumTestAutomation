package linclon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.selenium.SeleniumWebDriver;

public class QuizTryOuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Chrome", "/gmail/src/test/driver/chromedriver.exe");
		WebDriver Driver = new chromedriver; 
		
		
		/* SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");

Actions act = new Actions(SeleniumWebDriver); // where driver is WebDriver type
 
 act.moveToElement(webElement).perform();
 
 act.contextClick().perform();
		
		
		*/
		
		Alert alt = driver.switchTo().alert(); // to move control to alert popup
		 
		 alt.accept(); // to click on ok.
		 
		 alt.dismiss(); // to click on cancel.
		 
		 //Then move the control back to main web page-
		 
		 driver.switchTo().window(mainPage);
		
		
		
		
		
		

	}

}
