/**
     * Sum of Digit of number
     */
package com;

public class Sumofdigit 
{
	public static void test(int num)
	{
	//for(;n!=0;n=n/10)
		int sum=0;
	while(num!=0)
	{
		
		int a=num%10;
		sum=sum+a;
		System.out.print(a);
		num=num/10;
	}
	System.out.println();
	System.out.println(sum);
	}
	
	 public static void main(String[] args) 
	 {
		 Sumofdigit.test(12345);
		
	 }
	}

