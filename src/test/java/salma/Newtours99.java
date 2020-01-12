package salma;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class Newtours99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SeleniumWebDriver.openBrowser("chrome", "http://newtours.demoaut.com/mercuryregister.php");	
		
		SeleniumWebDriver.type(By.name("firstName"), "jonney");
		SeleniumWebDriver.type(By.name("lastName"), "King");
		SeleniumWebDriver.type(By.name("phone"), "3012215712");
		SeleniumWebDriver.type(By.name("userName"), "abc.deg@gmail.com");
		SeleniumWebDriver.type(By.name("address1"), "2104 pinney branch cir");
		SeleniumWebDriver.type(By.name("address2"), "233 pinney branch cir");
		SeleniumWebDriver.type(By.name("city"), "bowie");
		SeleniumWebDriver.type(By.name("state"), "Alberta");
		SeleniumWebDriver.type(By.name("postalCode"), "20712");
		SeleniumWebDriver.type(By.name("country"), "click");
		SeleniumWebDriver.type(By.id("email"), "jack");
		SeleniumWebDriver.type(By.name("password"), "abcdefg");
		SeleniumWebDriver.type(By.name("confirmPassword"), "abcdefg");
		SeleniumWebDriver.type(By.name("register"), "click");
		
		SeleniumWebDriver.click(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
		
		
	}

}
