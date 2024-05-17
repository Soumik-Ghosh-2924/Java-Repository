import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class AL 
{
	public static void main(String args[])
	{
		ArrayList<Integer> l1= new ArrayList<Integer>();
		
		//To add elements to an array list
		l1.add(2);
		l1.add(5);
		l1.add(8);
		System.out.println(l1);
	
		
		
		//To get - to display the elements
		int e= l1.get(2);
		System.out.println(e);
		
		
		
		
		//to add an element in between the list
		l1.add(2,7);
		System.out.println(l1);
		
		
		
		
		//to set an element- change or modify an element in an array
		l1.set(2,88);
		System.out.println(l1);
		
		
		
		
		//to delete an element from the array list
		l1.remove(2);
		l1.remove(0);
		System.out.println(l1);
		
		
		
		
		//to find the size
		int s=l1.size();
		System.out.println(s);
		
		
		//using arraylist in loops
		int i;
		for(i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		
		l1.add(0);
		l1.add(20);
		l1.add(36);
		
		
		
		//sorting the elements in the arraylist
		Collections.sort(l1);
		System.out.println(l1);
		
	}

}
