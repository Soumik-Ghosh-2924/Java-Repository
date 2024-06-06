package OOPS;

class horse implements i1
{

	public void walk() {
		System.out.println("Walks on four legs.");
	}
	
	public void eat()
	{
		System.out.println("Horse eats grass.");
	}
	
}


public class oops7 
{
	public static void main(String args[])
	{
		horse h1 = new horse();
		h1.walk();
		h1.eat();
	}
	
	
}
