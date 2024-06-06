package OOPS;
// This is an example of single inheritance
// as well as an example of multi-level inheritance
class shape1
{
	String color;
	
	public void area()
	{
		System.out.println("Displays area.");
	}
}

class triangle1 extends shape1
{
	public void area(int l , int h)
	{
		System.out.println((1/2)*l*h);
	}
}

//class equi_triangle extends shape1
//{
//	public void area(int l, int h)
//	{
//		System.out.println((1/2)*l*h);
//	}
//}

class circle extends shape1 // to show the concept of heirarchical inheritance
{
	public void area(int r)
	{
		System.out.println((3.14)*r*r);
	}
}

public class oops5 
{
	public static void main(String args[])
	{		
		shape1 s1 = new shape1();
		triangle1 t1 =new triangle1();
//		equi_triangle e1 = new equi_triangle();
		s1.area();
		t1.area(4,5);
//		e1.area(6,8);
	}

}
