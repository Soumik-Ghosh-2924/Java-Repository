import java.util.*;
public class BST_delete 
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
	
	static Node delete_node(Node root, int del)
	{
		//case 1: to delete the leaf node
		if(root.left==null && root.right==null)
		{
			return null;
		}
		
		if(root.left==null)
		{
			return root.right;
		}
		else if (root.right==null)
		{
			return root.left;
		}
		else
		{
			Node IS_Node= successor_node(root.right);
			root.data=IS_Node.data;
			root.right=delete_node(root.right,IS_Node.data);
		}
		
		return root;
		
	}
	static Node successor_node(Node root)
	{
		if(root.left!=null)
			root=successor_node(root.left);
		
		return root;
	}
	
	static void Inorder_Traversal(Node root)
	{
		if(root==null)
			return ;
		
		Inorder_Traversal(root.left);
		System.out.print(root.data+" ");
		Inorder_Traversal(root.right);
	}
	
	public static void main(String args[])
	{
		int values[]= {5,1,3,4,2,7};
		Node root=null;
		
		for(int i=0;i<values.length;i++)
		{
			root=insert_node(root,values[i]);
		}
		
//		int key =2;
//		if(search_key(root,key))
//		{
//			System.out.println("Found");
//		}
//		else
//		{
//			System.out.println("Not Found");
//		}
		
		root= delete_node(root, 5);
		if(search_key(root,5))
			{
				System.out.println("Found");
			}
			else
			{
				System.out.println("Not Found");
			}
		
		Inorder_Traversal(root);
		
	}

}