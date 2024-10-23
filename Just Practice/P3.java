class calculator1
{
    static int add(int n, int o)
    {
        return n+o;
    }

    static int add(int a, int b, int c)
    {
        return a+b+c;
    }

    static double add(double x, int y)
    {
        return x+y;
    }
}



public class P3 
{ 
    public static void main(String args[])
    {
        calculator1 c= new calculator1();
        int res1=c.add(2,5);
        int res2=c.add(1,9,10);
        Double res3=c.add(2.5, 6);

        System.out.println("res1: "+res1);
        System.out.println("res2: "+res2);
        System.out.println("res3: "+res3);
    }
    
}
