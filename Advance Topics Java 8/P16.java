package ADVANCE_JAVA;

public class P16 
{
    public static void main(String[] args) 
    {
        int i=1;
        int j=0;
        int arr[]= new int[5];
        String S=null;

        try{
            j=13/i;
            arr[1]+=1;
            System.out.println(S.charAt(6));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator can't be zero.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Going  out of bounds.");
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Pointer exception.");
        }
        catch(Exception e) 
        //This is the Parent exception class
        //This block should be kept at last after
        //mentioning all the sub-classes of exceptions.
        {
            System.out.println("Something went wrong.");
        }

        System.out.println("Handled.");
    }
    
}
