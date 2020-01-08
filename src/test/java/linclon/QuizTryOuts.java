package linclon;

import org.openqa.selenium.interactions.Actions;
import org.selenium.SeleniumWebDriver;

public class QuizTryOuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");

Actions act = new Actions(SeleniumWebDriver); // where driver is WebDriver type
 
 act.moveToElement(webElement).perform();
 
 act.contextClick().perform();
		
		
		
		
		
		
		
		
		
		
		

	}

}
