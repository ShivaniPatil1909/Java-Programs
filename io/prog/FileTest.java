package io.prog;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException 
	{
		
		//File f1 = new File("test.txt");
		File f1 = new File("D:\\javaprog\\MCA2019\\introduction");
		
		if(f1.exists())
			System.out.println(f1.getName()+" is exists");
		else
			System.out.println(f1.getName()+" is not exists");
		
		System.out.println("path: "+f1.getPath());
		System.out.println("absolute: "+f1.getAbsolutePath());
		
		System.out.println(f1.getCanonicalPath());
		
		System.out.println("directiry: "+f1.isDirectory());
		
		String []files=f1.list();
		
		System.out.println("number of files: "+files.length);
		
		for(String fileName: files)
			System.out.println(fileName);
		
		f1.createNewFile();
		//f1.renameTo(arg0)
	}

}
