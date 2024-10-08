package DSA;
class Nod
{
    Nod left;
    Nod right;
    int val;

    Nod (int val)
    {
        this.left=null;
        this.right=null;
        this.val=val;
    }
}

public class CreateT_Inorder
{
    static int index=0;
    public Nod build_Tree(int arr[])
    {
        if(index >= arr.length || arr[index]== -1)
        {
            index++;
            return null; 
        }

        Nod root = new Nod(arr[index++]);
        root.left= build_Tree(arr);
        root.right=build_Tree(arr);

        return root;

    }

    static void InorderTraversal(Nod root)
    {
        if(root==null)
        {
            return;
        }

        InorderTraversal(root.left);
        System.out.print(root.val+"->");
        InorderTraversal(root.right);
    }



    public static void main(String args[])
    {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        CreateT_Inorder bt = new CreateT_Inorder();
        Nod root=bt.build_Tree(arr);
        System.out.println("New tree has been built.");
        System.out.println("Here's the In-order traversal : ");
        InorderTraversal(root);
        System.out.print("end");
        
    }
    
}
