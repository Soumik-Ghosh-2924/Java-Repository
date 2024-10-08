package DSA;
import java.util.*;

class Node6
{
    Node6 left;
    Node6 right;
    int val;
    Node6(int val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }
}


public class leftside_view 
{
    static int index=0;
    public Node6 buildTree(int arr[])
    {
        if(index>= arr.length || arr[index]==-1)
        {
            index++;
            return null;
        }

        Node6 root= new Node6(arr[index++]);
        root.left=buildTree(arr);
        root.right=buildTree(arr);

        return root;
    }

    public List<Integer> leftView(Node6 root)
    {
        Queue<Node6> q = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        if(root == null)
        {
            return list;
        }

        q.offer(root);

        while(!q.isEmpty())
        {
            int len=q.size();
            for(int i=0;i<len;i++)
            {
                Node6 n = q.poll();
                if(i==0)
                {
                    list.add(n.val);
                }
                if(n.left!=null)
                {
                    q.offer(n.left);
                }

                if(n.right!=null)
                {
                    q.offer(n.right);
                }
            }
        }

        return list;
    }


    public static void main(String args[])
    {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        leftside_view l = new leftside_view();
        Node6 root = l.buildTree(arr);

        List<Integer> result = new LinkedList<>();
        result=l.leftView(root);

        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i)+"->");
        }
        System.out.print("end");
    }
    
}
