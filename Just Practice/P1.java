import java.util.*;

class calculator 
{
    int num;
    calculator()
    {

    }

    calculator(int n)
    {
        this.num=n;
    }

    static int add(calculator a, calculator b)
    {
        int res=a.num+b.num;
        return res;
    }
}



public class P1
{

    public static void main(String args[])
    {
        calculator c1= new calculator(12);
        calculator c2= new calculator(25);
        calculator c3= new calculator();
        // int result=c1.num+c2.num;
        // System.out.println("The sum id : "+result);

        int sum= c3.add(c1, c2);

        System.out.println("The sum is : "+sum);
    }
}     