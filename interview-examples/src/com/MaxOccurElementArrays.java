/**
     * Find the element which occurs Maximum number of time in a given array
     */
package com;

import java.util.Arrays;

public class MaxOccurElementArrays
{
public static void main(String[] args)
{
	int precount=0,k=0,e=0, nextcount=0;
	int [] a1={1,2,3,4,5,6,7,1,2,3,4,5,3,4,1,2,3,4,11,4};
	Arrays.sort(a1);
	for(int i=0;i<a1.length;i++)
	{
		int g=i-1;
		if(nextcount>precount)
		{
			precount=nextcount;
			nextcount=0;
			e=a1[g];
		}
		  else
		  {
			  nextcount=0;
			  }
		
for(int j=0;j<a1.length;j++)
{
	
		if(a1[i]==a1[j])
	{
	
		 nextcount++;
	 }

}
	}
	System.out.println(e);
}
static int maxOccourElement(int [] arrayinput){
	Arrays.sort(arrayinput);
	int precount=0,nextcount=0,index=0;
	
		for(int i=0;i<arrayinput.length;i++){
				if(precount<nextcount){
					precount=nextcount;
					nextcount=0;
					index=Arrays.binarySearch(arrayinput, arrayinput[i]);}
				else{nextcount=0;}
			for(int j=0;j<arrayinput.length;j++){
				if(arrayinput[i]==arrayinput[j]){
				nextcount++;}
					
		}
	}
	return arrayinput[index];
}
}
