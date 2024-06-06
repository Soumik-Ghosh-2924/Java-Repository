package OOPS;
//Inheritance- increasses reusability
class shape //Base or Parent class 
{
	String color;
}

class triangle extends shape //child class 
{
	
}

public class oops4 
{
	public static void main(String args[])
	{
		triangle t1= new triangle();
		t1.color="red";
		
		System.out.println(t1.color);
	}
}