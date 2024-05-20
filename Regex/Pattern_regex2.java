import java.util.*;
import java.util.regex.*;
public class Pattern_regex2
{
	public static void main(String args[])
	{
		String my_line= "Hey there, where are you going?";
		Pattern pat=Pattern.compile("[A-Za-z,?]+");
		Matcher m= pat.matcher(my_line);
		
		while(m.find())
		{
			System.out.println(my_line.substring(m.start(),m.end()));
		}
		
		
	}
}
