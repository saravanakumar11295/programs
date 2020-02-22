package com.ios;

import java.util.Scanner;

public class indexs {
	

	public static void main(String[] args) {
		System.out.print("enter the value in index =");
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int arr[]=new int[10];
		for(int i=0;i<n;)
		{
			System.out.print("enter the values in array["+i+"] =");
			arr[i]=sr.nextInt();
			i++;
		}
		System.out.print("enter the postion to insert the values =");
		int postion=sr.nextInt();
		System.out.print("enter the value to insert into an array =");
		int value=sr.nextInt();
		for(int i=n-1;i>postion-1;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[postion-1]=value;
		for(int i=0;i<=n;i++)
		{
			System.out.println("enter the values in array["+i+"] = "+arr[i]);
		}
		
		}

}
