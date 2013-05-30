package se.mah.k3.pokergametest;

import se.mah.k3.pokergame.R;
import se.mah.k3.pokergame.R.layout;
import se.mah.k3.pokergame.R.menu;
import se.mah.k3.pokergame.media.Effects;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class TestSoundActivity extends Activity {
	private Effects e;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_sound);
		 e = Effects.getInstance();
		e.init(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test_sound, menu);
		return true;
	}

	public void onClick(View v){

		switch (v.getId()) {
		case R.id.backgroundButton:
			e.startBackground(Effects.BACKGROUND);
			break;
		case R.id.backgroundstopbutton:
			e.stopBackground(Effects.BACKGROUND);
			break;
		case R.id.clickButton:
			e.playSound(Effects.CLICK);
			break;
		case R.id.happyButton:
			e.playSound(Effects.HAPPY);
			break;
		case R.id.sadButton:
			e.playSound(Effects.SAD);
			break;
		case R.id.s17Button:
			e.playSound(Effects.SOUND_1);
			break;
		case R.id.s24Button:
			e.playSound(Effects.SOUND_2);
			break;
		default:
			break;
		}
	}
}
