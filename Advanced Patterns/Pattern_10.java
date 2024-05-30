package Patterns;
import java.util.*;
public class Pattern_10 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of n : ");
//		int n = sc.nextInt();
		
		int n=4;
		System.out.println();
		System.out.println();
		System.out.println("Here's your inverted pyramid pattern : ");
		System.out.println();
		System.out.println();
		
		//this is for the upper half
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int a=1;a<=n-i;a++)
			{
				System.out.print(" ");
			}
		
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		//this is for the lower half
		for(int a=n;a>0;a--)
		{
			for(int b=a;b>0;b--)
			{
				System.out.print("*");
			}
			for(int d=1;d<=n-a;d++)
			{
				System.out.print(" ");
			}
			for(int d=1;d<=n-a;d++)
			{
				System.out.print(" ");
			}
			for(int p=a;p>0;p--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		sc.close();
	}

}
