package exceptionhandling;

public class sampleException4
{
    public static void main (String args[])
    {
        try
        {
            String name = "hello java.";
            StringBuilder sc= new StringBuilder();
            sc.append(name.charAt(13));

            String k=sc.toString();
            System.out.println(k);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("The String index you are trying to access is out of bounds. ");
        }
        finally
        {
            System.out.println("The finally block in a try catch block is always executed.");
        }
    }
}

