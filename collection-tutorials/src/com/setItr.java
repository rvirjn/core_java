package com;

import java.util.*;

public class setItr
{
public static void main(String[] args)
{
	Set s1=new LinkedHashSet();
	s1.add(null);
	s1.add("ravi");
	s1.add(1);
	s1.add("ranjan2");
	System.out.println(s1);//it does not maintain insertion order but linkedHashset maintain insertain order
	Iterator it=s1.iterator();
	while (it.hasNext())
	{
		System.out.print(" "+it.next());
	}
	//TreeSet t1=new TreeSet(s1);
	//System.out.println(t1);
}
}
