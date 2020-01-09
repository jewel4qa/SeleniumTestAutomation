package newtours.pages;

import org.openqa.selenium.By;

import selenium.org.SeleniumSwd;

public class Register extends SeleniumSwd{

	public static void openRegisterPage() {
		click(By.xpath("//a[text()='REGISTER']"));
	}
	public static void addContactInfo(String fName,String lName, String phone, String email) {
		type(By.name("firstName"), fName);
		type(By.name("lastName"), lName);
		type(By.name("phone"), phone);
		type(By.name("userName"), email);
		
	}

}
