import java.util.*;

class Node
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

public class outline 
{
    static int index=-1;
    public static Node buildTree(int nodes[])
    {
        index++;
        if(nodes[index]==-1)
        {
            return null;
        }
        Node root= new Node(nodes[index]);
        root.left= buildTree(nodes);
        root.right=buildTree(nodes);

        return root;
    }

    public static List<Integer> leftSideview(Node root)
    {
        Queue<Node> q =new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty())
        {
            int len=q.size();
            for(int i=0;i<len;i++)
            {
                Node temp= q.poll();
                if(i==0)
                {
                    list.add(temp.data);
                }

                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }


                if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
            }
        }
        
        return list;
    }


    public static List<Integer> rightSideView(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty())
        {
            int len= q.size();
            for(int i=0;i<len;i++)
            {
                Node temp=q.poll();
                if(i==len-1)
                {
                    list.add(temp.data);
                }

                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }

                if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
            }
        }
        return list;
    }

    public static void main(String args[])
    {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ;
        outline bt = new outline();
        Node root= bt.buildTree(nodes);
        List<Integer> left = new LinkedList<>();
        List<Integer> right = new LinkedList<>();

        left=leftSideview(root);
        Collections.reverse(left);
        left.remove(left.size()-1);
        right=rightSideView(root);


        List<Integer> result = new LinkedList<>();
        result.addAll(left);
        result.addAll(right);
        System.out.println("The outline of the tree is : " + result);

        Thread t = Thread.currentThread();

        System.out.println(t.getAllStackTraces());

    }
    
}
