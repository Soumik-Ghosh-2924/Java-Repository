package DSA.Linked_list;
import DSA.Linked_list.Node;

public class ll3 
{
    public static Node addFirst(Node head, int a)
    {
        Node start = new Node(a);
        if(head==null)
        {
            return start;
        }
        start.next=head;
        return start;
    }


    public static void addLast(Node head, int a)
    {
        Node end = new Node(a);
        if(head==null)
        {
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=end;
    }

    public static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }


    public static Node reverseList(Node head)
    {
        if(head==null)
        {
            return head;
        }

        Node prev=null;
        Node current = head;
        Node nxt=null;

        while(current !=null)
        {
            nxt=current.next;
            current.next= prev;
            prev=current;
            current=nxt;
        }

        return prev;
    }

    public static void main(String args[])
    {
        ll3 list= new ll3(); 
        Node head=null;
        head=list.addFirst(head,20);
        head=list.addFirst(head,30);
        head=list.addFirst(head,40);
        list.addLast(head,50);
        list.addLast(head,60);
        list.addLast(head,70);

        list.print(head);
        System.out.println("end");

        head=list.reverseList(head);


        list.print(head);
        System.out.println("end");
    }
    
}
