//this is just an extra solved question posted here, it wasn't asked during recruitment;

package Amagi_Media;
class Solution 
{
    static boolean isPalindrome(String a)
    {
        int l=a.length();
        String s="";
        for(int i=l-1;i>=0;i--)
        {
            s=s.concat(Character.toString(a.charAt(i)));
        }
        return s==a;
    }
    
    public static void main(String args[])
    {
    	String s="ada";
    	System.out.println(isPalindrome(s));
    	
    }
}
