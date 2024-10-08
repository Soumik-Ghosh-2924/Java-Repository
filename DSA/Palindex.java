package DSA;
import java.util.*;
public class Palindex 
{

    public static boolean checkPal(int x)
    {
        int sum=0;
        int y=x;
        while(y>0)
        {
            int d=y%10;
            sum=sum*10+d;
            y=y/10;
        }

        return sum==x;
    }

    public static List<Integer> find_index(int arr[])
    {
        int n=arr.length;
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(checkPal(arr[i]))
            {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String args[])
    {
        int arr[]={291,121,265,767,11,86,919};

        List<Integer> ans = find_index(arr);
        System.out.println("The palindromes are present at indices : ");
        for(int i :ans)
        {
            System.out.print(i + "  ");
        }

    }
    
}
