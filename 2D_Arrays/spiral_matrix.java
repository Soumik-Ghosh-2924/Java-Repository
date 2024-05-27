package arrays_2d;

import java.util.Scanner;

public class spiral_matrix 
{
	
	static void print_spiral(int arr[][])
	{
		int rows=arr.length;
		int columns=arr[0].length;
		int row_start=0;
		int col_start=0;
		int row_end=rows-1;
		int col_end=columns-1;
		
		while(row_start<=row_end && col_start<=col_end)
		{
			for(int i=col_start;i<=col_end;i++)
			{
				System.out.print(arr[row_start][i]+" ");
			}
			row_start++;
			
			
			for(int i=row_start;i<=row_end;i++)
			{
				System.out.print(arr[i][col_end]+" ");
			}
			col_end--;
			
			
			for(int i=col_end;i>=col_start;i--)
			{
				System.out.print(arr[row_end][i]+" ");
			}
			row_end--;
			
			
			for(int i=row_end;i>=row_start;i--)
			{
				System.out.print(arr[i][col_start]+" ");
			}
			col_start++;
			
			
			System.out.println();
			
		}
	}
	
	
	static void enter_elements(int arr[][])
	{
		Scanner sc= new Scanner(System.in);
		int rows=arr.length;
		int columns=arr[0].length;
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
		
		System.out.println("Here's the spiral matrix :");
		print_spiral(matrix);
	}

}
