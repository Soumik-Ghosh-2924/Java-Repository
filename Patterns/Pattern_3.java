package Patterns;
import java.util.*;
public class Pattern_3 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Here's your Half Pyramid Pattern :");
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
