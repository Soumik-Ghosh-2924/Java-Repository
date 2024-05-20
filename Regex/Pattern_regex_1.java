import java.util.*;
import java.util.regex.*;
public class Pattern_regex_1 
{
	public static void main(String args[])
	{
		String my_line="Hey there, where are you going?";
		Pattern Patt= Pattern.compile("[a-z]+"); //Pattern object created as pat
		Matcher m = Patt.matcher(my_line);//matcher object created as m
		while(m.find())
		{
			System.out.println(my_line.substring(m.start(),m.end()));
		}
	}

}
