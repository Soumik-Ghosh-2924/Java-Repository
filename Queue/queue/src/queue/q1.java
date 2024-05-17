/*Queue is also known as FIFO . 
 * Operations are Enque - Adding elements   O(1)         but using array - O(1)
 * Dequeue - removing elements from the queue. O(1)      but using array - O(n)
 * Deque - to represent a double ended Queue.
 * Peek -  to look at the 1st element of the queue. O(1)   but using array - O(n)
 * we have front and rear markers  in a queue.*/

//Queue using array . Array has a fixed size.


package queue;
public class q1 
{
	static class Queue
	{
		static int arr[];
		static int size;
		static int rear=-1;
		
		
		
		
		
		
		Queue(int n) //constructor for the queue.
		{
			arr=new int[n];
			this.size=n;
		}
		
		public static boolean isEmpty()
		{
			return rear==-1;     // used to return a boolean output regarding the fact whether or not the queue is empty .
		}
		
		
		
		
		
		
		//enqueue
		public static void add(int data)
		{
			if(rear== size-1)
			{
				System.out.println("Queue is full");
				return ;
			}
			
			rear++;
			arr[rear]=data;
		}
		
		
		
		
		
		
		//dequeue
		public static int remove()
		{
			if(rear == -1)
			{
				System.out.println("Empty Queue.");
				return -1;
			}
			
			int front = arr[0];
			
			for(int i=0;i<rear;i++)
			{
				arr[i]=arr[i+1];
			}
			
			rear--;
			return front;
		}
		
		
		
		
		//peek
		public static int peek()
		{
			if(rear==-1)
			{
				System.out.print("empty queue");
				return -1;
			}
			
			return arr[0];
		}
		
	}
	
	
	public static void main(String args[])
	{
		Queue q1 = new Queue(5);
		q1.add(3);
		q1.add(5);
		q1.add(7);
		
		while(!q1.isEmpty())
		{
			System.out.println(q1.peek());
			q1.remove();
			
		}
	}
}
