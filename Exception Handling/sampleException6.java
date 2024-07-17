package exceptionhandling;

public class sampleException6 
{
	static void cry() throws ArithmeticException
	{
		System.out.println("Inside cry method.");
		throw new ArithmeticException("Demo");
	}
	
	public static void main(String args[])
	{
		try
		{
			cry();
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Here's an error buddy.");
//		}
		finally
		{
			System.out.println("This is the finally block.");
		}
	}
}
