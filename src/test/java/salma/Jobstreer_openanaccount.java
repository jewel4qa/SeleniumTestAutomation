package salma;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;




public class Jobstreer_openanaccount {



	public static void main(String[] args) {
		SeleniumWebDriver.openBrowser("chrome","https://www.jobstreet.com/");
		SeleniumWebDriver.click(By.id("singapore"));
		SeleniumWebDriver.clickWithJS(By.id("header-signup-button"));
		SeleniumWebDriver.type(By.id("first_name"),"salma");
		SeleniumWebDriver.type(By.id("last_name"),"siddik2");
		SeleniumWebDriver.type(By.id("email"), "salma.siddik.usa@gmaol.com");
		SeleniumWebDriver.type(By.id("password"), "salma24");
		SeleniumWebDriver.click(By.id("promotion"));
		SeleniumWebDriver.click(By.id("signup-btn"));


	}



}


