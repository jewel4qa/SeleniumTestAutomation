package gmail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/Users/ag9068/Documents/ImportantInfo.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet9");
		
		int rowNum=sheet.getLastRowNum();//count row -- 0 based
		//System.out.println(rowNum);
		
		for(int i=1;i<=rowNum;i++) {
			
			Row row = sheet.getRow(i);
			int colNum=row.getLastCellNum();	
			for(int j=0;j<=colNum-1;j++) {
				
				Cell cell=row.getCell(j,MissingCellPolicy.CREATE_NULL_AS_BLANK);
				
				String cellValue=cell.getStringCellValue();
				System.out.println(cellValue);
				
				
				
				
				
				
			}
			
			
			
			
/*			int col=sheet.getRow(i).getLastCellNum(); //1 based
			System.out.println(col);*/
			
		}
		
		
		
	}

}
