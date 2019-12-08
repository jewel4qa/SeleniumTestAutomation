package linclon;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class Ikea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SeleniumWebDriver.openBrowser("chrome", "https://www.ikea.com/us/en/");
		
		SeleniumWebDriver.click(By.xpath("/html[1]/body[1]/header[1]/div[3]/div[1]/nav[1]/div[1]/ul[1]/li[3]/button[1]/span[1]"));
		
		SeleniumWebDriver.click(By.xpath("//a[contains(text(),'Home office')]"));
		
		SeleniumWebDriver.type(By.xpath("//input[@name='q']"), "mirror");
		
		//SeleniumWebDriver.click(By.xpath("//a[contains(text(),'//a[@class='search-results-item__link'][contains(text(),'Mirrors')]')]"));
		
		//SeleniumWebDriver.click(By.xpath("//button[contains(text(),'Price')]"));
		
		SeleniumWebDriver.click(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[2]/div[1]/ol[2]/li[1]/a[1]"));
		
		SeleniumWebDriver.click(By.xpath("//span[contains(text(),'Wall mirrors')]"));
		
		SeleniumWebDriver.click(By.xpath("//button[contains(text(),'Sort by')]"));
		
		SeleniumWebDriver.click(By.xpath("//span[contains(text(),'Price: high to low')]"));
		
				
		
		
		
		
		
		
		
		
	}

}
