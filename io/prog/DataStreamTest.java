package io.prog;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	public static void main(String[] args) {
		DataOutput dos;
		FileOutputStream fos = null;
		try{ 
			fos = new FileOutputStream("test.txt");
			dos = new DataOutputStream(fos);
			dos.writeByte(127);
			dos.writeInt(128);
			dos.writeFloat(12.34f);
			dos.writeUTF("Satyawan");
			fos.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	
			
		// read data 
		DataInput dis;
		FileInputStream fis = null;
		try{ 
			fis = new FileInputStream("test.txt");
			dis = new DataInputStream(fis);
			
			
			System.out.println(dis.readByte());
			
			System.out.println(dis.readInt());
					
			System.out.println(dis.readFloat());
			
			System.out.println(dis.readUTF());
			
			fis.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}
}
