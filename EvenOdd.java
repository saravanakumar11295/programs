package com.ios;

import java.util.Scanner;

public class EvenOdd {
	static void  evenodd(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+((i%2==0)?(i-1):(i+1)));
					
		}
				
				
			}
		
	
 public static void main(String args[])
 {
	 int i=10;
	 evenodd(i);
	 
 }
}
