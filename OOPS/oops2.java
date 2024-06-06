class Student
{
    String Name;
    int age;

    // Student() //Non-parameterized constructor
    // {
    //     System.out.println("constructor called");
    // }
    
    Student(String name, int a) //parameterized constructors
    {
        this.Name=name;
        this.age=a;
    }

    Student(Student s2) // this is an example for copy constructor
    {
        this.Name=s2.Name;
        this.age=s2.age;
    }
    
    Student()
    {

    }

    public void print()
    {
        System.out.println(this.age);
        System.out.println(this.Name);
    }
}


public class oops2 
{
    public static void main(String args[])
    {
        // Student s1= new Student();
        // s1.Name="Soumik";
        // s1.age=21;
        //s1.print();
        Student s1 =new Student("Madhusnuhi", 22);
        s1.print();

        System.out.println();
        System.out.println();

        Student s2= new Student(s1);
        s2.print();

    }
    
}
