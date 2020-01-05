package salma;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class HandleAlert {

	public static void main(String[] args) {
	
	  // TODO Auto-generated method stub
		
		//http://demo.guru99.com/test/delete_customer.php 
		
		
		SeleniumWebDriver.openBrowser("chrome"," http://demo.guru99.com/test/delete_customer.php");
		
		boolean found =SeleniumWebDriver.verifyElementExists(By.name("cusidx"));
		
		System.out.println("found");
		
		
		
		
		
	}

}
