package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.parse.ParseAnalytics;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpened(getIntent());
		
//		ParseObject lolcat = new ParseObject("lolcat2");
//		lolcat.put("foo2", "bar2");
//		lolcat.saveInBackground(new SaveCallback() {
//
//			@Override
//			public void done(com.parse.ParseException e) {
//				if (e == null) {
//					Toast toast = Toast.makeText(getApplicationContext(),
//							"Success", Toast.LENGTH_SHORT);
//					toast.show();
//				} else {
//					e.printStackTrace();
//
//					Toast toast = Toast.makeText(getApplicationContext(),
//							"Failed", Toast.LENGTH_SHORT);
//					toast.show();
//				}
//			}
//
//		});
	}
}
