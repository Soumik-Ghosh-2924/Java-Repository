package TCS_NQT;
import java.util.*;
public class p10 
{
    static void printOccurrences(int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr)
        {
            map.put(x, map.getOrDefault(x,0)+1);
        }

        // for(Map.Entry<Integer, Integer> e : map.entrySet())
        // {
        //     System.out.println(e.getKey()+"     "+e.getValue());
        // }

        for(int a : map.keySet())
        {
            System.out.println(a+" occurs "+map.get(a)+" times.");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[]= new int[n];

        for(int i =0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }

        printOccurrences(array);
        sc.close();

    }
    
}
