package Amagi_Media;
import java.util.*;
public class fibonacci_primesum 
{
	static int[] generateFib_Array(int n)
	{
		int f[]=new int [n];
		if(n>0) f[0]=0;
		if(n>1) f[1]=1;
		
		for(int i=2;i<n;i++)
		{
			f[i]=f[i-1]+f[i-2];
		}
		
		return f;
		
	}
	
	
	static boolean checkPrime(int num)
	{
		if(num<=1) return false;
		if(num==2) return true;
		if(num%2==0) return false;
		
		for(int i=3;i*i<=num;i+=2)
		{
			if(num%i==0)
			{
				return false;
			}	
		}
		return true;
	}
	
	
	static int sumPrime(int [] fib)
	{
		int sum=0;
		int l=fib.length;
		for(int i=2;i<l;i++)
		{
			if(checkPrime(i+1))
			{
				sum+=fib[i];
			}
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		
		int arr[]= generateFib_Array(n);
		
		int res=sumPrime(arr);
		sc.close();
		System.out.println("the sum is : " + res);
	}
	
}
