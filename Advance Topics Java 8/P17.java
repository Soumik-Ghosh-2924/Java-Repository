package ADVANCE_JAVA;

public class P17 
{
    public static void main(String args[])
    {

        int i=2;
        int j=0;

        try
        {
            j=12/i;
            if(j==6)
            {
                throw new ArithmeticException("Hey custom Exception.");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Mathematical Exception"+e);
        }
        catch(Exception e)
        {
            System.out.println("Something's Wrong.");
        }

        System.out.println("Hey! It's absolutely fine.");
    }
    
}
