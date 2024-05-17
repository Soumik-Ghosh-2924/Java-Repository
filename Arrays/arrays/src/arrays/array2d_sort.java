package arrays;
import java.util.*;
public class array2d_sort 
{
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean swapped=false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}	
			}
			if(swapped==false)
				break;
		}
	}
	
	
	public static void print(int arr[])
	{
		for(int a=0;a<arr.length;a++)
		{
			System.out.print(arr[a] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dimensions of the 2-d array : ");
		int m=s.nextInt();
		int n=s.nextInt();
		
		int a[][]= new int[m][n];
		
		for(int x=0;x<m;x++)
		{
			for(int y=0;y<n;y++)
			{
				a[x][y]=s.nextInt();				
			}
		}	
		
		
		for(int x=0;x<m;x++)
		{
			for(int y=0;y<n;y++)
			{
				sort(a[x]);
			}
			print(a[x]);
		}
	}	

}

	
