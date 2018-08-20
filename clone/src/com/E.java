package com;

public class E implements Cloneable ///////deep copy-both different object
{
	D d1=new D();
		public static void main(String[] args) throws Throwable
		{
			
			E e1=new E();
			System.out.println(e1.d1.i);
			System.out.println(e1.d1.s1);

			E e2=(E)e1.clone();
			e2.d1.i=6;
			e2.d1.s1="ranjan";
			System.out.println("after clone attribute changing original object changing:"+e1.d1.i);
			System.out.println("after clone attribute changing original object changing:"+e1.d1.s1);

		}

	}
