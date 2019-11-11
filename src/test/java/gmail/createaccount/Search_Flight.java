package gmail.createaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.selenium.SeleniumWebDriver;

public class Search_Flight {
	
	public static void main(String[] args) {
		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");
		
		SeleniumWebDriver.type(By.name("userName"), "salma11");
		SeleniumWebDriver.type(By.name("password"), "test4321");
		SeleniumWebDriver.click(By.name("login"));
	
		
		//Select by index
	WebElement passCnt = SeleniumWebDriver.driver.findElement(By.name("passCount"));
	Select select =new Select(passCnt);
	select.selectByIndex(3);
	
	WebElement fromPort=SeleniumWebDriver.driver.findElement(By.name("fromPort"));
	
	Select fPort=new Select(fromPort);
	fPort.selectByValue("New York");
	
	
	WebElement fromMonth=SeleniumWebDriver.driver.findElement(By.name("fromMonth"));
	
	//List<WebElement> options =fromMonth.findElements(By.tagName("option"));
	List<WebElement> options =fromMonth.findElements(By.xpath(".//option"));
	
	for(WebElement opt:options) {
		System.out.println(opt.getText());
	}
	
	
	//Select fMonth=new Select(fromPort);
	//fMonth.selectByVisibleText("December\n");
	
		
	}

}
