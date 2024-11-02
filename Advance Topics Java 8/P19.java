package ADVANCE_JAVA;

public class P19 
{
    public static void main(String args[])
    {
        int i=5;
        int k=0;

        try
        {
            i=2;
            k=20/i;

            if(k==10)
                throw new ArithmeticException("Custom Exception."); //trying to throw 
                // the error using throw;

        }
        catch(ArithmeticException e)
        {
            System.out.println("Getting an arithmetic exception.");
            k=20/1;
            System.out.println("That's what is should return."+e);
        }
        catch(Exception e)
        {
            System.out.println("It's the parent exception class.");
        }


        System.out.println(k);
        System.out.println("error handled.");
    }
}
