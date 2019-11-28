package linclon;
import org.openqa.selenium.By;
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

		
		
		
		
		
		
	}

}
