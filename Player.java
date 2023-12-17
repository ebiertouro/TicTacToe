package ticTacToe;

public interface Player {
	
	String toString();
	
	void incrementScore();
	
	int getScore();
	
	String getName();
	
	int[] takeTurn(GameBoard board);
	
	char getChar();
}
