package com;

public class B {
	static{
		
	}
public static void main(String[] args){
	System.out.println(1);
	try{
		test();
		}
	catch(Throwable ex){}
	System.out.println(5);
}
static void test() throws Throwable{
	test1();
	System.out.println(7);
}
static void test1() throws Throwable{
	test2();
	System.out.println(9);
}
static void test2() throws Throwable{
	Class.forName("java.lang.Sttring");
	System.out.println(11);
	}
}
