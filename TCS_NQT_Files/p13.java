package TCS_NQT;
import java.util.*;
public class p13
{
    static int factorial(int n)
    {
        if(n==0) return 1;
        if(n<=1)
        {
            return n;
        }

        return n*factorial(n-1);
    }

    static int factorialsum(int a)
    {
        int ary= a;
        int sum=0;
        while(ary>0)
        {
            int r =ary%10;
            sum+=factorial(r);
            ary/=10;
        }

        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue : ");
        int n=sc.nextInt();

        int array[]= new int[n];

        for(int i=0;i<n;i++)
        {
            while(true)
            {
                System.out.println("Enter your numbers.");
                array[i]=sc.nextInt();
                if(array[i]>=0)
                {
                    break;
                }
                else{
                    System.out.println("Only positive numbers are allowed.");
                }
            }
            
        }
        ArrayList<Integer>List= new ArrayList<>();

        for(int j=0;j<n;j++)
        {
            int k=factorialsum(array[j]);
            if(k==array[j])
            {
                List.add(array[j]);
            }
        }

        if(List.size()>0)
        {
            System.out.println("The Strong numbers in the queue are : "+List);
        }
        else{
            System.out.println("There are no Strong numbers in the queue.");
        }
        sc.close();
    }
}