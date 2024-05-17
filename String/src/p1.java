import java.util.*;
public class p1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings : ");
		int n=sc.nextInt();
		String arr[]=new String [n];
		int s=0, k;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		
		
		for(int i=0;i<n;i++)
		{
			k=arr[i].length();
			s+=k;
		}
		
		System.out.println("The length of all strings is : " + s);
	}

}
