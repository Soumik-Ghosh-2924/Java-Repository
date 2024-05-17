public class eg3 
{
	public static void main (String args[])
	{
		System.out.println("The marks of the students in the following subs are : \n");
		System.out.println("\tHist\tGeo\tCiv");
		int marks[][]= {{68,75,90}, {87,75,93}};
		int i, j;
		for(i=0;i<2;i++)
		{
			System.out.print("S"+i+"\t");
			for(j=0;j<3;j++)
			{
				System.out.print(marks[i][j] + "\t");				
			}
			System.out.println();
		}
	}
}
