public class n1 
{
	public static int Mul(int x, int y)
	{
		int m;
		m=x*y;
		System.out.println(m+" is the product.");
		return m;
	}
	public static void main(String args[])
	{
		int a, b,y;
		try 
		{
			a=9;
			b=5;
			y=Mul(a,b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
		
	}

}
