class ll1
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
	
	
	
	public static void main(String args[])
	{
		ll1 l1 = new ll1();
		l1.add_first("is");
		l1.add_first("a");
		
		l1.print_list();
		
		System.out.println();
		System.out.println();
		
		l1.add_last("List ?");
		l1.add_last("Determine.");
		
		l1.print_list();
		
	}
	
}