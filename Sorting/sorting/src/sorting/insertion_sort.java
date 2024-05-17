package sorting;

public class insertion_sort 
{
	static int[] i_sort(int []a)
	{
		for(int i=1;i<a.length;i++)
		{
			int current =a[i];
			int j=i-1;
			while(j>=0 && current <a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			
			a[j+1]=current;
		}
		
		return a;
	}
	
	public static void main(String args[])
	{
		int []b= {4,1,3,7,9};
		int n=b.length;
		int a1[]=new int [n];
		a1=i_sort(b);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+ "  ");  
		}
		
	}

}
