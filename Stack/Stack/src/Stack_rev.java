import java.util.*;
public class Stack_rev 
{
	public static void Push_at_bottom(Stack<Integer> s, int data)  //code to push an element at the bottom of the stack. 
	{
		if(s.isEmpty())
		{
			s.push(data);
			return ;
		}
		
		int top =s.pop();
		Push_at_bottom( s, data);
		s.push(top);
	}
	
	
	public static void Reverse(Stack<Integer> s)  //reverse the stack
	{
		if(s.isEmpty())
		{
			return ;
		}
		int top=s.pop();
		Reverse(s);
		Push_at_bottom(s,top);
	}
	
	
	public static void main(String args[])
	{
		Stack <Integer> s = new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		Reverse(s);
		
		Push_at_bottom(s, 90);
		
		while(!s.isEmpty())  //loop to display the new reversed stack
		{
			System.out.println(s.peek());
			s.pop();
		}
	}

}
