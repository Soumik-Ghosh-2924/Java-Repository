class student
{
	String name ;
	int age;
	
	student()
	{
		
	}
	
	student(student s2) //This is the copy instructor that is used to copy the details of the object s1 to the object s2. 
	{
		this.name=s2.name;
		this.age=s2.age;
	}
	
	
	public void Print_info()
	{
		System.out.println(name);
		System.out.println(age);
	}
}

public class copy_constructor 
{
	public static void main(String args[])
	{
		student s1= new student();
		s1.name="Soumik";
		s1.age=21;
		
		student s2 = new student(s1);
		
		s2.Print_info();
		
				
	}

}
