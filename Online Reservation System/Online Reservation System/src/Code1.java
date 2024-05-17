import java.util.Scanner;
public class Code1 
{ 
	private static boolean s[] = new boolean[100];
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. View Seat Arrangements. ");
			System.out.println("2. Reserve your seat. ");
			System.out.println("3. Cancel Your Reservation.");
			System.out.println("4. Wrong choice.");
			
			int ch;
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					view_seat_status();
					break;
					
				case 2:
					reserve_seat();
					break;
				
				case 3:
					cancel_reservation();
					break;
					
				case 4:
					System.exit(0);
				
				case 5:
					System.out.println("Entered wrong choice.");
					break;
			}
					
				
		}
	}
	
	private static void view_seat_status()
	{
		System.out.println("Current seat status .");
		for(int i=0; i<s.length;i++)
		{
			if(s[i])
			{
				System.out.print((i+1)+" -  X \n");
			}
			else
			{
				System.out.print((i+1)+" "+"empty"+"\n");
			}
		}
		
	}
	
	private static void reserve_seat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the seat number u want to reserve :");
		int sn=sc.nextInt();
		if(sn<1||sn>100)
		{
			System.out.println("Wrong choice of seat");
		}
		else
		{
			s[sn-1]=true;
			System.out.println("Your seat is reserved.");
		}
		
		
	}
	
	private static void cancel_reservation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the seat number u have been allotted to : ");
		int sn=sc.nextInt();
		if(sn<1||sn>100)
		{
			System.out.println("Wrong choice of seat");
		}
		else
		{
			s[sn-1]=false;
			System.out.println("Your seat reservation has been cancelled.");
		}
		
	}
}
		
		
		
		
		

