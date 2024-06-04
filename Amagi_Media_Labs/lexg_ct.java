package Amagi_Media;
import java.util.*;
public class lexg_ct 
{
	static int lex_ct(String s, int k)
	{
		int ct=0;
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		int n=ch.length;
		if(k>n)
		{
			return -1;
		}
		
		//kth term in a 0 indexed array is basically a k-1th term in the actual array
		
		char c= ch[k-1];
		System.out.println("The kth element is : "+c);
		
		for(int i=0;i<n;i++)
		{
			if(ch[i]==c)
			{
				ct+=1;
			}
		}
		
		return ct;
		
	}
	
	public static  void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your String : ");
		String A=sc.nextLine();
		
		System.out.println("Enter the term u want to check for : ");
		int k=sc.nextInt();
		
		int res=lex_ct(A,k);
		
		System.out.println("The "+k+"th character is present "+res+" times in the String provided .");
		
		sc.close();
		
	}

}
