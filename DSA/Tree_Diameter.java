package DSA;
class Node4
{
    int val;
    Node4 left;
    Node4 right;
    Node4(int val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }
}


public class Tree_Diameter 
{
    static int index=0;
    public Node4 buildTree(int arr[])
    {
        if(index>=arr.length || arr[index]==-1)
        {
            index++;
            return null;
        }

        Node4 root = new Node4(arr[index++]);
        root.left=buildTree(arr);
        root.right=buildTree(arr);

        return root;
    }

    public int height(Node4 root)
    {
        if(root==null)
        {
            return 0;
        }

        int left_height=height(root.left);
        int right_height=height(root.right);

        return Math.max(left_height, right_height)+1;
    }

    public int Diameter(Node4 root)
    {
        if(root==null)
        {
            return 0;
        }

        int d1= Diameter(root.left);
        int d2=Diameter(root.right);
        int d3= height(root.left)+height(root.right)+1;

        return Math.max(d3, Math.max(d1, d2));
    }
    

    public static void main(String args[])
    {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree_Diameter t1 = new Tree_Diameter();
        Node4 root= t1.buildTree(arr);

        int Dia = t1.Diameter(root);

        System.out.println("The diameter of the tree is : "+Dia);

    }
}
