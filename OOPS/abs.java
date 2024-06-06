package OOPS;
abstract class Animal 
{
	//The progam demonstrated below is not a example 
	//of pure abstraction. Pure abstraction is achieved
	//using interfaces.
	//blueprint of a class
//its an abstract class and it can't be instantiated
//it can have static methods and constructors
//it can also have member methods 
//it can also have abstract methods
	String name;
	abstract void walk();
	Animal()
	{
		System.out.println("Animal constructor.");
	}
	public void eats()
	{
		System.out.println("Animal eats.");
	}
}

class horse extends Animal
{
	horse()
	{
		System.out.println("Horse constructor.");
	}
	public void walk()
	{
		System.out.println("Walks on four legs!");
	}
}

class hen extends Animal
{
	public void walk()
	{
		System.out.println("Wlaks on 2 legs.");
	}
}
public class abs 
{
	public static void main(String args[])
	{
		horse h1 = new horse();
		//in the above statement when the object of the class horse 
		// is created the constructor of the base class is called first 
		// and then the constructor of the derived class is called.
		//This concept is better known as CONSTRUCTOR CHAINING.
		h1.walk();
		h1.eats();
//		Animal a1= new Animal();
//		a1.walk();
		
		
	}

}
