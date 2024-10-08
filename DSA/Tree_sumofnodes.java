package DSA;
class Node2
{
    int val;
    Node2 left;
    Node2 right;
    Node2(int val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }
}


public class Tree_sumofnodes 
{
    static int index=0;

    public Node buildTree(int nodes[])
    {
        if(index>=nodes.length || nodes[index]==-1)
        {
            index++;
            return null;
        }

        Node root= new Node(nodes[index++]);
        root.left=buildTree(nodes);
        root.right=buildTree(nodes);

        return root;
    }


    public int SumofallNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int sum=0;
        sum=sum+root.val;
        int left_sum=SumofallNodes(root.left);
        int right_sum=SumofallNodes(root.right);

        return sum+left_sum+right_sum;
    }
    


    public static void main(String args[])
    {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Tree_sumofnodes bt = new Tree_sumofnodes();
        Node root= bt.buildTree(arr);

        System.out.println("The tree has been built.");
        System.out.println("The sum of all the nodes of the tree is : "+bt.SumofallNodes(root));
    }
}
