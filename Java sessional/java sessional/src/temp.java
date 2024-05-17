import java.io.*;
class Temperature
{
	public void convert(Double x)
	{
		Double F, C;
		F=((9.0*x)/5.0) + 32.0;
		C=(x-32.0)*(5.0/9.0);
		System.out.printf("The temperature in Fahrenheit =", F);
		System.out.printf("The temperature in Celcius =", C);
		try
		{
			float a;
			a=Double.parseDouble(x:);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception.");
		}
	}
	public static void main(String args[])
	{
		Temperature t = new Temperature();
		t.convert(45.0);
		System.out.println("Rest");
	}
}
