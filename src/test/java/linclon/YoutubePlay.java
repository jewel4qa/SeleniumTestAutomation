package linclon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.selenium.SeleniumWebDriver;
public class YoutubePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeleniumWebDriver.openBrowser("chrome", "https://www.youtube.com/");
		//SeleniumWebDriver.click(By.id("guide-icon"));
		SeleniumWebDriver.click(By.xpath("//ytd-topbar-menu-button-renderer[3]//div[1]//a[1]//yt-icon-button[1]//button[1]"));
		SeleniumWebDriver.click(By.id("secondary-icon"));
		SeleniumWebDriver.click(By.xpath("//div[@class='toggle-container style-scope paper-toggle-button']"));
		SeleniumWebDriver.click(By.xpath("//ytd-topbar-menu-button-renderer[3]//div[1]//a[1]//yt-icon-button[1]//button[1]"));
		SeleniumWebDriver.type(By.xpath("//input[@id='search']"), "ami banglai gan gai ami banlar gan gai");
		SeleniumWebDriver.click(By.xpath("//button[@id='search-icon-legacy']"));
		SeleniumWebDriver.click(By.xpath("//a[@title='AMI BANGLAY GAAN GAI || NOBLE MAN || PROTUL MUKHERJEE ||']"));
		SeleniumWebDriver.click(By.xpath("//button[@title='Full screen (f)']"));
		
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException ed) {
			ed.printStackTrace();
		}
		
		SeleniumWebDriver.click(By.xpath("//button[@title='Exit full screen (f)']"));
		
		//I WANT TO MAKE THE BROUWSER WAIT 10 SEC THEN DO THE NEXT ITEM
		//Driver.implicitly_wait(15);
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SeleniumWebDriver.click(By.xpath("//input[@id='search']"));
		
		//SeleniumWebDriver.driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.);
		
		//String link = Keys.chord(Keys.CONTROL,Keys.values()=a)
		
		
	
		
		
		
		
		
	

}
}
