package DSA;
class Node3
{
    int value;
    Node3 left;
    Node3 right;
    Node3(int val)
    {
        this.value=val;
        this.left=null;
        this.right=null;
    }
}


public class Tree_height 
{
    static int index=0;
    
    public Node3 buildTree(int arr[])
    {
        if(index >= arr.length || arr[index]==-1)
        {
            index++;
            return null;
        }

        Node3 root = new Node3(arr[index++]);
        root.left=buildTree(arr);
        root.right=buildTree(arr);

        return root;
    }

    public int height_tree(Node3 root)
    {
        if(root==null)
        {
            return 1;
        }

        int left_h=height_tree(root.left);
        int right_h=height_tree(root.right);
        int act_h=Math.max(left_h,right_h);
        
        return act_h+1;
    }

    public static void main(String args[])
    {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes[]={1,2,-1,7,-1,-1,6,5,-1,-1,4,10,-1,-1,9,-1,-1};
        Tree_height bt = new Tree_height();
        Node3 root = bt.buildTree(nodes);
        int ht=bt.height_tree(root);

        System.out.println("The height of the tree is : "+ht);
    }

    
}