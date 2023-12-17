package ticTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	

class GameBoardTest {
	
	GameBoard b;
	
	/*
	 * 		int[] ints = {1, 2, 3};
		

		int max = t.max();	
	     
	     Assertions.assertEquals(3, max);
	 */

	@BeforeEach
	
	
	
	void setup() {
		
		
	}
	
	@Test
	void test_checkWinner() {
		b = new GameBoard();
		for(int i = 0; i < b.boardSize; i++) {
			for (int j = 0; j < b.boardSize; j++)
				{[i][j] = 'o';}
		}
		Player p = new ComputerPlayer("C");
		
		
		Assertions.assertEquals(p, 'o');
		

		

	}

}
