import java.util.*;
//static - the properties which are common for a class and to be ket fixed.
//the fields(data members, member methods etc whichever ones are declared static they are 
//allotted memory only once in the Main memory. )
class Student {
    String name;
    static String school;
}

public class oop_stat {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.school = "Saint Xavier's School";
        s1.name = "Soumik";

        System.out.println(s1.name);
        System.out.println(Student.school); // To verify that the static field is working correctly
    }
}

