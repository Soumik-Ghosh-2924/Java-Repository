import java.util.*;
public class p3 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your email address : ");
		String s= sc.nextLine();
		
		String User_name;
		if(s.contains("@"))
		{
			User_name=s.substring(0,s.indexOf('@'));
			System.out.println(User_name);
		}
		else
		{
			System.out.println("Invalid email.");
		}
		
		
		sc.close();
	}

}
