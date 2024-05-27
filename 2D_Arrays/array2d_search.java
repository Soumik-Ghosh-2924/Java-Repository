
package arrays_2d;
import java.util.*;
public class array2d_search 
{
	static boolean existence(int arr[][], int key)
	{
		int rows=arr.length;
		int columns=arr[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(arr[i][j]==key)
				{
					System.out.println("The element is present at row = "+i+" & column = "+j);
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns; ");
		int n=sc.nextInt();
		int arr[][]=new int [m][n];
		
		System.out.println("Enter the elements in the matrix: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++) 
			{
				arr[i][j]=sc.nextInt();				
			}
		}
		
		System.out.println("Enter the ky to be searched : ");
		int key=sc.nextInt();
		boolean find=existence(arr,key);
		
		if(find)
		{
			System.out.println("Thus the element is present.");
		}
		else
		{
			System.out.println("Thus the element is not present.");
		}
		
		sc.close();
	}

}
