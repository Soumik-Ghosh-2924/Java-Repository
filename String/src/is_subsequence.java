
public class is_subsequence 
{
	static boolean issubseq(String a, String b)
	{
		if(a.length()==0)
			return true;
		
		int i=0,j=0;
		while(i<a.length() && j<b.length())
		{
			if(a.charAt(i)==b.charAt(j))
			{
				j++;
				i++;
			}
			else
			{
				j++;
			}
		}
		if(i==a.length())
		{
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	public static void main(String args[])
	{
		String a="ace";
		String b="abcfeh";
		System.out.println(issubseq(a,b));		
	}

}
