public class Reverse_recursive
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
	
	// add first
	public void add_first(String data)
	{
		Node new_node = new Node(data);
		if(head==null)
		{
			head=new_node;
			return;
		}
		new_node.next=head;
		head=new_node;
	}
	
	
	
	//add last
	public void add_last(String data)
	{
		Node new_node= new Node(data);
		if(head==null)
		{
			head = new_node;
			return;
		}
		Node curr_node = head;
		while(curr_node.next!=null)
		{
			curr_node=curr_node.next;
		}
		curr_node.next=new_node;
	}
	
	
	//print list
	public void print_list()
	{
		if(head==null)
		{
			System.out.print("This list is empty");
		}
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data + " -> ");
			current=current.next;                   //updation to next node
		}
		System.out.print("NULL");
	}
	
	
	//reverse list
	public void reverseList()
	{
		if(head==null || head.next==null)
		{
			return ;
		}		
		
		Node previous = head;
		Node current = head.next;
		while(current!=null)
		{
			Node next = current.next;
			current.next=previous;			
			
			//update
			previous=current;
			current=next;
		}
		head.next=null;
		head=previous;
		
	}
	
	
	
	public static void main(String args[])
	{
		Reverse_recursive l1 = new Reverse_recursive();
		l1.add_last("List ?");
		l1.add_last("Determine.");
		l1.add_first("is it a");
		l1.print_list();
		
		System.out.println();
		System.out.println();
		
		
		l1.reverseList();
		l1.print_list();
		
	}
	
}