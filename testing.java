import java.util.Arrays;
import java.util.Scanner; 

public class testing {
	
	
	 static int[] sort( int b[],int m)
	{
		int temp=0;
		int i;
		
		 for( i=0;i<m;i++)
		 {
			 for(int j=i+1;j<m;j++)
			 {  if(b[i]>b[j])
			 {
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			 }
			 }
			 
		 }
		
		
		return b;
		
		
	}
	 

	public static void main(String[] args) {
		try {
		int n;
		
		Scanner sr=new Scanner(System.in);
		n=sr.nextInt();
		int a[]=new int[n];
		
		 int m=0;
		
		System.out.print("enter the elements in array =");
		
		for(int i=0;i<5;i++)
		{
			a[i]=sr.nextInt();
		}
		sort(a,n);
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	
	}

}
