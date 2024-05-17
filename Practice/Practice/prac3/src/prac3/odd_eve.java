package prac3;
import java.util.*;
public class odd_eve 
{
	public static String check(int x)
	{
		int result=x & 1;
		if(result == 1)
		{
			return "odd";
		}
		else
		{
			return "even";
		}
		
	}
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner (System.in);
		int a=s.nextInt();
		
		String odd_eve_ch= check(a);
		
		System.out.println(odd_eve_ch);
				
	}

}
