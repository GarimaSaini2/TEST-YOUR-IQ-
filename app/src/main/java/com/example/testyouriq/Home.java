package com.example.testyouriq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		DbAdapter adapter = new DbAdapter(this);
		adapter.getWritePermission();
		adapter.closeDB();
	}

	public void about(View v){
			startActivity(new  Intent(this,About.class));
	}

	public void instructions(View v){
		startActivity(new  Intent(this,Instructions.class));
	}
	public void start(View v){
		startActivity(new  Intent(this,UserDetail.class));
	}
	public void exit(View v){
		finish();
	}
	
	public void history(View v){
		startActivity(new  Intent(this,History.class));
	}

}
