import java.util.*;
public class stack_using_collectionf 
{
	public static void main(String args[])
	{
		Stack<Integer> s = new Stack<>();  //using java collection framework 
		s.push(9);
		s.push(1);
		s.push(3);
		s.push(10);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}

}
