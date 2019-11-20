package priyanka;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PBSelniumD {
	

		public static WebDriver driver;



		public static void openBrowser(String browserName,String appUrl) {

			if(browserName.equalsIgnoreCase("chrome")) {
				if(System.getProperty("os.name").toLowerCase().contains("mac")) {
					System.setProperty("webdriver.chrome.driver", "/Users/ag9068/seleniumDemo/gmail/src/test/driver/chromedriver");
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
				driver=new EdgeDriver();
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

		/**
		 * click: method click on any given location.
		 * @param locator Expect By.locatorName("locatorValue")..
		 * @return void
		 * @author ag9068
		 */
		public static WebElement click(By locator) {
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

		public static void selctUsingIndex(By locator,int indexValue) {

			List<WebElement> elements = driver.findElements(locator);
			if(elements.size()>0) {
				WebElement element = driver.findElement(locator);
				if(element.isEnabled()) {
					try {
						Select select=new Select (element);
						select.selectByIndex(indexValue);
						System.out.println("index " + indexValue+ " item selected successfully!!");
					} catch (Exception e) {
						System.out.println("index " + indexValue + " doesn't available");
						e.getMessage();
						//e.printStackTrace();
					}
				}else {
					System.out.println(locator + " disable!!!");
				}
				
			}else {
				System.out.println(locator + " doesn't exists!!!");
			}

		}

		/**
		 * 
		 * @param locator
		 * @param itemName
		 */
		public static void selctUsingValue(By locator,String itemName) {

			List<WebElement> elements = driver.findElements(locator);
			if(elements.size()>0) {
				WebElement element = driver.findElement(locator);
				if(element.isEnabled()) {
					try {
						Select select=new Select (element);
						select.selectByValue(itemName);
						System.out.println( itemName+ " selected successfully!!");
					} catch (Exception e) {
						System.out.println(itemName + " doesn't available");
					}
				}else {
					System.out.println(locator + " disable!!!");
				}
				
			}else {
				System.out.println(locator + " doesn't exists!!!");
			}

		}

		/**
		 * selctVisibleText method select item from the given location by text value
		 * @param locator expect By.locatorName(locatorValue)
		 * @param itemText visiable text 
		 */
		
		public static void selctVisibleText(By locator, String itemText) {
			
			List<WebElement> elements = driver.findElements(locator);
			if(elements.size()>0) {
				WebElement element = driver.findElement(locator);
				Select select = new Select (element);
				if(element.isEnabled()) {
					List<WebElement> options = element.findElements(By.tagName("option"));
					try {
						for(WebElement opt:options) {
							if(opt.getText().trim().equalsIgnoreCase(itemText)) {
								select.selectByVisibleText(opt.getText());
								System.out.println(itemText + " Selected successfully!!");
								break;
							}
						}
					} catch (Exception e) {
						System.out.println(itemText + " not available in the list");
					}
					
	/*				boolean bFound=false;
					String curText=null;
					for(WebElement opt:options) {
						if(opt.getText().trim().equalsIgnoreCase(itemText)) {
							bFound=true;
							curText=opt.getText();
							break;
						}
					}
					
					if(bFound==true) {
						select.deselectByVisibleText(curText);
						System.out.println(itemText + " selected successfully!!");
					}else {
						System.out.println(itemText + " not available in the list");
					}*/
					
									
				}else {
					System.out.println(locator + " disable!!");
				}
				
				
			}else 
				System.out.println(locator + "doesn't exists!!");
			
			
		}
		
		
		
		/*public static void Checkbox(By locator) {
			List<WebElement> elements = driver.findElements(locator);
				if(elements.size()>0) {
					if(driver.findElement(locator).isEnabled()) {
						driver.findElement(locator).click();
						System.out.println(locator + " clicked Successfully!!");
					}else {
						System.out.println(locator +" disable!!");
					}

				}else {
					System.out.println(locator + " doesn't exists!!");
				}*/
		}	
		
		
		
	}



}
