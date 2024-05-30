package Patterns;

import java.util.*;
public class Pattern_9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Here's your 0-1 triangle Pattern : ");
		System.out.println();
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(1 + " ");
				}
				else
				{
					System.out.print(0 + " ");
				}
			}			
			System.out.println();
		}
		sc.close();
	}

}
