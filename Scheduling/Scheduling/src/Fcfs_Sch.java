import java.util.Scanner;
import java.util.*;

class Process
{
	String name;
	int arrTime;
	int bstTime;
	int wtTime;
	int taTime;
	
	Process(String name, int arrTime, int bstTime)
	{
		this.name=name;
		this.arrTime=arrTime;
		this.bstTime=bstTime;
	}
}

public class Fcfs_Sch 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num of tasks: ");
		int n=sc.nextInt();
		Process [] processes = new Process[n];
		for (int i=0;i<n;i++)
		{
			String name=sc.nextLine();
			int arrTime=sc.nextInt();
			int bstTime=sc.nextInt();
			
			processes[i]=Process(name, arrTime, bstTime);
			
		}
		
		
		sort_p(processes);
		
		calculate_p(processes);
		
		
		display_p(processes);
	}
	
	
	public static void sort_p(Process []processes)
	{
		int k=processes.length;
		for(int i=0;i<k-1;i++)
		{
			for(int j=1;j<k-i-1;j++)
			{
				if(processes[i].arrTime>processes[j].arrTime)
				{
					int temp = processes[i].arrTime;
					processes[i].arrTime=processes[i+1].arrTime;
					processes[i+1].arrTime=temp;
				}
			}
		}
	}
	
	
	
	public static void calculate_p(Process[] processes)
	{
		
		int p= processes.length;
		
		processes[0].wtTime=0;
		processes[0].taTime=processes[0].bstTime;
		
		for(int i=1;i<p;i++)
		{
			processes[i].wtTime= processes[i-1].wtTime + processes[i-1].bstTime;
			processes[i].taTime=processes[i].wtTime + processes[i].bstTime;
			
			
			
		}
		
		
		
	}
	
	
	
	
	

}
