import java.util.Arrays;

class max_min {
    static void maxMinScheduling(int[] tasks, int numOfProcessors) 
    {
        int[] completionTimes = new int[numOfProcessors];
        Arrays.sort(tasks);

        for (int i = tasks.length - 1; i >= 0; i--) 
        {
            int minIndex = findMinIndex(completionTimes);
            completionTimes[minIndex] += tasks[i];
            System.out.println("Task " + tasks[i] + " scheduled on Processor " + (minIndex + 1));
        }
    }

    static int findMinIndex(int[] completionTimes) {
        int minIndex = 0;
        int minCompletionTime = completionTimes[0];

        for (int i = 1; i < completionTimes.length; i++) {
            if (completionTimes[i] < minCompletionTime) {
                minCompletionTime = completionTimes[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] tasks = {4, 6, 2, 8, 3, 7}; // Processing times of tasks
        int numOfProcessors = 2;

        System.out.println("Max-Min Scheduling:");
        maxMinScheduling(tasks, numOfProcessors);
    }
}