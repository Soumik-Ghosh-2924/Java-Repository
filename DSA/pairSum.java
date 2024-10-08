package DSA;

import java.util.*;

class Pair
{
    int item1;
    int item2;
    Pair(int i, int j)
    {
        this.item1=i;
        this.item2=j;
    } 
}


public class pairSum
{
    public static List<Pair> findpair(int arr[], int k )
    {
        List<Pair> ans = new ArrayList<>();
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==k)
            {
                ans.add(new Pair(arr[left],arr[right]));
                left++;
                right--;
            }
            else if(sum<k)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return ans;

    }


    public static void main(String args[])
    {
        int arr[]={1,2,3,3,4,5,6};
        int k=6;

        List<Pair> result = new ArrayList<>();

        result=findpair(arr,k);

        for(Pair p : result)
        {
            System.out.println(p.item1 +" , "+ p.item2);
        }
    }


}