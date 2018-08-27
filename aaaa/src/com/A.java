package com;

import java.util.LinkedList;

public class A
{
public static void main(String[] args)
{
	LinkedList l1=new LinkedList();
	l1.add(1);
	l1.add(2);l1.add(3);l1.add(4);l1.add(6);l1.add(9);l1.add(45);
	int midsize;
	if(l1.size()%2==0){
		midsize=l1.size()/2;
	}
	else{
		midsize=(l1.size()/2)+1;
	}
	System.out.println(l1.get(midsize-1));
	//System.out.println(test());
	
}

private static int test()
{
	try{
		return 2;
		
	}
	catch(Exception e){
		
		System.out.println(e);
		return 3;
	}
	
}
}
