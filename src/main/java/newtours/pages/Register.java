package newtours.pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.org.SeleniumSwd;

public class Register extends SeleniumSwd{
@BeforeMethod 
	public static void openRegisterPage() {
		openBrowser("chrome", "http://www.newtours.demoaut.com/");
		click(By.xpath("//a[text()='REGISTER']"));
	}
	@Test 
	public static void addContactInfo(String firstName,String lastName, String phone, String email, String address1, String city, String state, String postalCode) {
		type(By.name("firstName"), "aha");
		type(By.name("lastName"), "links");
		type(By.name("phone"), "6464646");
		type(By.name("userName"), "xyz@yahoo.com");
		type(By.name("address1"), "123 done dr");
		type(By.name("city"), "pagolkhana");
		type(By.name("state"), "nilkhet");
		type(By.name("postalCode"), "0012");
		type(By.name("email"), "amijani");
		type(By.name("password"), "121212");
		type(By.name("confirmPassword"), "121212");
	}
		@Test 
		public static void verifyregistration() {
			click(By.name("register"));
			verifyElementExists(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[2]"));
		}			
	}
