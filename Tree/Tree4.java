import java.util.*;
public class Tree4 
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
	
	static void Postorder_Traversal(Node node)
	{
		if(node==null)
			return ;
		
		Postorder_Traversal(node.left);
		Postorder_Traversal(node.right);
		System.out.print(node.data + " ");
	}
	
	public static void main (String args[])
	{
		int []nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree bt = new BinaryTree();
		Node head=bt.buildtree(nodes);
		/*System.out.println(head.data);*/
		
		Postorder_Traversal(head);
	}

}
