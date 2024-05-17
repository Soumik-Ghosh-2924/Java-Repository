import java.util.*;
public class addbinary 
{
	static String add(String a , String b)
	{
		StringBuilder sb=new StringBuilder();
		int i=a.length()-1;
		int j=b.length()-1;
		int carry=0;
		
		while(i>=0|| j>=0||carry==1)
		{
			if(i>=0)
				carry+=a.charAt(i--)-'0';
			if(j>=0)
				carry+=b.charAt(j--)-'0';
			sb.append(carry%2);
			carry=carry/2;
		}
		
		return sb.reverse().toString();
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 Strings: ");
		String a=s.nextLine();
		String b=s.nextLine();
		
		String res=add(a,b);
		
		System.out.println(res);
	}

}
