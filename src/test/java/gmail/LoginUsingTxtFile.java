package gmail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class LoginUsingTxtFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("./resources/userInfo.txt");
		FileReader fr=new FileReader(f);

		BufferedReader br = new BufferedReader(fr);

		String userId="";
		String passwd="";

		String line;
		line=br.readLine();
		while(line!=null) {
			if(line.startsWith("userName")) {
				userId=line;
				line=br.readLine();
			}else if(line.startsWith("password")) {
				passwd=line;
				line=br.readLine();
			}


		}


		/*		userId = userId.substring(9);
		System.out.println(userId);
		passwd=passwd.substring(9);
		System.out.println(passwd);*/

		userId=userId.split("-->")[1];

		System.out.println(userId);
		passwd=passwd.split("-->")[1];
		System.out.println(passwd);


		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");
		SeleniumWebDriver.type(By.name("userName"), userId);




	}

}
