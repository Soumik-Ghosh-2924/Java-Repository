import java.util.*;
import java.util.regex.*;
public class Pattern_reg5 
{
	public static void main(String args[])
	{
		String my_line= "9876543210";
		//Pattern pat=Pattern.compile("\\d{10}");
		
		//String my_line= "1256543210";
		Pattern pat=Pattern.compile("[987]{2}\\d{8}");

		Matcher m= pat.matcher(my_line);
		
//		while(m.find())
//		{
//			System.out.println(my_line.substring(m.start(),m.end()));
//			//this prints the entire phone
//		}
		
		if(m.matches())
		{
			System.out.print("Valid input");
		}
		else
		{
			System.out.println("Invalid input");
		}
		
	}
}
