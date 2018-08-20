package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListItr
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		list1.add("abc");
		list1.add("fsdfsdf");
		list1.add("abc1");
		
		Iterator it = list1.iterator();
		//list1.add("ravi"); // it give current modification error
		while (it.hasNext())
		{
			System.out.print(" "+it.next());
		}
		System.out.println("1===========");
		list1.add("ravi");
		System.out.println(list1);
		System.out.println("2===========");
		ListIterator lt = list1.listIterator();
		lt.add("ranjan"); // it does not give current modification error but 
		lt.add("ranjan1");
		//list1.add("ranjan");//it give current exception
		//lt.remove(); //exception
		while (lt.hasNext())
		{
			System.out.print(" "+lt.next());
		}
		lt.remove(); //removing last due to hashnext
		System.out.println("3===========");
		System.out.println(list1);
		
	}
}
