package se.mah.k3.pokergame;

import se.mah.k3.pokergame.model.PlayingDeck;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends Activity {
	private PlayingDeck pd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		 pd = new PlayingDeck();
		TextView tv = (TextView) findViewById(R.id.TestText);
		tv.setText(pd.toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}

	public void sortButton(View v){
		pd.sort();
		TextView tv = (TextView) findViewById(R.id.TestText);
		tv.setText(pd.toString());
	}
	
	public void shuffleButton(View v){
		pd.shuffle();
		TextView tv = (TextView) findViewById(R.id.TestText);
		tv.setText(pd.toString());
	}
}
