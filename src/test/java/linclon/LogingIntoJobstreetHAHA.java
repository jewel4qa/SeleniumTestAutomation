package linclon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.selenium.SeleniumWebDriver;

public class LogingIntoJobstreetHAHA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumWebDriver.openBrowser("chrome", "https://www.jobstreet.com/");
		
		
		SeleniumWebDriver.click(By.id("malaysia"));
		SeleniumWebDriver.clickWithJS(By.id("header-login-button"));
		SeleniumWebDriver.type(By.id("login-email"), "habib_links@yahoo.com");
		SeleniumWebDriver.type(By.id("login-password"), "Idontknow123");
		//SeleniumWebDriver.click(By.linkText("remember"));
		SeleniumWebDriver.clickWithJS(By.name("remember"));
		SeleniumWebDriver.clickWithJS(By.id("login_btn"));
		
		
		//SeleniumWebDriver.clickWithJS(By.className("experience-content"));
		SeleniumWebDriver.clickWithJS(By.id("lbl_student"));
		//SeleniumWebDriver.click(By.id("select2-nationality_code-container"));
		//SeleniumWebDriver.click(By.id("select2-nationality_code-result-b8xa-150"));
		//SeleniumWebDriver.click(By.id("select2-nationality_code-result-mxh7-147"));
		//SeleniumWebDriver.click(By.id("select2-state_code-container"));
		//SeleniumWebDriver.click(By.id("select2-state_code-result-232m-85"));
		//SeleniumWebDriver.selctVisibleText(By.id("select2-nationality_code-container"), "Maldives");
		
		Thread.sleep(10000);
		
		SeleniumWebDriver.click(By.id("select2-country_code-container"));
		
		SeleniumWebDriver.type(By.xpath("//span[@class='select2-results']//preceding-sibling::span/input"), "Mexico");
		
		SeleniumWebDriver.driver.findElement(By.xpath("//span[@class='select2-results']//preceding-sibling::span/input")).sendKeys(Keys.ENTER);
		
		
		//SeleniumWebDriver.click(By.id("select2-country_code-result-y0am-149"));
		
		
		
		
	}

}
