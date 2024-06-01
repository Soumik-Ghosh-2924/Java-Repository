package arrays_2d;
import java.util.*;


public class Solution
{
    static int max_sum_hourglass(int [][]n)
    {
        int current=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                current=n[i][j]+n[i][j+1]+n[i][j+2]+n[i+1][j+1]+n[i+2][j]+n[i+2][j+1]+n[i+2][j+2];
                
                max_sum=Math.max(current,max_sum);
            }
        }
        
        return max_sum;
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[][]= new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j]=sc.nextInt();
                System.out.print(" ");
            }
            System.out.println();
            
        }
        
        int res=max_sum_hourglass(arr);
        System.out.println(res);
        
        sc.close();
        
    }
}
