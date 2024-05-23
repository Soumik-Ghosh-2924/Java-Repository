package bst;
import java.util.*;

public class q2bst 
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static Node insert_node(Node root, int val )
	{
		if(root==null)
		{
			root=new Node(val);
			return root;
		}
		
		if(root.data>val)
		{
			root.left=insert_node(root.left,val);
		}
		else
		{
			root.right=insert_node(root.right,val);
		}
		return root;
	}
	
	
	static void printpath(ArrayList<Integer>path)
	{
		for(int i=0;i<path.size();i++)
		{
			System.out.print(path.get(i)+"->");
		}
		System.out.print("null");
		System.out.println();
	}
	
	
	static void root_to_leaf(Node root, ArrayList<Integer>path)
	{
		if(root==null)
			return ;
		
		path.add(root.data);
		
		if(root.left==null && root.right==null)
		{
			printpath(path);
		}
		else
		{
			root_to_leaf(root.left,path);
			root_to_leaf(root.right,path);
		}
		
		path.remove(path.size()-1);
		
	}
	
	
	public static void main(String args[])
	{
		int values[]= {5,1,3,4,2,7};
		Node root=null;
		
		for(int i=0;i<values.length;i++)
		{
			root=insert_node(root,values[i]);
		}
		
		ArrayList<Integer> arr =new ArrayList<>();
		
		root_to_leaf(root,arr);
		
		
		
	}
	
}