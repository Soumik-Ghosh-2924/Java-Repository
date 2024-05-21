import java.util.*;
public class heightoftree 
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
	
	static class Binary_Tree
	{
		static int index=-1;
		static Node buildtree(int []nodes)
		{
			index++;
			if(nodes[index]==-1)
			{
				return null;
			}
			
			Node newnode =new Node(nodes[index]);
			newnode.left=buildtree(nodes);
			newnode.right=buildtree(nodes);
			
			return newnode;
		}
	}
	
	static int Height(Node node)
	{
		if(node ==null)
		{
			return 0;
		}
		
		int left_height=Height(node.left);
		int right_height=Height(node.right);
		
//		if(left_height>right_height)
//			return left_height+1;
//		
//		else
//			return right_height+1;
		
		return Math.max(left_height, right_height)+1;
	}
	
	public static void main(String args[])
	{
		int []nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Binary_Tree bt= new Binary_Tree();
		Node head=bt.buildtree(nodes);
		
		int h=Height(head);
		System.out.println(h); //This prints the height of the tree.
		
	}

}
 
 