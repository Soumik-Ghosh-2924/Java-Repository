import java.util.*;

public class p1
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		String essay =sc.nextLine();
		
		int M = sc.nextInt();
		int N=sc.nextInt();
		int res[]=new int[N];
		 
		for(int i=0;i<N;i++)
		{
			int a = sc.nextInt();
			int b= sc.nextInt();
			
			String substr=essay.substring(a,b);
			
			Set<Character>distinctchar=new HashSet<>();
			
			for(char c : substr.toCharArray())
			{
				distinctchar.add(c);
			}
			
			res[i]=distinctchar.size();
		}
		
		
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]);
			if(i<N-1)
			{
				System.out.print(" ");
			}
		}
	}
}