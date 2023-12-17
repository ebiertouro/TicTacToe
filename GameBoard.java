package ticTacToe;

public class GameBoard {
	
	
		int boardSize = 3;
		char[][] boxes = new char[boardSize][boardSize];
		char unchosen = ' ';
		
	public GameBoard() {

		this.boardSize = boardSize;
		this.boxes = boxes;
		this.unchosen = unchosen;
		

		//fill up a board with blank boxes
		for(int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++){
				boxes[i][j] = unchosen;
			}}
	}
	
	public GameBoard(char[][] list) {
		for(int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++){
				boxes[i][j] = list[i][j];
			}}
		
	}
	
	//check if a given box is available
	public boolean isAvailable(int[] choice) {
		
		boolean isAvailable = false;
		char wantedBox = unchosen;
		
		for(int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++){
				//rewrite 'wantedBox' with the value that is in the given position
				wantedBox = boxes[choice[0]][choice[1]];
			}}
		
		//if no value was written over, return true that the box is available;
		if (wantedBox == unchosen) {
			isAvailable = true;
		}
		return isAvailable;
	}
			
	public void addChoice(int[] choice, Player player) {
		
		Player pl = player;
	
		//add the x or o to the board
		for(int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++){
				boxes[choice[0]][choice[1]] = pl.getChar();
			}
		}
		
	}
	public void display(){
		
		System.out.println(boxes[0][0] + "|" + boxes[0][1] + "|" + boxes[0][2]);
		System.out.println("------");
		System.out.println(boxes[1][0] + "|" + boxes[1][1] + "|" + boxes[1][2]);
		System.out.println("------");
		System.out.println(boxes[2][0] + "|" + boxes[2][1] + "|" + boxes[2][2]);
			
		
	}
	
	 public char checkWinner(Player pl, int[] choice) {
		 
	   char winningChar = pl.getChar();
	   char noWinner = ' ';
	   int x = choice[0], y = choice[1];


		 //check column
	for(int i = 0; i < boardSize; i++){
		if(boxes[x][i] != winningChar)
		    	break;
		 if(i == boardSize-1){
		    	return winningChar;
			}
	   	}

		  //check row
	for(int i = 0; i < boardSize; i++){
		 if(boxes[i][y] != winningChar)
		    break;
		    	if(i == boardSize-1){
		    		return winningChar;
		    	 }
		   }

		//check diagonal
		   	if(x == y){
		for(int i = 0; i < boardSize; i++){
			if(boxes[i][i] != winningChar)
				break;
			if(i == boardSize-1){
					return winningChar;
				}
			}
	   	}

	   //check diagonal
		  	for(int i = 0;i<boardSize;i++){
		     		if(boxes[i][(boardSize-1)-i] != winningChar)
		 	    			break;
	   	 		if(i == boardSize-1){
		    			 return winningChar;
		  	    		}
		  	    	}
    
		   return noWinner; 	
	 }
	
	 public boolean isFull() {
		 
		 boolean full = false;
		 
		 for(int i = 0; i < boardSize; i++) {
				for (int j = 0; j < boardSize; j++){
					if (boxes[i][j] == unchosen) 
						return false;
				}}
		 return true;
	 }
	 
}
