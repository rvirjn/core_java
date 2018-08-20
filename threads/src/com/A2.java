package com;

public class A2 extends Thread
{
	A a1;
	A2(A a1){
		this.a1=a1;
	}
	@Override
	public void run()
	{
		System.out.println("A2 run above=="+this.getName()+" "+a1.i);
		a1.test1();
		System.out.println("A2 run below==="+this.getName()+" "+a1.i);
	}
}
