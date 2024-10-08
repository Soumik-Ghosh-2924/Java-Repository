package DSA.Linked_list;
import DSA.Linked_list.Node;

public class reverseLL 
{
    public static Node AddNode(int data, Node head)
    {
        Node start = new Node(data);
        if(head==null)
        {
            return start;
        }
        start.next=head;
        return start;
    }

    public static Node reverse(Node start)
    {
        if(start ==null || start.next==null)
        {
            return start;
        }

        Node prev=null;
        Node current= start;
        Node nxt=null;

        while(current!=null)
        {
            nxt=current.next;
            current.next=prev;
            prev=current;
            current=nxt;
        }

        return prev;

    }

    public static void PrintLL(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("end");
    }
    public static void main(String args[])
    {
        reverseLL R = new reverseLL();
        Node head=null;
        head=R.AddNode(23, head);
        head=R.AddNode(35, head);
        head=R.AddNode(55, head);
        R.PrintLL(head);
        
        Node rev =R.reverse(head);

        System.out.println();
        R.PrintLL(rev);
    }
    
}
