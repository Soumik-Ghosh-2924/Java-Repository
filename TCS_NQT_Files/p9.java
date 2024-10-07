package TCS_NQT;
import java.util.*;

public class p9 
{
    static boolean isSubset(int arr[], int sub[])
    {

        HashSet<Integer> s =  new HashSet<>();
        for(int x : arr)
        {
            s.add(x);
        }

        for(int a : sub)
        {
            if(!s.contains(a))
            {
                return false;
            }
        }

        return true;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your array size ? ");
        int size= sc.nextInt();
        System.out.println("What's the size of your sub array ?");
        int len=sc.nextInt();
        int arr[]= new int [size];
        int sub[]= new int[len];

        System.out.println("Enter the elements of the main array : ");
        for(int i =0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the elements of the sub-array : ");
        for(int j=0;j<len;j++)
        {
            sub[j]=sc.nextInt();
        }


        boolean checkSubset= isSubset(arr, sub);

        if(checkSubset)
        {
            System.out.println("Yes, it is a subset of the original array.");
        }
        else
        {
            System.out.println("No, it is not a subset of the original array.");
        }


        sc.close();
    }
    
}
