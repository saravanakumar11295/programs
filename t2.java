import java.util.Scanner;

public class t2 {

	   public static void main(String args[])
	   {
		   int ar[]=new int[10];
		   int n;
		   int i,j,k;
		   Scanner sr=new Scanner(System.in);
		   System.out.print("enter array size");
		   n=sr.nextInt();
		  
		   for(i=0;i<n;i++) 
		   {
			ar[i]=sr.nextInt();   
		   }
		   for(i=0;i<n;i++) 
		   {
			   System.out.println("enter the elements in array ="+ar[i]);   
		   }
		   for(i=0;i<n;i++)
		   {
			   for(j=i+1;j<n;)
			   {
				   if(ar[i]==ar[j])
				   {
					   for(k=j;k<n;k++)
					   {
						   ar[k]=ar[k+1];
					   }n--;
				   }
				   else 
					   {
						   j++;
					   }
							  
				   }
			   }
		         for(i=0;i<n;i++) 
		            {
			   System.out.println("removed dupilcate values ="+ar[i]);
		            }
		   
	   }
}
