/*import java.util.Scanner;

public class longest_substring {

    static int[] max_length(String s) {
        int[] x = new int[2];
        int longest = 0, start = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Check for odd length palindromes
            int l = i, h = i;
            while (l >= 0 && h < n && s.charAt(l) == s.charAt(h)) {
                l--;
                h++;
            }
            if (h - l - 1 > longest) {
                longest = h - l - 1;
                start = l + 1; // Correct the start index
            }

            // Check for even length palindromes
            l = i;
            h = i + 1;
            while (l >= 0 && h < n && s.charAt(l) == s.charAt(h)) {
                l--;
                h++;
            }
            if (h - l - 1 > longest) {
                longest = h - l - 1;
                start = l + 1; // Correct the start index
            }
        }

        x[0] = longest;
        x[1] = start;

        return x;
    }

    static String longest_substr(String s) {
        int[] a = max_length(s); // Call max_length to get the values
        return s.substring(a[1], a[1] + a[0]); // Correct the substring extraction
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String s = longest_substr(line);
        System.out.println(s);
    }
}*/
import java.util.*;
public class longest_substring 
{
	
	static int[] max_length(String s)
	{
		int [] x=new int[2];
		int longest=0,start=0;
		
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			
			//for odd length palindrome
			int l=i,h=i;
			while(l>=0 && h<n && s.charAt(l)==s.charAt(h))
			{
				l--;
				h++;
			}
			if(h-l-1>longest)
			{
				longest=h-l-1;
				start=l+1;
			}
			
			//for even length palindrome
			l=i;
			h=i+1;
			while(l>=0 && h<n && s.charAt(l)==s.charAt(h))
			{
				l--;
				h++;
			}
			if(h-l-1>longest)
			{
				longest=h-l-1;
				start=l+1;
			}
			
		}
		x[0]=longest;
		x[1]=start;
		
		return x;
		
	}
	
	
	static String longest_substr(String s)
	{
		int n=s.length();
		int []a=max_length(s);
		return s.substring(a[1], a[0]+a[1]);
		
		
	}
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner (System.in);
		String line = sc.next();
		String s = longest_substr(line);
		System.out.println(s);
	}

}
