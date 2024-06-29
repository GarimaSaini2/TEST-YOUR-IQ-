package com.example.testyouriq;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DbAdapter {
	DbHelper helper = null;
	SQLiteDatabase db = null;

	DbAdapter(Context ctx){
		helper = new DbHelper(ctx, DbInfo.DB_NAME, null, DbInfo.DB_VERSION);
	}


	void getReadPermission(){
		db = helper.getReadableDatabase();
	}

	void getWritePermission(){
		db = helper.getWritableDatabase();
	}

	void closeDB(){
		db.close();
		
	}





	public String[] getQuestion(int num, int age) {
		String[] ques = new String[6];
		Cursor cur = null;
		System.out.println("       NUMBER         ::::      "+num +"             AGE         :::       "+age);

		if(age>=15 && age<=18  ){
			cur = db.query("data15_18", null, "sno="+num, null, null, null, null);
		}else if(age>=19 && age<=22  ){
			cur = db.query("data19_22", null, "sno="+num, null, null, null, null);
		}else if(age>=23 && age<=28 ){
			cur = db.query("data23_28", null, "sno="+num, null, null, null, null);
		}else if(age>=29 && age<=39  ){
			cur = db.query("data29_39", null, "sno="+num, null, null, null, null);
		}else if(age>=40 ){
			cur = db.query("data40_70", null, "sno="+num, null, null, null, null);
		}


		cur.moveToFirst();

		ques[0] = cur.getString(cur.getColumnIndex("question"));
		ques[1] = cur.getString(cur.getColumnIndex("option1"));
		ques[2] = cur.getString(cur.getColumnIndex("option2"));
		ques[3] = cur.getString(cur.getColumnIndex("option3"));
		ques[4] = cur.getString(cur.getColumnIndex("option4"));
		ques[5] = cur.getString(cur.getColumnIndex("answer"));

		return ques;
	}


	public long insertHistory(String name,int age,double iq)
	{
		ContentValues cont = new ContentValues();
		cont.put("name", name);
		cont.put("age", age);
		cont.put("iq", iq);
		return db.insert("history", null, cont);
	}


	public String fetchHistory(){
		String str = "S.NO\tName\t\tAGE\tIQ\n\n";
		Cursor cur = db.query("history", null, null, null, null, null, null);
		while(cur.moveToNext()){
			int sNO = cur.getInt(0);
			String name = cur.getString(1);
			int age = cur.getInt(2);
			long iq  = Math.round(cur.getDouble(3));
			if(name.length()>6){
				name = name.substring(0, 5);
			}
			str += sNO+"\t\t"+name+"\t\t"+age+"\t\t"+iq+"\n";
		}

		cur.close();
		return str;
	}

	/*public List fetchAll()
	{
		String[] col = {ID_COL,NAME_COL};
		Cursor cur = db.query(MY_TAB, col, null, null, null, null, null);
		int id_index = cur.getColumnIndex(ID_COL);
		int name_index = cur.getColumnIndex(NAME_COL);
		List list = new ArrayList();
		for(cur.moveToFirst();!cur.isAfterLast();cur.moveToNext())
		{
			list.add(new Student(cur.getInt(id_index),cur.getString(name_index)));
		}

		return list;
	}*/

}
