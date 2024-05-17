package prac3;
import java.util.*;
public class swap 
{
	
	public static int[] swap_num(int a , int b)
	{
		int arr[]=new int [3];
		a=a^b;
		b=b^a;
		a=a^b;
		
		for(int i=0;i<1;i++)
		{
			arr[i]=a;
			arr[i+1]=b;
		}
		
		return arr;		
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		
		int a[]=new int [3];
		a=swap_num(x,y);		
		System.out.println(a[0]);
		System.out.println(a[1]);
	}

}
