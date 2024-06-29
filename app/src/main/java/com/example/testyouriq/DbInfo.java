package com.example.testyouriq;;

public class DbInfo {
	public static final String DB_NAME = "iqtest.db";
	public static final int DB_VERSION = 1;
	public static  int score = 0;
	public static  String userName = "";
	public static  int age ;

	public static final String CREATE_TABLE_FOR_40_TO_70= "create table data40_70("
			+ " sno integer PRIMARY KEY autoincrement, " 
			+ " question  text, " 
			+ " option1  text, " 
			+ " option2  text, "
			+ " option3  text, "
			+ " option4  text, "
			+ " answer  text);  ";
	
	public static final String CREATE_TABLE_FOR_15_TO_18= "create table data15_18("
			+ " sno integer PRIMARY KEY autoincrement, " 
			+ " question  text, " 
			+ " option1  text, " 
			+ " option2  text, "
			+ " option3  text, "
			+ " option4  text, "
			+ " answer  text);  ";
	public static final String CREATE_TABLE_FOR_19_TO_22= "create table data19_22("
			+ " sno integer PRIMARY KEY autoincrement, " 
			+ " question  text, " 
			+ " option1  text, " 
			+ " option2  text, "
			+ " option3  text, "
			+ " option4  text, "
			+ " answer  text);  ";
	public static final String CREATE_TABLE_FOR_23_TO_28= "create table data23_28("
			+ " sno integer PRIMARY KEY autoincrement, " 
			+ " question  text, " 
			+ " option1  text, " 
			+ " option2  text, "
			+ " option3  text, "
			+ " option4  text, "
			+ " answer  text);  ";
	public static final String CREATE_TABLE_FOR_29_TO_39= "create table data29_39("
			+ " sno integer PRIMARY KEY autoincrement, " 
			+ " question  text, " 
			+ " option1  text, " 
			+ " option2  text, "
			+ " option3  text, "
			+ " option4  text, "
			+ " answer  text);  ";


	public static final String CREATE_TABLE_FOR_HISTORY= "create table history("
			+ " sno integer PRIMARY KEY autoincrement, " 
			+ " name  text, " 
			+ " age  integer, " 
			+ " iq  real);  ";
	


}
