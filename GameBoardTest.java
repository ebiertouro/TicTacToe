package ticTacToe;

import org.junit.jupiter.api.*;

class GameBoardTest {
	
	GameBoard b;

	@Test
	void test_isFull_isTrue() {
		char[][] list = {{'x', 'x', 'x'}, {'x', 'x', 'x'}, {'x', 'x', 'x'}};
		b = new GameBoard(list);
		Assertions.assertTrue(b.isFull());
	}
	
	void test_isFull_isFalse() {
		char[][] list = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
		b = new GameBoard(list);
		Assertions.assertFalse(b.isFull());
	}

	
	void test_isAvailable_isTrue() {
		char[][] list = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
		b = new GameBoard(list);
		int[] choice = {1, 1};
		Assertions.assertTrue(b.isAvailable(choice));
	}
	
	void test_isAvailable_isFalse() {
		char[][] list = {{'x', 'x', 'x'}, {'x', 'x', 'x'}, {'x', 'x', 'x'}};
		b = new GameBoard(list);
		int[] choice = {1, 1};
		Assertions.assertFalse(b.isAvailable(choice));
	}
	
	void test_checkWinner() {
		char[][] list = {{' ', 'x', 'x'}, {'x', 'x', 'x'}, {'x', 'x', 'x'}};
		Player p = new HumanPlayer("H");
		b = new GameBoard(list);
		int[] choice = {1, 1};
		Assertions.assertEquals(b.checkWinner(p, choice), 'x');
	}
}
