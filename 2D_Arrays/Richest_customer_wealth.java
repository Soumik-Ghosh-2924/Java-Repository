package Patterns;
import java.util.*;
public class Richest_customer_wealth
{
	static int[] richest_cwealth(int [][]a)
	{
		int rich=Integer.MIN_VALUE;
		int m=a.length;
		int n=a[0].length;
		int row_index=-1;
		int b[]=new int[2];
		for(int i=0;i<m;i++)
		{
			int current=0;
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==1)
				{
					current+=1;
				}
			}
			if(current>rich)
			{
				rich=current;
				row_index=i;
			}
			else if(current==rich && row_index==-1 )
			{
				row_index=i;
			}
		}
		b[0]=row_index;
		b[1]=rich;
		
		return b;		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the dimensions of the square matrix :");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int [][]mat =new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		int res[]=new int[2]; 
		res=richest_cwealth(mat);
		sc.close();
		
		
		System.out.println(res[0]);
		System.out.println(res[1]);
		
	}
}
