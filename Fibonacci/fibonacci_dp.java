//This is the optimized code foe the fibonacci series 
// here the auxillary space complexity is O(n)
//& the time complexity is O(n);


import java.util.*;
public class fibonacci_dp 
{
	static int fib(int n)
	{
		if(n==0 || n==1)
			return n;
		
		int []a= new int[n+1];
		a[0]=0;
		a[1]=1;
		int i;
		for(i=2;i<=n;i++)
		{
			
			a[i]=a[i-1]+a[i-2];
		}
		return a[n];
	}
	
	public static void main(String args[])
	{
		int n=9;
		int res=fib(n);
		
		System.out.println(res);
		
	}
	

}
