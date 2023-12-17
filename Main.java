package ticTacToe;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		boolean playAgain = true;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to our Tic-Tac-Toe computer game,"
				+ " where you will battle AI for supremacy. \nPlease enter your name.");
		
		String name = input.nextLine();
		Player xplayer = new HumanPlayer(name);
		Player oplayer = new ComputerPlayer("TicTacToeAI");
		
		//generate new games as long as the user continues to play
		
		while (playAgain) {
		
		@SuppressWarnings("unused")
		Game game = new TicTacToeGame(xplayer, oplayer);
		
		System.out.println("Play again? Enter 1 to continue or 0 to exit. ");
		
		int choice = input.nextInt();
		
		if (choice == 0) {
			playAgain = false;
		}
		
		}
		
		//display the final scores and exit
		System.out.println("Final Scores:\n" + xplayer + "\n" + oplayer);
		
		if (xplayer.getScore() > oplayer.getScore()) 
			System.out.println(xplayer.getName() + " is the winner!");
		
		else if (xplayer.getScore() < oplayer.getScore())
			System.out.println(oplayer.getName() + " is the winner!");
		else
			System.out.println("No winner - this game is tied.");
		
		input.close();

	}}