package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writedata {

	public static void main(String[] args) throws IOException {
		
		File nf	= new File("D:\\testfile.txt");
		
		FileWriter fw = new FileWriter(nf);
		
		fw.write("Hi how are you im file writer");
		fw.write("May i help you to write something");
		
		fw.flush();
		fw.close();
		
		System.out.println("writing done");
	}

}
