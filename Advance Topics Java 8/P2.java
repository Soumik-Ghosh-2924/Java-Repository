package ADVANCE_JAVA;

class A
{
    public static  void Show()
    {
        System.out.println("In A show.");
    }


    class a{
        public void config1()
        {
            System.out.println("Inner Class 1 config 1. ");
        }

    }

    static class b{
        public void config2()
        {
            System.out.println("Inner class 2 config 2. ");
        }
    }

}


public class P2 
{
    public static void main(String args[])
    {

        System.out.println("We have tried to explain here about inner class here.");
        System.out.println();
        System.out.println();
        System.out.println();



        A ob = new A();
        A.Show();


        A.a ob1 = ob.new a();
        ob1.config1();

        A.b ob2 = new A.b();
        ob2.config2();

    }
    
}
