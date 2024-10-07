package TCS_NQT;
import java.util.*;

import DSA.lcs;
public class p8 
{
    static ArrayList<Integer> removeDuplicates(int array[])
    {
        ArrayList<Integer> List = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int c : array)
        {
            map.put(c, map.getOrDefault(c,0 )+1);
        }
        
        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            if(e.getValue()==1)
            {
                List.add(e.getKey());
            }
        }

        return List;
    }
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=  sc.nextInt();
        int array[]= new int [size];

        System.out.println("Enter the elements of the array : ");
        for(int i =0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans = removeDuplicates(array);
        System.out.println("After removing the duplicates the elements in the array are : ");
        for(int x : ans)
        {
            System.out.print(x+" ");
        }

        sc.close();
    }
    
}
