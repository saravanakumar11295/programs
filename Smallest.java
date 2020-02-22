package com.ios;

public class Smallest {

	public static void main(String[] args) {
		int arr[]= {23,65,98,32,-67,87,95,-21,2,4,9};
		int len =arr.length;
		int smallest =arr[0];
		int laregest =arr[0];
		 for(int i=1;i<len;i++)
		 {
			 if(arr[i]<smallest)
			 {
				 smallest=arr[i];
		      }
			if(arr[i]>laregest)
			{
				laregest=arr[i];
			}
		 }
		 System.out.print(smallest+" ");
		System.out.println(laregest+" ");

	}

}
