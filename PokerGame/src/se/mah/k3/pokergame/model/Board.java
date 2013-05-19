package se.mah.k3.pokergame.model;

import java.util.ArrayList;
import java.util.List;


	
public class Board {
	private ArrayList<Card> row1 = new ArrayList<Card>();
	private ArrayList<Card> row2 = new ArrayList<Card>();
	private ArrayList<Card> row3 = new ArrayList<Card>();
	private ArrayList<Card> row4 = new ArrayList<Card>();
	private Rules rules;
	//Enums som tillhör board så de kan vara i denna klassen
    public static enum Row {FIRST,SECOND,THIRD,FOURTH};
	
    public Board() {
		// TODO Auto-generated constructor stub
    	rules = new Rules();
	}
	
    /**Try to remove card from rownumber tru if possible*/
	public boolean removeCard(Row rowNumber){
		return true;
	}
	
	
	
	
	
	

}
