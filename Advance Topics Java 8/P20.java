package ADVANCE_JAVA;

class customException extends Exception{
    public customException(String X)
    {
        super(X);
    }
}


public class P20 
{
    public static void main(String[] args) {
        
        String Sentence="Xcsdewakkk";

        try{
            char ch = Sentence.charAt(6);
            if(ch == 'a')
            {
                throw new customException("Watch out.");
            }
        }
        catch(customException E)
        {
            System.out.println("New Custom Exception "+E);
        }

        catch(NullPointerException E)
        {
            System.out.println("The string is empty."+E);
        }

        catch(Exception E)
        {
            System.out.println("Something's Wrong.");
        }


        System.out.println("Error has been taken care of.");

    }
}
