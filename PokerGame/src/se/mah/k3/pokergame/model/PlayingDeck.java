package se.mah.k3.pokergame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import se.mah.k3.pokergame.R;

public class PlayingDeck {	
	private List<Card> deck = new ArrayList<Card>();  
    private static int NBR_OF_CARDS=52;
	
	
	public PlayingDeck()  
    {  
		createCards();//Lägger det i en metod sist för det ser så fult ut i konstruktorn
    }  
      
   

	public List<Card> deal(int nbrCards){
    	//Remove nbrCards random from the deck
    	return new ArrayList<Card>();
    }
      
    public int cardsLeftinDeck()  
    {  
    	return deck.size();
    }  
      
    public void shuffle()  
    {  
        Collections.shuffle(deck); 
    }
    
    public void sort()  
    {  
        Collections.sort(deck);
    }
    
    @Override
    public String toString() {
    	String s="";
    	for (Card c : deck) {
			s = s + c.toString()+"\n";//Breakrow
		}
    	return s;
    }
    
    private void createCards() {
    	//Club
        deck.add(new Card(1,Card.Suits.CLUB,R.drawable.k1,R.drawable.backblueport,Card.SpecialNames.ACE));
        deck.add(new Card(2,Card.Suits.CLUB,R.drawable.k2,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(3,Card.Suits.CLUB,R.drawable.k3,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(4,Card.Suits.CLUB,R.drawable.k4,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(5,Card.Suits.CLUB,R.drawable.k5,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(6,Card.Suits.CLUB,R.drawable.k6,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(7,Card.Suits.CLUB,R.drawable.k7,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(8,Card.Suits.CLUB,R.drawable.k8,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(9,Card.Suits.CLUB,R.drawable.k9,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(10,Card.Suits.CLUB,R.drawable.k10,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(11,Card.Suits.CLUB,R.drawable.k11,R.drawable.backblueport,Card.SpecialNames.JACK));
        deck.add(new Card(12,Card.Suits.CLUB,R.drawable.k12,R.drawable.backblueport,Card.SpecialNames.QUEEN));
        deck.add(new Card(13,Card.Suits.CLUB,R.drawable.k13,R.drawable.backblueport,Card.SpecialNames.KING));
        //Diamond
        deck.add(new Card(1,Card.Suits.DIAMOND,R.drawable.r1,R.drawable.backblueport,Card.SpecialNames.ACE));
        deck.add(new Card(2,Card.Suits.DIAMOND,R.drawable.r2,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(3,Card.Suits.DIAMOND,R.drawable.r3,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(4,Card.Suits.DIAMOND,R.drawable.r4,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(5,Card.Suits.DIAMOND,R.drawable.r5,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(6,Card.Suits.DIAMOND,R.drawable.r6,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(7,Card.Suits.DIAMOND,R.drawable.r7,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(8,Card.Suits.DIAMOND,R.drawable.r8,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(9,Card.Suits.DIAMOND,R.drawable.r9,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(10,Card.Suits.DIAMOND,R.drawable.r10,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(11,Card.Suits.DIAMOND,R.drawable.r11,R.drawable.backblueport,Card.SpecialNames.JACK));
        deck.add(new Card(12,Card.Suits.DIAMOND,R.drawable.r12,R.drawable.backblueport,Card.SpecialNames.QUEEN));
        deck.add(new Card(13,Card.Suits.DIAMOND,R.drawable.r13,R.drawable.backblueport,Card.SpecialNames.KING));
      //Hearts
        deck.add(new Card(1,Card.Suits.HEART,R.drawable.h1,R.drawable.backblueport,Card.SpecialNames.ACE));
        deck.add(new Card(2,Card.Suits.HEART,R.drawable.h2,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(3,Card.Suits.HEART,R.drawable.h3,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(4,Card.Suits.HEART,R.drawable.h4,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(5,Card.Suits.HEART,R.drawable.h5,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(6,Card.Suits.HEART,R.drawable.h6,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(7,Card.Suits.HEART,R.drawable.h7,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(8,Card.Suits.HEART,R.drawable.h8,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(9,Card.Suits.HEART,R.drawable.h9,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(10,Card.Suits.HEART,R.drawable.h10,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(11,Card.Suits.HEART,R.drawable.h11,R.drawable.backblueport,Card.SpecialNames.JACK));
        deck.add(new Card(12,Card.Suits.HEART,R.drawable.h12,R.drawable.backblueport,Card.SpecialNames.QUEEN));
        deck.add(new Card(13,Card.Suits.HEART,R.drawable.h13,R.drawable.backblueport,Card.SpecialNames.KING));
      //Hearts
        deck.add(new Card(1,Card.Suits.SPADE,R.drawable.s1,R.drawable.backblueport,Card.SpecialNames.ACE));
        deck.add(new Card(2,Card.Suits.SPADE,R.drawable.s2,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(3,Card.Suits.SPADE,R.drawable.s3,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(4,Card.Suits.SPADE,R.drawable.s4,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(5,Card.Suits.SPADE,R.drawable.s5,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(6,Card.Suits.SPADE,R.drawable.s6,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(7,Card.Suits.SPADE,R.drawable.s7,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(8,Card.Suits.SPADE,R.drawable.s8,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(9,Card.Suits.SPADE,R.drawable.s9,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(10,Card.Suits.SPADE,R.drawable.s10,R.drawable.backblueport,Card.SpecialNames.NONE));
        deck.add(new Card(11,Card.Suits.SPADE,R.drawable.s11,R.drawable.backblueport,Card.SpecialNames.JACK));
        deck.add(new Card(12,Card.Suits.SPADE,R.drawable.s12,R.drawable.backblueport,Card.SpecialNames.QUEEN));
        deck.add(new Card(13,Card.Suits.SPADE,R.drawable.s13,R.drawable.backblueport,Card.SpecialNames.KING));
		
	}
}
