import java.util.*;
public class p4_string_reverse 
{
	public static void main(String args[])
	{
/*		StringBuilder sb = new StringBuilder("Soumik");
		StringBuilder s2 = new StringBuilder();
		int k=sb.length();
		for(int i=0; i<sb.length();i++)
		{
			s2.append(sb.charAt(k-1));
			k-=1;
		}
		System.out.println(s2); 
		*/
		
		StringBuilder s1= new StringBuilder("Soumik");
		
		for(int i=0;i<s1.length()/2;i++)
		{
			int front = i;
			int back = s1.length()-1-i;
			
			char fchar = s1.charAt(front);
			char bchar = s1.charAt(back);
			
			s1.setCharAt(front, bchar);
			s1.setCharAt(back,  fchar);
		}
		
		System.out.println(s1);
	}

}
