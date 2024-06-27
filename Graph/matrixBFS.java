import java.util.*;
public class matrixBFS 
{
	static final int directions[][]= {
			{0,1},
			{1,0},
			{0,-1},
			{-1,0}
	};
	
	static void bfs(int matrix[][], boolean visited[][], int r, int c)
	{
		if(matrix==null || matrix.length==0 || visited[r][c])
		{
			return ;
		}
		visited[r][c]=true;
		
		Queue<int []> result = new LinkedList<>();
		result.offer(new int[] {r,c});
		
		while(!result.isEmpty())
		{
			int [] current =result.poll();
			int i=current[0];
			int j=current[1];
			System.out.print(matrix[i][j]+" ");
			
			for(int dir[] : directions)
			{
				int nrow=i+dir[0];
				int ncol=j+dir[1];
				
				if(nrow>=0 && nrow<matrix.length && ncol>=0 && ncol<matrix[0].length && !visited[nrow][ncol])
				{
					result.offer(new int[] {nrow,ncol});
					visited[nrow][ncol]=true;
				}
			}
		}
	}
	
	
	static void bfs_traversal(int matrix[][])
	{
		if(matrix==null|| matrix.length==0)
			return ;
		
		
		boolean visited[][]= new boolean[matrix.length][matrix[0].length];
		
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(!visited[i][j])
				{
					bfs(matrix, visited,i,j);
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
		
		bfs_traversal(matrix);
	}

}
