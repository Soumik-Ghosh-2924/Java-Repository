package ADVANCE_JAVA;



class SoumikException extends Exception
{
    public SoumikException(String example)
    {
        super(example);
    }
}

public class P18 {
    public static void main(String args[])
    {
        int x=10;

        try{
            int k=20/x;
            if(k==2)
            {
                throw new SoumikException("Hey Soumik's Exception.");
            }
        }

        catch(SoumikException e)
        {
            System.out.println("Never mind.");
        }

        catch(Exception e)
        {
            System.out.println("Parent Exception Class.");
        }
    }
}
