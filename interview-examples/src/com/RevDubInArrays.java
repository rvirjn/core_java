/**
     * Remove Dublicates form arrayList without using set
     */
package com;

import java.util.ArrayList;

public class RevDubInArrays
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(9076);
		l1.add(10);
		l1.add(10);
		l1.add(20);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(10);
		l1.add(90);
		l1.add(90);
		l1.add(91);
		l1.add(90);
		l1.add(11);
		l1.add(10);
		l1.add(10);
		l1.add(90);
		l1.add(90);
		l1.add(90);
		l1.add(990);
		int size = l1.size();
		for (int i = 0; i < size; i++)
		{
			for (int j = i + 1; j < size; j++)
			{
				if ((l1.get(i) == l1.get(j)))
				{
					l1.remove(j);
					j--;
					size--;
				} else
				{
					continue;
				}

			}
		}
		System.out.println(l1);
	}
}