package exceptionhandling;

public class sampleException7 {
    private int id;

    public sampleException7(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup code here
            System.out.println("Finalize method called for object with id: " + id);
        } finally {
            // Call the superclass finalize method
            super.finalize();
        }
    }

    public static void main(String[] args) {
    	sampleException7 obj1 = new sampleException7(1);
    	sampleException7 obj2 = new sampleException7(2);

        obj1 = null; // Eligible for garbage collection
        obj2 = null; // Eligible for garbage collection

        // Suggest the JVM to run garbage collector
        System.gc();

        // Give the garbage collector some time to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method");
    }
}