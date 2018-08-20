/**
     *Sum of elements of an array  
     */
package com;
import java.util.ArrayList;


    public class ArrayListSumElements {
       
        public static void main(String args[]){
           
            //create new ArrayList
            ArrayList<String> aListNumbers = new ArrayList<String>();
            aListNumbers.add("1");
            aListNumbers.add("2");
            aListNumbers.add("3");
           
            //Java ArrayList Sum All Elements
           
            int sum = 0;
            for(int i=0; i < aListNumbers.size(); i++){
                sum = sum + Integer.parseInt(aListNumbers.get(i));
            }
               
            System.out.println("Sum of all elements of ArrayList is " + sum);
        }
    }

