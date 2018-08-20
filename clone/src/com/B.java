package com;

public class B implements Cloneable ////shallow copy
{
C c1=new C();
	public static void main(String[] args) throws Throwable
	{
		
		B b1=new B();
		System.out.println(b1.c1.i);
		
		B b2=(B)b1.clone();
		b2.c1.i=6;
		System.out.println("after clone attribute changing original object changing:"+b1.c1.i);
	}

}
