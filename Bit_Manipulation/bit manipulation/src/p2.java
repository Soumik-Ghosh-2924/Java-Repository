import java.util.*;
public class p2 
{
	static int sbit(int n, int i)
	{
		int bitmask=n<<i;
		int x=bitmask | n;
		return x;
		
	}
	
	static int[] to_binary(int k)
	{
		int arr[]= new int[10];
		int l;
		int i=0;
		while(k>0)
		{
			l=k%2;
			k=k/2;
			arr[i]=l;
			i++;
		}
		int x,y;
		int a1[] = new int[3];
		for(x=0,y=2;x<3 && y>=0;x++,y--)
		{
			a1[x]=arr[y];
		}
		
		return a1;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the index u want to change :");
		int i=sc.nextInt();
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int r=sbit(n,i);
		int []res=new int [10];
		res=to_binary(r);
		
		for(int i1=0;i1<res.length;i1++)
		{
			System.out.print(res[i1]);
		}
		
		System.out.print( "  " + r);
	
	}

}
