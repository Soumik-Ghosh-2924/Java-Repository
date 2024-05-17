import java.util.*;
public class second_largest 
{
	static void sLarge(Integer []a)
	{
		Arrays.sort(a,Collections.reverseOrder());
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=max)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
	
	
	public static void main(String args[])
	{
		Integer [] a = {12, 35, 1, 10, 34, 1};
		
		sLarge(a);
		
		
	}

}
