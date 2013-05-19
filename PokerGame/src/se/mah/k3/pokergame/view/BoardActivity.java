package se.mah.k3.pokergame.view;

import se.mah.k3.pokergame.R;
import se.mah.k3.pokergame.controller.Controller;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.ImageView;

public class BoardActivity extends Activity implements OnClickListener{
    Controller controller;
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
	
	public void removeClick(View v){
		
	}
	
    public void moveClick(View v){
		
	}
    
    public void newCardsClick(View v){
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
    
	
	
	
	
	
}
