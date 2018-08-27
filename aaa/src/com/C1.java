package com;

public class C1 extends B1{

	public int test2()
	{
		super.test();
		return 0;
	}
	public static void main(String[] args)
	{
		C1 c=new C1();
		
		
		System.out.println(c.test2());
	}
}
