package linclon;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class LogingIntoJobstreetHAHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumWebDriver.openBrowser("chrome", "https://www.jobstreet.com/");
		SeleniumWebDriver.click(By.id("malaysia"));
		SeleniumWebDriver.clickWithJS(By.id("header-login-button"));
		SeleniumWebDriver.type(By.id("login-email"), "habib_links@yahoo.com");
		SeleniumWebDriver.type(By.id("login-password"), "Idontknow123");
		//SeleniumWebDriver.click(By.linkText("remember"));
		SeleniumWebDriver.click(By.name("remember"));
		SeleniumWebDriver.click(By.id("login_btn"));
		//SeleniumWebDriver.clickWithJS(By.className("experience-content"));
		SeleniumWebDriver.click(By.id("lbl_student"));
		SeleniumWebDriver.click(By.id("select2-nationality_code-container"));
		//SeleniumWebDriver.click(By.id("select2-nationality_code-result-b8xa-150"));
		//SeleniumWebDriver.click(By.id("select2-nationality_code-result-mxh7-147"));
		SeleniumWebDriver.click(By.id("select2-state_code-container"));
		//SeleniumWebDriver.click(By.id("select2-state_code-result-232m-85"));
		
		
		
		
		
		
	}

}
