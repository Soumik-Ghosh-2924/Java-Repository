package exceptionhandling;

public class sampleException1
{
    public static void main(String[] args) 
    {
        // String s = null;
        // System.out.println(s.length());

        try
        {
            int a =10;
            int b=0;
            int c= a/b;
            System.out.println("the result is : "+ c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide a number by zero.");
        }

        try
        {
            int x=Integer.parseInt("Soumik");
            System.out.println("The number is  : " +x);
        }
        catch(NumberFormatException e)
        {
            System.out.println("The number can't be of a string format.");
        }

        try 
        {
            int a[] = new int[10];
            a[12]=10;
            System.out.println(a[12]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The index of the array is out of bound.");
        }
    }
}