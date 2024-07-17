package exceptionhandling;

public class sampleException2 
{
    public static void main(String[] args) 
    {
        // String s = null;
        // System.out.println(s.length());

        try
        {
            int a =10;
            int b=0;
            // int c= a/b;
            // System.out.println("the result is : "+ c);

            try
            {
                int  x=Integer.parseInt("Soumik");
                System.out.println(x);
            }
            catch(NumberFormatException e)
            {
                System.out.println("There's an incorrect format.");
            }

            try
            {
                String name="Madhusnuhi";
                String sub=name.substring(5,12);
                System.out.println(sub);
            }

            catch(StringIndexOutOfBoundsException e)
            {
                System.out.println("The index that u are trying to access is out of bounds.");
            }

        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide a number by zero.");
        }
    }
}
