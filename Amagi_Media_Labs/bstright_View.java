package Amagi_Media;

public class bstright_View 
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
	
	static Node insert(Node node , int data)
	{
		if(node==null)
		{
			node= new Node(data);
			return node; 
		}
		
		if(node.data>data)
		{
			insert(node.left,data);
		}
		else
		{
			insert(node.right,data);
		}
		return node;
	}
	
	static void pre_order(Node node)
	{
		if(node==null)
			return;
		
		System.out.println(node.data);
		pre_order(node.left);
		pre_order(node.right);
		
	}
	
	public static void main(String args[])
	{
		int val[]= {5,1,3,4,2,7};
		
		Node root=null;
		for(int i=0;i<val.length;i++)
		{
			root=insert(root,val[i]);
		}
		
		pre_order(root);
	}
}
