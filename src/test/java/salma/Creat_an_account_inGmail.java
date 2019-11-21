package salma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Creat_an_account_inGmail {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver","C:\\github\\SeleniumTestAutomation\\src\\test\\driver\\chromedriver");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/driver/chromedriver");
		
		
		WebDriver driver=new chromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		
		
		
	}

	private static Object findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
