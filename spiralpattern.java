package com.ios;

import java.util.Scanner;

public class spiralpattern {
	public static void spiral(int b[][],int c)
	
	{
		int value=1,R1=0,R2=c-1,c1=0,c2=c-1,temp=0;
		while(value<=c*c)
		{
			for(int i=c1;i<=c2;i++ )
			{
				b[R1][i]=value;
				//temp=b[R1][i];
				System.out.print(b[R1][i]+" ");
				value++;
			}System.out.println();
		}
		
		
	}
public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int a[][]=new int[n][n];
		spiral(a,n);
	
		

	}

}
