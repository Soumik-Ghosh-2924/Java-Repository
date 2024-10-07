package TCS_NQT;
import java.util.*;

public class p4 
{

    static int[] reverse(int arr[])
    {
        int a=0;
        int len=arr.length;
        int x[]=new int[len];
        for(int i=len-1;i>=0;i--)
        {
            x[a++]=arr[i];
        }

        return x;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("What's your array size ?");
        int size=sc.nextInt();
        int array[]= new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        
        System.out.println("The elements of the array initially : ");
        for(int z : array)
        {
            System.out.print(z+" ");
        }
        int n[]=reverse(array);
        System.out.println();
        System.out.println("The elements of the array after reversing the array is : ");
        for(int  y : n)
        {
            System.out.print(y+" ");
        }
        sc.close();

    }
    
}
