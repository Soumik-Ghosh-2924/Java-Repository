import java.util.*;
public class p1 
{
	static int gbit(int a, int b) 
	{
		int bitmask;
		bitmask=1<<b;
		int getn=bitmask & a;
		
		return getn;
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the index u wnt to get :");
		int i=sc.nextInt();
		System.out.println("Enter the number : ");
		int n= sc.nextInt();
		
		int x= gbit(n,i);	
		if(x>0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
		
	}

}
