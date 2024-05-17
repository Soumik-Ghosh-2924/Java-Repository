package sorting;

public class selectionn_sort 
{
	static void swap(int []a, int x, int y)
	{
		final int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	
	static int[] s_sort(int []a)  // complexity of this algorithm is O(n^2);
	{
		for(int i=0;i<a.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[smallest]>a[j])
				{
					smallest=j;
				}
			}
			
			swap(a, smallest, i);
		}
		
		return a;
	}
	
	public static void main(String args[])
	{
		int arr[]= {3,6,2,9,1,10};
		int n=arr.length;
		int[] a1= new int[n];
		a1=s_sort(arr);
		
		for(int x=0;x<n;x++)
		{
			System.out.print(a1[x] + " ");
		}
		
		
		
	}

}
