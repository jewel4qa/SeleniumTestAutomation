package linclon;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNewToursQA {
	@BeforeTest
	public void openAppication() {
		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");
	}
	@Test(priority=0)
	  public void verifyhomepage() throws InterruptedException {
			SeleniumWebDriver.startTestCase("verifyhomepage");
			SeleniumWebDriver.verifyElementExists(By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/p[1]/img[1]"));

	  }
	 @Test(priority=1)
	 public void RegisterClicked() {
		 SeleniumWebDriver.click(By.xpath("//a[text()='REGISTER']"));
	 }
	 @Test(priority=2)
	 public void TestDataInput() {
		 SeleniumWebDriver.type(By.name("firstName"), "aha");
		 SeleniumWebDriver.type(By.name("lastName"), "links");
		 SeleniumWebDriver.type(By.name("phone"), "6464646");
		 SeleniumWebDriver.type(By.name("userName"), "xyz@yahoo.com");
		 SeleniumWebDriver.type(By.name("address1"), "123 done dr");
		 SeleniumWebDriver.type(By.name("city"), "pagolkhana");
		 SeleniumWebDriver.type(By.name("state"), "nilkhet");
		 SeleniumWebDriver.type(By.name("postalCode"), "0012");
		 SeleniumWebDriver.type(By.name("email"), "amijani");
		 SeleniumWebDriver.type(By.name("password"), "121212");
		 SeleniumWebDriver.type(By.name("confirmPassword"), "121212");
  }
	 
	 @Test(priority=3)
	 public static void verifyregistration() {
		 SeleniumWebDriver.click(By.name("register"));
		 SeleniumWebDriver.verifyElementExists(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[2]"));

	 }
	 
}
