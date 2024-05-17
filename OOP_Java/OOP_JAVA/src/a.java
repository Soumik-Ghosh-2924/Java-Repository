/*
An abstract class must be declared with an abstract keyword. 
It can have abstract and non abstract methods. 
It cannot be instantiated.
It can have constructors and static methods also. 
It can have final methods which will force the sub class not to change the body of 
the method.
*/


abstract class Animal 
{
	
	Animal()
	{
		System.out.println("Animal created .");
	}
	public void walk()
	{
	}
	public void eat()
	{
		System.out.println("Animal eats.");
	}
}
/*Whenever the object of the derived class is created the constructor of the base class is first called and then the constructor 
 derived class gets called . This is called constructor chaining.*/


class horse extends Animal
{
	horse()
	{
		System.out.println("Horse created ");
	}
	public void walk()
	{
		System.out.println("Walks on four legs!");
	}
}



class chicken extends Animal
{
	public void walk()
	{
		System.out.println("Walks on two legs! ");
	}
}

public class a 
{
	public static void main(String args[])
	{
		horse h1 = new horse();
		chicken c1 = new chicken();
		// Animal a1 =new Animal();  can't be instantiated by the compiler since its a error as Animal class is an abstract class.  
		h1.walk();
		h1.eat();
		c1.walk();
		//a1.walk();
		
	}

}
