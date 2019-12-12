package utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file = new File("./resources/a.txt");
		
		/**
		 * Write file in a byte 
		 */
		String txt="My Name is Romelhdbfshjdb";		
/*		byte[] iptxt =txt.getBytes();		
		FileOutputStream fos=new FileOutputStream(file,false);
		fos.write(iptxt);
		fos.close();
		*/

		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write(txt);
		bw.close();fw.close();
		
	}

}
