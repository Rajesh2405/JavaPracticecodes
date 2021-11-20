package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatafromFile {

	public void ReadData() throws IOException {

		File f = new File("D:\\AT files\\linknecessary.txt");

		FileReader fr = new FileReader(f);

		int ch = fr.read();

		while (ch != -1) {

			System.out.print((char) ch);

			ch = fr.read();

		}

	}

	public void buffReader() throws IOException {

		File f = new File("D:\\AT files\\linknecessary.txt");

		FileReader fr = new FileReader(f);
		
		BufferedReader	bfr = new BufferedReader(fr);
		
		String eachline = bfr.readLine();
		
		while (eachline!=null) {
			
			System.out.println(eachline);
			eachline = bfr.readLine();
			
		}

	}

	public static void main(String[] args) throws IOException {

		ReadDatafromFile fileRead = new ReadDatafromFile();

		//fileRead.ReadData();
		
		fileRead.buffReader();

	}

}
