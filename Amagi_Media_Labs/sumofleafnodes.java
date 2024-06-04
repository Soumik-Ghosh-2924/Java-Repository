package Amagi_Media;
public class sumofleafnodes 
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int val)
		{
			this.data=val;
			this.left=null;
			this.right=null;
		}
	}
	
	
	static class binaryTree
	{
		static int index=-1;
		
		static Node buildTree(int nodes[])
		{
			index++;
			if(nodes[index]==-1)
				return null;
			
			Node newNode = new Node(nodes[index]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			
			return newNode;				
		}
	}
		
	
		static int sum_ofLeafnodes(Node root)
		{
			if(root==null)
				return 0;
			
			if(root.left==null && root.right==null)
				return root.data;
			
			int left_sum=sum_ofLeafnodes(root.left);
			int right_sum=sum_ofLeafnodes(root.right);
			
			return left_sum+right_sum;
		}	
	
	public static void main(String argss[])
	{
		int Nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		binaryTree bt=new binaryTree();
		Node root =bt.buildTree(Nodes);
		
		int sumofleafnodes=sum_ofLeafnodes(root);
		
		System.out.println(sumofleafnodes);
	}

}
