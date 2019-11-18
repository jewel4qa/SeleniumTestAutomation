package linclon;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class EbayDailyDeals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeleniumWebDriver.openBrowser("chrome", "https://www.ebay.com/");
		SeleniumWebDriver.click(By.xpath("/html[1]/body[1]/header[1]/div[1]/ul[1]/li[2]/a[1]"));
		//SeleniumWebDriver.click(By.xpath("//*[@id=\"nav_3348690\"]"));
		//*[@id="nav_3348690"]
		//a[@class="navigation-desktop-menu-link"]|//span[@text()='Tech']
		
		//WORKING WITH THIS ONE PARTIALLY 
		SeleniumWebDriver.click(By.xpath("//span[text()='Tech']"));
		
		//*[@id="refit-spf-container"]/div[1]/nav/ul/li[2]/div/div[1]/a[2]
		//SeleniumWebDriver.click(By.xpath("//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[2]/div/div[1]/a[2]"));
		
		//ELEMENT NOT ENTERACTABLE  
		//SeleniumWebDriver.click(By.xpath("//a[contains(text(),'Laptops & Netbooks')]"));
		//ELEMENT NOT ENTERACTABLE ALSO 
		//SeleniumWebDriver.click(By.xpath("//a[contains(text(),'Laptops & Netbooks')]"));
		
		SeleniumWebDriver.click(By.xpath("//span[@class='ebayui-ellipsis-3']"));
		//SeleniumWebDriver.selctUsingValue(By.xpath("//option[@id='msku-opt-0']"), "0");		
		
		SeleniumWebDriver.selctUsingValue(By.name("color"), "msku-opt-0");
		
		
		
		
		
		
		
		
	}

}
