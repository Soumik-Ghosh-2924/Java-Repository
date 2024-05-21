//This problem can be solved using two ways 
//1. using the recursive concept 
//which is similar to the fibonacci series 
//calculation, but the major issue with that 
//approach is that it takes exponential time 
//complexity and it becomes complex and may not
//work for larger values of "N".

// so the 2nd approach is using the linear time 
//complexity using a for  loop. The solution is
//given below.

import java.util.*;
public class staircase 
{
	static int climbingStairs(int n)
	{
		if(n==1) return 1;
		if(n==2) return 2;
		
		int a=1;
		int b=2;
		for(int i=3;i<=n;i++)
		{
			int c= a+b;
			a=b;
			b=c;
		}
		
		return b;
	}
	
	public static void main(String args[])
	{
		int n=5;
		int res=climbingStairs(n);
		System.out.println(res);
		
	}

}
