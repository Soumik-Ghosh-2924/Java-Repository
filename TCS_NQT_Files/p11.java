package TCS_NQT;
import java.util.*;
public class p11 
{
    static boolean perfect(int n)
    {
        if(n<=0)
        {
            return false;
        }
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }

        return sum==n;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();

        if(perfect(n))
        {
            System.out.println("Perfect Number.");
        }
        else{
            System.out.println("Not a perfect number.");
        }

        sc.close();
    }
    
}
