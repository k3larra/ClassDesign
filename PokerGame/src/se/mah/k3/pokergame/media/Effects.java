package se.mah.k3.pokergame.media;

import java.util.HashMap;

import se.mah.k3.pokergame.R;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;

public class Effects {

	private static final String TAG = Effects.class.toString();
	private static final Effects INSTANCE = new Effects();
	public static final int SOUND_1= 1;
	public static final int SOUND_2 = 2;
	public static final int SAD = 3;
	public static final int HAPPY = 4;
	public static final int CLICK = 5;
	public static final int BACKGROUND = 6;
	private SoundPool soundPool;
	private HashMap<Integer, Integer> soundPoolMap;
	private int priority = 1;
	private int priority_higher = 2;
	private int no_loop = 0;
	private int loop = -1;
	private int volume;
	private float normal_playback_rate = 1f;
	private Context context;
	private int backgroundSoundId=0;
	private Effects() {

	}

	public static Effects getInstance() {
		return INSTANCE;
	}

	public void init(Context context) {
		this.context = context;
		soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);
		soundPoolMap = new HashMap<Integer, Integer>(); //Bara för att inte behöva hålla reda på en massa nummer
		// ----HÄR LÄGGER MAN IN
		// LJUDEN---------------------------------------------------------------
		soundPoolMap.put(SOUND_1, soundPool.load(context, R.raw.cartoon024, 1));
		soundPoolMap.put(SOUND_2, soundPool.load(context, R.raw.cartoon017, 1));
		soundPoolMap.put(SAD, soundPool.load(context, R.raw.sadsound, 1));
		soundPoolMap.put(HAPPY , soundPool.load(context, R.raw.happysound,1));
		soundPoolMap.put(CLICK, soundPool.load(context, R.raw.clicksound, 1));
		soundPoolMap.put(BACKGROUND, soundPool.load(context, R.raw.bakgrundsmusik, 1));
		AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
		volume = audioManager.getStreamVolume(AudioManager.STREAM_SYSTEM);
	}

	public void playSound(int soundId) {
		int id = soundPoolMap.get(soundId);
		soundPool.play(id, 1, 1, priority, no_loop, normal_playback_rate);
		Log.i("k3larra", "Sound: " + soundId + " playerID: " + id);
	}
	
	public void startBackground(int soundId) {
		int id = soundPoolMap.get(soundId);
		backgroundSoundId = soundPool.play(id, 1, 1, priority_higher, loop, normal_playback_rate);
		Log.i("k3larra", "Backstart: " + soundId + " playerID: " + id + " backgroundSoundId: " + backgroundSoundId );
	}
	
	public void stopBackground(int soundId) {
		int id = soundPoolMap.get(soundId);
		soundPool.stop(backgroundSoundId);
		Log.i("k3larra", "Backstop: " + soundId + " playerID: " + id + " backgroundSoundId: " + backgroundSoundId );
		//soundPool.unload(backgroundSoundId);
	}

}
