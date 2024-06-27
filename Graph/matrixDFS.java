import java.util.*;
public class matrixDFS
{
	static final int [][]directions = {
			{0,1},
			{1,0},
			{0,-1},
			{-1,0}
	};
	
	static void dfs(int matrix[][], boolean visited[][], int r, int c)
	{
		if(r<0 || r>=matrix.length || c<0 || c>=matrix[0].length || visited[r][c])
		{
			return ;
		}
		visited[r][c]=true;
		System.out.print(matrix[r][c] + " -> ");
		for(int dir[] : directions)
		{
			int nrow=r+dir[0];
			int ncol=c+dir[1];
			dfs(matrix, visited,nrow,ncol);
		}
	}
	
	static void dfs_traversal(int matrix[][])
	{
		if(matrix==null || matrix.length==0)
			return ;
		boolean [][]visited= new boolean[matrix.length][matrix[0].length];
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(!visited[i][j])
				{
					dfs(matrix, visited, i, j);
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		int matrix[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		dfs_traversal(matrix);
	}
}