package gmail;

import java.util.Set;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class HandleNewWindow {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumWebDriver swd=new SeleniumWebDriver();
		swd.openBrowser("chrome", "http://demo.guru99.com/popup.php");
		
		
		
		String firstWindowId=swd.driver.getWindowHandle();

		

		swd.click(By.xpath("//a[text()='Click Here']"));
		
		
		swd.selectWindowByWindowId(firstWindowId);
		
		

		
		
		
		swd.type(By.name("emailid"), "abc@gmail.com");
		swd.driver.close();
		
		swd.driver.switchTo().window(firstWindowId);
		
		swd.driver.quit();
		
		

	}

}
