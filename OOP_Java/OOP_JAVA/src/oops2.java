class Stud
{
	String name ;
	int age;
	
	public void printInfo()
	{
		System.out.print(name+" ");
		System.out.println(age);	
	}
	
	
	//constructor are same as function or methods but with certain conditions.
	//They have the same name as that of the class.
	//They do not have a return type.
	//They are called just once unlike any function or method.
	//They are of 2 types : a. Non parameterized  b. parameterized
	//Constructors are by default created during the creation of an object of a class and they are not to be called separately.
	//java does not support the idea of the destructors instead it supports the concept of Garbage collection using Garbage Collector.
	
	
	Stud(String name, int age) //Parameterized
	{
		this.name=name;     //this.name represents the object's member variables value which is being assigned the value with the parameter "name". 
		this.age=age;
	}
	
}


public class oops2 
{
	public static void main(String args[])
	{
		Stud S1 = new Stud("Soumik", 21); // new keyword helps in allocating a new space in the memory heap where it stores the object's details. 
		
		S1.printInfo();
						
	}
}
