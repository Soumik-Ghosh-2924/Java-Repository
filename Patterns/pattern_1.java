package Patterns;
import java.util.*;
public class pattern_1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your solid rectangle: ");
		int n=sc.nextInt();
		System.out.println();
		System.out.println();
		
		System.out.println("Here's your solid rectangle : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
