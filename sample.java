import java.util.Arrays;
import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		int a[]= new int[5];
		int n;
		
	    Scanner sr=new Scanner(System.in);
		System.out.println("sort the given elements ");
		for(int i=0;i<5;i++)
		{
			System.out.print("enter the array=" );
		 a[i]=sr.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		//System.out.println(a[i]);
		//Arrays.sort(a);
		//System.out.println(a);
		

	}

}
