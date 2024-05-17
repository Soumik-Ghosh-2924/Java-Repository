package arrays;
import java.util.*;

public class delete_ele 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n= s.nextInt();
		int a1 []= new int[n];
		for(int i=0;i<n;i++)
		{
			a1[i]=s.nextInt();
		}
		System.out.println("Enter the element that u want to delete : ");
		int key = s.nextInt();
		
		int toremove=-1;
		for(int j=0;j<n;j++)
		{
			if(a1[j]==key)
			{
				toremove=j;
				break;
			}
		}
		
		int a2[] = new int[n-1];
		for(int l=0,m=0;l<n;l++)
		{
			if(l!=toremove)
			{
				a2[m]=a1[l];
				m=m+1;
			}
		}
		
		a1=a2;
		
		System.out.println("The array after deletion : ");
		for(int b=0;b<a2.length;b++)
		{
			System.out.print(a1[b] + "  ");
		}
			
	}

}
