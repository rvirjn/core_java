package com;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class B
{
public static void main(String[] args)throws FileNotFoundException,IOException
{
// create file and dir	
	File f=new File("D:/lab");
	f.mkdir();
	File f1=new File("D:/lab/test.txt");	//File f6=new File(f,"test.txt");
	f1.createNewFile();
	
	//wirinting to file
	FileWriter f2=new FileWriter(f1);
	f2.write("ravi ranjan \n");f2.flush();//f2.close();
	
	BufferedWriter b1=new BufferedWriter(f2);
	b1.write("my name is ravi ranjan ");
	b1.flush();
	//b1.close();
	
	//reading from file
	FileReader r=new FileReader("D:/lab/test.txt");//FileReader r2=new FileReader(f1);
	char[] c1=new char[(int)f1.length()];
	r.read(c1);//r.close();
	String s1=new String(c1);
	System.out.println(s1);
	
	FileReader r5=new FileReader("D:/lab/test.txt");//FileReader r2=new FileReader(f1);
	BufferedReader r2=new BufferedReader(r5);
	String s3=r2.readLine();
	while(s3!=null){
		System.out.println(s3);
		s3=r2.readLine();
	}	
}
}
