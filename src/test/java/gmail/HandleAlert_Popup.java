package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.selenium.SeleniumWebDriver;

public class HandleAlert_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//http://demo.guru99.com/test/delete_customer.php
		
		
		/**
		 * 1. Open http://demo.guru99.com/test/delete_customer.php
		 * 2. Type '12345' into Customer_Id input box
		 * 3. Click on Submit button
		 * 4. Verify alert box open
		 * 5. CLick on OK button from Alert
		 */
		
		
		
		SeleniumWebDriver.openBrowser("chrome", "http://demo.guru99.com/test/delete_customer.php");
		boolean found =SeleniumWebDriver.verifyElementExists(By.name("cusid"));
		
		if(found==true) {
			//continue...
			SeleniumWebDriver.type(By.name("cusid"), "12345");
			
		}else {
			System.out.println("Input box doesn't exists.following all steps depends on this step, So test execution quite here");
			System.exit(0);
		}
		
		
		SeleniumWebDriver.click(By.name("submit"));
		
		String txt=SeleniumWebDriver.driver.switchTo().alert().getText();
		System.out.println(txt);
		
		SeleniumWebDriver.HandleAlert("ACCEPT");
		SeleniumWebDriver.HandleAlert("accept");

		
	}

}
