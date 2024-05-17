import java.util.Scanner;

class Process {
    String name;
    int arrTime;
    int bstTime;
    int wtTime;
    int taTime;

    Process(String name, int arrTime, int bstTime) {
        this.name = name;
        this.arrTime = arrTime;
        this.bstTime = bstTime;
    }
}

public class FCFS 
{
    public static void main(String[] args) 
    {       
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no. of processes: ");
        int no_of_Processes = scanner.nextInt();

        Process[] processes = new Process[no_of_Processes];

        // Input process details
        for (int i = 0; i < no_of_Processes; i++) {
            System.out.print("Enter name, arrival time, and burst time for process " + (i + 1) + ": ");
            String name = scanner.next();
            int arrTime = scanner.nextInt();
            int bstTime = scanner.nextInt();

            processes[i] = new Process(name, arrTime, bstTime);
        }

        // Sort processes based on arrival time
        sort_p(processes);
        
     // Display results
        display_r(processes);

        // Calculate waiting time and turnaround time
        calculate_t(processes);

        scanner.close();
    }

    private static void sort_p(Process[] processes) {
        // Simple bubble sort based on arrival time
        int n = processes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (processes[j].arrTime > processes[j + 1].arrTime) {
                    // Swap processes
                    Process temp = processes[j];
                    processes[j] = processes[j + 1];
                    processes[j + 1] = temp;
                }
            }
        }
    }

    private static void calculate_t(Process[] processes) 
    {
    	int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        processes[0].wtTime = 0;
        processes[0].taTime = processes[0].bstTime;

        for (int i = 1; i < processes.length; i++) 
        {
            processes[i].wtTime = processes[i - 1].wtTime + processes[i - 1].bstTime;
            processes[i].taTime = processes[i].wtTime + processes[i].bstTime;

            totalWaitingTime += processes[i].wtTime;
            totalTurnaroundTime += processes[i].taTime;
            
        }
        double averageWaitingTime = (double) totalWaitingTime / processes.length;
        double averageTurnaroundTime = (double) totalTurnaroundTime / processes.length;

        System.out.println("\nAverage Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
    }

    
    private static void display_r(Process[] processes) 
    {
    	
        for (Process process : processes) 
        {
            System.out.println(process.name + "\t\t" + process.arrTime + "\t\t\t" +
                    process.bstTime + "\t\t\t" + process.wtTime + "\t\t\t" + process.taTime);
        }

        
    }
}
