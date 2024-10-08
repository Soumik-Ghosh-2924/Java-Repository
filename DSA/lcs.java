package DSA;

public class lcs 
{
    public static int longest(String s1, String s2)
    {

        if(s2.length()==0 || s2==null)
        {
            return 0;
        }
        int m=s1.length(),n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=n;i++)
            dp[0][i]=0;
        for(int i=0;i<=m;i++)
            dp[i][0]=0;   
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);    
            }
        }  
        return dp[m][n];   

    }

    public static void main(String args[])
    {
        String s1="longest";
        String s2="stone";

        int res=longest(s1,s2);
        System.out.println("the longest common subsequence is of length : "+res);
    }
    
}
