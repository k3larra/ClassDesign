package se.mah.k3.pokergame.model;

public class Card implements Comparable<Card>{
	private int cardFace;
	private int cardBack;
	private Suits suit; //if spade etc 
	private SpecialNames specialName; //if spade etc 
	private int rank; //1 to 13, ace 1 (14), jack 11, queen 12, king 13,
	private boolean faceUp=true;
	
	//Enums som tillhör kort så de kan vara i denna klassen
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
		faceUp =! faceUp;  //Ändrar värdet till det andra......
	}
	
	public void turnfaceDown(){
		faceUp = false;
	}
	
	public boolean isFaceUp(){
		return faceUp;
	}
	
	public String getSuit(){
		//Använder en switch här för det är lättast if funkar lika bra emn lite omständligare
		String s="";
		switch(suit){
			case SPADE: {
				s="Spader"; //Skall vara språk här om hämtat från Strings
				break;
			}
			case DIAMOND:{
				s="Ruter";
				break;
			}
			case HEART:{
				s="Hjärter";
				break;
			}
			case CLUB:{
				s="Klöver";
				break;
			}
		}
		return s;
	}
	/**Method tom compare Suit returns a value for each rank Spade 4, Hearts 3, Diamond 2, Club 1*/
	public int getSuitValue(){
		int i=0;
		switch(suit){
			case CLUB: {
				i=1; //Skall vara språk här om hämtat från Strings
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
	
	//Denna metoden är magiken när man sorterar med Collections.sort
	@Override
	public int compareTo(Card another) {
		// När man sorterar används denna metoden korten jämförs blir det minustal är det här
		int i=0;
		//kortet mindre värt än det man jämför med, sen används detta av Collections.sort( se Card Deck
		if (suit == another.suit){
			i = rank - another.rank; //Blir minus om de andra kortet är större
		}else if (suit != another.suit){
			i = getSuitValue() - another.getSuitValue(); //Blir minus om de andra kortet är större
		}
		return i;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return suit +":"+rank;
	}
	
	
	  
	
}
