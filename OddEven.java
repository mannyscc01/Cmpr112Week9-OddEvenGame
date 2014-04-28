//Manny Aguirre
//CS112
//Professor Durendal
//4/20/14
//HW Week 9
//File: OddEven.java

import java.util.Random;

public class OddEven 
{
	int compNum;
	char userGuess;
	final int lowerBound = 10;
	final int upperBound = 20;
	
	public OddEven()
	{
		displayIntroMessage();
	}	
	
	private void displayIntroMessage()
	{
		System.out.println("Welcome to the Odd/Even Game!");
		System.out.println("The goal is to determine if the "
			+ "computer chose an odd or even number.\n");
		System.out.println("The computer will choose a random number "
				+ "between " + lowerBound + " and " + upperBound + " (inclusive).");
		
	}
	
	public void assignRandomCompNum()
	{
		int range = upperBound-lowerBound;
		compNum = (int) ( lowerBound + Math.random()*(range+1));
	}
	
	public boolean isOdd()
	{
		return (compNum%2!=0);
	}
	
	public void displayWinningMessage()
	{
		System.out.println("Congratulations! You won!");
	}
	
	public void displayLosingMessage()
	{
		System.out.println("Sorry! You lost!");
	}
	
	public int getCompNum()
	{
		return compNum;
	}
	
}

// Good job
