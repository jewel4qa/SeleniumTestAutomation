package priyanka;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

public class LoginUsingXLSX {

	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		

		File f = new File("C:\\Users\\grk4m\\\\git\\Credential.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("Sheet1");
		
		int rowNum=sheet.getLastRowNum();
		
		for(int i =1;i<=rowNum;i++) {
			
			Row row = sheet.getRow(i);
			
			String userID=row.getCell(0).getStringCellValue();
			System.out.println(userID);
			String password=row.getCell(1).getStringCellValue();
			System.out.println(password);
			
			
			SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");
			
			SeleniumWebDriver.type(By.name("UserID"), userID);
			
			Thread.sleep(5000);
			SeleniumWebDriver.type(By.name("Password" ), password);
			Thread.sleep(5000);
			SeleniumWebDriver.click(By.name("login"));
			Thread.sleep(5000);
			SeleniumWebDriver.driver.close();
			Thread.sleep(5000);
			SeleniumWebDriver.driver.quit();
			
			
			
			
	}
	}
}
