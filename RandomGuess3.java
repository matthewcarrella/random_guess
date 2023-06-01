// Chapter 6 practice project 5/31/23

import javax.swing.JOptionPane;

public class RandomGuess3
{
	public static void main(String[] args) 
	{
		// Variables and constants
		int userGuess;
		int magicNumber;
		String msg;
		int attempts = 1;
		final int LOW = 1;
		final int HIGH = 10;

		// Input phase
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between " + LOW + "and " + HIGH));
		// Processing phase
		magicNumber = (int) (Math.random() * HIGH) + LOW;
		while (userGuess!=magicNumber)
		{
			if (userGuess>magicNumber)
			{
				msg = "Sorry, your guess was too high";
			} else {

				msg = "Sorry, your guess was too low";
			}

			userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\nPlease enter a number between " + LOW + "and " + HIGH ));
			++attempts;
		}

		JOptionPane.showMessageDialog(null, "YOU'VE WON!! \n The magic number was: " + magicNumber + "\nYou guess it in " + attempts + " attempt(s)");
	}
}