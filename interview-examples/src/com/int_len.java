/**
     *length of stirng or digit
     */
package com;

public class int_len
{
static void test(int i){
	int k=0;
	while(i!=0){
		i=i/10;
		k++;
		}
	System.out.println(k);
}
static void test2(int i){
	int k=0;
			for(;i!=0;i=i/10){k++;}
System.out.println(k);
} 
public static void main(String[] args)
{
	int_len.test2(778);
}
}
