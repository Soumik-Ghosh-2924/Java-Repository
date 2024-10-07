package TCS_NQT;
import java.util.*;

public class p5 
{
    static void countfrequency(int arr[])
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : arr)
        {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        System.out.println("Key     ->      Frequency");
        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey()+"     -->         "+ e.getValue());
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your array size ? ");
        int size=sc.nextInt();

        int array[]= new int [size];

        System.out.println("Enter the elements of the array : ");

        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        countfrequency(array);
        sc.close();

    }
    
}
