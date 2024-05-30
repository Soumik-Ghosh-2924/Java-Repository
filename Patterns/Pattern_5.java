package Patterns;

import java.util.*;
public class Pattern_5 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Here's your inverted pyramid pattern rotate by 180 deg : ");
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		sc.close();
	}

}
