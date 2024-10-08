package DSA;
import java.util.*;
public class Accenture_magicalN 
{ 
    public static List<Integer> toBin(int N)
    {
        List<Integer> l = new ArrayList<>();
        while(N>0)
        {
            int r=N%2;
            l.add(r);
            N/=10;
        }

        Collections.reverse(l);
        return l;
    }

    public static int countZ(List<Integer> list)
    {
        int count=0;
        for(int i=0;i<list.size();i++)
        {   
            if(list.get(i)==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        int magic=0;
        for(int i=1;i<=n;i++)
        {
            ans=toBin(i);
            int ct=countZ(ans);
            if(ct%2==1)
            {
                magic++;
            }
            else
            {
                continue;
            }
        }

        System.out.println("There are "+ magic + " magic numbers in the range.");

    }
    
}
