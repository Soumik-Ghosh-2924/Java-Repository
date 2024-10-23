package Inheritance;

public class Demo extends AdvCalc
{
    public static void main(String args[])
    {
        Demo d1=new Demo();
        int r1=d1.add(5,6);
        int r2=d1.sub(2,1);
        int r3=d1.multiply(8,7);
        int r4=d1.div(12,5);

        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
    
}
