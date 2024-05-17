import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class p2 
{
	static int count_border( char arr[][], int x, int y)
	{
		int i,j,a,b;
		a=x;
		b=y;
		int hash=0;
		ArrayList <Integer>list= new ArrayList<Integer>();
		
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				if(arr[i][j]=='#')
				{
					hash+=1;
				}
			}
			list.add(hash);
		}
		return Collections.max(list);
	}
	
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int i,j,k;
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();

        char arr [][] = new char[x][y];
        for(i=0;i<n;i++)
        {
            
            for(j=0;j<x;j++)
            {
                for(k=0;k<y;k++)
                {
                    arr[x][y]=sc.next().charAt(0);
                }
            } 
        }
        
        int z = count_border(arr, x,y);
        System.out.println(z);
        
    }
}
