package com;

public class Board {

private Square [][] squares = new Square[8][8] ;

/*Determines if move is legal. Look up the checker rules to determine what
is legal */
public boolean isMoveLegal(Move move) {
	
	if(move.getEndingXCoor() < 0) {
		return false;
	}
	
	else {
		return true;
	}
	
}

//Should move the piece only if the move is legal
public void movePiece(Move move) {}

//Should represent the board as a string in the console
public String toString(){return "update this method";}
	
}