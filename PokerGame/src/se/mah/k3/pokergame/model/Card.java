package se.mah.k3.pokergame.model;

public class Card implements Comparable<Card>{
	private int cardFace;
	private int cardBack;
	private Suits suit; //if spade etc 
	private SpecialNames specialName; //if spade etc 
	private int rank; //1 to 13, ace 1 (14), jack 11, queen 12, king 13,
	private boolean faceUp=true;
	
	//Enums som tillh�r kort s� de kan vara i denna klassen
	public static enum Suits {CLUB,DIAMOND,HEART,SPADE} ;
	public static enum SpecialNames {NONE,JACK,QUEEN,KING,ACE,JOKER};
	
	public Card(int rank, Suits suit, int cardFace,int cardBack, SpecialNames specialName ){
		//Instantiate local variables
		this.rank = rank;
		this.suit = suit;
		this.cardFace = cardFace;
		this.cardBack=cardBack;
		this.specialName = specialName;
	}
	
	public int getCardFace() {
		return cardFace;
	}
	
	public int getCardBack() {
		return cardBack;
	}
	
	/**returns the face or the back depending of the card is turned or not*/ 
	public int getCardImage(){
		if (faceUp){
			return cardFace;
		}else{
			return cardBack;
		}
	}

	public SpecialNames getSpecialName() {
		return specialName;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void turnCard(){
		faceUp =! faceUp;  //�ndrar v�rdet till det andra......
	}
	
	public void turnfaceDown(){
		faceUp = false;
	}
	
	public boolean isFaceUp(){
		return faceUp;
	}
	
	
	//Denna metoden �r magiken n�r man sorterar med Collections.sort
	@Override
	public int compareTo(Card another) {
		// N�r man sorterar anv�nds denna metoden. Korten j�mf�rs blir det minustal �r det h�r
		//kortet mindre v�rt �n det man j�mf�r med (another), sen anv�nds detta av Collections.sort( se Card Deck)
		int i=0;
		if (suit == another.suit){
			i = rank - another.rank; //Blir minus om de andra kortet �r st�rre
		}else if (suit != another.suit){
			i = getSuitValue() - another.getSuitValue(); //Blir minus om de andra kortet �r st�rre
		}
		return i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return suit +":"+rank;
	}
	
	/**Method tom compare Suit returns a value for each rank Spade 4, Hearts 3, Diamond 2, Club 1*/
	private int getSuitValue(){
		int i=0;
		switch(suit){
			case CLUB: {
				i=1; //Skall vara spr�k h�r om h�mtat fr�n Strings
				break;
			}
			case DIAMOND:{
				i=2;
				break;
			}
			case HEART:{
				i=3;
				break;
			}
			case SPADE:{
				i=4;
				break;
			}
		}
		return i;
	}
	  
	
}
