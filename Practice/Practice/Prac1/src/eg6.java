import java.util.Scanner;
public class eg6 
{
	public static void print_s()
	{
		System.out.println("Hello Java");		
	}
	
	public static void main(String args[])
	{
			int i;
			for(i=0;i<2;i++)
			{
				print_s();
			}
			Scanner sc = new Scanner(System.in);
			int k= sc.nextInt();
			System.out.println(k);
			
	}

}
