import java.util.Scanner;

public class arr 
{
		    public static void main(String args[]) 
		    { 
		        int a[]=new int[10];
		        int i,n;
		        Scanner sr=new Scanner(System.in);
		        n=sr.nextInt();
		        System.out.println("elements in array="+n);
		        
		           for( i=0;i<5;i++)
		                {
		        	     System.out.print("enter value for array["+i+"]-" );
		        	     a[i]=sr.nextInt();
		        	    }
		           System.out.print("entre the pos=");
		           int pos=sr.nextInt();
		           System.out.print("entre the values=");
		           int values=sr.nextInt();
		           
		           for(i=n-1;i>=pos-1;i--)
		           {
		        	   a[i+1]=a[i];
		           }
		           a[pos-1]=values;
		           System.out.println("array after inserting elements");
		           for(i=0;i<=n;i++)
		           {
		        	   System.out.println(a[i]);
		           }
		           
		           
		        
		        
		        
		         }
		        
		
 
	}
		    
		    	
		    


