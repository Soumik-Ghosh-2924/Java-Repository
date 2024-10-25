package ADVANCE_JAVA;
//Here we are gonna implement the concept of 
//lambda expresion

@FunctionalInterface
interface X{
    void run();
}


@FunctionalInterface
interface Y{
    void walk(int w);
}

public class P13 {
    public static void main(String args[])
    {
        // X object = () ->
        // {            
        //     System.out.println("Lambda");
        // };

        X object = () -> System.out.println("Run");
        object.run();

        System.out.println();
        System.out.println();


        Y obj = (w) -> System.out.println("walk "+w+" kms");
        obj.walk(10);
    }
    
}
