import java.util.*;
class pen
{
	String color;
	String type;
	
	public void write()
	{
		System.out.println("Writing something ! ");
	}
	
	
	public void printColor()
	{
		System.out.println(this.color);   // this is a keyword used to define exactly which object of the pen class is being referred to when it's being called.
	}
}

public class oops 
{
	public static void main(String args[])
	{
		pen pen1 = new pen();
		pen1.color = "Blue";
		pen1.type = "Gel";
		pen1.write();
		pen1.printColor();
		
		pen pen2 = new pen();
		
		pen2.color="Black";
		pen2.type="Ballpoint";
		pen2.printColor();
		pen2.write();
		
				
	}

}
