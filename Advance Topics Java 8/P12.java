package ADVANCE_JAVA;

@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show()
//     {
//         System.out.println("In show ." );
//     }

// }

public class P12
{
    public static void main(String args[])
    {
        // B ob = new B();
        // ob.show();


        A obj = new A()
        {
            public void show()
            {
                System.out.println("Anonymous Inner class.");
            }

        };

        obj.show();
    }
}
