/**
     * Reversing a String
     */
package com;

import java.util.Arrays;
import java.util.LinkedList;

public class String_rev
{

	static int i=1;

	static void rev()
	{
		String s1 = "hfjyfyyt";
		char[] ch = s1.toCharArray();
		int j=ch.length-(i++);
		
		if(j>=0){
		System.out.print(ch[j]);
		}
		if(j <= -1) {
			return;
		}
		rev();
	}

	static void test6(String s)
	{
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--)
			rev = rev + s.charAt(i);
		System.out.println(rev);
	}

	static void test2(String s)
	{
		char[] c = s.toCharArray();
		for (int j = c.length - 1; j >= 0; j--)
		{
			System.out.print(c[j]);
		}
		System.out.println();
	}

	static void test3(String s)
	{
		StringBuffer s1 = new StringBuffer(s);
		s1.reverse();
		System.out.print(s1);
	}

	static String test4(String input)
	{
		String output = "";
		int lastIndex = input.length()-1;
		for (int j = lastIndex; j >= 0; j--)
		{
			output = output+input.charAt(j);
		}
		return output;
	}
	
public static void test7(){
	
		LinkedList<String> l1=new LinkedList<String>();
		String o1="r";String o2="a";String o3="v";String o4="i";
		l1.add(o1);l1.add(o2);l1.add(o3);l1.add(o4);
		//Iterator it=l1.iterator();
		//while(it.hasNext())
		for(int i=l1.size();i>0;i--)
		{
			System.out.print(l1.pollLast());
			}
			
	
}
	
	public static void main(String[] args)
	{
		
		//String_rev.test2("rajesh");
		//String_rev.test3("i m ravi ranjan");
		//System.out.println();
		//System.out.println(String_rev.test4("my name is ravi ranjan"));
		//String_rev.test6("raaj");
		//rev();
		//test7();
		System.out.println(test5("my name is ravi ranjan"));
	
	}

	private static String test5(String string) {
		String output=new String();
		String [] arraysString = string.split("\\s+");
		//System.out.println(Arrays.toString(arraysString));
		for (int j=arraysString.length-1; j>=0; j--){
			output = output+arraysString[j]+" ";
		}
		return output;
	}
}
