package DSA;
import java.util.*;


public class Zoho_chfreq
{

    public static String fString(String input)
    {
        Stack<Integer> stack1 =new Stack<>();
        Stack<Character> stack2 =new Stack<>();
        int len = input.length();
        int form_number=0;
        for(int i=0;i<len;i++)
        {
            if(Character.isDigit(input.charAt(i)))
            {
                form_number=form_number*10+(Integer.parseInt(String.valueOf(input.charAt(i))));
            }
            else
            {
                if(form_number>0)
                {
                    stack1.push(form_number);
                }
                form_number=0;
                stack2.push(input.charAt(i));
            }
        }
        if(form_number>0)
        {
            stack1.push(form_number);
        }

        StringBuilder sb =  new StringBuilder();
        while(!stack1.isEmpty())
        {
            char c= stack2.pop();
            int x= stack1.pop();
            for(int a=0;a<x;a++)
            {
                sb.append(c);
            }
        }

        return sb.reverse().toString();
    }
    public static void main(String args[])
    {

        String input="x10z3y2";
        String res= fString(input);
        System.out.println("The result is : "+res);

    }
}