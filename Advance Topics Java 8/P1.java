package ADVANCE_JAVA;

abstract class Car
{
    public abstract void drive();

    static void model()
    {

    }
}

class Audi extends Car
{
    public void drive()
    {
        System.out.println("Its an Audi.");
    }

    static void model()
    {
        System.out.println("The model is R8.");
    }
}

class BMW extends Car
{
    public void drive()
    {
        System.out.println("It's a BMW.");
    }

    static void model()
    {
        System.out.println("It's an M5.");
    }
}


public class P1
{
    public static void main(String args[])
    {

        System.out.println();
        System.out.println("This is an example related to the abstract keyword. ");
        System.out.println();
        System.out.println();
        Audi A =new Audi();
        A.drive();
        A.model();

        BMW B = new BMW();
        B.drive();
        B.model();
    }
 
}