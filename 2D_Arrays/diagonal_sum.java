package Patterns;
import java.util.*;
public class diagonal_sum 
{
	static int DiagonalSum(int [][]a)
	{
		int sum=0;
		int pd=0;
		int sd=0;
		int dim=a.length;
		if(dim==1)
		{
			sum=a[0][0];
		}
		for(int i=0;i<dim;i++)
		{
			for(int j=0;j<dim;j++)
			{
				if(i==j)
				{
					pd+=a[i][j];;
				}
			}
		}
		int k=0;
		int l=dim-1;
		while(k<=dim-1 && l>=0)
		{
			sd+=a[k][l];
			k++;
			l--;
		}
		
		sum=pd+sd;
		
		if(dim%2==1)
		{
			sum=sum-a[dim/2][dim/2];
		}
		return sum;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the dimensions of the square matrix :");
		int m=sc.nextInt();
		int [][]mat =new int[m][m];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		int res=DiagonalSum(mat);
		sc.close();
		
		
		System.out.println(res);		
	}
}
