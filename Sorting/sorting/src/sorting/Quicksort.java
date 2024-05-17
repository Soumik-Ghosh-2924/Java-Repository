package sorting;

public class Quicksort 
{
	static int partition(int []arr, int low, int high)
	{
		int pivot=arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp= arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;		
	}
	
	static void quicksort(int arr[], int low, int high)
	{
		if(low<high)
		{
			int pivot = partition(arr, low, high);
			quicksort(arr, low, pivot-1);
			quicksort(arr, pivot+1, high);
		}
	}

	public static void main(String args[])
	{
		int arr[]= {7,9,2,4,1,6,0};
		int n=arr.length;
		quicksort(arr,0,n-1);
		
		for(int a=0;a<n;a++)
		{
			System.out.print(arr[a] + " " );
		}
		
		
	}
}
