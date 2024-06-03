package Patterns;
import java.util.*;
public class Alice_Bob 
{
	/*
	 * Alice and Bob take turns playing a game, with Alice starting first.

Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:

Choosing any x with 0 < x < n and n % x == 0.
Replacing the number n on the chalkboard with n - x.
Also, if a player cannot make a move, they lose the game.

Return true if and only if Alice wins the game, assuming both players play optimally.*/
	
	
	static boolean divisor_game(int n)
	{
		return n%2 ==0;
				}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number on the chalkboard : ");
		int n=sc.nextInt();
		
		boolean result=divisor_game(n);
		
		System.out.println("Does Alice Win ? " + result);
		
		sc.close();
		
	}

}
