/**
     *find out largest 
     */
package com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Largest 
{
	
	public static void main(String[] args) 
	{
		//large(12,80,1); 
		Integer [] i1={12,12,-7,7,10,9,9,10,10,10,11,11};
		int firstlarg = 0;
		int secondlarg = 0;
		int j=0;
		for(int i=0;i<i1.length;i++){
			int temp = i1[i];
			if(secondlarg>temp && j==0){
				secondlarg=temp;
				j++;
				continue;
			}
			if(temp>firstlarg && temp >secondlarg){
				secondlarg=firstlarg;
				firstlarg=temp;
			}
			if(temp>secondlarg && temp < firstlarg){
				secondlarg = temp;
			}
		}
		System.out.println(secondlarg);
	}
	
public static void large(int a,int b,int c){
	
	if(a>b&&a>c){
		System.out.println(a);
		}
	else if(b>c){
		System.out.println(b);
	}	
	else{
		System.out.println(c);
	}
	}
static int secondlarge(Integer [] a){
	Arrays.sort(a);
	int largeIndex=Arrays.binarySearch(a, a[a.length-1]);
	int secondlarge=a[largeIndex-1];
	return secondlarge;
	 
 }
static int secondlarge1(Integer[] a){
	Arrays.sort(a);
	ArrayList<Integer> l1=new ArrayList<Integer>(Arrays.asList(a));
	int large=l1.get(l1.size()-1);
	int largestartindex=l1.indexOf(large);
	System.out.println(largestartindex);
	int secondlarge=l1.get(largestartindex-1);
	return secondlarge;

}
}
