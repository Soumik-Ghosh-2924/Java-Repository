package bst;
import java.util.*;
// to print the nodes in a bst within a specified range 
public class bstq1 
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
	
	static  Node insert_node(Node root, int val)
	{
		if(root == null)
		{
			root=new Node(val);
			return root;
		}
		
		if(root.data>val)
		{
			root.left= insert_node(root.left,val);
		}
		else
		{
			root.right= insert_node(root.right,val);
		}
		
		return root;
	}
	
	
	static void print_in_range(Node root , int x,int y)
	{
		
		if(root==null)
			return ;
					
					
		if(root.data>=x && root.data<=y)
		{
			print_in_range(root.left,x,y);
			System.out.print(root.data+" ");
			print_in_range(root.right,x,y);
		}
		
		else if(root.data<=x)
		{
			print_in_range(root.right,x,y);
		}
		else 
		{
			print_in_range(root.left,x,y);
		}
	}
	
	
	public static void main(String args[])
	{
		int[] values= {5,1,3,4,2,7};
		Node root=null;
		
		
		for(int i=0;i<values.length;i++)
		{
			root=insert_node(root,values[i]);
		}
		
		print_in_range(root,3,6);
		
		
	}
	

}
