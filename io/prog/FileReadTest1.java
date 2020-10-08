package io.prog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReadTest1 {

	public static void main(String[] args) {
		InputStream is;
		OutputStream os=null;
		try{
			is = new FileInputStream("numbers.txt");
			os = new FileOutputStream("test.txt");
			int ch = is.read();
			while(ch != -1)
			{
			   System.out.print((char)ch);
			   ch = is.read();
			   os.write(ch);
			}
			is.close();
			os.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
