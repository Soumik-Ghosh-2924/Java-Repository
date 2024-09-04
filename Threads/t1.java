import java.util.*;
public class t1 
{
    public static void main(String args[])
    {
        System.out.println("calling a thread !");
        Thread t = Thread.currentThread();
        System.out.println("thread details : "+ t);
        System.out.println("thread name : "+t.getName());
    }
    
}
