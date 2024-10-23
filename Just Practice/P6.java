class Student 
{
    int roll;
    int marks;
    String name;
}


public class P6 
{
    public static void main(String args[])
    {
        Student s1= new Student();
        s1.name="Soumik";
        s1.marks=80;

        Student s2= new Student();
        s2.name="Madhu";
        s2.marks=90;

        Student s3= new Student();
        s3.name="Swarnim";
        s3.marks=85;

        Student s[]= new Student[3];

        s[0]=s1;
        s[1]=s2;
        s[2]=s3;

        System.out.println(" The student details are as follows : ");

        // for(int i=0;i<s.length;i++)
        // {
        //     System.out.println(s[i].name+" : " +s[i].marks);
        // }

        for(Student std : s)
        {
            System.out.println(std.name+" : "+std.marks);
        }
    }
    
}
