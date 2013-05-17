package se.mah.k3.pokergame.view;

import se.mah.k3.pokergame.R;
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridlay);
		findViewById(R.id.imageView1).setOnClickListener(this);
		findViewById(R.id.imageView2).setOnClickListener(this);
		findViewById(R.id.imageView3).setOnClickListener(this);
		findViewById(R.id.imageView4).setOnClickListener(this);
		findViewById(R.id.imageView5).setOnClickListener(this);
		findViewById(R.id.imageView6).setOnClickListener(this);
		findViewById(R.id.imageView7).setOnClickListener(this);
		findViewById(R.id.imageView8).setOnClickListener(this);
		findViewById(R.id.imageView9).setOnClickListener(this);
		findViewById(R.id.imageView10).setOnClickListener(this);
		findViewById(R.id.imageView11).setOnClickListener(this);
		findViewById(R.id.imageView12).setOnClickListener(this);
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

}
