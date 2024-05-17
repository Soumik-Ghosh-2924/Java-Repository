//Polymorphism
//Poly means Many and Morph means Change of form
// Polymorphism is of 2 types : - Runtime Polymorphism and Compile Time Polymorphism
//For Compile time polymorphism we have the concept of Function overloading 
//For Run time polymorphism we have the concept of Funcntion overriding.  

//Here in this program we have explained the concept of compile time polymorphism using function overloading 
class S
{
	String name;
	int age;
	S()
	{
		this.name=name;
		this.age=age;
	}

	public void printinfo(String name)
	{
		System.out.println(name);
	}
	
	public void printinfo(int age)
	{
		System.out.println(age);
	}
	
	public void printinfo(String name, int age)
	{
		System.out.println(name+" "+age);
	}
}



public class P 
{
	public static void main(String args[])
	{
		S s1 =new S();
		s1.name="Madhusnuhi";
		s1.age=21;
		
		s1.printinfo(s1.name);
	}

}
