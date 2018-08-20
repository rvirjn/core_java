package com;

public class A implements Cloneable///deep copy-both different object
{
int i=3;
String s1="ravi";
boolean s3=true;
public static void main(String[] args) throws Throwable
{
	
	A a1=new A();
	A a2=(A)a1.clone();
	a2.i=6;
	a2.s1="ravnjan";
	a2.s3=false;
	System.out.println(a1.i);
	System.out.println(a1.s1);
	System.out.println(a1.s3);
}
}
