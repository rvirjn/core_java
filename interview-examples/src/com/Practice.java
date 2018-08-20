package com;

public class Practice {
public static void main(String[] args) {
	System.out.println(test(89745));
}

private static String test(int input) {
	String output = "";
	while (input!=0){
		int a=input%10;
		output+=(a);
		input= input/10;
	}
	return output;
}
}
