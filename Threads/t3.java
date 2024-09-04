import java.util.*;

class x implements Runnable {
    // Make stop an instance variable
    public volatile boolean stop = false;

    public void run() {
        for (int i = 1; i <= 100000; i++) {
            System.out.println(i);
            if (stop)  // Check the instance variable stop
                return;
        }
    }
}

public class t3 {

    public static void main(String args[]) throws java.io.IOException {
        x obj = new x();
        Thread th = new Thread(obj);
        th.start();

        System.in.read();  // Waits for the user to press Enter
        obj.stop = true;   // Set stop to true to terminate the thread

        try {
            th.join();  // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
