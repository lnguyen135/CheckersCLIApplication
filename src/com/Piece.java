package com;
public class Piece {

private String color ;//a piece is either red or black 
private String rank ; //rank is either pawn or king

//Bad constructor :P
//I'm sorry :(
public Piece(String color, String rank) {
	  this.color = color;
	  this.rank = rank;
	//Hello from kaleb!
}

public Piece(String color) {
	  this.color = color ;
	  this.rank = "pawn";
}

//Current methods to be corrected and new methods updated by team

//Accessor methods
public String getColor() {return color;}
public String getRank() {return rank;}

//Mutator methods
public void setColor(String color) {this.color = color;}

//setRank method may or may not be needed since 
//the only rank change is kingPiece
public void setRank(String rank) {this.rank = rank;}


//Promote the piece from pawn to king
//either use if logic or switch case logic
//Pawns represented as r or b for red or black respectively
//Kings represented as R or B for red or black kings respectively

public static void kingPiece() {}
	
}