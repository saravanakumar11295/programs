package com.ios;

public class contains {
	public static int sumarray(int a[],int b)
	{
		int result=0;
		for(int i=0;i<b;i++)
		{
			for(int j=i;j<b;j++)
			{
				for(int k=i;k<=j;k++)
				{
					result+=a[k];
				}
			}
		}
	return result;
	}
public static void main(String[] args) 
{  
		
		int n[]= {1,2,3};
		int len=n.length;
		int c=sumarray(n,len);
		System.out.println(c);
		}
   }  

	
	
			
	

