/**
     * Palindrome number and find next palindrome number
     */
package com;

public class Palindrom
{
	public static boolean test(int num)
	{
		boolean b=false;
		int numN=num;int k=0;
		while(num!=0)
	{
		
		int a=num%10;
			k=k*10+a;//making digit into number
		num=num/10;
	}
	if(numN==k){b=true;}
	
	return b;
	}
	//not working
	static void test6(String s) { 
		String rev="";
		for ( int i = s.length()- 1 ; i >= 0 ; i-- ){
		   rev = rev+s.charAt(i);}
		if(rev.equals(s)){System.out.println("palindrom");}
		else{System.out.println("not palindrom");}		
		}
	
	
static void test2(String s){
	char[] c = s.toCharArray();
		int i=0;
		for(int j=c.length-1;j>=0;)
			{
			if(c[i]!=c[j]){System.out.println("not palindrome");break;}
			if(j==0){System.out.println("plindrome");}
			i++;
			j--;
			}
		
}			
	public static void main(String[] args)
	{
		//Palindrom.test(123454321);
		System.out.println(Palindrom.least(123));
		//Palindrom.test2("harrah");
		//Palindrom.test6("madam");
	}
	private static int least(int abc)
	{
		boolean b=false;
		while(!b){
			
			b=Palindrom.test(abc++);
			
		}
		return abc-1;
	}
}
