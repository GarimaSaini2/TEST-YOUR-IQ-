package com.example.testyouriq;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class History extends Activity {

	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_history);
		tv = (TextView) findViewById(R.id.textView1);
		
		DbAdapter adapter = new DbAdapter(this);
		adapter.getReadPermission();
		String data = adapter.fetchHistory();
		adapter.closeDB();
		
		tv.setText(data);
	}

	

}
