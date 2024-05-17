import java.util.Scanner;
import java.util.ArrayList;

public class Find_words_containing_character 
{
	public static int[] findWordsContaining(String[] words, String x)
	{
		ArrayList<Integer> pos = new ArrayList<>();
		for(int i =0; i<words.length;i++)
		{
			if(words[i].indexOf(x)!=-1)
			{
				pos.add(i);
			}
		}
		
		int [] l1 = new int [pos.size()];
		for(int i=0;i<pos.size();i++)
		{
			l1[i]=pos.get(i);
		}
		
		return l1;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String words[]=new String[50];
		for(int j=0;j<words.length;j++)
		{
			words[j]=sc.nextLine();
		}
		
		String x=sc.next();
		
		
		int a1[]=new int[50];
		a1=findWordsContaining(words,x);
		
		sc.close();

	}

}
