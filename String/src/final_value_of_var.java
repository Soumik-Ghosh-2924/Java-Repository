import java.util.Scanner;
public class final_value_of_var 
{
	public static int finalValue(String [] operations)
	{
		
		int s=0, i=0;
		while(i<operations.length)
		{
			if(operations[i].equals("++X") || operations[i].equals("X++"))
			{
				s+=1;
			}
			else if (operations[i].equals("--X") || operations[i].equals("X--"))
			{
				s-=1;
			}
            i++;
		}
		return s;	
	}
	
	public static void main(String args)
	{
		Scanner s1 = new Scanner(System.in);
		int n=s1.nextInt();
		String operations[]=new String[n];
		
		for(int j=0;j<n;j++)
		{
			operations[j]=s1.next();
		}
		
		int m= finalValue(operations);
		
		System.out.println(m);
		
		s1.close();
	}

}
