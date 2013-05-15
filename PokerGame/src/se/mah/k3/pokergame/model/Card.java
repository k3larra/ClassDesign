package se.mah.k3.pokergame.model;

public class Card {
	private int cardFace;
	private int cardBack;
	private int rank;
	public static enum suit {SPADE,HEART,DIMOND,CLUB} ;
	
	public Card(int rank, int suit, int cardFace ){
		//Instantiate local variables
	}
	public void turnFaceUp(){
		
	}
	
	public void turnfaceDown(){
		
	}
	
	public boolean isFaceUp(){
		return true;
	}
	
}
