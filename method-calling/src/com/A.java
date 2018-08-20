package com;

public class A
{

public static B test(){
	return new B();
}


public static void main(String[] args)
{
	
	A.test().method1();
	System.out.println("======");
}
}
