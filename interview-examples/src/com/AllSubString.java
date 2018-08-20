/**
     *find out all substring of a string  
     */
package com;

public class AllSubString
{
public static void main(String[] args)
{
	String name=new String("ravi");
	for(int i=0;i<name.length();i++){
		for(int j=1;j<=name.length()-i;j++){
			
			String sub=name.substring(i,i+j);
			System.out.println(" "+sub);
		}
	}
	
}
}
