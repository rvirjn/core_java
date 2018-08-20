/**
     *Reversing any digit or string
     */
package com;

class Int_Rev{

public static void test(int num)
	{
	//for(;n!=0;n=n/10)
	while(num!=0)
	{
		
		int a=num%10;
		System.out.print(a);
		num=num/10;
	}
	
	}
static void test2(int[] i){
	
	for(int j=i.length-1;j>=0;j--){
		System.out.println(i[j]);
	}
}
 public static void main(String[] args) 
 {
	 Int_Rev.test(899323);
	 System.out.println("");
	 int[] i={1267,1399,14,15};
	// Rev.test2(i);
 }
}