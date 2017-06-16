package com.vodoke.tutorial;

import com.vodoke.service.MusicService;
import com.vodoke.tutorial.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	private static final String TAG = MainActivity.class.getSimpleName();

	private ImageView t1;
	private ImageView frame1;
	private ImageView t2;
	private ImageView frame2;
	private ImageView t3;
	private ImageView frame3;
	private ImageView t4;
	private ImageView frame4;
	private ImageView t5;
	private ImageView frame5;
	private ImageView t6;
	private ImageView t7;
	private ImageView t8;
	private ImageView t9;
	private int index = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Intent intent = new
		// Intent(getApplicationContext(),MusicService.class);
		// startService(intent);
		t1 = (ImageView) findViewById(R.id.t1);
		frame1 = (ImageView) findViewById(R.id.frame1);
		t2 = (ImageView) findViewById(R.id.t2);
		frame2 = (ImageView) findViewById(R.id.frame2);
		t3 = (ImageView)findViewById(R.id.t3);
		frame3 = (ImageView) findViewById(R.id.frame3);
		t4 = (ImageView) findViewById(R.id.t4);
		frame4 = (ImageView) findViewById(R.id.frame4);
		t5 = (ImageView)findViewById(R.id.t5);
		frame5 = (ImageView) findViewById(R.id.frame5);
		t6 = (ImageView) findViewById(R.id.t6);
//		t7 = (ImageView) findViewById(R.id.t7);
//		t8 = (ImageView) findViewById(R.id.t8);
//		t9 = (ImageView) findViewById(R.id.t9);
	}

	protected void onResume() {
//		Intent intent = new Intent(getApplicationContext(), MusicService.class);
//		startService(intent);
		super.onResume();
	}

	protected void onStop() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(getApplicationContext(), MusicService.class);
		stopService(intent);
		super.onStop();
	}


	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			displayTutorials();
			break;
		}
		return super.onTouchEvent(event);
	}


	public boolean onKeyUp(int keyCode, KeyEvent event) {
		Log.d(TAG, "onKeyUp()");
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent = new Intent(getApplicationContext(), MusicService.class);
			stopService(intent);
		}
		if (keyCode == KeyEvent.KEYCODE_ENTER) {
			Log.d(TAG, "onKeyUp(), #0");
			displayTutorials();
		}
		return super.onKeyUp(keyCode, event);
	}

	private void displayTutorials() {
		Log.d(TAG, "displayTutorials()");
		index++;
		if (index == 1) {
			Log.d(TAG, "onKeyUp(), #1");
			this.frame1.setVisibility(View.INVISIBLE);
			this.t1.setVisibility(View.INVISIBLE);
			this.frame2.setVisibility(View.INVISIBLE);
			this.t2.setVisibility(View.VISIBLE);
		} else if (index == 2) {
			Log.d(TAG, "onKeyUp(), #2");
			this.frame2.setVisibility(View.INVISIBLE);
			this.t2.setVisibility(View.INVISIBLE);
			this.frame3.setVisibility(View.INVISIBLE);
			this.t3.setVisibility(View.VISIBLE);
		} else if (index == 3) {
			Log.d(TAG, "onKeyUp(), #3");
			this.frame3.setVisibility(View.INVISIBLE);
			this.t3.setVisibility(View.INVISIBLE);
			this.frame4.setVisibility(View.INVISIBLE);
			this.t4.setVisibility(View.VISIBLE);
		} else if (index == 4) {
			Log.d(TAG, "onKeyUp(), #4");
			this.frame4.setVisibility(View.INVISIBLE);
			this.t4.setVisibility(View.INVISIBLE);
			this.frame5.setVisibility(View.INVISIBLE);
			this.t5.setVisibility(View.VISIBLE);
		} else if (index == 5) {
			Log.d(TAG, "onKeyUp(), #5");
			this.frame4.setVisibility(View.INVISIBLE);
			this.t5.setVisibility(View.INVISIBLE);
			this.frame5.setVisibility(View.INVISIBLE);
			this.t6.setVisibility(View.VISIBLE);
		} else if (index == 6) {
			Log.d(TAG, "onKeyUp(), #6");
			finish();
//			this.frame4.setVisibility(View.INVISIBLE);
//			this.t6.setVisibility(View.INVISIBLE);
//			this.frame5.setVisibility(View.INVISIBLE);
//			this.t7.setVisibility(View.VISIBLE);
		} else if (index == 7) {
			Log.d(TAG, "onKeyUp(), #7");
//			this.frame4.setVisibility(View.INVISIBLE);
//			this.t7.setVisibility(View.INVISIBLE);
//			this.frame5.setVisibility(View.INVISIBLE);
//			this.t8.setVisibility(View.VISIBLE);
		} else if (index == 8) {
			Log.d(TAG, "onKeyUp(), #8");
//			this.frame4.setVisibility(View.INVISIBLE);
//			this.t8.setVisibility(View.INVISIBLE);
//			this.frame5.setVisibility(View.INVISIBLE);
//				this.t9.setVisibility(View.VISIBLE);
		} else if (index == 9) {
//			Log.d(TAG, "onKeyUp(), #9");
			finish();
		}
	}

}
