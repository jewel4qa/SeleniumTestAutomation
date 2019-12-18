package gmail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;



public class LoginUsingTxtPB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	File f= new File ("C:\\Users\\grk4m\\git\\Credential.txt");
	
	FileReader fr=new FileReader(f);

	BufferedReader br = new BufferedReader(fr);

	String userID="";
	String password="";

	String line;
	line=br.readLine();
	while(line!=null) {
		if(line.startsWith("UserID")) {
			userID=line;
			line=br.readLine();
		}else if(line.startsWith("Password")) {
			password=line;
			line=br.readLine();
			
			//System.out.println(userID);
			//System.out.println(password);
			

	userID=userID.split(":")[1];

	System.out.println(userID);
	password=password.split(":")[1];
	System.out.println(password);


			SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");
			SeleniumWebDriver.type(By.name("userName"), userID);
			SeleniumWebDriver.type(By.name("password"), password);
			SeleniumWebDriver.click(By.name("login"));

			
			
		}


	}
	
	
	
	
	
	
	}

}
