//This is the optimized code foe the fibonacci series 
// here the space complexity is O(n), depth of recursion tree is n
//& the time complexity is exponential since every function calls 2 other functions;


import java.util.*;
public class fibo_recur 
{
	static int fib(int n)
	{
		if((n==0) || (n==1))
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	
	public static void main(String args[])
	{
		int n=9;
		int res=fib(n);
		System.out.println(res);
	}

}
