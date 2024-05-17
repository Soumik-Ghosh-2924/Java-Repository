import java.util.*;
import java.util.Scanner;
import java.util.Collections;
public class stack_q1 
{
	public static void Push_at_bottom(Stack<Integer> s, int d)
	{
		while(s.isEmpty())
		{
			s.push(d);
		}
		int top = s.pop();
		Push_at_bottom(s,d);
		s.push(top);
		
	}
	
	public static void main(String args)
	{
		Stack<Integer> s = new Stack<>();
		
		s.push(2);
		s.push(0);
		s.push(10);
		
		Push_at_bottom(s, 50);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
		
	}

}
