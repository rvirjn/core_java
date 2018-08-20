package input;

import java.util.*;
public class ArrayAvg
{
	static ArrayList l2=new ArrayList();
	static ArrayList  addAll(int i){
		l2.add(i);
		return l2;
	}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		Scanner sci=new Scanner(System.in);
		do{
			System.out.println("enter the integer value for array ");
			int i=sci.nextInt();
			addAll(i);
			System.out.println("want to continue y/n ");
			}
		while("y".equals(sc.next()));
		
		System.out.println(l2);
		
		
	}

}
