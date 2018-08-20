/**
     *prime factor of a given number 
     */
package com;


public class PrimeFactor 
{
public static  void  prime(int num)
	{
		
	for(int i=2;i<num;i++){
		if(num%i==0){
			System.out.print(i+",");
		}
	}
	}
public static void main(String[] args)
{
	PrimeFactor.prime(60);
	
}
}
