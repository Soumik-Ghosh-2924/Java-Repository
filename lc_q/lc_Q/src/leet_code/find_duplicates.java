class find_duplicates 
{
	public static int f_duplicates(int nums[])
	{
		int k =nums.length;
		int slow=nums[0];
		int fast=nums[0];
		
		do
		{
			slow=nums[slow];
			fast=nums[nums[fast]];
		}while(slow!=fast);
		
		while(slow != fast)
		{
			slow=nums[slow];
			fast=nums[fast];
		}
		return slow;
	}

}
