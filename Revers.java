package com.ios;

public class Revers {
	public static void printarray(int a[],int n)
	
	{
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
	
 public static void main(String args[])
 {
	 int arr[]= {1,2,3,4,5};
	 int len=arr.length;
	// System.out.print(len);
	 printarray(arr,len);
 }
}
