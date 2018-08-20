package com;

import java.util.Arrays;

public class B {
	B(int i){
		
	}

	public int compareTo(Object o){	return 0;	}
	public static String toString(Object[] obj){ return "toString";}
	public String toString(){ return " B toString";}
	public boolean equals(Object obj) {return true;}
	public int hashCode(){return 0;}
	public static void main(String[] args)
	{
		Object[] b1={new B(4),new B(6),new A()};
		
		System.out.println(new B(9));
		System.out.println(Arrays.toString(b1));
		System.out.println(new B(0)==new B(0));
		System.out.println(new B(0).equals(new B(0)));

	}
	
	
}
