public class eg5 
{
	public static void main(String args[])
	{
		int arr[]= new int[] {1,31,66,20,0};
		try 
		{
			System.out.println(arr[6]);			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("The exception has been handled");
	}

}
