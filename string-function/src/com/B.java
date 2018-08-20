package com;

public class B
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("13");
System.out.println(sb.capacity());
sb.append("ravi");
System.out.println(sb.length());
sb.append(1);
System.out.println(sb.length());

	}
	

}
