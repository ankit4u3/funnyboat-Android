package com.ankit.funnyboat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Game.start(this);
	}

	@Override
	protected void onResume() {
		if (Game.current != null)
			Game.instance.resume();
		super.onResume();
	}
}
