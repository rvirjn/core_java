package com;

public class A
{
public static void main(String[] args)
{
	String s1="abc";
	String s2="abc"; 
	
	if(s1==s2){
	System.out.println(s1);}
	
	String s3=new String("abc");
	String s4=new String("abc"); 
	
	if (s3==s4){
		System.out.println(s4);
	}
	String s5=new String("ranjan");
	System.out.println(s5.hashCode());
	s5="ranjan";
	System.out.println(s5.hashCode());
}
}
