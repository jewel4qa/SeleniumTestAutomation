package linclon;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class GoogleMapsfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeleniumWebDriver.openBrowser("chrome", "https://www.google.com/maps/");
		SeleniumWebDriver.clickWithJS(By.xpath("//button[@class='searchbox-hamburger']"));
		SeleniumWebDriver.clickWithJS(By.xpath("//*[@id=\"settings\"]/div/div[2]/div/ul[1]/li[2]/div/button[1]/label"));
		SeleniumWebDriver.clickWithJS(By.xpath("//button[@class='maps-sprite-settings-chevron-left widget-settings-icon-close']"));
		SeleniumWebDriver.type(By.xpath("//input[@id='searchboxinput']"), "Dhaka bangladesh");
		SeleniumWebDriver.clickWithJS(By.xpath("//div[@id='sbse47']//div[@class='suggest-left-cell']"));
		
		
		
		
		
		
		
		
	}

}
