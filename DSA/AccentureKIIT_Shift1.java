package DSA;

public class AccentureKIIT_Shift1 
{
    static String cal_space(String str1, String str2)
    {
        int s1=0,s2=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)==' ')
            s1++;
        }
        for(int i=0;i<str2.length();i++)
        {
            if(str2.charAt(i)==' ')
            s2++;
        }
        int c=Math.abs(s1-s2);
        if(c%2==0)
        {
            return ("even"+c);
        }
        else{
            return ("odd"+c);
        }
    }


    public static void main(String args[])
    {
        String s1= "Hello World";
        String s2= "he l lo w or ld";

        String res=cal_space(s1,s2);

        System.out.println(res);
    }
    
}
