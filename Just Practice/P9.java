class Mobile
{
    int price;
    String brand;
    static String name;


    public Mobile()
    {
        brand="";
        price=2000;
        System.out.println("Within the constructor.");
    }

    static 
    {
        name="Smartphone";
        System.out.println("in the static block");
    }

    public void show()
    {
        System.out.println(brand+ " -- "+ price + " -- "+ name);
    }

}



public class P9 
{
    public static void main(String args[]) throws ClassNotFoundException
    {

        Class.forName("Mobile");
        
        // Mobile  m1 = new Mobile();
        // m1.brand="Apple";
        // m1.price=2000;


        // m1.show();
    }
    
}
