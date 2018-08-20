package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class C
{
public static void main(String[] args) throws IOException
{
	///reading image blob and wirinting to .txt
	File f1=new File("D:/lab/test.jpg");
	FileInputStream fis=new FileInputStream(f1);
	BufferedInputStream bis=new BufferedInputStream(fis);
	byte[] b=new byte[(byte)f1.length()];
	bis.read(b);//bis.flush(); no need of flush while reading
	//bis.close();fis.close(); close at last 
	//System.out.println(Arrays.toString(b));
	
	//witing to file image
	File f12=new File("D:/lab/test.txt");	
	f1.createNewFile();
	FileWriter f122=new FileWriter(f12);
	BufferedWriter f22=new BufferedWriter(f122);
	//f22.write(b);f22.flush();//f2.close();
	
	//writing to image
	File f2=new File("D:/lab/test.jpg/test1.jpg");
	FileOutputStream fos=new FileOutputStream(f2);
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	//byte[] b2=new byte[(byte)f2.length()];
	bos.write(b);bos.flush();
	bos.close();fos.close();
		
}
}
