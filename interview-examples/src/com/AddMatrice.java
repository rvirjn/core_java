/**
     *Add two matrices
     */
package com;

import java.util.Arrays;

public class AddMatrice
{

	
	
	public static void main(String[] args)
	{
		int[][] a={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int[][] b={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};

		
		System.out.println(Arrays.deepToString(addMatrice( a,b )));
	}
	private static int[][] addMatrice(int[][] a, int[][] b)
	{
		int result[][]=new int[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				result[i][j]=a[i][j]+b[i][j];
			}
		}
		return result;
	}
}
