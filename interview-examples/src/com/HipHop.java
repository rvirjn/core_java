/**
     *HipHop remove char between h and p
     */
package com;

import java.util.Arrays;

public class HipHop
{
	
    public static String hipHop(String str){       
    		String result=""; 
         	
    		int i=str.indexOf('h');
      		int j=str.indexOf('p');       	
      		result=result+str.charAt(i)+str.charAt(j);
      		
      		String afterP=((str.substring(j+1)));
      		int k=afterP.indexOf('h');
         	int l=afterP.lastIndexOf('p');

         	result=result+afterP.substring(0,k);
         	result=result+afterP.charAt(k)+afterP.charAt(l);
         	
         	return result;  
        }

	public static void main(String []args){
    	System.out.println( hipHop("hipZhop"));
        System.out.println( hipHop("hophop"));
       System.out.println( hipHop("hihapophop"));
    }
}

