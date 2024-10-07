package TCS_NQT;
import java.util.*;

public class p2 
{
    static int findlargest(int arr[])
    {
        int largest=Integer.MIN_VALUE;

        for(int x: arr)
        {
            if(x>largest)
            {
                largest=x;
            }
        }
        return largest;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("What's the size of the array ?");
        int size=sc.nextInt();
        int array[]=new int[size];
        
        System.out.println("Enter the elements in the array : ");
        for(int i=0 ;i<size;i++)
        {
            array[i]=sc.nextInt();
        }

        int largest=findlargest(array);
        System.out.println("The largest element in the array is : "+largest);
        sc.close();
    }
    
}
