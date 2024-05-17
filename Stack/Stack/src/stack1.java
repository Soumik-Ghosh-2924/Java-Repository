import java.util.ArrayList;
import java.util.*;

public class stack1 
{
	static class Stack
	{
		static ArrayList<Integer> list = new ArrayList<>();
		
		public  boolean isEmpty()
		{
			return list.size() == 0;
		}
		
		public  void push(int data)
		{
			list.add(data);
		}
		
		public  int pop()
		{
			if(isEmpty()==true)
			{
				return -1;
			}
			int top = list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		public  int peek()
		{
			if(isEmpty()==true)
			{
				return -1;
			}
			
			return list.get(list.size()-1);
			
		}
	public static void main ( String args[])
	{
		Stack s = new Stack();
		s.push(5);
		s.push(2);
		s.push(9);
		s.push(5);
			
		while (s.isEmpty()==true)
		{
			System.out.println(s.peek());
			s.pop();
		}
			
			
	}
	}
}

