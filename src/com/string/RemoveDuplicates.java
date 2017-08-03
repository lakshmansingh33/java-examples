/**
 * 
 */
package com.string;

import java.util.Objects;

/**
 * @author lmuriyal
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		removeuplicate("laxmansingaha");
		removeDuplicateV2("laxmansingaha");
		removeDuplicateCharacters("laxmansingaha");

	}
	
	// With no additional buffer
	public static void removeuplicate(String str){
		char[] charArray = str.toCharArray();
		
		// If char array is null then return
		if(charArray == null){
			return;
		}
		// If only 1 char is present then duplicate not possible
		if(charArray.length <2){
			return ;
		}
		// For every character in char array in nested loop check for existence 
		int tail =1;
		for(int i=1;i<charArray.length;i++){
			int j;
			for(j=0; j<tail;j++){
				if(charArray[i] == charArray[j]){
					break;
				}
			}
				if(j == tail){
					charArray[tail] = charArray[i];
					tail++;
				}
			
		}
		
		//Make sure last character is set to 0
		charArray[tail]=0;
		
		System.out.println("Duplicate removed string "+new String(charArray));
	}
	
	// With additional buffer
	public static void removeDuplicateV2(String str){
		char[] charArray = str.toCharArray();
		if(charArray == null){
			return;
		}
		if(charArray.length <2){
			return;
		}
		
		boolean[] val = new boolean[256];
		for(int i =0 ;i<256;i++){
			val[i] = false;
		}
		
		val[charArray[0]]= true;
		int tail =1;
		for(int i=1;i<charArray.length;++i){
			if(!val[charArray[i]]){
				charArray[tail] = charArray[i];
				++tail;
				val[charArray[i]] = true;
			}
		}
		
		charArray[tail] =0;
		
		System.out.println("Duplicate removed string "+new String(charArray));
	}
	
	public static void removeDuplicateCharacters(String word) {
	    Objects.requireNonNull(word);

	    char[] wordArray = word.toCharArray();

	    int len = wordArray.length;
	    for (int i = 0; i < wordArray.length; i++) {
	        int count = 0;
	        for (int j = i; j < wordArray.length; j++) {
	            if (wordArray[i] == wordArray[j]) {
	                count++;
	                if (count > 1) {
	                    wordArray[j] = 0;
	                }
	            }
	        }
	    }
	    System.out.println("Duplicate removed string "+String.valueOf(wordArray));
	}


}
