package linclon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckingEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver drE;
		/*
		WebDriverManager.chromedriver().clearPreferences();
		WebDriverManager.chromedriver().setup();
		
		drE = new ChromeDriver();
				
		drE.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/3.7.1");
		
	*/
		
		WebDriverManager.edgedriver().clearPreferences();
		WebDriverManager.edgedriver().setup();
		
		drE = new EdgeDriver();
		
		drE.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/3.7.1");
	
		
		
		
		
		
	}

}
