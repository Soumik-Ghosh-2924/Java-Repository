import java.util.Scanner;
public class Defang_ip_add 
{
	public static String defangIPaddr(String addr)
	{
		addr= addr.replace(".","[.]");
		
		return addr;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		String addr =sc.nextLine();
		
		String a=defangIPaddr(addr);
		
		System.out.println(a);
		
		sc.close();
		
		
	}

}
