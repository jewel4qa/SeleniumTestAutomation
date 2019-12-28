package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static Sheet getExcelSheet(String filepath,String sheetName) throws IOException {	
		Sheet xlSheet=null;
		try {
			File file=new File(filepath);
			FileInputStream fis= new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			xlSheet=wb.getSheet(sheetName);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return xlSheet;

	}

	
	
	


	
}
