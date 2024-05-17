package sorting;
public class maximumaveragesubarray 
{
	static double MAS(int nums[], int k)
	{
		int n=nums.length;
		if(n<k)
			return -1.0;
		
		
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+nums[i];
		}
		int max=sum;
		for(int j=0;j<n-k;j++)
		{
			sum=sum-nums[j]+nums[j+k];
			if(sum>=max)
			{
				max=sum;
			}
		}
		
		return (double)max/k;
	}
	
	public static void main(String args[])
	{
		int n[]= {1,12,-5,-6,50,3};
		int k=4;
		double res = MAS(n,k);
		
		System.out.println(res);
		
	}

}
