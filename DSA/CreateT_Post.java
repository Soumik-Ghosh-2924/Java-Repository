package DSA;

class Node 
{
    Node left;
    Node right;
    int val;
    Node(int val)
    {
        this.left=null;
        this.right=null;
        this.val=val;
    }
}

public class CreateT_Post 
{

    static int index=0;

    public Node buildTree(int nodes[])
    {
        if(index>=nodes.length || nodes[index]==-1)
        {
            index++;
            return null;
        }

        Node root = new Node(nodes[index++]);
        root.left=buildTree(nodes);
        root.right=buildTree(nodes);

        return root;
    }

    public void PostOrderTraversal(Node root)
    {
        if(root==null)
        {
            return ;
        }

        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.val + "->");
    }


    public static void main(String args[])
    {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        CreateT_Post bt = new CreateT_Post();
        Node root = bt.buildTree(arr);

        System.out.println("The tree has been built");
        System.out.println("Here is the post order traversal of the same.");

        bt.PostOrderTraversal(root);
        System.out.println("end");
    }
    
}
