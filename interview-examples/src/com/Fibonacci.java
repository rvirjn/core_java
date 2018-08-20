/**
     *find out fibonacci of  the given number  
     */
package com;


public class Fibonacci 
{
	public static void main(String[] args)
	{	
	//f1(6);
		//System.out.println("========");
	System.out.println(f2(7));
		//System.out.println("========");
	
		
	}			
	public static int f2(int n)
	 {
		if(n==0|| n==1){
			return n;}
	  else{
	   return f2(n-1)+f2(n-2);
	 }}
	
	public static void f1(int num)
	{
		int a=0;
		int b=0;
		int sum=1;
		System.out.print(" "+a+" "+b+" "+sum);
		for(int i=2;i<=num;i++)
		{
				a=b;
				b=sum;
				sum=a+b;
			System.out.print(" "+sum);
					}	
	}
	 public static void fif (String args [ ])
	 {
	 int i;
	 int[] array = new int[12];
	 array[0]= -1;
	 array[1]= 1;
	 for(i=2 ; i<array.length ; i++)
	 {
	 array[i]=array[i-2] + array[i-1];
	 System.out.print(array[i]+ " " );
	 }
	 }
}
