package Patterns;

import java.util.*;
public class Pattern_6 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Here's your half pyramid pattern of numbers : ");
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		sc.close();
	}

}
