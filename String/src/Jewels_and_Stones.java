import java.util.Scanner;

public class Jewels_and_Stones 
{
	
	public static int numJewelsInStones(String jewels, String stones)
	{
		int i=0,j=0,c=0;
		for(i=0;i<stones.length();i++)
		{
			char s=stones.charAt(i);
			for(j=0;j<jewels.length();j++)
			{
				if(s==jewels.charAt(j))
				{
					c+=1;
				}
			}
		}
		return c;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String jewels=sc.nextLine();
		String stones=sc.nextLine();
		
		int x = numJewelsInStones(jewels, stones);
		
		System.out.println(x);
		
		sc.close();
		
	}
}
