package gmail.createaccount;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.SeleniumWebDriver;



public class Create_An_Accoun_In_Gmail {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/ag9068/seleniumDemo/gmail/src/test/driver/chromedriver");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\driver\\chromedriver.exe");
		
		//System.out.println(System.getProperty("user.dir"));
		
		driver=new ChromeDriver();
		
		//implicit wait		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		

		
		
		driver.get("http://newtours.demoaut.com/");
		
		
		//List<WebElement> links=driver.findElements(By.xpath("//a"));

		
/*		List<WebElement> link=driver.findElements(By.xpath("//button"));
		
		System.out.println(link.size());*/
		
		
		
//		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();

/*		boolean isDisplay=driver.findElement(By.xpath("//img[@src='/images/masts/mast_register.gif']")).isDisplayed();

		if(isDisplay==true) {
			System.out.println("Register page open!!!");
		}else {
			System.out.println("Register page doesn't displayed!!!");
		} */
		//option-1
		if(driver.findElements(By.xpath("//img[@src='/images/masts/mast_register.gif']")).size()>0) {
			System.out.println("Register page open!!!");
		}else {
			System.out.println("Register page doesn't displayed!!!");
		}
		
		
		//option 2
	/*	List<WebElement> imgs=driver.findElements(By.xpath("//img[@src='/images/masts/mast_register.gif']"));
		
		
		if(imgs.size()>0) {
			System.out.println("Register page open!!!");
		}else {
			System.out.println("Register page doesn't displayed!!!");
		} */
		
		
/*		List<WebElement> fName=driver.findElements(By.name("firstName"));
		
		if(fName.size()>0) {
			
			if(driver.findElement(By.name("firstName")).isEnabled()) {
				driver.findElement(By.name("firstName")).sendKeys("Salma");
				System.out.println("Salam typed successfully!!!");
			}else {
				System.out.println("Middle name object exists but disable!!");
			}
					
		}else {
			System.out.println("Middle Name doesn't exists!!!");
		}*/
		
		
		
		//driver.findElement(By.name("firstName")).sendKeys("Salama");
		
		
		SeleniumWebDriver.type(By.name("firstName"), "Salma");
		
	//	Create_An_Accoun_In_Gmail.type(By.name("middleName"), "Salma");
		
		
		
		
		
		//driver.findElement(By.name("lastName")).sendKeys("Siddik");
		SeleniumWebDriver.type(By.name("lastName"), "siddik");
		
		//driver.findElement(By.name("phone")).sendKeys("3456789876");
		SeleniumWebDriver.type(By.name("phone"), "345678903");
		
		
		//driver.findElement(By.id("userName")).sendKeys("abc@gmail.com");
		
		SeleniumWebDriver.type(By.id("userName"), "bnbnjj@gmail.com");
		
		
		//driver.findElement(By.name("address1")).sendKeys("2118");
		SeleniumWebDriver.type(By.name("address1"), "211187877");
		
		//driver.findElement(By.name("address2")).sendKeys("Tall pines ct");
		SeleniumWebDriver.type(By.name("address2"), "Tall pines Ct");
		
		//driver.findElement(By.name("city")).sendKeys("Catonsville");
		SeleniumWebDriver.type(By.name("city"), "Catonsville");
		
		
		//driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maryland");
		
		SeleniumWebDriver.type(By.xpath("//input[@name='state']"), "Maryland");
		
		//driver.findElement(By.name("postalCode")).sendKeys("21228");
		
		SeleniumWebDriver.type(By.name("postalCode"), "321223");
		
		// handle select controller
		
		//driver.findElement(By.name("email")).sendKeys("salma11");
		
		SeleniumWebDriver.type(By.name("email"), "salma11");
		
		//driver.findElement(By.name("password")).sendKeys("test4321");
		SeleniumWebDriver.type(By.name("password"), "test4321");
		
		
	//	driver.findElement(By.name("confirmPassword")).sendKeys("test4321");	
		SeleniumWebDriver.type(By.name("confirmPassword"), "test4321");
		driver.findElement(By.name("register")).click();

	}
	
	

	
	
	

}
