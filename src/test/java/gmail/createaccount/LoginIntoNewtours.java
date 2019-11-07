package gmail.createaccount;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class LoginIntoNewtours {


	public static void main(String[] args) {

		SeleniumWebDriver.openBrowser("chrome","http://newtours.demoaut.com/mercurysignon.php");
		SeleniumWebDriver.click(By.xpath("//a[text()='SIGN-ON']"));
		SeleniumWebDriver.type(By.name("userName"), "salma11");
		SeleniumWebDriver.type(By.name("password"), "test4321");
		SeleniumWebDriver.click(By.name("login"));
	}

}
