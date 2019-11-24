package com;

public class Checkers {

// Testing....the below fields were added by Kayan
private Board gameBoard;
private Player playerOne;
private Player playerTwo;

	public static void main(String[] args) {
		
     Checkers checkersGame = new Checkers();
     checkersGame.setupByUser();
     
     while(checkersGame.isInProgress()) {
    		 checkersGame.currentPlayerTakeTurn();
    		 checkersGame.displayBoard();
     }
	
	}

//Current methods to be corrected and new methods updated by team
public void setupByUser() {}

public boolean isInProgress() {return false;}

public void currentPlayerTakeTurn() {}

public void displayBoard() {}

public void displayEndOfGameMessage() {}


}
