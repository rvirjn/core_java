/**
     *sort employee based on their name 
     */
package com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(4, "e3wrewr", 7);
		Employee e2 = new Employee(3, "ravi", 7);
		Employee e3 = new Employee(7, "e2wrewr", 7);
		List<Employee> l1 = new ArrayList<Employee>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		Collections.sort(l1, new Comparator<Employee>()
		{

			@Override
			public int compare(Employee o1, Employee o2)
			{
				// TODO Auto-generated method stub
				return o1.empName.compareTo(o2.empName);
			}
		});
		
		for(Employee e:l1)
		{
			System.out.println(e.empName);
		}
	}
}
