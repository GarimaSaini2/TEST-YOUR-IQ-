package com.example.testyouriq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Thread thread = new Thread(){
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					startActivity(new Intent(MainActivity.this,Home.class));
					finish();
				}
			}
		};
		thread.start();
	}


}
