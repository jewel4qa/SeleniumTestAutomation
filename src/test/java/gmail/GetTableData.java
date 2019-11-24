package gmail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.SeleniumWebDriver;

public class GetTableData {
	
	public static void main(String[] args) {
		
		//
		
		SeleniumWebDriver.openBrowser("chrome", "http://www.newtours.demoaut.com/");
		
		
		
		WebElement tbl = SeleniumWebDriver.driver.findElement(By.xpath("//img[@alt='Specials']/parent::td/../following-sibling::tr[@valign='top']//table"));
				
		List<WebElement> rows=tbl.findElements(By.tagName("tr"));
		
		//System.out.println(rows.size());
		
		
		//For Each loop
		boolean bfound=false;
		for( WebElement r:rows) {
			
			//get column for each row
			List<WebElement> colmuns = r.findElements(By.tagName("td"));

			for(int i =0; i<colmuns.size()-1;i++) {
				String txtVal = colmuns.get(0).getText().trim();
				if(txtVal.contentEquals("Atlanta to Las Vegascvxvxcvx")) {
					String fareValue=colmuns.get(1).getText().trim();
					System.out.println(fareValue);
					bfound=true;
					break;
				}
				
			}
			
			if(bfound==true) {
				System.out.println("HAHAHAHA");
				break;
			}
		}
		
		if(bfound==false)
			System.out.println("Sorry....");
		
		
		//if New York to Chicago exist in the Special table then display the air fare
		
		
		
		/**
		 * 		
		WebElement tbl = SeleniumWebDriver.driver.findElement(By.xpath("//img[@alt='Specials']/parent::td/../following-sibling::tr[@valign='top']//table"));
				
		List<WebElement> rows=tbl.findElements(By.tagName("tr"));
		
		System.out.println(rows.size());
		
		
		//For Each loop
		
		for( WebElement r:rows) {
			
			//get column for each row
			List<WebElement> colmuns = r.findElements(By.tagName("td"));
			for(WebElement col:colmuns) {
				//get cell text value
				System.out.println(col.getText());
			}
			
		}
		 */
		
		
		
		
		
		
		
		
		
	}

}
