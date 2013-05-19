package se.mah.k3.pokergame.controller;

import java.util.ArrayList;
import java.util.Collections;

import se.mah.k3.pokergame.R;
import se.mah.k3.pokergame.model.Board;
import se.mah.k3.pokergame.model.Card;
import se.mah.k3.pokergame.model.Deck;
import se.mah.k3.pokergame.model.Rules;

/** This is the controller class for the game. Use the methods and if successful
 * collect the rows and show them in the view.
 * @author K3LARA
 *
 */
public class Controller {
	
	private Deck deck;
	private Rules rules;
	private Board board;
	public Controller() {
		deck = new Deck();
		rules = new Rules();
		board = new Board();
		startNewGame();
	}
	
	
	public void startNewGame(){
		//Create new deck
		//create empty board
	}
	
	/**Stub returns true every time*/
	public boolean removeCard(Board.Row rowNumber){
		//Check if a card in any other row is bigger
		//if true remove the card
		return true; //if done
	}
	
	/**Stub returns true every time*/
	public boolean newCards(){
		//check more cards in deck 
		//deliver cards on rows
		return true; //if succecssfull
	}
	
	/**Stub returns true every time*/
	public boolean moveCard(Board.Row fromRow, Board.Row toRow){
		//Check if toRow is empty
		//check if fromRow has card
		//move the card
		return true; //if successful
	}
	
	
	/**Returns a fake row*/
	public ArrayList<Card> getFirstRow(){
		ArrayList<Card> a = new ArrayList<Card>();
		 a.add(new Card(10,Card.Suits.CLUB,R.drawable.k10,R.drawable.backblueport,Card.SpecialNames.NONE));
	     a.add(new Card(11,Card.Suits.CLUB,R.drawable.k11,R.drawable.backblueport,Card.SpecialNames.JACK));
		Collections.shuffle(a);
	     return a;
	}
	
	/**Returns a fake row*/
	public ArrayList<Card> getSecondRow(){
		ArrayList<Card> a = new ArrayList<Card>();
		 a.add(new Card(5,Card.Suits.HEART,R.drawable.h5,R.drawable.backblueport,Card.SpecialNames.NONE));
	     a.add(new Card(6,Card.Suits.HEART,R.drawable.h6,R.drawable.backblueport,Card.SpecialNames.NONE));
	     a.add(new Card(7,Card.Suits.HEART,R.drawable.h7,R.drawable.backblueport,Card.SpecialNames.NONE));
	     a.add(new Card(8,Card.Suits.HEART,R.drawable.h8,R.drawable.backblueport,Card.SpecialNames.NONE));
	     a.add(new Card(9,Card.Suits.HEART,R.drawable.h9,R.drawable.backblueport,Card.SpecialNames.NONE));
	     a.add(new Card(10,Card.Suits.HEART,R.drawable.h10,R.drawable.backblueport,Card.SpecialNames.NONE));
	     Collections.shuffle(a);
	     return a;
	}
	
	/**Returns a fake row*/
	public ArrayList<Card> getThirdRow(){
		ArrayList<Card> a = new ArrayList<Card>();
		a.add(new Card(11,Card.Suits.HEART,R.drawable.h11,R.drawable.backblueport,Card.SpecialNames.JACK));
        a.add(new Card(12,Card.Suits.HEART,R.drawable.h12,R.drawable.backblueport,Card.SpecialNames.QUEEN));
        a.add(new Card(13,Card.Suits.HEART,R.drawable.h13,R.drawable.backblueport,Card.SpecialNames.KING));
        a.add(new Card(1,Card.Suits.SPADE,R.drawable.s1,R.drawable.backblueport,Card.SpecialNames.ACE));
        a.add(new Card(2,Card.Suits.SPADE,R.drawable.s2,R.drawable.backblueport,Card.SpecialNames.NONE));
        a.add(new Card(3,Card.Suits.SPADE,R.drawable.s3,R.drawable.backblueport,Card.SpecialNames.NONE));
        Collections.shuffle(a);
        return a;
	}
	
	/**Returns a fake row*/
	public ArrayList<Card> getFourthRow(){
		ArrayList<Card> a = new ArrayList<Card>();
		a.add(new Card(3,Card.Suits.DIAMOND,R.drawable.r3,R.drawable.backblueport,Card.SpecialNames.NONE));
        a.add(new Card(4,Card.Suits.DIAMOND,R.drawable.r4,R.drawable.backblueport,Card.SpecialNames.NONE));
        a.add(new Card(5,Card.Suits.DIAMOND,R.drawable.r5,R.drawable.backblueport,Card.SpecialNames.NONE));
        a.add(new Card(6,Card.Suits.DIAMOND,R.drawable.r6,R.drawable.backblueport,Card.SpecialNames.NONE));
        a.add(new Card(7,Card.Suits.DIAMOND,R.drawable.r7,R.drawable.backblueport,Card.SpecialNames.NONE));
        a.add(new Card(8,Card.Suits.DIAMOND,R.drawable.r8,R.drawable.backblueport,Card.SpecialNames.NONE));
        a.add(new Card(9,Card.Suits.DIAMOND,R.drawable.r9,R.drawable.backblueport,Card.SpecialNames.NONE));
        Collections.shuffle(a);
        return a;
	}
	
}
