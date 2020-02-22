import java.util.Scanner;

public class printnum {
	public static void printpyramind(int a)
	{
		int num=1;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num);
				num+=num;
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		
		int n;
		System .out.print("enter the values =" );
		Scanner sr=new Scanner(System.in);
		n=sr.nextInt();
		printpyramind(n);
			

	}

}
