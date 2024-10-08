package DSA;

class Node1
{
    int val;
    Node1 left;
    Node1 right;

    Node1(int val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class Tree_CountNodes 
{
    static int index=0;
    static Node1 buildTree(int arr[])
    {
        if(index >= arr.length || arr[index]==-1)
        {
            index++;
            return null;
        }

        Node1 root= new Node1(arr[index++]);
        root.left=buildTree(arr);
        root.right=buildTree(arr);

        return root;
    }



    static int Count_Node1s(Node1 root)
    {
        if(root==null)
        {
            return 0;
        }

        int left_count=Count_Node1s(root.left);
        int right_count=Count_Node1s(root.right);

        return left_count+right_count+1;
    }


    @SuppressWarnings("static-access")
    public static void main(String args[])
    {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree_CountNodes bt = new Tree_CountNodes();
        @SuppressWarnings("static-access")
        Node1 n =bt.buildTree(arr);

        System.out.println("the no of Node1s in the tree : "+bt.Count_Node1s(n));
    }
    
}
