/**
     * Reading a word from file and finding how many times it occurs in another file
     */
package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenInPage
{
public static void main(String[] args) throws IOException
{
	File f1 = new File("src/com/A.txt");
	FileReader fr =new FileReader(f1);
	BufferedReader r2=new BufferedReader(fr);
	String s3="";
	ArrayList<String> l1=new ArrayList<String>();
	while(s3!=null){
		s3=r2.readLine();
		if(s3!=null){l1.add(s3);}
	}
	File f2 = new File("src/com/B.txt");
	FileReader fr1 =new FileReader(f2);
	BufferedReader r3=new BufferedReader(fr1);
	String s4="";
	String s5=new String();
	while(s4!=null){
		s4=r3.readLine();
		if(s4!=null)s5=s5+" "+s4;
	}
	for(int k=0;k<l1.size();k++){
	String[] a=s5.split(l1.get(k));
	int j=(a.length)-1;
	System.out.println(l1.get(k)+","+j);}
	
}}
