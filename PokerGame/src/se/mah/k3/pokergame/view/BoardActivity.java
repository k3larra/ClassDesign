package se.mah.k3.pokergame.view;

import se.mah.k3.pokergame.R;
import se.mah.k3.pokergame.controller.Controller;
import se.mah.k3.pokergame.model.Board.Row;
import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

public class BoardActivity extends Activity implements OnClickListener{
    Controller controller;
    ImageView iv1; 
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.imageView1).setOnClickListener(this);
		findViewById(R.id.imageView2).setOnClickListener(this);
		findViewById(R.id.imageView3).setOnClickListener(this);
		findViewById(R.id.imageView4).setOnClickListener(this);
		controller = new Controller();
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@Override
	public void onClick(View v) {
		Log.i("k3larra", "Clicked: "+ v.getId());
		ImageView iv = (ImageView)v;
		iv.setPadding(0, 0, 2, 2);
	}

	public void newGameClick(View v){
		controller.startNewGame();
		updateAll();
	}
	
	//Tries to remove a card The controller controls if it is possible 
	public void removeClick(View v){
		TextView textView = (TextView)findViewById(R.id.removeEditText);
		try {
		  int i = Integer.parseInt(textView.getText().toString());
		  //translate row to the enum rows read about enums
		  if ((i>=1)&&(i<=4)){
			  Row row = translateIntToRow(i);
			  controller.removeCard(Row.FIRST);
			  updateAll();
		  }
		} catch (Exception e) {}
	}
	
    public void moveClick(View v){
    	TextView fromTextView = (TextView)findViewById(R.id.fromEditText);
    	TextView toTextView = (TextView)findViewById(R.id.toEditText);
		try {
		  int i = Integer.parseInt(fromTextView.getText().toString());
		  int j = Integer.parseInt(toTextView.getText().toString());
		  if ((i>=1)&&(i<=4)&&(j>=1)&&(j<=4)){ //Kolla så rader är mellan 1 o 4
			  controller.moveCard(translateIntToRow(i),translateIntToRow(j));
			  updateAll();
		  }
		}catch(Exception e){
			
		}
	}
    
    public void newCardsClick(View v){
    	controller.newCards();
    	updateAll();
   	}
    
    private void updateAll(){
    	ImageView i1 = (ImageView) findViewById(R.id.imageView1);
    	ImageView i2 = (ImageView) findViewById(R.id.imageView2);
    	ImageView i3 = (ImageView) findViewById(R.id.imageView3);
    	ImageView i4 = (ImageView) findViewById(R.id.imageView4);
    	i1.setImageResource(controller.getFirstRow().get(0).getCardFace());
    	i2.setImageResource(controller.getSecondRow().get(0).getCardFace());
    	i3.setImageResource(controller.getThirdRow().get(0).getCardFace());
    	i4.setImageResource(controller.getFourthRow().get(0).getCardFace());
    }
    
	private Row translateIntToRow(int rowNumber){
		Row returnRow=null;
		switch(rowNumber){
			case(1):{
				returnRow=Row.FIRST;
				break;
			}
			case(2):{
				returnRow=Row.SECOND;
				break;
			}
			case(3):{
				returnRow=Row.THIRD;
				break;
			}
			case(4):{
				returnRow=Row.FOURTH;
				break;
			}
		}
		return returnRow;
	}
}

