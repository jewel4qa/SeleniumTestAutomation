package pom.testcase;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import newtours.pages.*;
import selenium.org.SeleniumSwd;

public class LoginAndRegister {
	
	@BeforeMethod
	public void openAppication() {
		SeleniumSwd.openBrowser("chrome", "http://www.newtours.demoaut.com/");
	}
	@Test
	public  void loginNewtours() {
		SignIn.SignOn("salma11", "test4321");
		SeleniumSwd.tearDown();
	}

	@Test
	public  void loginNewtours2() {
		SignIn.SignOn("salma11", "test4321");
		SeleniumSwd.tearDown();
	}
	
	@Test
	public  void loginNewtours3() {
		SignIn.SignOn("salma11", "test4321");
		SeleniumSwd.tearDown();
	}
	
	@Test
	public  void loginNewtours4() {
		SignIn.SignOn("salma11", "test4321");
		SeleniumSwd.tearDown();
	}
	
	@Test
	public  void loginNewtours5() {
		SignIn.SignOn("salma11", "test4321");
		SeleniumSwd.tearDown();
	}
}
