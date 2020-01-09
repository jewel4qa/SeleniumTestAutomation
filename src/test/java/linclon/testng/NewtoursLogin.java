package linclon.testng;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;
import org.testng.annotations.Test;

public class NewtoursLogin {


	@Test (priority=0)
	public void newToursLogin() {
		SeleniumWebDriver.startTestCase("newToursLogin");
		SeleniumWebDriver.startTestCase("NewtoursLogIn");
		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");

		SeleniumWebDriver.type(By.name("userName"), "ahlink");
		SeleniumWebDriver.type(By.name("password"), "121212");
		SeleniumWebDriver.click(By.xpath("//input[@name='login']"));

	}

	@Test (priority=1)
	public void bookedOnewayFlight() {
		SeleniumWebDriver.startTestCase("bookedOnewayFlight");
		SeleniumWebDriver.click(By.xpath("//*[@value='oneway']"));
		SeleniumWebDriver.selctUsingValue(By.name("passCount"), "1");
		SeleniumWebDriver.selctUsingValue(By.name("fromPort"), "London");
		SeleniumWebDriver.selctUsingValue(By.name("fromMonth"), "3");
		SeleniumWebDriver.selctUsingValue(By.name("fromDay"), "15");
		SeleniumWebDriver.selctUsingValue(By.name("toPort"), "Paris");
		SeleniumWebDriver.selctUsingValue(By.name("toMonth"), "5");
		SeleniumWebDriver.selctVisibleText(By.name("toDay"), "10");


		SeleniumWebDriver.click(By.xpath("//*[@value='Business']"));
		SeleniumWebDriver.selctVisibleText(By.name("airline"), "Unified Airlines");
		SeleniumWebDriver.click(By.name("findFlights"));
		SeleniumWebDriver.click(By.xpath("//table//table//table//table//table[1]//tbody[1]//tr[7]//td[1]//input[1]"));
		SeleniumWebDriver.click(By.xpath("//table[2]//tbody[1]//tr[9]//td[1]//input[1]"));
		SeleniumWebDriver.click(By.name("reserveFlights"));
		SeleniumWebDriver.type(By.name("passFirst0"), "AhaAha");
		SeleniumWebDriver.type(By.name("passLast0"), "LINKS");
		SeleniumWebDriver.selctUsingValue(By.name("pass.0.meal"), "DBML");
		SeleniumWebDriver.selctUsingValue(By.name("creditCard"), "CB");
		SeleniumWebDriver.type(By.name("creditnumber"), "55351111333244");
		SeleniumWebDriver.selctVisibleText(By.name("cc_exp_dt_mn"), "05");
		SeleniumWebDriver.selctUsingValue(By.name("cc_exp_dt_yr"), "2004");
		SeleniumWebDriver.type(By.name("cc_frst_name"), "AhaAha");
		SeleniumWebDriver.type(By.name("cc_mid_name"), "HH");
		SeleniumWebDriver.type(By.name("cc_last_name"), "LLKK");
		SeleniumWebDriver.click(By.name("ticketLess"));
		//problem on clearing out date already put in 
		SeleniumWebDriver.type(By.name("billAddress1"), "1111 hello hi how r u");
		SeleniumWebDriver.type(By.name("billCity"), "i know");
		//same problem for clearing out old date
		SeleniumWebDriver.type(By.name("billState"), "MD");
		SeleniumWebDriver.clickWithJS(By.xpath("//input[@name='buyFlights']"));
		SeleniumWebDriver.click(By.xpath("//img[@src='/images/forms/backtoflights.gif']"));

	}
	@Test (priority=2)
	public void bookedTwowayFlight() {
		SeleniumWebDriver.startTestCase("bookedTwowayFlight");
		SeleniumWebDriver.click(By.xpath("//*[@value='roundtrip']"));
		SeleniumWebDriver.selctUsingValue(By.name("passCount"), "1");
		SeleniumWebDriver.selctUsingValue(By.name("fromPort"), "London");
		SeleniumWebDriver.selctUsingValue(By.name("fromMonth"), "3");
		SeleniumWebDriver.selctUsingValue(By.name("fromDay"), "15");
		SeleniumWebDriver.selctUsingValue(By.name("toPort"), "Paris");
		SeleniumWebDriver.selctUsingValue(By.name("toMonth"), "5");
		SeleniumWebDriver.selctVisibleText(By.name("toDay"), "10");
		SeleniumWebDriver.click(By.xpath("//*[@value='Business']"));
		SeleniumWebDriver.selctVisibleText(By.name("airline"), "Unified Airlines");
		SeleniumWebDriver.click(By.name("findFlights"));
		SeleniumWebDriver.click(By.xpath("//table//table//table//table//table[1]//tbody[1]//tr[7]//td[1]//input[1]"));
		SeleniumWebDriver.click(By.xpath("//table[2]//tbody[1]//tr[9]//td[1]//input[1]"));
		SeleniumWebDriver.click(By.name("reserveFlights"));
		SeleniumWebDriver.type(By.name("passFirst0"), "AhaAha");
		SeleniumWebDriver.type(By.name("passLast0"), "LINKS");
		SeleniumWebDriver.selctUsingValue(By.name("pass.0.meal"), "DBML");
		SeleniumWebDriver.selctUsingValue(By.name("creditCard"), "CB");
		SeleniumWebDriver.type(By.name("creditnumber"), "55351111333244");
		SeleniumWebDriver.selctVisibleText(By.name("cc_exp_dt_mn"), "05");
		SeleniumWebDriver.selctUsingValue(By.name("cc_exp_dt_yr"), "2004");
		SeleniumWebDriver.type(By.name("cc_frst_name"), "AhaAha");
		SeleniumWebDriver.type(By.name("cc_mid_name"), "HH");
		SeleniumWebDriver.type(By.name("cc_last_name"), "LLKK");
		SeleniumWebDriver.click(By.name("ticketLess"));
		//problem on clearing out date already put in 
		SeleniumWebDriver.type(By.name("billAddress1"), "1111 hello hi how r u");
		SeleniumWebDriver.type(By.name("billCity"), "i know");
		//same problem for clearing out old date
		SeleniumWebDriver.type(By.name("billState"), "MD");
		SeleniumWebDriver.clickWithJS(By.xpath("//input[@name='buyFlights']"));
		SeleniumWebDriver.click(By.xpath("//img[@src='/images/forms/backtoflights.gif']"));

	}



}
