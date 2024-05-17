import java.util.Arrays;
public class min_min 
{

    public static void main(String[] args)
    {
        
        int[] taskExecutionTimes = {10, 8, 6, 7, 5};
        int numTasks = taskExecutionTimes.length;

        // Array to store the completion time of each task
        int[] completionTimes = new int[numTasks];
        // Array to keep track of whether a task is scheduled or not
        boolean[] scheduledTasks = new boolean[numTasks];
        // Initialize scheduledTasks array to false
        Arrays.fill(scheduledTasks, false);

        // Apply Min-Min algorithm
        for (int i = 0; i < numTasks; i++) 
        {
            int minStartTime = Integer.MAX_VALUE;
            int selectedTask = -1;

            // Find the task with the earliest minimum start time
            for (int j = 0; j < numTasks; j++) 
            {
                if (!scheduledTasks[j]) 
                {
                    if (taskExecutionTimes[j] < minStartTime) 
                    {
                        minStartTime = taskExecutionTimes[j];
                        selectedTask = j;
                    }
                }
            }

            // Schedule the selected task
            scheduledTasks[selectedTask] = true;
            completionTimes[selectedTask] = minStartTime + taskExecutionTimes[selectedTask];
        }

        // Display the completion times for each task
        System.out.println("Task Completion Times:");
        for (int i = 0; i < numTasks; i++) {
            System.out.println("Task " + i + ": " + completionTimes[i]);
        }
    }
}
