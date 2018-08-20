/**
     * Time Complexity of Linkedlist and ArraysList
     */
package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimeComplexcityOfLists
{
	
	public static void main(String[] args)
	{
		
		List l1=new ArrayList();
		List l2=new LinkedList();
		
		for(int i=0;i<10000;i++){
			l1.add(i,1);
		}
		
		long t1=System.currentTimeMillis();
		for(int i=0;i<999;i++){
			l1.remove(i);
		}
		long t2=System.currentTimeMillis();
		System.out.println("Arraylist"+(t2-t1));
		
		for(int i=0;i<10000;i++){
			l2.add(i,1);
		}
		
		long t3=System.currentTimeMillis();
		for(int i=0;i<999;i++){
			l2.remove(i);
		}
		long t4=System.currentTimeMillis();
		System.out.println("linkedlist"+(t4-t3));
		
	
		
	}
}
