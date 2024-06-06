//the below program demonstrates pure abstraction using the concept of abstraction
//In java the concept of Multiple inheritance is exhibited usng interfaces
//The example below exhibits multiple inheritance.


interface Animal{
    void walk();
}

interface herbivore
{
    void eats();
}

class horse implements Animal,herbivore
{
    public void walk()
    {
        System.out.println("Walks on 4 legs.");
    }

    public void eats()
    {
        System.out.println("eats grass.");
    }

}



public class oops_mi {
    
}
