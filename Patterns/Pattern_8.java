package Patterns;

import java.util.*;
public class Pattern_8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Here's your Floyd's triangle Pattern : ");
		System.out.println();
		System.out.println();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+"  ");
				k++;
			}			
			System.out.println();
		}
		sc.close();
	}

}
