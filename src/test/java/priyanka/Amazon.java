package priyanka;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SeleniumWebDriver.openBrowser("chrome", "https://www.amazon.com");
		SeleniumWebDriver.driver.manage().window().maximize();
		//SeleniumWebDriver.click(By.xpath("//div[contains(text(),'Clothing,')]"));
		//SeleniumWebDriver.click(By.xpath("//a[@href='/gp/browse.html?node=7147440011&ref_=nav_em_T1_0_4_12_2__sft_women']"));

		SeleniumWebDriver.selctVisibleText(By.id("searchDropdownBox"), "Women");		
		SeleniumWebDriver.type(By.id("twotabsearchtextbox"), "Cute Dress");
		SeleniumWebDriver.click(By.xpath("//input[@type='submit']"));
		int isDisplayed=SeleniumWebDriver.driver.findElements(By.xpath("//span[contains(text(),'result')] ")).size();
		if (isDisplayed >0) {
			SeleniumWebDriver.click(By.xpath("//ul[@aria-labelledby='p_90-title']//input[@type='checkbox']"));
		}else {System.out.println("Not There Yet");

		}







	}

}
