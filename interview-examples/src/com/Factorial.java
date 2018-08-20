/**
     *find out factorial of  the given number  
     */
package com;

public class Factorial
{
	public static void test(int num)
	{
		int fact = 1;
		for (int i = num; i > 0; i--)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args)
	{
		test(5);
	}
}
