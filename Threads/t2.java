import java.util.*;

public class t2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i*2);
        }
    }
    public static void  main(String args[])
    {
        t2 obj = new t2();

        Thread th = new Thread(obj);
        th.start();

    }
    
}
