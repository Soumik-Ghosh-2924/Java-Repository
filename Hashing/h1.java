package Hashing;
import java.util.Iterator;
import java.util.HashSet;
public class h1 
{
	public static void main(String args[])
	{
		HashSet<Integer> set= new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println("The size of the set is  : "+ set.size());
		
		System.out.println("The elements in the set are :");
		System.out.println(set);
		if(set.contains(1))
		{
			System.out.println("The set contains 1.");
		}
		
		if(!set.contains(22))
		{
			System.out.println("The set does not contain 22.");
		}
		
		set.remove(1);
		if(!set.contains(1))
		{
			System.out.println("The set does not contain 1 any more.");
		}
		
		System.out.println("The size of the set now is  : "+ set.size());
		
		
		//Iterator in HashSets
		Iterator it = set.iterator();  //to traverse the set & the hashmaps too
		
		//iterator has 2 functions :  i. it.next();
		//ii. it.hasNext();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" "); // no guarantee on the order of the
			// elements entered in the Set
		}
		
		
	}
	

}
