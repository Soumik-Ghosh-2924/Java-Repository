package OOPS ;
/* //Java has automatic garbage collector instead of destructor unlike c++;
//Here we discuss about the concept of polymorphism
//There are 2 types of Polymorphism : 1.Runtime Polymorphism 2.Compile Time polymorphism
//Compile time polymorhism - is generally exhibited through the use of Function ovrloading concept   */

class stud {
    String Name;
    int age;

    public void infor(String Name) {
        System.out.println(Name);
    }

    public void infor(int age) {
        System.out.println(age);
    }

    public void infor(String Name, int age) {
        System.out.println(Name + age);
    }
}

public class oops3 
{
    public static void main(String[] args) {
        stud s2 = new stud();
        String name="Soumik";
        int age=22;
        s2.infor(name);
        s2.infor(age);
        s2.infor(name,age);
    }
}

