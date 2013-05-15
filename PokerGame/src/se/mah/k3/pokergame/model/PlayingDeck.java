package se.mah.k3.pokergame.model;

import java.util.ArrayList;
import java.util.List;

public class PlayingDeck {	
	private List<Card> deck = new ArrayList<Card>();  
    private static int NBR_OF_CARDS=52;
	
	
	PlayingDeck()  
    {  
        //Instantiate and populate list with 52 card objects  
    }  
      
    public List<Card> deal(int nbrCards){
    	//Remove nbrCards random from the deck
    	return new ArrayList<Card>();
    }
      
    public int size()  
    {  
        //return the size
    	return 52;
    }  
      
    public void shuffle()  
    {  
        //Shuffle the deck  
    }
    
    @Override
    public String toString() {
    	// TODO Print debug info here
    	return "Info";
    }
}
