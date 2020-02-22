import java.util.Scanner;

public class pyramids {
	public static void printpyramind(int a)
	{
		for(int i=0;i<a;i++)
		{
			for(int j=a-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int z=0;z<=i;z++)
			{
				System.out.print("* ");
			}
               System.out.println();
			
		}
	}
	public static void main(String args[])
	
	{
		int n;
		System .out.print("enter the values =" );
		Scanner sr=new Scanner(System.in);
		n=sr.nextInt();
		printpyramind(n);
		
	}

}
