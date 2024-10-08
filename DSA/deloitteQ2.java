package DSA;

public class deloitteQ2 
{
    public static void rever(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        String s=sb.reverse().toString();
        System.out.println(s);
        String w[] = s.split(" ");
        StringBuilder res= new StringBuilder();
        for(String wo : w)
        {
            StringBuilder rev_word = new StringBuilder(wo);

            res.append(rev_word);
            res.append(" ");
        }

        String f=res.toString().trim();
        System.out.println(f);
    }

    public static void main(String args[])
    {
        String s="hello! i am Soumik.";
        rever(s);
    }
    
}
