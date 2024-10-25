package ADVANCE_JAVA;

abstract class anom
{
    public void help(){};

}


public class P4 
{
    public static void main(String args[])
    {
        anom A= new anom()
        {
            public void help()
            {
                System.out.println("was a great help ! ");
            }
        };

        A.help();
    }
    
}
