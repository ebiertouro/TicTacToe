package ticTacToe;
import java.util.*;

public class ComputerPlayer implements Player{
	
	String name;
	int score = 0;
	char XorO = 'o';
	
	public ComputerPlayer(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String str = ("Name: " + name + " Score: " + score);
		return str;
	
}
	@Override
	public char getChar() {
		return XorO;
	}
	
	@Override
	public void incrementScore() {
		score++;
	}
	
	@Override
	public int getScore() {
		return score;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int[] takeTurn(GameBoard board) {
		//logic of the computer player
		
		boolean valid = false;
		Random random = new Random();
		int[] choiceArray = new int[2];
		
		//generate a random choice
		while (!valid) {
			int row = random.nextInt(board.boardSize);
			int col = random.nextInt(board.boardSize); 
		
			choiceArray[0] = row;
			choiceArray[1] = col;
		
		//check if that box is available
		if(!board.isAvailable(choiceArray)) {
			valid = false;
			}
		else {
			valid = true;
		}
	
	}
		System.out.println("TicTacToeAI chose where to put an O.");
		
		return choiceArray;
			
		}
	}