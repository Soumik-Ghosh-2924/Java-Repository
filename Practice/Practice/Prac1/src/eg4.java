import java.util.Scanner;
public class eg4 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.println();
		System.out.println();
		
		//Sum
		c=a+b;
		System.out.println(c);
		
		//Diff
		c=a-b;
		System.out.println(c);
		
		//Mul
		c=a*b;
		System.out.println(c);
		
		//Div
		double d;
		d=a/b;
		System.out.println(d);
		
		//mod
		c=a%b;
		System.out.println(c);
		
		//use of unary operators
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		
		//for the decrement operator
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		
	}

}
