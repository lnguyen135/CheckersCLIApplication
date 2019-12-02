package com;

public class Move {

private int initialXCoor;
private int initialYCoor;
private int endingXCoor;
private int endingYCoor;

public Move(int initialXCoor, int initialYCoor, int endingXCoor, int endingYCoor) 
{
	this.initialXCoor = initialXCoor;
	this.initialYCoor = initialYCoor;
	this.endingXCoor = endingXCoor;
	this.endingYCoor = endingYCoor;
}

//Accessor methods
public int getInitialXCoor() {return initialXCoor; }
public int getInitialYCoor() {return initialYCoor; }

public int getEndingXCoor() {return endingXCoor; }
public int getEndingYCoor() {return endingYCoor; }

//Mutator methods
public void setInitialXCoor(int initialXCoor) {this.initialXCoor = initialXCoor; }
public void setInitialYCoor(int initialYCoor) {this.initialYCoor = initialYCoor; }

public void setEndingXCoor(int endingXCoor) {this.endingXCoor = endingXCoor; }
public void setEndingYCoor(int endingYCoor) {this.endingYCoor = endingYCoor; }

//Current methods to be corrected and new methods updated by team
public String toString(){return "update this method";}
	
}