/**
     *find out weither the given number is prime or not 
     */
package com;

public class Prime
{
	public static void test(int num)
	{int i;
		for(i=2;i<num;i++)
		{ 
				if(num%i==0){
				System.out.println("not prime");
				break;
				}
							
		}	
		if(num==i){
		System.out.println("prime");
		}}

public static void test2(int num)
{
		int i;
			for (i=1; i < num; i++ )		
	{
				int j;
					for (j=2; j<i; j++){
							if (i%j==0){
								break;
									}
										}
		  if(i == j){
		  System.out.print("  "+i);
		  			}
	}
}
	public static void main(String[] args) 
	{
		//System.out.print(1);
		//System.out.println(2);
	//Prime a=new Prime();
	//a.prime1();
	Prime.test(13);
	//Prime.test2(11);
	}
}
