/*package priyanka;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccount {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir"));

		
		 * for Chrome dirver
		 * 
		 

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\grk4m\\eclipse-workspace\\gmail\\src\\test\\driver\\chromedriver.exe")
		// good to have..

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		// implicit wait is conditional wait-- allocate maximum wait time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// expelicit wait is hard wait-- allocate fixed wait time
		
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();

		boolean isDisplay = driver.findElement(By.xpath("//img[@src='/images/masts/mast_register.gif'] "))
				.isDisplayed();

		if (isDisplay == true) {
			System.out.println("Register Page Opened");
		} else {
			System.out.println("Register Page not Found!!");
		}

		// driver.findElement(By.name("firstName")).sendKeys("Priya");
		CreateAccount.type(By.className("firstname"), "Priya");
		CreateAccount.type(By.name("lastName"), "Pu");
		CreateAccount.type(By.name("address1"), "123 Jump Streat");
		CreateAccount.type(By.name("city"), "Jumper");
		CreateAccount.type(By.name("state"), "Chittagong");
		CreateAccount.type(By.name("postalCode"), "31456");
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("BANGLADESH");
		CreateAccount.type(By.name("email"), "pu@gmail.com");
		CreateAccount.type(By.name("password"), "abcd1");
		CreateAccount.type(By.name("confirmPassword"), "abcd1");

		
		 * driver.findElement(By.name("lastName")).sendKeys("Pu");
		 * 
		 * driver.findElement(By.name("address1")).sendKeys("123 Jump Streat");
		 * driver.findElement(By.name("address2")).sendKeys("Suit# 2");
		 * driver.findElement(By.name("city")).sendKeys("Jumper");
		 * driver.findElement(By.name("state")).sendKeys("Chittagong");
		 * driver.findElement(By.name("postalCode")).sendKeys("31456"); Select
		 * drpCountry = new Select (driver.findElement(By.name("country")));
		 * drpCountry.selectByVisibleText("BANGLADESH");
		 * driver.findElement(By.name("email")).sendKeys("pu@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("abcd1");
		 * driver.findElement(By.name("confirmPassword")).sendKeys("abcd1");
		 * driver.findElement(By.name("register")).click();
		 

		
		 * boolean isDisplay1=
		 * driver.getPageSource().contains("Thank you for registering"); if ( isDisplay1
		 * == true) { System.out.println("Good Job!!!"); }else {
		 * System.out.println("Try Harder!!"); }
		 * 
		 
		int isDisplay1 = driver.findElements(By.xpath("//font[contains(text(),'Thank you ford')]")).size();

		if (isDisplay1 > 0) {
			System.out.println("Good Job!!!");
		} else {
			System.out.println("Try Harder!!");
		}

		/// html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/text()

		// driver.quit();

		
		 * for firefox
		 

		// Selenium IDE
		// Selenium RC
		// Selenium WebDriver

		// Selenium Grid-- Browser stack, Saucelabs
	}

	public static void type(final By locatorValue, String value) { // elementLocator

		if (driver.findElements(locatorValue).size() > 0) {
			driver.findElement(locatorValue).sendKeys(value);
			System.out.println("<" + value + "> entered successfuly");
		} else {
			System.out.println("not entered");
		}

		driver.findElement(locatorValue).sendKeys(value);

	}

}
*/