package com;

public class A 
{
	int i;
	
	synchronized void test1()
	{
		
		System.out.println("A test1 above a1=="+i);
		for(; i <= 500; i++){
			System.out.println("A test1 below a1=="+i);
		}
		
	}
	
	synchronized void test2()
	{
		System.out.println("A test2 above a1=="+i);
		for(; i <= 1000; i++){
			System.out.println("A test2 below a1=="+i);
		}
	}
}
