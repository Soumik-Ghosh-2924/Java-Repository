import java.util.Scanner;
import java.util.ArrayList;
public class p1 
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list= new ArrayList<Integer>();
		try
		{
			int n;
			n=sc.nextInt();
			int i,j;
			for(i=0;i<n;i++)
			{
				int x=sc.nextInt();
				list.add(x);
			}
			int z=0;
			for(i=0;i<n;i++)
			{
				int c=0;
				int e=list.get(i);
				for(j=i+1;j<n;j++)
				{
					if(e==list.get(j))
					{
						c+=1;
					}					
				}
				if(c>=1)
				{
					z++;
				}
			}
			
			System.out.println(z);
			}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		finally {
			sc.close();
		}
	}

}
