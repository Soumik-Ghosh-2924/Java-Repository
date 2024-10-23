
class Mobile 
{
    int price ;
    String brand;
    static String name;


    public void show()
    {
        System.out.println(brand+" : "+price);
    }

    public static void show1(Mobile ob)
    {
        System.out.println(ob.brand+" : "+ob.price+" : "+ob.name);
    }
}



public class P8 
{
    public static void main(String args[])
    {
        Mobile.name="smartphone";
        Mobile m1 = new Mobile();
        m1.brand="Apple";
        m1.price=1000;
        

        Mobile m2 = new Mobile();
        m2.brand="Samsung";
        m2.price=2000;

        m1.show();
        m2.show();  
        
        Mobile.show1(m1);

    }
   
}
