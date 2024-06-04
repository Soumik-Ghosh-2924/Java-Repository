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