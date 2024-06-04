package Amagi_Media;
import java.util.*;
public class collinear 
{
	static boolean collinear_check(double x1, double x2, double x3, double y1, double y2, double y3)
	{
		double res = (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;  //collinearty check for the points
		//if they lie in the same 2D plane then their triangle area =0; 
		
		return res==0;
	}
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the three points :");
		double x1 =sc.nextDouble();
		double x2 =sc.nextDouble();
		double x3 =sc.nextDouble();
		double y1 =sc.nextDouble();
		double y2 =sc.nextDouble();
		double y3 =sc.nextDouble();
		
		
		boolean check=collinear_check(x1,x2,x3,y1,y2,y3);
		
		System.out.println(check);
		sc.close();
	}

}
