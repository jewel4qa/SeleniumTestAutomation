package com.jobstreet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTestWithWebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver dr;
		
		
		//System.setProperty("webdriver.chrome.driver", "./src/test/....");
		
		WebDriverManager.chromedriver().clearPreferences();
		WebDriverManager.chromedriver().setup();
		
		dr=new ChromeDriver();
		dr.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager");
		

	}

}
