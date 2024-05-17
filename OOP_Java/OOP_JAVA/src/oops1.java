class Stu
{
	String name ;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);	
	}
	
	
	//constructor are same as function or methods but with certain conditions.
	//They have the same name as that of the class.
	//They do not have a return type.
	//They are called just once unlike any function or method.
	//They are of 2 types : a. Non parameterized  b. parameterized
	//Constructors are by default created during the creation of an object of a class and they are not to be called separately.
	
	
	Stu() //Non parameterized
	{
		System.out.println("Constructor called");
	}
	
}


public class oops1 
{
	public static void main(String args[])
	{
		Stu S1 = new Stu(); // new keyword helps in allocating a new space in the memory heap where it stores the object's details. 
		S1.name= "Soumik Ghosh";
		S1.age = 21;
		
		S1.printInfo();
						
	}
}
