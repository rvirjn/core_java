/**
     *Different conversion VVI
     */
package com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Conversion
{
public static void main(String[] args)
{
	int i=3;
	Integer j=Integer.valueOf(i);//boxing
	int k=j.intValue();//unboxing
	
	String s1=Integer.toString(i);//int into string// Integer cuz args is int/integer type//anyting into string
	String s9=j.toString();//only for wapper class
	
	int l=Integer.parseInt(s1);//string into int //jisme convert krna h uska wapper class.parseInt
	
	char c[]=s1.toCharArray();//string into char array..
	
	//primitive char arrays into String
	
	char[] c1={'a','b','c','d','f','c','v','v'};
	String s2=new String(c1);// String s7=c1.toString(); will print MA for not only for premitive
	System.out.println(s2);
	
	
	
	Integer[] array1={1,3,4};
	ArrayList<Integer> l2= new ArrayList<Integer>(Arrays.asList(array1));// arrays into arrayList
	
	//or
		ArrayList<Integer> l1= new ArrayList<Integer>();// arrays into arrayList
		Collections.addAll(l1,array1);
		
		
		
		 Integer[] array2 = l2.toArray(new Integer[l2.size()]);// ArrayList into arrays
		 System.out.println(Arrays.toString(array2));
		 
		 
}
}
