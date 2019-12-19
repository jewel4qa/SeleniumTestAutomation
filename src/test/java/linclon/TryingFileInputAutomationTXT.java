package linclon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryingFileInputAutomationTXT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		File f = new File(".\\resources\\userinfo.txt");
		FileReader fr=new FileReader(f);
		
		BufferedReader brd = new BufferedReader(fr);
		
		String id="";
		String pas="";
		String line; 
		
		line = brd.readLine();
		while (line!=null) {
			//System.out.println("line: + " + line);
			if(line.startsWith("userName")) {
				id=line;
				line=brd.readLine();
				//System.out.println("id: + " + id);
			}else if(line.startsWith("password")) {
				pas=line;
				//System.out.println("Pass: " + pas);
				line=brd.readLine();
			}
		}
			id=id.split("-->")[1];
			System.out.println(id);
			pas=pas.split("-->")[1];
			System.out.println(pas);
		
			
			
			
	}

	}

