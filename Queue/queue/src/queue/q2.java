package queue;

public class q2 
{
	static class node
	{
		int data;
		node next;
		
		node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static class queue
	{
		
		static node head= null;
		static node tail= null;
		
		public static boolean isEmpty()
		{
			return head==null && tail==null;
		}
		
		//Since linked list is a dynamic data structure thus no need to check for its isEmpty()   
		
		//enqueue
		public static void add(int data)
		{
			node newnode = new node(data);
			if(head==null)
			{
				head=tail=newnode;
			}
			tail.next=newnode;
			tail=newnode;
		}
		
		//dequeue - O(1)
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Empty queue");
				return -1;
			}
			
			int front =head.data;
			if(head==tail)
			{
				tail=null;
			}
			
			head=head.next;
			return front;
			
		}
		
		
		//peek
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Empty queue");
				return -1;
			}
			
			return head.data; 
		}
	}
	
	public static void main(String args[])
	{
		queue q1 = new queue();
		
		q1.add(6);
		q1.add(30);
		q1.add(70);
		q1.add(90);
		q1.add(35);
		
		System.out.println(q1.remove());
		q1.add(22);
		System.out.println(q1.remove());
		q1.add(5);
		
		while(!q1.isEmpty())
		{
			System.out.println(q1.peek());
			q1.remove();
		}
	}
}
