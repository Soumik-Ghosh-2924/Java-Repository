import java.util.*;
public class p3 
{
	static int clear(int n, int i)
	{
		int bitmask = 1<<i;
		int k =~(bitmask);
		int res= k & n;
		return res;
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number and the index u want to clear : ");
		int n=sc.nextInt();
		int i=sc.nextInt();
		
		int result = clear(n,i);
		
		System.out.println(result);
		
	}

}
