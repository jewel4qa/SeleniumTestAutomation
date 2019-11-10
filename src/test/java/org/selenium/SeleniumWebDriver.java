package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver {
	public static WebDriver driver;
	
	
	
	public static void openBrowser(String browserName,String appUrl) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			if(System.getProperty("os.name").toLowerCase().contains("mac")) {
//				System.setProperty("webdriver.chrome.driver", "/Users/ag9068/seleniumDemo/gmail/src/test/driver/chromedriver");
			}else {
				 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\driver\\chromedriver.exe");
			}
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(appUrl);
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ag9068/seleniumDemo/gmail/src/test/driver/geckodriver");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(appUrl);
		}else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ag9068/seleniumDemo/gmail/src/test/driver/geckodriver");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(appUrl);
		}else {
			System.setProperty("webdriver.chrome.driver", "/Users/ag9068/seleniumDemo/gmail/src/test/driver/chromedriver");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(appUrl);
		}
	}
	

	
	public static void type(final By locator, String valueToType) {		
		List<WebElement> element = driver.findElements(locator);
		if(element.size()>0) {
			if(driver.findElement(locator).isEnabled()) {
				driver.findElement(locator).sendKeys(valueToType);
				System.out.println(valueToType + " entered successfully into " + locator);
			}else {
				System.out.println(locator+" disabled!!");
			}
			
		}else {
			System.out.println(locator + " doesn't exists!!");
		}
		
	}
	
  public static void click(By locator) {
	  List<WebElement> element = driver.findElements(locator);
	  if(element.size()>0) {
		  if(driver.findElement(locator).isEnabled()) {
			  driver.findElement(locator).click();
			  System.out.println(locator + " clicked Successfully!!");
		  }else {
			  System.out.println(locator +" disable!!");
		  }
		  
	  }else {
		  System.out.println(locator + " doesn't exists!!");
	  }
  }
  
  
  public static void clickWithJS(By locator) {
	  List<WebElement> elements = driver.findElements(locator);
	  if(elements.size()>0) {
		  WebElement element=driver.findElement(locator);
		  if(element.isEnabled()) {
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  js.executeScript("arguments[0].click();", element);
			  System.out.println(locator + " clicked Successfully!!");
		  }else {
			  System.out.println(locator +" disable!!");
		  }
		  
	  }else {
		  System.out.println(locator + " doesn't exists!!");
	  }
  }

}
