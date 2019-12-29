package testNG;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;
import org.testng.annotations.Test;

public class MacysLogin {
	
  @Test
  public void VerifySignInButtonWorking() {
	  SeleniumWebDriver.openBrowser("chrome", "https://www.macys.com/");
	  SeleniumWebDriver.click(By.xpath("//*[@id=\"myRewardsLabel-status\"]/span[text()='Sign In']"));
	  boolean objExist=SeleniumWebDriver.verifyElementExists(By.id("standard-sign-up1"));
	  System.out.println(objExist);
	  
	  if(objExist!=true) {
		  System.exit(0);
	  }
	  
  }
  
  @Test
  
  public void VerifyUserAbleToCreateAccount() {
	  SeleniumWebDriver.click(By.id("standard-sign-up"));
	  SeleniumWebDriver.type(By.name("ca-profile-firstname"), "Salma121");
	  SeleniumWebDriver.type(By.name("ca-profile-lastname"), "Siddik121");
	 // SeleniumWebDriver.
	  
  }
  
  
}
