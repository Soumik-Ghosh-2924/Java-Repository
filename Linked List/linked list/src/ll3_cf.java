import java.util.*;
public class ll3_cf 
{
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("a");
		list.addFirst("is");
		list.addFirst("this");
				
		System.out.print(list);
		
		System.out.println();
		
		list.add("List .");
		
		System.out.print(list);
		
		System.out.println();
		System.out.println();
		
		
		System.out.print(list.size());
		System.out.println();
		System.out.println();
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" -> ");
		}
		System.out.print("NULL");
		System.out.println();
		
		
		list.removeLast();
		list.removeFirst();
		
		for(int j =0; j<list.size();j++)
		{
			System.out.print( list.get(j)+" -> ");
		}
		System.out.print("NULL");
	
	}

}
