package com;

import java.util.ArrayList;
import java.util.Arrays;

public class A
{
	public String toString(){ return " A  Tostring";}
	public static void main(String[] args){
	String[] a ={"ravi","ranjan","rajesh","kumar"};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.binarySearch(a,"r"));
	System.out.println(Arrays.binarySearch(a,"kumar"));
	
	ArrayList l3=new ArrayList(Arrays.asList(a));
	System.out.println(l3);
	
	String [] a2={"ravi","ranjan","rajesh","kumar","madev"};
	Arrays.equals(a, a2);
	
	Arrays.sort(a2, 1, 4);//excluding 4
	System.out.println("==="+Arrays.toString(a2));
	
	Object[] a1 ={8,"ravi",true,90.0};
	System.out.println(Arrays.toString(a1));
	
	
	
	
}
}
