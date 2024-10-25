package ADVANCE_JAVA;

//Here we are gonna talk about annotations.
class A{
    public void show()
    {
        System.out.println("In A Show.");
    }
}

class B extends A
{
    @Override
    public void show()
    {
        System.out.println("In B show. ");
    }
}
public class P11 
{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
    
}
