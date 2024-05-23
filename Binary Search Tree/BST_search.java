import java.util.*;
public class BST_search 
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node (int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	
	static Node insert_node(Node root, int val)
	{
		if(root==null)
		{
			root = new Node(val);
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
	
	static boolean search_key(Node root, int key)
	{
		if(root==null)
		{
			return false;
		}
		
		if(root.data>key)
		{
			return search_key(root.left,key);
		}
		else if(root.data==key)
		{
			return true;
		}
		else
		{
			return search_key(root.right,key);
		}
	}
	
	public static void main(String args[])
	{
		int values[]= {5,1,3,4,2,7};
		Node root=null;
		
		for(int i=0;i<values.length;i++)
		{
			root=insert_node(root,values[i]);
		}
		
		int key =2;
		System.out.println(search_key(root,key));		
	}

}
