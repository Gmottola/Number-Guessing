package numberguessing;
// Name: Greg Mottola This program is a guessing game where user 1 inputs a number between 1-1000 and user two must guess the number in 15 tries

import javax.swing.JOptionPane;

public class NumberGuessing {
	public static void main(String args[]){
	{
		// the variable guesses is being used to hold the number of guesses user two has
		int guesses = 1;
		
		// Good is being used as the while loop condition to validate user 1s number
		boolean good = false;
		
		// Integer 1 will be holding User 1's number
		int integerOne = 0;
		
		// guess will be holding User 2's guess
		int guess = 0;
				
		// this loop is used to actually validate user 1s input
		while(!good)
		{
			
			// this allows user 1 to input their initial value
			integerOne = Integer.parseInt( JOptionPane.showInputDialog ("User 1 input a number between 1 and 1000"));
	
			
			if (integerOne < 0)
			{
				good = false;
				System.out.println("Error. Invalid Input");
			}
			else if(integerOne > 1000)
			{
				good = false;
				System.out.println("Error. Invalid Input");
			}
			else
			{
				good = true;
			}
		}
		
		// this is just resetting good back to false
		good = false;
		
		guess = Integer.parseInt( JOptionPane.showInputDialog ("User 2 enter your guess, you have 15 guesses"));
		
		//This loop checks to see if User Twos input is correct, and lets them know if they ran out of guesses
		while (!good)
		{

			
			if (guess == integerOne)
			{
				good = true;
				System.out.println("Congratulations You Guessed it!");
				System.out.println("The number was: " + integerOne);
			}
		else if (guess < integerOne)
			{
				good = false;
				guess = Integer.parseInt( JOptionPane.showInputDialog ("Wrong! Too Low, Guess Again! Total number of guesses: " + guesses));
				guesses = guesses + 1;
			}
		else if (guess > integerOne)
			{
				good = false;
				guess = Integer.parseInt( JOptionPane.showInputDialog ("Wrong! Too High, Guess Again! Total number of guesses: " + guesses));
				guesses = guesses + 1;
			}
		if (guesses >= 15)
			{
				good = true;
				System.out.println("You ran out of Guesses! the number was: " + integerOne);
		}
	}
	}
	}
}
