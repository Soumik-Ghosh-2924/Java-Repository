package DSA.Linked_list;
import DSA.Linked_list.*;

public class ll4 
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

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=end;
    }




    public static void printLL(Node head)
    {
        Node temp= head;

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }


    public static Node evenodd(Node head)
    {
        if(head==null)
        {
            return null;
        }

        Node even=head.next;
        Node odd=head;
        Node even_start=even;

        while(even!=null && even.next!=null)
        {
            odd.next=odd.next.next;
            odd=odd.next;

            even.next=even.next.next;
            even=even.next;           
        } 

        odd.next=even_start;

        return head;
    }

    public static void main(String args[])
    {
        ll4 list = new ll4();
        Node head=null;
        head=list.addFirst(head,5);
        head=list.addFirst(head, 10);
        head=list.addFirst(head, 15);
        head=list.addFirst(head, 20);
        list.addLast(head, 12);
        list.addLast(head, 13);
        list.addLast(head, 24);
        list.addLast(head, 29);


        list.printLL(head);
        System.err.print("end");

        System.out.println();
        System.out.println();

        head = list.evenodd(head);

        list.printLL(head);
        System.err.print("end");

    }
    
}
