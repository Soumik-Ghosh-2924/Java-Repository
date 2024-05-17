import java.util.*;
public class Goal_Parser 
{
	public static String interpret(String command)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<command.length();)
		{
			if(command.charAt(i)=='G')
			{
				sb.append('G');
				i++;
			}
			else if(command.charAt(i+1)==')')
			{
				sb.append('o');
				i+=2;
			}
			else
			{
				sb.append("al");
                i+=4;
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String command=sc.nextLine();
		String s=interpret(command);
		
		System.out.println(s);
		
		sc.close();
	}
	
}
