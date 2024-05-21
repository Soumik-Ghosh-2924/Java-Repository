import java.util.*;
public class sumoftreeNodes 
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
	
	static int sumof_Nodes(Node node)
	{
		if(node==null)
			return 0;
		int sum=0;
		sum=sum+node.data;
		int left_c= sumof_Nodes(node.left);
		int right_c=sumof_Nodes(node.right);
		
		return sum+left_c+right_c;
		
	}
	
	public static void main (String args[])
	{
		int []nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree bt = new BinaryTree();
		Node head=bt.buildtree(nodes);
		/*System.out.println(head.data);*/
		
//		Inorder_Traversal(head);
		
		System.out.println(sumof_Nodes(head));
	}

}
