package TCS_NQT;
import java.util.*;

public class p1 
{
    static int findsmallest(int arr[])
    {
        int smallest=Integer.MAX_VALUE;
        for(int x : arr)
        {
            if(x<smallest)
            {
                smallest=x;
            }
        }

        return smallest;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int array[]= new int[6];
        for(int i=0;i<6;i++)
        {
            array[i]=sc.nextInt();
        }


        int smallest= findsmallest(array);

        System.out.println("The smallest element in the array is : "+smallest);
        sc.close();

    }
    
}
