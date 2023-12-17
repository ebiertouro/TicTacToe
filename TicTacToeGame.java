package ticTacToe;

public class TicTacToeGame implements Game{
	
		@SuppressWarnings("rawtypes")
		private GenericLinkedListQ turnQ = new GenericLinkedListQ<Player>();
		private GameBoard board = new GameBoard();
		private int onOrOff;
		
	public TicTacToeGame(Player xplayer, Player oplayer) {
		
		 this.turnQ = turnQ;
		 this.board = board;
		 onOrOff = 0;
		 
		 System.out.println("Welcome to our Tic-Tac-Toe game. \n The 'x' player will go first.");
		 
		 board.display();
		 
		 while (!winnerExists(onOrOff) && !board.isFull()) {
			 turnQ.enqueue(xplayer);
			 turnQ.enqueue(oplayer);
			 turn((Player) turnQ.dequeue());
		 }
		 if (!winnerExists(onOrOff) && board.isFull()) 
			 System.out.println("This game has ended in a draw.");
			 
		 System.out.println("Scores for each player: ");
		 System.out.println(xplayer);
		 System.out.println(oplayer);
	}

	@Override
	public void turn(Player player) {
		
		Player pl = player;
		
		int[] choice = pl.takeTurn(board);
		
		board.addChoice(choice, player);
		
		board.display();
		
		char checking = board.checkWinner(pl, choice);
		
		if (checking == 'x' || checking == 'o') {
			
			System.out.println("The winner is: " + pl.getName());
			
			onOrOff = 1;
		
			winnerExists(1);
			
 			pl.incrementScore();
		
			
		}

	}

	@Override
	public boolean winnerExists(int onOrOff) {
		
		int check = onOrOff;
		if (check == 1) {
			return true;
		}
		return false;
	}
}