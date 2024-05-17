import java.util.*;
public class seggregateoddeven 
{
	static void rearrange(int array[])
	{
		int left =0;
		int right=array.length-1;
		
		while(left<right)
		{
			while(array[left]%2==0 && left<right)
			{
				left++;
			}
			
			while(array[right]%2==1 && left<right)
			{
				right--;
			}
			
			if(left<right)
			{
				int temp = array[left];
				array[left]=array[right];
				array[right]=temp;
				left++;
				right--;
			}
		}
	}
	
	
	public static void main(String args[])
	{
		int [] a = {12,34,8,90,45,9,3};
		
		rearrange(a);
		
		System.out.println("The rearranged array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + "  ");
		}
	}

}
