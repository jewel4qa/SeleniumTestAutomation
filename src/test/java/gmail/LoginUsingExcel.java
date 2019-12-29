package gmail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.selenium.SeleniumWebDriver;

import utility.ExcelUtility;

public class LoginUsingExcel {


	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		/*	File file = new File("/Users/ag9068/Documents/ImportantInfo.xlsx");
	FileInputStream fis = new FileInputStream(file);

	Workbook wb = WorkbookFactory.create(fis);

	Sheet sheet=wb.getSheet("Practice");*/

		Sheet sheet=ExcelUtility.getExcelSheet("./resources/testexcel.xlsx", "Credential");


		int rowNum=sheet.getLastRowNum();

		for(int i =1;i<=rowNum;i++) {

			Row row = sheet.getRow(i);

			String userName=row.getCell(0).getStringCellValue();

			System.out.println(userName);

			/*		double dd =row.getCell(1).getNumericCellValue();

		int aa = new Double(dd).intValue();*/


			//int pawd=new Double(row.getCell(1).getNumericCellValue()).intValue();
			//row.getCell(1).getNumericCellValue();




			//	String password=Integer.toString(pawd);

			String password=row.getCell(1).getStringCellValue();
			System.out.println(password);


			SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");

			SeleniumWebDriver.type(By.name("userName"), userName);

			Thread.sleep(5000);
			SeleniumWebDriver.type(By.name("password"), password);
			Thread.sleep(5000);
			SeleniumWebDriver.click(By.xpath("//input[@name='login']"));
			Thread.sleep(5000);
			SeleniumWebDriver.driver.close();
			Thread.sleep(5000);
			SeleniumWebDriver.driver.quit();

		}





	}



}
