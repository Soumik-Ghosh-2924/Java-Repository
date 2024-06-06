interface Animal
{
    //for an interface all the fields mentioned are by 
    //default public, static and final
    int eyes= 2;
    public void walk(); //all methods are public and abstract by default
}

class horse implements Animal
{
    public void walk()
    {
        System.out.println("The horse has four legs.");
    }
}


public class oops_if {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();

    }
    
}
