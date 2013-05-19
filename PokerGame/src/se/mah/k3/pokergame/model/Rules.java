package se.mah.k3.pokergame.model;

public class Rules {
	public Rules() {
		// TODO Auto-generated constructor stub
	}
	
	/**Check if one card is in same rank and smaller than one of the others
	 * always 3 cards to compare to*/
	public boolean canRemoveCard(Card cardToRemove, Card[] otherCards){
		return true;
	}
	
	/**check if only Ace left*/
	public boolean hasWon(Card[] cards){
		//Check if all Ace
		return false;
	}
	
	

}
