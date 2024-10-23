class a{
    a()
    {
        System.out.println("constructor for class 'a' ");
    }

    public void show()
    {
        System.out.println("hell of a show");
    }
}


public class P11 
{
    public static void main(String args[])
    {
        System.out.println("This is to show the concept of the anonymous object.");
        System.out.println();
        System.out.println();

        new a().show();
        
    }
    
}
