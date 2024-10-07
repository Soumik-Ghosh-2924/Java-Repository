package TCS_NQT;
import java.util.*;
public class p3 
{

    static int findsecmax(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int a: arr)
        {
            if(a>max)
            {
                smax=max;
                max=a;
            }
            else if (a>smax && a<max)
            {
                smax=a;
            }
        }

        return smax;
    }


    static int findsecmin(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;

        for(int x : arr)
        {
            if(x<min)
            {
                smin=min;
                min=x;
            }
            else if (x<smin && x>min)
            {
                smin=x;
            }
        }
        return smin;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]= new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int secondsmallest=findsecmin(arr);
        int secondlargest=findsecmax(arr);

        System.out.println("The second smallest element in the array is : "+ secondsmallest);
        System.out.println("The second largest element in the array is : "+secondlargest);

        sc.close();

    }
    
}
