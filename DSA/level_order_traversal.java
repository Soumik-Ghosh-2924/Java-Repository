package DSA;
import java.util.*;

class Node5
{
    Node5 left;
    Node5 right;
    int val;
    Node5(int val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }    
}


public class level_order_traversal 
{
    private static int index=0;
    public Node5 buildTree(int arr[])
    {
        if(index>= arr.length || arr[index]==-1)
        {
            index++;
            return null;
        }

        Node5 root= new Node5(arr[index++]);
        root.left=buildTree(arr);
        root.right=buildTree(arr);

        return root;
    }

    public List<List<Integer>> levelOrder(Node5 root)
    {
        Queue<Node5> q =  new LinkedList<>();
        List<List<Integer>> l =  new LinkedList<>();
        if(root==null)
        {
            return l;
        }

        q.offer(root);

        while(!q.isEmpty())
        {
            int len=q.size();
            List<Integer>list = new LinkedList<>();
            for(int i=0;i<len;i++)
            {
                if(q.peek().left!=null)
                {
                    q.offer(q.peek().left);
                }

                if(q.peek().right!=null)
                {
                    q.offer(q.peek().right);
                }

                list.add(q.poll().val);
            }
            l.add(list);
        }

        return l;
    }


    public static void main(String args[])
    {
        int arr[] ={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        level_order_traversal l1 = new level_order_traversal();
        Node5 root = l1.buildTree(arr);

        List<List<Integer>>ans=l1.levelOrder(root);

        int rows=ans.size();
        for(int i=0;i<rows;i++)
        {
            int cols=ans.get(i).size();
            for(int j=0;j<cols;j++)
            {
                System.out.print(ans.get(i).get(j)+"->");
            }
            System.out.print("end.");
            System.out.println();
        }
    }
}