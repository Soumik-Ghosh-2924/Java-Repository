package DSA;
// class Node 
// {
//     Node left;
//     Node right;
//     int val;

//     Node (int val)
//     {
//         this.left=null;
//         this.right=null;
//         this.val=val;
//     }
// }



// public class CreateT_PreO 
// {
//     static int index=-1;
//     public Node build_Tree(int arr[])
//     {
//         index++;
//         if(index >= arr.length || arr[index]== -1)
//         {
//             return null; 
//         }

//         Node root = new Node(arr[index]);
//         root.left= build_Tree(arr);
//         root.right=build_Tree(arr);

//         return root;

//     }

//     public void PreOrderTraversal(Node root)
//     {
//         if(root==null)
//         {
//             return;
//         }

//         System.out.print(root.val+"->");
//         PreOrderTraversal(root.left);
//         PreOrderTraversal(root.right);
//     }



//     public static void main(String args[])
//     {
//         int arr[]={1,2,3,4,5,7,8,-1,-1,6,-1,-1,-1,9,10};
//         CreateT_PreO bt = new CreateT_PreO();
//         Node root=bt.build_Tree(arr);
//         System.out.println("New tree has been built.");
//         System.out.println("Here's the post order traversal : ");
//         bt.PreOrderTraversal(root);
//         System.out.print("end");
        
//     }
    
// }
class Node 
{
    int val;
    Node left;
    Node right;
    Node(int val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class CreateT_PreO
{
    static int index=0;

    public Node createTree(int arr[])
    {
        if(index>=arr.length || arr[index]==-1)
        {
            index++;
            return null;
        }

        Node root = new Node (arr[index++]);
        root.left=createTree(arr);
        root.right=createTree(arr);

        return root;
    }


    public void pre_order(Node root)
    {
        if(root==null)
        {
            return ;
        }

        System.out.print(root.val+"->");
        pre_order(root.left);
        pre_order(root.right);
    }


    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int left_h=height(root.left);
        int right_h=height(root.right);
        int x =Math.max(left_h,right_h);

        return x+1;
    }

    public static int Dia(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int d1= Dia(root.left);
        int d2= Dia(root.right);
        int d3=height(root.left)+height(root.right)+1;

        int D = Math.max(d3, Math.max(d1,d2));

        return D;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,-1,7,-1,-1,6,5,-1,-1,4,10,-1,-1,9,-1,-1};

        CreateT_PreO t1= new CreateT_PreO();
        Node root=t1.createTree(arr);

        System.out.println("Here's your preorder traversal:");
        t1.pre_order(root);
        System.out.println("end");

        int ht =height(root);
        System.out.println("Height of tree : " +(ht+1));

        int D=Dia(root);
        System.out.println("Diameter : "+D);
    }
}