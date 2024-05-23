import java.util.*;
public class BST 
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
		}
	}
	
	static Node insert(Node root, int val)
	{
		if(root==null)
		{
			root=new Node(val);
			return root;
		}
		
		if(root.data>val)
		{
			root.left=insert(root.left,val);
		}
		else
		{
			root.right=insert(root.right,val);
		}
		
		return root;
	}
	
	
	static void inorder_traversal(Node root)
	{
		if(root==null)
			return ;
		
		inorder_traversal(root.left);
		System.out.print(root.data+" ");
		inorder_traversal(root.right);
	}
		
	public static void main(String args[])
	{
		
		int values[]= {5,1,3,4,2,7};
		
		Node root=null;
		
		for(int i=0;i<values.length;i++)
		{
			root=insert(root, values[i]);
		}
		
		inorder_traversal(root);
		System.out.println();
		
	}

}
