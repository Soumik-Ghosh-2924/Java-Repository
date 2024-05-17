// here we are explaining the concept of inheritance 
// The concept of the inheritance is implemented using the keyword "extends"
//helps in increasing the reusability
//In java there are four types of inheritances : a. Single level inheritance
//b.Multi level inheritance
//c.heirarchical inheritance
//d.hybrid inheritance

class shape
{
	String color;
	public void area()
	{
		System.out.println("Display area");
	}
}

class Triangle extends shape
{
	public void area(int h , int b)
	{
		int area=(1/2)*b*h;
		System.out.println(area);
	}
}

class Circle extends shape
{
	public void area(int a)
	{
		System.out.println((3.14)*a*a); 
	}
}

public class inherit 
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle();
		t1.color="red";
		t1.area(5,4);
		Circle c1= new Circle();
		c1.area(6);
	}

}
