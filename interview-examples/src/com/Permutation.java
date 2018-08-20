package com;

import java.util.Arrays;

public class Permutation
{
static	int i;static int j;
static void prem(int[] a,int k ,int n){
	
	if(k==n){
		for(j=0;j<n;j++){
			System.out.print(a[j]);
						}
		System.out.println();
			}
	else{
		for(i=k;i<n;i++){
			int t=a[k];a[k]=a[i];a[i]=t;
			prem(a,k+1,n);
			t=a[k];a[k]=a[i];a[i]=t;
		}
		}
}
static void per(int [] a){
	
	for(i=0;i<a.length;i++){
		System.out.print(a[i]);
			per2(a);
			//a[j]=a[j+1];a[j+1]=a[j];
		}}
	
static void per2(int [] a){
	for(j=0;j<a.length;j++){
		System.out.print(a[j]);
		}j=0;
	System.out.println();
		
	//System.out.print(a[i]);
	int t=a[j]=a[j+1];a[j+1]=t;
	for(int j=1;j<a.length;j++){
		System.out.print(a[j]);
		}
	System.out.println();

	}
public static void main(String[] args)
{
int [] a={1,2,3};
per(a);
}
}
