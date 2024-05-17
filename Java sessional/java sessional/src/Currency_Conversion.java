import java.io.*;
import java.util.Scanner;
public class Currency_Conversion implements Currency
{
	public void moneyconversion(Double X, Double Y)
	{
		Double A, I;
		A=X/85.0;
		I=Y*85.0;
		System.out.printf("The amount in dollars = \n"+ A);
		System.out.printf("\nThe amount in Indian rupees ="+ I);
	}
	public void countrycurrency()
	{
		System.out.println("The American dollars is worth 85 Indian Rupee each.");
		System.out.println("The dollar is slowly going to lose its market value.");
		System.out.println("Rupee forms the basis of Indian Currency.");
	}
	public static void main(String args[])
	{
		Double ind, Amd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount in Indian Currency :");
		ind=sc.nextDouble();
		System.out.println("Enter the amount in American Currency :");
		Amd=sc.nextDouble();
		Currency_Conversion c = new Currency_Conversion();
		c.countrycurrency();
		c.moneyconversion(ind,Amd);
		System.out.println("Program ends.");
	}
}
