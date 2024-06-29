package com.example.testyouriq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserDetail extends Activity {

	EditText edAge,edName;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_detail);
		edName = (EditText)findViewById(R.id.editText1);
		edAge = (EditText)findViewById(R.id.editText2);

	}

	public void submit(View v){

		String name = edName.getText().toString();
		String sage  = edAge.getText().toString();
		System.out.println("     :::      "+name);
		System.out.println("     :::      "+sage);

		if(name.equals("") && sage.equals("")){
			Toast.makeText(this, "Please enter name and age", 1).show();
		}else if(!name.equals("") && sage.equals("")){
			Toast.makeText(this, "Please enter age", 1).show();
		}else if(name.equals("") && !sage.equals("")){
			Toast.makeText(this, "Please enter name", 1).show();
		}else if(!name.equals("") && !sage.equals("")){
			DbInfo.age = Integer.parseInt(sage);
			if(DbInfo.age>=15 && DbInfo.age<=100){
				DbInfo.userName = name;
				startActivity(new Intent(this,Question1.class));
				finish();
			}else{
				Toast.makeText(this, "Please enter a valid age between 10 to 100", 1).show();
			}
		}
		
		
		
		



	}
}
