
public class maxPdtsubarray 
{
	public static int mpsubarray(int nums[])
	{
		int k= nums.length;
		int res=nums[0];
		
		for(int i=0;i<k;i++)
		{//traversing the array for each element of the array
			int mul=nums[i];
			for(int j=i+1;j<k;j++)				
			{
				res=Math.max(res, mul);//storing the max pdt for each combination of elements at i
				//with subsequent elements
				mul*=nums[j];
			}
			res=Math.max(res, mul); //storing the max product among all combinations of array elements
			//products in the given array.
		}
		return res;
	}
	
	public static void main(String args[])
	{
		int nums[]= {2,3,-2,4};
		int ans=mpsubarray(nums);
		
		System.out.println(ans);
	}

}
