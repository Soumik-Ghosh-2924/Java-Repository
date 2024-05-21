import java.util.*;
public class treediameter 
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
	
	static int height(Node node)
	{
		if(node==null)
			return 0;
		
		int left_h=height(node.left);
		int right_h=height(node.right);
		
		return Math.max(left_h, right_h)+1; 
	}
	
	static int Diameter(Node node)
	{
		if(node ==null)
		{
			return 0;
		}
		
		int left_dia=Diameter(node.left);
		int right_dia=Diameter(node.right);
		int dia3= height(node.left)+height(node.right)+1;
		
		return Math.max(dia3,Math.max(left_dia, right_dia));
		
		

	}
	
	public static void main(String args[])
	{
		int []nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Binary_Tree bt= new Binary_Tree();
		Node head=bt.buildtree(nodes);
		
//		int h=height(head);
		int D=Diameter(head);
		System.out.println(D); //This prints the height of the tree.
		
	}

}
 
 