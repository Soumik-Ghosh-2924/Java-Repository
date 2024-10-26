package ADVANCE_JAVA;

public class P15 
{
    public static void main(String args[])
    {

        int i=0;
        int j=0;

        try{
            j=23/i;
        }
        catch(Exception e)
        {
            System.out.println("Handling Arithmetic Exception." +e);
        }

        System.out.println("j value : "+j+"-");
        System.out.println("Out-side try-catch Block.");

    }
    
}
