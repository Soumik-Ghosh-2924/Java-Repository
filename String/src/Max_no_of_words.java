import java.util.*;
public class Max_no_of_words 
{
	public static int mostWordsFound(String[] sentences )
	{
		
		int max=0;
		for(int i=0;i<sentences.length;i++)
		{
			String S1=sentences[i];
			int words=0;
			for(int j=0;j<S1.length();j++)
			{
				if(S1.charAt(j)==' ') 
				{
					words+=1;	
				}
			}
			
			if(words>max)
			{
				max=words;
			}
			
		}
		
		return max;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		String sentences[]= new String[100];
		
		for(int i=0;i<sentences.length;i++)
		{
			sentences[i]=sc.nextLine();
		}
		
		int count=0;
		count= mostWordsFound(sentences);
		
		sc.close();
		
	}

}
