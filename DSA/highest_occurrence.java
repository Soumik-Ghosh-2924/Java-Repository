package DSA;
import java.util.*;
public class highest_occurrence 
{

    static int frequency(int arr[])
    {
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int x: arr)
        {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int threshold=arr.length/4;
        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            if(e.getValue()>threshold)
            {
                return e.getKey();
            }
        }

        return -1;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,5,2,1,3,5,5};
        int result=frequency(arr);

        System.out.println("The element with the highest frequency is : "+result);

    }
    
}
