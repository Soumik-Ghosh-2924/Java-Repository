package TCS_NQT;
import java.util.*;
public class p12 
{
    static boolean checkPalindrome(int x)
    {
        int num=x;
        int d=0;
        while(num>0)
        {
            int r= num%10;
            d=d*10+r;
            num=num/10;
        }

        return d==x;
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count=0;
        for(int i=A; i<=B;i++)
        {
            if(checkPalindrome(i))
            {
                count++;
                System.out.print(i+" , ");
            }
        }

        System.out.println("The number of palindromes between M and N : "+count);

        sc.close();
    }
    
}
