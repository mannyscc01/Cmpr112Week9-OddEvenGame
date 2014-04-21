//Manny Aguirre
//CS112
//Professor Durendal
//4/20/14
//HW Week 9
//File: main.java

import java.util.Scanner;
public class main 
{
	public static void main(String[] args) 
	{
		int userAns;
		Scanner in = new Scanner(System.in);
		OddEven game = new OddEven();
		
		game.assignRandomCompNum();
		System.out.print("Is the computer's number even or odd? (1 for odd, 2 for even): ");
		userAns = in.nextInt();
		
		if(userAns==1 && game.isOdd())
			game.displayWinningMessage();
		else
			game.displayLosingMessage();
		
		System.out.println("The computer's number was: " + game.getCompNum());
		
	}

}
