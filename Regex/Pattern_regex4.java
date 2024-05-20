import java.util.*;
import java.util.regex.*;
public class Pattern_regex4 
{
	public static void main(String args[])
	{
		//String my_line= "Hey12 there20, where are you going?";
		//String my_line= "5678936250";
		//String my_line= "9876543210";
		String my_line= "1256543210";
//		String my_line= "Hey there, where are you going?";
//		String my_line= "Hey there, where are you going?";
//		String my_line= "Hey there, where are you going?";
		
		//Pattern pat=Pattern.compile("[A-Za-z]+[0-9]");
		//Pattern pat=Pattern.compile("\\d"); 
		Pattern pat=Pattern.compile("[987]{3}\\d{7}");
//		Pattern pat=Pattern.compile("[?]+");
//		Pattern pat=Pattern.compile("[?]+");
//		Pattern pat=Pattern.compile("[?]+");
//		Pattern pat=Pattern.compile("[?]+");
//		Pattern pat=Pattern.compile("[?]+");
		
		Matcher m= pat.matcher(my_line);
		
		while(m.find())
		{
			System.out.println(my_line.substring(m.start(),m.end()));
		}
		
		
	}
}
