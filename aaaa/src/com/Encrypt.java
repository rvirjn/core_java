package com;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Encrypt
{
	public static void main(String[] args) throws Exception
	{
		//reading .jpg and writing to byte []
		File f1=new File("D:/IMAGES/read.jpg");
		FileInputStream fis=new FileInputStream(f1);
		BufferedInputStream bis=new BufferedInputStream(fis);
		byte[] b=new byte[(int)f1.length()];
		bis.read(b);
		
		//writing to .txt from byte[]
		File f2=new File("D:/write.txt");
		f2.createNewFile();
		FileOutputStream fos =new FileOutputStream(f2);
		fos.write(b);
		
		//reading .txt and writing to bye[]
		File f3=new File("D:/write.txt");
		FileInputStream fis3=new FileInputStream(f3);
		BufferedInputStream bis3=new BufferedInputStream(fis3);
		byte[] b3=new byte[(int)f3.length()];
		bis3.read(b3);
		
		//writing to .jpg from byte[]
		File f4=new File("D:/write.jpg");
		f4.createNewFile();
		FileOutputStream fos4 =new FileOutputStream(f4);
		fos4.write(b3);
	}

}
