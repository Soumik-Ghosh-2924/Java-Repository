package arrays;
import java.util.*;
public class frequency 
{
	public static void freq_c(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int l=0;
			int j=0;
			for(j=0;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					l+=1;
				}
			}
			
			if(i==0 || arr[i]!=arr[i-1])
			{
				System.out.println("the frequency of "+arr[i]+" is : "+l); 
			}
			
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=s.nextInt();
		int a[]= new int [n];
		
		System.out.println("Enter the elements of the arraay :");
		for(int i=0; i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("The Frequency of the array elements are as follows :  ");
		
		freq_c(a);
		

		
	}

}
