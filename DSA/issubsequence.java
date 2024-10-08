package DSA;

public class issubsequence 
{
    static boolean issubsequence(String check, String original)
    {
        int i=0,j=0;
        while(i<check.length() && j<original.length())
        {
            if(check.charAt(i)==original.charAt(j))
            {
                i++;
                j++;
            }
            else
                j++;
        }
        if(i==check.length())
            return true;
        return false;    
    }
    public static void main(String args[])
    {
        String check="che";
        String original="abcdghelp";

        boolean find=issubsequence(check, original);

        System.out.println(find);
    }
    
}
