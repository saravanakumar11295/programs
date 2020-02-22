package lives;

public class Deletearray {

	public static void main(String[] args) {
	int a[]= {2,5,6,7,4,5,8};
	int n=a.length;
	//System.out.println(n);
	int value=5;int i=0;
	for( i=0;i<n;i++)
	{
		if(a[i]==value)
		{
			for(int k=i;k<n-1;k++)
			{
				a[k]=a[k+1];
				
			}n--;
			i--;
		}
	}
	System.out.println(i);
	
	System.out.println(n);
	for(int j =0;j<n;j++)
	{
		System.out.print(a[j]);
	}

	}

}
