package com.example.testyouriq;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Question7 extends Activity {

	RadioGroup rg;
	RadioButton op1,op2,op3,op4;
	TextView  tvQuestion;
	String []data;
	MyCounter timer1;
	TextView min,sec;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question7);
		
		rg  = (RadioGroup)findViewById(R.id.answers);
		op1 = (RadioButton)findViewById(R.id.option1);
		op2 = (RadioButton)findViewById(R.id.option2);
		op3 = (RadioButton)findViewById(R.id.option3);
		op4 = (RadioButton)findViewById(R.id.option4);
		
		min  = (TextView)findViewById(R.id.min);
		sec  = (TextView)findViewById(R.id.sec);

		Intent intent = getIntent();
		int i = intent.getExtras().getInt("min");
		int j = intent.getExtras().getInt("sec");
		MyCounter localMyCounter = new MyCounter(1000 * (i * 60) + j * 1000, 1000L);
		localMyCounter.start();
		this.timer1 = localMyCounter;
		
		tvQuestion = (TextView)findViewById(R.id.question);
		int num = QuesData.array[6];
		DbAdapter adapter = new DbAdapter(this);
		adapter.getReadPermission();
		data = adapter.getQuestion(num,DbInfo.age);
		adapter.closeDB();
		tvQuestion.setText(data[0]);
		op1.setText(data[1]);
		op2.setText(data[2]);
		op3.setText(data[3]);
		op4.setText(data[4]);
	}

	public void next(View view){
		int selectedId = rg.getCheckedRadioButtonId();
		RadioButton radioButton = (RadioButton) findViewById(selectedId);

		if(radioButton!=null){
			if(radioButton.getText().equals(data[5])){
				DbInfo.score++;
			}
		}
		
		Intent intent = new  Intent(this,Question8.class);
		intent.putExtra("min", Integer.parseInt(min.getText().toString()));
		intent.putExtra("sec", Integer.parseInt(sec.getText().toString()));
		startActivity(intent);
		timer1.cancel();
		finish();;
	}

	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode==KeyEvent.KEYCODE_BACK)
		{
			
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setMessage("Are You sure that you want to quit the test ?");
			builder.setTitle("Confirm");
			builder.setCancelable(false);
			builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					Toast.makeText(Question7.this, "Youe test has been canceled!", 1).show();
					timer1.cancel();
					finish();
				}
			}).setNegativeButton("No", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					//  Action for 'NO' Button
					dialog.cancel();
				}
			});
			builder.show();			
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	public class MyCounter extends CountDownTimer{
		public MyCounter(long arg2, long arg4){
			super(arg2,arg4);
		}

		public void onFinish(){
			timer1.cancel();
			startActivity(new  Intent(Question7.this,ResultActivity.class));
			finish();
		}

		public void onTick(long paramLong){
			min.setText(String.valueOf(paramLong / 60000L));
			sec.setText(String.valueOf(paramLong / 1000L % 60L));
		}	
	}

}
