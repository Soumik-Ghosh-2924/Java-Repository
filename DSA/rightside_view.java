package DSA;
import java.util.*;

class Node7
{
    int val;
    Node7 left;
    Node7 right;
    Node7(int val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class rightside_view 
{
    static int index=0;
    public Node7 buildtree(int arr[]) 
    {
        if(index>arr.length || arr[index]==-1)
        {
            index++;
            return null;
        }

        Node7 root = new Node7(arr[index++]);
        root.left=buildtree(arr);
        root.right=buildtree(arr);

        return root;
    }

    public List<Integer> right_View(Node7 root)
    {
        Queue<Node7> q =new LinkedList<>();
        List<Integer> list =new LinkedList<>();

        if(root==null)
        {
            return list;
        }

        q.offer(root);
        while(!q.isEmpty())
        {
            int len=q.size();
            for(int i=0;i<len;i++)
            {
                Node7 n = q.poll();
                if(i==len-1)
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

        rightside_view R =new rightside_view();
        Node7 root=R.buildtree(arr);

        List<Integer> ans = new LinkedList<>();
        ans=R.right_View(root);

        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+"->");
        }
        System.out.print("end");

    }
   
}
