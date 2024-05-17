import java.util.*;  //from leetcode solutions
public class Split_a_string_in_Balanced_Strings 
{
	public static int balancedStringSplit(String s) 
	{
        int ans = 0, l = 0;
        for (char c : s.toCharArray()) 
        {
	            if (c == 'L') 
	            {
	                ++l;
	            } else 
	            {
	                --l;
	            }
	            if (l == 0) 
	            {
	                ++ans;
	            }
	        }
	        return ans;
	    }
	
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		
		int k= balancedStringSplit(s);
		
		System.out.println(k);
		
		sc.close();
		
	}
}

