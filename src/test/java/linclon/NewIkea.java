package linclon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.selenium.SeleniumWebDriver;

public class NewIkea {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SeleniumWebDriver.openBrowser("chrome", "https://www.ikea.com/us/en/");
		
		SeleniumWebDriver.click(By.xpath("/html[1]/body[1]/header[1]/div[3]/div[1]/nav[1]/div[1]/ul[1]/li[3]/button[1]/span[1]"));
		
		SeleniumWebDriver.click(By.xpath("//a[contains(text(),'Home office')]"));
		
		SeleniumWebDriver.type(By.xpath("//input[@name='q']"), "office table");
		
		SeleniumWebDriver.click(By.xpath("//a[contains(text(),'Office desks')]"));
		
		SeleniumWebDriver.click(By.xpath("//button[contains(text(),'Price')]"));
		
		//does not clear out old data
		
		WebElement lowPrice=SeleniumWebDriver.driver.findElement(By.xpath("//input[@type='number']"));
		
		lowPrice.clear();
		lowPrice.sendKeys("200");
		Thread.sleep(3000);
		lowPrice.sendKeys(Keys.TAB);
		
		//SeleniumWebDriver.type(By.xpath("//div[@class='range-price-range__indicators']/input[1]"), "200");
		
		
		WebElement highPrice=SeleniumWebDriver.driver.findElement(By.xpath("//input[@type='number'][2]"));
		
		highPrice.clear();
		highPrice.sendKeys("700");
		Thread.sleep(3000);
		highPrice.sendKeys(Keys.TAB);
		
		
	//	SeleniumWebDriver.driver.findElement(By.xpath("//div[@class='range-price-range__indicators']/input[2]")).clear();
	//	SeleniumWebDriver.type(By.xpath("//div[@class='range-price-range__indicators']/input[2]"), "400");
		
		//SeleniumWebDriver.click(By.xpath("//input[@placeholder]")).sendKeys(Keys.BACK_SPACE);
		
		//SeleniumWebDriver.click(By.xpath("//div[@class='range-price-range__indicators']/input[2]]")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
