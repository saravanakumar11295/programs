package com.ios;

import java.util.Scanner;

public class diamond {
	public static void diamonds(int a)
	{
	  for(int i=1;i<=a;i++)
	  {
		  for(int j=a-1;j>=i;j--) 
		  {
			System.out.print(" ");  
		  }
		  for(int k=0;k<i;k++)
		  {
			  System.out.print("* ");
		  }System.out.println();
	  }
	}

	public static void main(String[] args) {
	System.out.print("print the diamond =");
	Scanner sr=new Scanner(System.in);
	int n=sr.nextInt();
	diamonds(n);
	}

}
