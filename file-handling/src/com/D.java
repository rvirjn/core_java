package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class D implements Serializable
{
	int i=9;
public static void main(String[] args) throws Exception
{
	//serialization writing object to file
	D d1=new D();
	File f1=new File("obj.txt");
	FileOutputStream fos=new FileOutputStream(f1);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d1);
	
	//Externalization ..writing attribute wise insteed of whole object
	oos.writeInt(d1.i);//writeUTF for string
	
	oos.flush();oos.close();
	
	//deserialization reading object from file
	File f2=new File("obj.txt");
	FileInputStream fis=new FileInputStream(f2);
	ObjectInputStream ois=new ObjectInputStream(fis);
	D d2=(D)ois.readObject();
	d2.method1();
	
	//Externalization ..writing attribute wise instead of whole object
	int j=(int) ois.readInt();
	System.out.println(j);
}
void method1(){System.out.println("1");}
}
