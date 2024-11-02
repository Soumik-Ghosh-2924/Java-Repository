package ADVANCE_JAVA;


class X extends Thread{
    public void run()
    {
        for(int i=1;i<100;i++)
        {
            System.out.println("hello.");
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
        }
    }
}



public class P23 {
    public static void main(String args[]) throws NumberFormatException
    {
        X obj1= new X();
        Y obj2= new Y();

        obj1.start();
        obj2.start();


    }
      
    
}
