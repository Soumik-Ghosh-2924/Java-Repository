package TCS_NQT;
import java.util.*;
public class p6 
{
    static void rearrange(int arr[])
    {
        int len=arr.length;

        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        } 
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your array size?");
        int size=sc.nextInt();

        int array[]= new int[size];

        System.out.println("Enter the elements of the array?");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }

        rearrange(array);
        System.out.println("The elements of the array in the descending order is :");
        for(int z : array)
        {
            System.out.print(z+" ");
        }
        sc.close();
    }
    
}
