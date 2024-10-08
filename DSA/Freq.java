package DSA;
import java.util.*;
public class Freq 
{
    public static  int highestFreq(String s)
    {
        char ch[]=s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        int maxF=0;
        for(char c : ch)
        {
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)>maxF)
            {
                maxF=map.get(c);
            }
        }

        // List<Integer> f= new ArrayList<>();
        // for(Map.Entry<Character, Integer> m : map.entrySet())
        // {
        //     f.add(m.getValue());
        // }

        // Collections.sort(f);
        // return f.get(f.size()-1);
        return maxF;
    }

    public static void main(String[] args) 
    {
        String s="Soumik Ghosh";
        int high=highestFreq(s);

        System.out.println("The highest frequency is : " + high);

    }
}