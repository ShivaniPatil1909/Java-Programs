package io.prog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileReadTest2 {

	public static void main(String[] args) {
		InputStream is;
		Scanner sc=null;
		try{
			is = new FileInputStream("numbers.txt");
			sc = new Scanner("11 11 11 11 33 77");
			int n, sum=0;
			while(sc.hasNext())
			{
				n= Integer.parseInt(sc.next());
				sum+=n;
			}
			System.out.println("sum="+sum);	
			is.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
