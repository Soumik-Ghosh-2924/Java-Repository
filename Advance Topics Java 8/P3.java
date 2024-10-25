package ADVANCE_JAVA;

class Demo
{
    public void demonstrate()
    {
        System.out.println("A demo for you.");
    }
}



public class P3 
{
    public static void main(String args[])
    {
        System.out.println("Here we are going to explain about anonymous inner class.");
        System.out.println();
        System.out.println();
        System.out.println();
        Demo d= new Demo()
        {
            public void demonstrate()
            {
                System.out.println("It's an anonymous inner class.");
            }
        };

        d.demonstrate();


    }
    
}
