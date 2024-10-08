package DSA.Linked_list;
import  DSA.Linked_list.Node;


public class ll1 
{
    public static Node addFirst(Node head,int a)
    {
        Node start = new Node(a);
        if(head==null)
        {
            return start;
        }

        start.next=head;
        return start;
    }

    public void printLL(Node head)
    {
        Node temp =head;
        if(head==null)
        {
            return ;
        }

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }


    public static void addLast(Node head, int x)
    {
        Node end =new Node(x);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=end;
    }



    public static void main(String args[])
    {
        Node head=null;
        ll1 list = new ll1();
        head=list.addFirst(head, 10);
        head=list.addFirst(head, 20);
        head=list.addFirst(head, 35);
        head=list.addFirst(head, 42);
        list.addLast(head, 51);
        list.addLast(head, 65);
        list.addLast(head, 72);
        list.addLast(head, 80);

        System.out.println("Here's your Linked List : ");
        list.printLL(head);
        System.out.println("end");

    }
    
}
