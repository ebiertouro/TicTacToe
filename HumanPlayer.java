package ticTacToe;

import java.util.Scanner;

public class HumanPlayer implements Player{
	
	String name;
	int score = 0;
	char XorO = 'x';

	public HumanPlayer(String name) {
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
		
		//user chooses where to move
		boolean valid = false;
		int row, col;
		int[] choiceArray = new int[2];
		
		while(!valid) {
		
		//the choice of row and column are stored in an array
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice: row: ");
		row = (input.nextInt()-1);
		choiceArray[0] = row;
		
		System.out.println("column: ");
		col = (input.nextInt()-1);
		choiceArray[1] = col;
		
		//check if the choice is within 3x3
		if(row < 0 || col < 0 || row >= board.boardSize || col >= board.boardSize) {
			System.out.println("This position is outside the boundaries of the board! Try again.");
			valid = false;
			} 
		//check if the box is available
		else if(!board.isAvailable(choiceArray)) {
			System.out.println("This box is already full! Try again.");
			valid = false;
			}
		else {
			valid = true;
		}
	
		
	}
		
		return choiceArray;
		

		}

	}