package newtours.pages;

import org.openqa.selenium.By;


import selenium.org.SeleniumSwd;

public class SignIn extends SeleniumSwd{
	

	
	public static void SignOn(String userName, String password) {
		type(By.name("userName"), userName);
		type(By.name("password"), password);
		click(By.xpath("//input[@name='login']"));
	}
	
	public static void verifySignOnLink() {
		verifyElementExists(By.xpath("//a[text()='SIGN-ON']"));
	}
	
	public static void verifyRegisterLink() {
		verifyElementExists(By.xpath("//a[text()='REGISTER']"));
	}
	
}
