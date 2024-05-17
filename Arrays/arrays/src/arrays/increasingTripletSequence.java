package arrays;
import java.util.*;
public class increasingTripletSequence 
{
	static boolean checkTriplet(int nums[])
	{
		int a =Integer.MAX_VALUE;
		int b=Integer.MAX_VALUE;
		int n=nums.length;
		int i=0;
		while(i<n)
		{
			if(nums[i]<=a)
				a=nums[i];
			else if(nums[i]<=b)
				b=nums[i];
			else
				return true;
			
			i++;
		}
		
		return false;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		boolean x=checkTriplet(arr);
		
		System.out.println(x);
	}
}
