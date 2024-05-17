package leet_code;
import java.io.*;
import java.util.Scanner;
public class longest_prefix 
{
	
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		char arr[][]=new char[3][200];
		int i,j; 
		for(i=0;i<3;i++)
		{
			for(j=0;j<200;j++)
			{
				while(sc.hasNext())
				{
					arr[i][j]=sc.next().charAt(0);
					if(arr[i][j]==' ')
						return;
				}
				
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<200;j++)
			{
				while(arr[i][j]!=' ')
				{
					System.out.println(arr[i][j]);
					if(arr[i][j]==' ')
					{
						System.out.println();
				    }
				}
			}
		}
	}

}
