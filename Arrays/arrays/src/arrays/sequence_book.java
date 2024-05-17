package arrays;
import java.util.*;
public class sequence_book 
{
	public static int[] sequence(int f, int d)
	{
		int a[]= new int[20];
		a[0]=f;
		int sum=0;
		for(int i=1;i<20;i++)
		{
			sum=a[i-1]+d;
			a[i]=sum;
		}
		return a;
	}
	
	public static void print(int arr[])
	{
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+"  ");
		}
		System.out.println();
	}
	
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first element : ");
		int first = s.nextInt();
		System.out.println("Enter the difference : ");
		int diff= s.nextInt();
		
		int x[]= new int [20];
		
		x=sequence(first,diff);
		
		print(x);
		
	}

}
