package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

public class FileUtility {
	
	
	public static void main(String[] args) throws IOException{
/*		File file = new File("/Users/ag9068/Documents/Kume_");
		String[] files=file.list();
		 System.out.println(files.length);
		File[] filess= file.listFiles();

		 for(File f:filess) {
			 System.out.println(f.getName());
			 System.out.println(f.getAbsolutePath());
		 }*/
		 
		
		//Read File line by line
		
		
		//File file=new File("/Users/ag9068/seleniumDemo/github/SeleniumTestAutomation/resources/usefullInfo.txt");
		File file=new File("./resources/abc.csv");
		
		
		
		//Using FileInputStream Reader
		
/*		FileInputStream fis = new FileInputStream(file);
		int i;
		while((i=fis.read())!=-1){
			System.out.print((char)i);
		}*/
		
		
		
		//Using Buffer Reader
		
/*		try {
			FileReader fr=new FileReader(file);
			 BufferedReader br=new BufferedReader(fr);
			String line;			
			while( (line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Using Scanner
		
		
/*		Scanner scanner=new Scanner(file);
		
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}*/
		
		
		/**
		 * Read file by char..
		 */
		
/*		FileInputStream fis=new FileInputStream(file);
		
		int i;*/
/*		i=fis.read();
		
		while(i!=-1) {
			//System.out.print(i);
			System.out.print((char)i);
			i=fis.read();
		}*/
/*		boolean bfound = false;
		while((i=fis.read())!=-1) {
			char a = ((char)i);
			if(Character.toString(a).contains("X")){
				System.out.println("J found in a.txt file");
				bfound=true;
				break;
			}
		}
		if(bfound==false) {
			System.out.println("X doesn't exist in a.txt file");
		} */
		
		
		/**
		 * Read file line by line 
		 */
		
/*		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String line;*/
/*		line=br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}*/
		
/*		while((line=br.readLine())!=null) {
			System.out.println(line);
		}*/
		
		
		
		/**
		 * Read file using scanner class
		 */
		
		
	Scanner scanner=new Scanner(file);
		
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	}
	
	

}
