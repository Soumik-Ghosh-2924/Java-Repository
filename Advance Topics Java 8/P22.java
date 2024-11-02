package ADVANCE_JAVA;

public class P22 
{
    public static void main(String args[])
    {

        int arr[]= new int[3];

        try{
            arr[6]=arr[2]+11;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exceeding limit."); 
        }
        catch(Exception e)
        {
            System.out.println("Wrong.");
        }
        finally{
            System.out.println("Bye.");
        }

    }
    
}
