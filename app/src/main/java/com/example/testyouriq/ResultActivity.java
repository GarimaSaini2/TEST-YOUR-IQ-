package com.example.testyouriq;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends Activity {

	TextView resultTextView;
	RatingBar ratingBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		resultTextView = (TextView)findViewById(R.id.result);
		
		ratingBar = (RatingBar)findViewById(R.id.ratingBar1);
		int score = DbInfo.score;
		DbInfo.score = 0 ;
		double mentalAge = 0;
		double iqScore=0;
		int age = DbInfo.age;
		
		if(score<3){
			mentalAge = age-(age/2.5);
		}else if(score>=3 && score<=5){
			mentalAge = age-(age/4);
		}else if(score>=6 && score<=7){
			mentalAge = age-(age/10);
		}else if(score>=8 && score<=9){
			mentalAge = age;
		}else if(score==10){
			mentalAge = age+(age/10);
		}else if(score==11){
			mentalAge = age+(age/4);
		}else if(score==12){
			mentalAge = age+(age/2.5);
		}  
		
		iqScore = (mentalAge/age)*100;
		
		System.out.println("      IQ SCORE  :::      "+iqScore+"          Mental Age::    "+mentalAge+"      Correct Ans      :  :  "+score);
		if(iqScore<75){
			resultTextView.setText(DbInfo.userName+" You answered "+score+"/12 question(s) correctly.\nYour IQ is "+iqScore+".\nYou fall in the category of 'Feeble-Minded'.");
			ratingBar.setRating(1.0F);
		}else if(iqScore>=75 && iqScore<90){
			resultTextView.setText(DbInfo.userName+"  You answered " +score+ "/12 question(s) correctly.\nYour IQ is "+iqScore+".\nYou fall in the category of 'Below Average'.");
			ratingBar.setRating(2.0F);
		}else if(iqScore>=90 && iqScore<100){
			resultTextView.setText(" Congratulation ! "+DbInfo.userName+"  You answered " +score+  "/12 question(s) correctly.\nYour IQ is "+iqScore+".\nYou fall in the category of 'Average'.");
			ratingBar.setRating(3.0F);
		}else if(iqScore>=100 && iqScore<110){
			resultTextView.setText("Congratulation ! "+DbInfo.userName+"  You answered " +score+  "/12 question(s) correctly.\nYour IQ is "+iqScore+".\nYou fall in the category of 'Superior'.");
			ratingBar.setRating(3.5F);
		}else if(iqScore>=110  && iqScore<125){
			resultTextView.setText("Congratulation ! "+DbInfo.userName+"   You answered " +score+  "/12 question(s) correctly.\nYour IQ is "+iqScore+".\nYou fall in the category of 'Very Superior'.");
			ratingBar.setRating(4.0F);
		}else if(iqScore>=125 && iqScore<140){
			resultTextView.setText("Congratulation ! "+DbInfo.userName+"  You answered " +score+  "/12 question(s) correctly.\nYour IQ is "+iqScore+".\nYou fall in the category of 'Gifted'.");
			ratingBar.setRating(4.5F);
		}else if(iqScore>=140){
			resultTextView.setText("Congratulation ! "+DbInfo.userName+"  You answered " +score+  "/12 question(s) correctly.\nYour IQ is "+iqScore+".\nYou fall in the category of 'GENIUSES'.");
			ratingBar.setRating(5.0F);
		}
		
		DbAdapter adapter = new DbAdapter(this);
		adapter.getWritePermission();
		adapter.insertHistory(DbInfo.userName, age, iqScore);
		adapter.closeDB();
		
	}

}
