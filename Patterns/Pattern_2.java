package Patterns;
import java.util.*;
public class Pattern_2 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int columns = sc.nextInt();
		System.out.println();
		System.out.println("Here's your hollow rectangle : ");
		System.out.println();
		for(int j=0;j<columns;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=0;i<rows-2;i++)
		{
			System.out.print("*");
			for(int j=0;j<columns-2;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		if(rows>1)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print("*");
			}
		}
		sc.close();
	}

}
