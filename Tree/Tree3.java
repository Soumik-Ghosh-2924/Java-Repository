import java.util.*;
public class Tree3 
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
	
	static class BinaryTree
	{
		static int index=-1;
		static Node buildtree(int []nodes)
		{
			index++;
			if(nodes[index]==-1)
			{
				return null;
			}
			
			Node newnode= new Node(nodes[index]);
			newnode.left=buildtree(nodes);
			newnode.right=buildtree(nodes);
			return newnode;
		}
	}
	
	static void Inorder_Traversal(Node node)
	{
		if(node==null)
			return;
		
		Inorder_Traversal(node.left);
		System.out.print(node.data + " ");
		Inorder_Traversal(node.right);
		
	}
	
	public static void main (String args[])
	{
		int []nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree bt = new BinaryTree();
		Node head=bt.buildtree(nodes);
		/*System.out.println(head.data);*/
		
		Inorder_Traversal(head);
	}

}
