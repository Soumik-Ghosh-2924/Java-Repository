package ADVANCE_JAVA;


class X extends Thread{
    public void run()
    {
        for(int i=1;i<100;i++)
        {
            System.out.println("hello.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}



class Y extends Thread
{
    public void run()
    {
        for(int i=1;i<100;i++)
        {
            System.out.println("hi.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}



public class P24 {
    public static void main(String args[]) throws NumberFormatException
    {
        X obj1= new X();
        Y obj2= new Y();


        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 

        obj2.start();


    }
      
    
}
