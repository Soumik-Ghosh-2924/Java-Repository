import java.util.*;
public class p4update 
{
	static int update(int n, int k)
	{
		int bitmask,val;
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		if(x==0)
		{
			bitmask=1<<k;
			val=~(bitmask);
			int res=val & n;
			return res;
		}
		else if (x==1)
		{
			bitmask=1<<k;
			int res=bitmask | n;
			return res;
		}
		else
		{
			return-1;
		}
	}
	
	public static void main(String args[])
	{
		int n=5;
		int i=1;
		int r=update(n,i);
		System.out.println(r);
		
	}

}
