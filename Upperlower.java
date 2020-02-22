package lives;

public class Upperlower {

	public static void main(String[] args) {
		String s1="x.AllWiN"; 
		char[] s=s1.toCharArray();
		int l=s.length;
for(int i=0;i<l;i++)
{
	if((s[i]>=65)&&(s[i]<97))
	{
		int s21=s[i]+32;
		char le=(char)s21;
		System.out.print(le);
	}
	else if((s[i]<=122)&&(s[i]>=97))
	{
		int s3=s[i]-32;
		char les=(char)s3;
		System.out.print(les);
	}
	else
	{
		char e=(char)s[i];
		System.out.print(e);
	}
}
	}

}
