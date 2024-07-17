package exceptionhandling;

public class sampleException5 
{
	static  void cry()
	{
		try
		{
			throw new ArithmeticException("Hey Maths.");
		}
		
//		catch (ArithmeticException e)
//		{
//			System.out.println("Caught the Arithemtic Error.");
//		}
		finally
		{
			
		}
	}
	
	public static void main(String args[])
	{
		cry();
	}

}
