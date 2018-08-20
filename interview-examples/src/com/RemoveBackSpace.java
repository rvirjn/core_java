/**
     *Removing back Space 
     */
package com;

import java.util.StringTokenizer;

public class RemoveBackSpace
{
public static void main(String[] args)
{
	test("ravi is my name");
}

private static void test(String s1)
{
	String s2=" ";
	String s3="";
	StringTokenizer t1=new StringTokenizer(s1,s2);	
	while(t1.hasMoreElements()){
		s3=s3+(String) t1.nextElement();
	}
	System.out.println(s3);
	}

}
