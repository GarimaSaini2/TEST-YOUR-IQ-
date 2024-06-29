package com.example.testyouriq;
import java.util.Random;


public class QuesData {

	static  int [] array = new int[10];
	
	public static void initializeArray() {
		
		int pos = 0;
		Random random = new Random();

		while(pos<10){
			int count = 0;
			int num = random.nextInt(20);
			if(num!=0){
				if(pos == 0){
					array[pos]=num;
					pos++;
				}else{
					for(int j = 0;j<pos;j++){
						if(array[j]==num){
							count = 1;
							break;
						}
					}
					
					if(count==0){
						array[pos]=num;
						pos++;
					}
				}
			}
		}

	}
}
