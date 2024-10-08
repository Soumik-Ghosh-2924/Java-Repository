package DSA;

public class finding_missingnum 
{
    public static int missingnum(int arr[], int n)
    {
        int i,sum1=(n*(n+1))/2,sum2=0;
        for(i=0;i<arr.length;i++)
        sum2+=arr[i];
        int c=sum1-sum2;
        return c;
    } 

    public static void main(String args[])
    {
        int arr[]={1,2,4,5};
        int n=5;

        int res=missingnum(arr, n);

        System.out.println(res+ "is the missing number.");
    }
    
}
