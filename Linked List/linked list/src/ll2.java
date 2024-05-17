public class ll2 
{
	Node head;
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void addFirst(String data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	
	public void addLast(String data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node current = head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
	}
	
	public void print()
	{
		if(head==null)
		{
			System.out.print("The list is empty");
			return ;
		}
		
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data+" -> ");
			current=current.next;
		}
		System.out.println("NULL");
	}
	
	
	public void delete_first()
	{
		if(head==null)
		{
			System.out.printf("Empty list");			
		}
		
		head=head.next;
	}
	
	
	public void delete_last()
	{
		if(head==null)    //corner case 1
		{
			System.out.println("Empty List.");
			return;
		}
		
		if(head.next == null) //corner case 2 : if the list has only one node 
		{
			head=null;
		}
		
		Node secondlast = head;
		Node last=head.next;
		while(last.next!=null)
		{
			last=last.next;
			secondlast=secondlast.next;
		}
		secondlast.next=null;
		
	}
	
	public static void main(String args[])
	{
		
		ll2 l2= new ll2();
		l2.addFirst("hey");
		l2.addFirst("Soumik !");
		
		l2.print();
		
		System.out.println();
		System.out.println();
		
		
		l2.addLast("How ");
		l2.addLast("are you?");
		l2.print();
		
		l2.delete_first();
		System.out.println();
		System.out.println();
		
		l2.print();
	}

}
