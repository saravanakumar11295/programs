package lives;

public class programs {
static void pgm(char a[],int len)
{
	int px=0,py=len-1;
	for(int i=0;i<len;i++)
	{
		for(int j=0;j<len;j++)
		{
			if(j == px || j == py)
			{
				System.out.print(a[j]);
				
			}
			else
			{
				System.out.print(" ");
			}
		}System.out.println();
		px++;
		py--;
	}
		
}
	public static void main(String[] args) {
		String s1="program"
				+ "";
		char[] st=s1.toCharArray();
		int l=st.length;
		System.out.println(l);
		pgm(st,l);
		
		}

	}


