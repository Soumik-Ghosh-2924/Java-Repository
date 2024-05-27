package arrays_2d;
import java.util.*;
public class transpose 
{
	static void transpose_matrix(int arr[][])
	{
		int rows = arr.length;
		int columns=arr[0].length;
		for(int j =0;j<columns;j++)
		{
			for(int i=0;i<rows;i++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void enter_elements(int arr[][])
	{
		Scanner sc = new Scanner(System.in);
		int rows=arr.length;
		int columns= arr[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
	}

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns :");
		int n=sc.nextInt();
		
		int matrix[][]	= new int [m][n];
		
		System.out.println("Enter the elements of the matrix :");
		enter_elements(matrix);
		
		sc.close();
		
		System.out.println();
		System.out.println();
		System.out.println("Here's your transpose of the matrix  :");
		transpose_matrix(matrix);
	}

}
