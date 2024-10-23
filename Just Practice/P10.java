class Human
{
    private int age;
    private String name;

    void setage(int a)
    {
        System.out.println("Within the age setter function ");
        age=a;
    }
    int getAge()
    {
        return age;
    }

    void setname(String n)
    {
        System.out.println("Within the name setter function . ");
        name=n;
    }

    String getname()
    {
        return name;
    }
}




public class P10 
{
    public static void main(String args[])
    {


        System.out.println("This dummy program is just to explain the concept of Encapsulation.");
        Human Obj = new Human();
        Obj.setage(22);
        Obj.setname("Ghosh");

        System.out.println(Obj.getAge()+" -- "+Obj.getname());
    }
    
}
