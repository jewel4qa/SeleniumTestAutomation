package priyanka;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.selenium.SeleniumWebDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SeleniumWebDriver.openBrowser("chrome", "https://www.amazon.com");
		//SeleniumWebDriver.click(By.xpath("//div[contains(text(),'Clothing,')]"));
		//SeleniumWebDriver.click(By.xpath("//a[@href='/gp/browse.html?node=7147440011&ref_=nav_em_T1_0_4_12_2__sft_women']"));

		SeleniumWebDriver.selctVisibleText(By.id("searchDropdownBox"), "Women");		
		SeleniumWebDriver.type(By.id("twotabsearchtextbox"), "Cute Dress");
		SeleniumWebDriver.click(By.xpath("//input[@type='submit']"));
		
		
		
		
		
		
	}

}
