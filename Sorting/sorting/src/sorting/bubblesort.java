package sorting;
//time complexity is O(n^2)
public class bubblesort 
{
	static int[] bsort(int []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		return a;
		
	}
	
	public static void main(String args[])
	{
		int arr[] = { 2,6,1,5,9};
		int n=arr.length;
		int a1[]=new int[n];
		a1=bsort(arr);
		int i=0;
		while(i<=n-1)
		{
			System.out.println(a1[i]);
			i++;
		}
	}

}
