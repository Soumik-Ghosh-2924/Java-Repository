package leet_code;
import java.io.*;
import java.util.Scanner;
class Solution 
{
    public int romanToInt(String s, int len) 
    {
        String RT;
        int k=0;
        int i=0;
        while(i<1)
        {
            if(s.charAt(i)=='I')
            {
                k+=1;
            }
            else if(s.charAt(i)=='V')
            {
                k+=5;
            }
            else if(s.charAt(i)=='X')
            {
                k+=10;
            }
            else if(s.charAt(i)=='L')
            {
                k+=50;
            }
            else if(s.charAt(i)=='C')
            {
                k+=100;
            }
            else if(s.charAt(i)=='D')
            {
                k+=500;
            }
            else if(s.charAt(i)=='M')
            {
                k+=1000;
            }
            i++;
        }
        RT = s.substring(1,len);
        int o=0;
        while(o<1)
        {
        	if(RT.contains("IV"))
        	{
        		k+=4;
        	}
        	if(RT.contains("IX"))
        	{
        		k+=9;
        	}
        	if(RT.contains("XL"))
        	{
        		k+=40;
        	}
        	if(RT.contains("XC"))
        	{
        		k+=90;
        	}
        	if(RT.contains("CD"))
        	{
        		k+=400;
        	}	
        	if(RT.contains("CM"))
        	{
        		k+=900;
        	}
        	o++;
        }
        switch(RT)
        {
        	case "I" :
        		k+=1;
        		break;
        	case "II" :
        		k+=2;
        		break;
        	case "III" :
        		k+=3;
        		break;
        	case "V" :
        		k+=5;
        		break;
        	case "VI":
        		k+=6;
        		break;
        	case "VII" :
        		k+=7;
        		break;
        	case "VIII" :
        		k+=8;
        		break;
        	case "X" :
        		k+=10;
        		break;
        }
        return k;
    }
    public static void main(String args[])
    {
        String A;
        Scanner sc = new Scanner(System.in);
        A=sc.nextLine();
        int l;
        l=A.length();
        Solution sol= new Solution();
        int v = sol.romanToInt(A,l);
        System.out.print(v);
    }
}