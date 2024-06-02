package Patterns;


/*This is the Question: Leetcode 1582
Given an m x n binary matrix mat, return the number of special positions in mat.
A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
*/


import java.util.*;
public class special_positions_inabinarymatrix 
{
	public static boolean isSpecial(int [][]mat, int row, int col)
	{
		//to check that all other elements in the row are zero
		for(int j=0;j<mat[0].length;j++)
		{
			if(j!=col && mat[row][j]==1)
				return false;
		}
		
		
		//to check all other elements in the column are zero
		for(int i=0;i<mat.length;i++)
		{
			if(i!=row && mat[i][col]==1)
				return false;
		}
		
		return true;
	}
	
	
	public static int no_of_positions(int [][]mat)
	{
		int flag=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				if(mat[i][j]==1 && isSpecial(mat,i,j))
				{
					flag+=1;
				}
			}
		}
		return flag;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the dimensions of the array : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Enter the matrix: ");
		int [][]matrix=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		int no_ofspecialpos=no_of_positions(matrix);
		
		sc.close();
		System.out.println("There are "+no_ofspecialpos+" such positions.");
		
	}

}
