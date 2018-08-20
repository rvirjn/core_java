package com;
import java.util.ArrayList;
import java.util.*;

public class ArrayAvg
{
static ArrayList l2=new ArrayList();
	
	static ArrayList addAll(int i){
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
		
		System.out.println(l2.size());
		System.out.println(l2);
		
		
	}
	static int avg(ArrayList l1){
		int sumTot = 0;int sumHalf=0;int avgHalf = 0;
		for(int i=0;i<l2.size();i++){
		sumTot=sumTot +(Integer)(l1.get(i));
		sumHalf=sumTot/2;
		avgHalf=(sumTot/l2.size())/2;
		}
		return avgHalf;
	}

}
