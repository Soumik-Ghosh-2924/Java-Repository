//This is the optimized code foe the fibonacci series 
// here the space complexity is O(1)
//& the time complexity is O(n);


import java.util.*;
public class fibonacci_optimized 
{
	static int fib(int n)
	{
		if(n<=1)
			return n;
		
		int a=0;
		int b=1;
		for(int i=2;i<=n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
		}
		
		return b;
	}
	
	public static void main(String args[])
	{
		int n=9;
		int res=fib(n);
		System.out.println(res);
	}

}
