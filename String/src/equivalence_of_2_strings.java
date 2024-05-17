import java.util.*;
public class equivalence_of_2_strings 
{
	
	public static boolean arrayStringsAreEqual(String word1[], String word2[])
	{
		StringBuilder s1 = new StringBuilder(); // Using String Builder 
		//operations with String become easier 
		StringBuilder s2 = new StringBuilder();
		for(int i=0;i<word1.length;i++)
		{
			String s_1=word1[i];
			s1.append(s_1);
		}
		for(int i=0;i<word2.length;i++)
		{
			String s_2=word2[i];
			s2.append(s_2);
		}
		
		if(s1.toString().equals(s2.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String word1[]= new String[100];
		String word2[]=new String[100];
		
		for(int i=0;i<word1.length;i++)
		{
			word1[i]=sc.nextLine();
			word2[i]=sc.nextLine();
		}
		
		boolean ans;
		ans=arrayStringsAreEqual(word1,word2);
		
		System.out.println(ans);
		
		sc.close();
	}

}
