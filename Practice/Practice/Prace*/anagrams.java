import java.util.Scanner;

public class anagrams 
{

    static boolean isAnagram(String a, String b) 
    {
        if(a.length()!=b.length())
            return false;
            
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[]x=a.toCharArray();
        char[]y=b.toCharArray();
        
        sortCharArray(x);
        sortCharArray(y);
        int res=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==y[i])
            {
                 res=1;
            }
            else if(x[i]!=y[i])
            {
                res=0;
                break;                
            }
        }
        
        return (res==1)?true:false;
    }
    
    
    static void sortCharArray( char[]a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    char temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
