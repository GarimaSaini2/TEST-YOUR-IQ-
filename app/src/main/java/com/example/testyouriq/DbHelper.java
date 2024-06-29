package com.example.testyouriq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper{

	public DbHelper(Context context, String name, CursorFactory factory,int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DbInfo.CREATE_TABLE_FOR_15_TO_18);
		db.execSQL(DbInfo.CREATE_TABLE_FOR_19_TO_22);
		db.execSQL(DbInfo.CREATE_TABLE_FOR_23_TO_28);
		db.execSQL(DbInfo.CREATE_TABLE_FOR_29_TO_39);
		db.execSQL(DbInfo.CREATE_TABLE_FOR_40_TO_70);
		db.execSQL(DbInfo.CREATE_TABLE_FOR_HISTORY);


		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer) " +
				"values('Which word amongst the following is the most opposite to PALATABLE ?','Sparse','agonising', 'bland', 'agonising', 'bland')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer) " +
				"values ('What should be the next number in the series 100,99.5,98.5,97,95,92.5,89.5' ,'86.5', '86', '87', '87.5', '86')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer) " +
				"values ('Find the odd one out','Diploid', 'Deltoid' , 'Dual' , 'Binary'  , 'Deltoid')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				" values('Find odd one out- 6394,9416,5278,6231,9614,6132,7895,5872,7598','6394', '9614', '5872', '7598', '6394')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('Only one word amongst the following can be rearranged into a six letter word in English language . Find the word','HURLPO', 'KCIENA', 'WINCAL', 'EJBATC', 'EJBATC')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer) " +
				"values('caster is to chair as rowel is to: ','Wheel', 'Spur', 'Bicycle', 'Pulley', 'Spur')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer) " +
				"values('Which word is closest in meaning to Haughty','Lonely', 'Crafty', 'Arrogant', 'Careful', 'Arrogant')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('Which is opposite to revival','Validation','Sarcasm', 'Extinction', 'Rebellion', 'Extinction')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer) " +
				"values('What should be the next number in the series 9,16,13,13,17,10,21,7,...','25','16','18','29','25')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer) " +
				"values('A, B, C, D, E, F, G, H What letter is two letters to the right of the letter immediately to the left of the letter four letters to the right of the letter two letters to the left of the letter E ?','C','H','A','F','H')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('Starting from a point M, Hari walked 18 metres towards south. He turned to his left and walked 25 metres. He then turned to his left and walked 18 metres. He again turned to his left and walked 35 metres and reached a point P. How far Hari is from the point M and in which direction?','10 m east', '10 m west', '35 m west', '10 m south', '10 m west')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('Saroj is mother-in-law of Vani who is sister-in-law of Deepak. Rajeesh is father of Ramesh, the only brother of Deepak. How is Saroj related to Deepak ?','Mother-in-law', 'Aunt', 'Wife', 'Mother', 'Mother')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('If MACHINE is coded as 19 - 7 - 9 - 14 - 15 - 20 - 11, how will you code DANGER ? ','10 - 7 - 20 - 11 - 13 - 24', '10 - 7 - 16 - 18 - 11 - 24', '10 - 7 - 20 - 13 - 11 - 24', '13 - 7 - 11 - 13 - 11 - 24', '10 - 7 - 20 - 13 - 11 - 24')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('If two men start at a point and travel 2km each in the opposite direction and then turn right and travel 1.5km each then the distance between them is','7', '6', '5', '5.5', '5')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('If you count 1 to 100, how many 7 will you pass on the way','19','10','11','20','19')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('Which vowel comes midway between J and T ?','A','I','O','U','O')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('Which letter continues the series with A,B,D,G,K,....','N','O','P','Q','P')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('If two typist can type two pages in two minutes, How many typist will it take to type 18 pages in 6 minutes','3', '6', '9', '8', '6')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('Choose the number that is 1/4 of 1/2 of 1/5 of 1000','5', '25', '125', '100', '25')");

		db.execSQL("insert into data40_70(question, option1,option2,option3,option4,answer)" +
				"values('I am a male. If Son of Ram, is father of my son, Who is Ram to Me','Brother', 'Son', 'Uncle', 'Father', 'Father')");


		db.execSQL("insert into data15_18(question, option1,option2,option3,option4,answer)" +
				" values(' Find the word that is similar in meaning to Incompatible','Capable','Reasonable', 'Faulty', 'Alienated', 'Alienated')    ");

		db.execSQL(" insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values('Find the word that is similar in meaning to Integrate ','Tolerate','Unite', 'Flow', 'Copy', 'Unite')    ");

		db.execSQL(" insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values('What is the opposite of Equlibrium ','Imbalance','Peace', 'Inequity', 'Directness', 'Imbalance')    ");

		db.execSQL(" insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values ('What is the opposite of Extrovert ','Clown','Hero', 'Ectomorph', 'Introvert', 'Introvert') ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values(' If TIN is coded as *$@ , then how NITIN can be coded','@*@$*','@$*$@', '@*$*@', 'None of these', '@$*$@')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values(' If A is B , B is C then what is RU','SV','ST', 'QV', 'TW', 'SV')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values('DELHI is related to INDIA in the same way PARIS is related to  ',	'Germany','Spain', 'France', 'Portugal', 'France')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer)" +
				"	values('RUPEE is related to INDIA in the same way DOLLAR is related to ','Dubai','Italy', 'America', 'Japan', 'America')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values('Find the next number in the series 1 , 2 , 4 , 7 , 11 ,.... ','17','14', '19', '16', '16')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values('Find the next alphabet in the series a , c , e , g , .. ',	'i','h', 'j', 'None of these', 'i')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer)" +
				"	values('Find the odd number out ','49','64', '121', '156', '156')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer)" +
				"	values('if x=7 then what is the value of x*x + x*x','28','98', '686', 'None of these', '98')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values(' What is the value of 3*3+3*0-3*3+3*7*4*0','-9','9', '3', '0', '0')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values('Ravi goes 3 km towards East and then 4km towards south what is his distance from starting point now ','5','7', '25', '1', '5')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values(' Nishtha can eat ten apples in one hour . How many apples can she eat in 1 day','240','100', '10', '24', '240')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values(' Aakash travels at a speed of 50 km/h and Sagar travels at a speed of 80 km/h . What is the distance they both travel in 5 hours',	'250,400','250,640', '10,16', '400,250', '250,400')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values('What is the relation between Harbir and his mothers fathers son-in-law','Mother-son','Father-son', 'Uncle-Nephew', 'Cousins', 'Father-son')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values('A boy says he is the only son of my mother. To whom is he referring to','His sister','His brother', 'Himself', 'His Father', 'Himself')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values(' What is the next number in the series 65 , 52 , 39 , ..',	'26','27', '28', '24', '26')    ");

		db.execSQL("    insert into data15_18(question, option1,option2,option3,option4,answer) " +
				"values(' If 321 = 6 & 315 = 9 then what is the value of 441',	'9','6', '8', '2', '9')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('What is the meaning of TEPID ','Boiling','Lukewarm', 'Freezing', 'Gaseous', 'Lukewarm')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values(' What is the meaning of Monetry','Boring','Fascinating', 'Fiscal', 'Stationary', 'Fiscal')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('What is the antonym of NIGGARDLY ','Protected','Biased', 'Generous', 'Bankrupt', 'Generous')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer)" +
				" values(' What is the antonym of JAUNDICED',	'Whitened','Inflamed', 'Quickened', 'Non-yellow', 'Quickened')    ");


		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values(' Find the next two numbers in the series 23 , 23 , 26 , 19 , 29 , 15 , ...','32,12','32,13', '11,33', '33,11', '33,11')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('PAGE is related to BOOK in the same way as DAY is related to ','Hours','Week', 'Weak', 'Hour', 'Week')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('If two typists can type 2 pages in 2 minutes , then how many typists will it take to type 18 pages in 6 minutes ',	'6','12' , '3', '4', '6')    ");


		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('If 8 people can write 8 codes in 8 minutes then in how much time 13 people can write 13 codes  ','13','8', '104', '26', '8')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values(' If Pawan starts from Mumbai at a speed of 150 kmph and Vidit starts from Delhi at a speed of 250 kmph then they both meet at pune in the end. The distance of Pune from Delhi is 800 km and that from Mumbai is 200 km . Then find who is more nearer to Delhi in the end ','Pawan','Vidit', 'Both', 'Data-Inadequate', '')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('What is the next number in the series 0 , 1 , 1 , 2 , 5 , 29 , ..','841','866', '867', '842', '866')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values(' Take 1000 and add 40 to it , now add another 1000 , now add 30 , add another 1000 , now add 20 , now add another 1000 , now add 10','4000','4100', '5000', '5100', '4100')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('If u buy a tea for Rs 1200 and sell it for Rs 1500 , per sack u made a profit of Rs 50 then how how many sacks of tea u bought',	'8','6', '5', '7', '6')    ");


		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('PEDOLOGY is related to SOIL in the same way PETROLOGY is related to ',	'Rock','Petrol', 'Fossil', 'Plants', 'Rock')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('If 2505/0.5 = 5010 then 25.05/0.5 ','5.010','50.10', '501.0', '0.5010', '50.10')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values(' Find the odd one out','Bird','Kite', 'Crow', 'Pigeon', 'Bird')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('BOQD:ERTG::ANPC:? ','DQSF','FSHU', 'SHFU', 'DSQF', 'DQSF')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('HARD is coded 1357 and SOFT is coded 2468 , then what will 21448 stand for','SHAFT','SHORT', 'SHOOT', 'SHART', 'SHOOT')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values('Old Womans son is my Daughters Uncle , then how is old woman related to Me ',	'Sister','Mother', 'GrandMother', 'Mother-in-law', 'Mother')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values(' Pointing to Aakash , Ankita said he is the Son of my Grandmothers only child , how is Aakash related to Ankita',	'Brother','Cousin', 'Father', 'Uncle', 'Brother')    ");

		db.execSQL("    insert into data23_28(question, option1,option2,option3,option4,answer) " +
				"values(' What is the Synonym of DEFTLY','Skillfully','Blindly', 'Eagerly', 'Rightfully', 'Skillfully')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values('Rearrange the following letters to make a word and choose the category in which it fits.RAPETEKA ','City','Fruit', 'Bird', 'Vegetable', 'Bird')   ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer)" +
				"values(' . Find the answer that best completes the analogy	people : democracy :: wealthy : ',	'oligarchy','oligopoly', 'plutocracy', 'timocracy', 'plutocracy')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values('Find the answer that best completes the analogy languages : meaning :: philology : ','erudition','philosophy', 'ethics', 'semantics', 'semantics')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer)" +
				" values('Which one of the sets of letters below can be arranged into a five letter English word. ','A T R U N','P O D E B', 'R N A S L', 'M O H A T', 'R N A S L')    ");



		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values('What is the missing letter?E-C-O , B-A-B , G-B-N , D-B-? ', 'H','E', 'A','N',' H')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"	values('Which number should come next in this series  25,24,22,19,15 ','4','5', '10', '14', '10')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values('Which number should come next in this series   3,5,8,13,21, ',	'4','21', '31', '34', '34')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"	values(' Which number should replace the question mark 8-5-21 , 35-32-12 , 32-28-31 , 4-?-28 ',	'3','-2', '-6', '48', '-6')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values('Which word does not belong   apple, marmalade, orange, cherry, grape ','apple','marmalade', 'orange', 'cherry', 'marmalade')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values(' Which number does not belong   4,32,144,189,28,122,18,64,188,322,14,202 ','32','188', '189', '202', '189')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"		values(' At the end of a banquet 10 people shake hands with each other. How many handshakes will there be in total?',	'100','20', '45', '90', '45')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer)" +
				" values('The day before the day before yesterday is three days after Saturday. What day is it today? ','Wednesday','Thursday', 'Friday', 'None of these', 'Friday')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values('Select the number that best completes the analogy  10 : 6 :: 3 : ? ','2','1', '-1', '12', '-1')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values('Which number should come next in the series    1, 3, 6, 10, 15, ',	'24','21', '8', '11', '21')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer)" +
				"	values('165135 is to peace as 1215225 is to ',	'Lead','Love', 'Loop', 'Lovely', 'Love')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values(' Please enter the missing figure: 4, 5, 8, 17, 44,','80','125', '112', '60', '125')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"values('Please enter the missing figure: 13, 57, 911, 1315, 1719 ','2123','2023', '2111', '2333', '2123')    ");



		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer)" +
				"	values('If you rearrange the letters  CIFAIPC  you would have the name of an : ','City','Animal', 'Ocean', 'Sea', 'Ocean')    ");



		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer)" +
				" values(' 8 Monkeys can eat 8 bananas in 8 minutes , then in how much time 80 monkeys can eat 80 bananas',	'88','80', '8', '64', '8')    ");


		db.execSQL("    insert into data29_39(question, option1,option2,option3,option4,answer) " +
				"	values(' Akshita can travel 99.6 kms in 30 days , find how much distance she can cover in 5 days','3.32','1.61', '16.10', '33.20', '16.10')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values(' Wax:Candle::?:Paper ','Tree','Bamboo', 'Pulp', 'Stationary', 'Pulp')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer)" +
				"	values('HYGROMETER is related to HUMIDITY in same way as ODOMETER is related to ',	'Odour','Colour', 'Speed', 'Intensity', 'Speed')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values('What is the meaning of PIQUE ','Pyramid','Revolt', 'Resentment', 'Struggle', 'Resentment')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values('What is the meaning of TAUTOLOGY ','Memory','Repetition', 'Tension', 'Smile', 'Repetition')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values('What is the antonym of EQUITABLE ','Able to Leave','Able to learn', 'preferable', 'Unfair', 'Unfair')    ");


		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values('What is the antonym of LATENT ','Trim','Forbidding', 'Execrable', 'Obvious', 'Obvious')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values(' Pointing to Kayden , Pawan said - She is the Daughter of my Grandfathers only Daughter . Then how is Pawan is related to Kayden',	'Brother','Cousin', 'Husband', 'Data Inadequate', 'Data Inadequate')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer)" +
				"	values('Introducing Rakhi , Vidit said- She is the wife of my mothers only son. How is Rakhi related to Vidit ',	'Wife','Sister', 'Sister-in-law', 'Data Inadequate', 'Wife')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer)" +
				"	values(' What is the next number in the series 2 , 4 , 6 , 10 , 16 , ..',	'22','26', '20', 'None of these', '26')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values('If two typists can type 2 pages in 2 minutes , then how many typists will it take to type 18 pages in 6 minutes ',	'6','12' , '3', '4', '6')    ");


		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values('If 8 people can write 8 codes in 8 minutes then in how much time 13 people can write 13 codes  ','13','8', '104', '26', '8')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer)" +
				"	values(' If Pawan starts from Mumbai at a speed of 150 kmph and Vidit starts from Delhi at a speed of 150 kmph then they both meet at pune in the end. The distance of Pune from Delhi is 800 km and that from Mumbai is 200 km . Then find who is more nearer to Delhi in the end ','Pawan','Vidit', 'Both', 'Data-Inadequate', '')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values(' Which letter comes next in the series B , A ,C ,B , C , E , D , F , ..',	'E','D', 'C', 'F', 'E')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values('Some months have 30 days, some months have 31 days. How many months have 28 days? ','1','6', '12', '2', '12')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values(' Enter the missing number-  3,4,8,17,33 ',	'50','56', '58', '54', '58')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values(' Harbir need 13 bottles from the store. He can only carry 3 at a time. What is the minimum number of trips he need to make to the store ? ','4','4 1/3', '4 1/2', '5', '5')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values(' Sachin likes 25 but not 24, he likes 400 but not 300, he likes 144 but not 145. What does he like ? ','1250','1600', '4000', '1000', '1600')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values(' If a docter gives you 5 pills and tells you to take 1 pill every half hour. How long would it be before all the pills had been taken ? ',	'2 1/2','5', '2', '1/2', '2')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values(' A Farmer had 29 sheep. All but 15 died. How many live sheep were left ? ','13','14', '15', '16', '15')    ");

		db.execSQL("    insert into data19_22(question, option1,option2,option3,option4,answer) " +
				"values(' When asked How old he was? Ankush replied - In 2 years I will be twice as old as I was 5 years ago. How old is he ? ','11','12', '13', '14', '12')    ");


		System.out.println("<<<<<<<<<<<<DATA BASE CREATED>>>>>>>>>>>>>>>>");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}
