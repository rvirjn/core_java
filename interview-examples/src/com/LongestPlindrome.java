/**
     *find out the longest palindrome in a given string
     */
package com;

public class LongestPlindrome
{
public static String longestPlindrome(String input){
	String longestPalindrome = "";
	 
	for(int i = 0; i < input.length(); i++){
          for(int j = input.length()-1; j >= 0 && j != i; j--){
              if(isPalindrome(input.substring(i,j+1))){
                  if(input.substring(i, j+1).length()>longestPalindrome.length()){
                      longestPalindrome = input.substring(i, j+1);
                  }}}}
                  return longestPalindrome;
              
	
	
	
	
	
}
static boolean isPalindrome(String s){
	boolean check=false;
	StringBuffer s2=new StringBuffer(s);
	if(s.equals(s2.reverse().toString()))
			{check=true;}
	return check;
	}
public static void main(String[] args)
{
	System.out.println(LongestPlindrome.longestPlindrome("camadamr"));
}
}
