package DSA.Linked_list;
import  DSA.Linked_list.Node;

public class ll2 
{

    public static Node addFirst(Node head, int a)
    {
        Node start=  new Node(a);
        if(head==null)
        {
            return start;
        }
        
        start.next=head;
        return start;
    }

    public static void addLast(Node head, int b)
    {
        Node end = new Node(b);
        Node temp=head;
        while(temp.next!=null)
        {   
            temp=temp.next;
        }
        temp.next=end;
    }

    public static Node delete_middle(Node head)
    {
        if(head.next==null)
        {
            return null;
        }
        Node slow=head;
        Node fast=head;

        while(fast.next.next!=null && fast.next.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=slow.next.next;
        return head;
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


    public static void main(String args[])
    {
        ll2 list = new ll2();
        Node head=null;
        head=addFirst(head, 10);
        head=addFirst(head, 20);
        head=addFirst(head, 35);
        head=addFirst(head, 42);
        // list.addLast(head, 51);
        list.addLast(head, 65);
        list.addLast(head, 72);
        list.addLast(head, 80);


        System.out.println("Here's your Linked List : ");
        list.printLL(head);
        System.out.println("end");

        head=delete_middle(head);
        System.out.println("After deleting the middle node : ");
        list.printLL(head);
        System.out.println("end");


    }
    
}
