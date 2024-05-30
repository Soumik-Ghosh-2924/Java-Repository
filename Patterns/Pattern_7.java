package Patterns;

import java.util.*;
public class Pattern_7 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Here's your inverted pyramid of numbers pattern : ");
		System.out.println();
		System.out.println();
		
		for(int i=n;i>=1;i--)
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
