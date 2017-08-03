/**
 * 
 */
package com.string;

import java.util.Arrays;

/**
 * @author lmuriyal
 *
 */
public class Anagram {

	public static void main(String[] args) {
		isAnagram("1Ab c", "CB a1");
		isAnagramV2("1Abc", "CB a2");
	}
	
	public static boolean isAnagram(String str,String str2){
		// Remove all white space from both the string
		String copyOfStr1 = str.replaceAll("\\s", "").toLowerCase();
		String copyOfStr2 = str2.replaceAll("\\s", "").toLowerCase();
		
		boolean status = false;
		 // If length of both the string is not equal conclude as false
		 if(copyOfStr1.length()!=copyOfStr2.length()){
			 status= false;
		 }else{
			 // Convert it into Char array
			 char[] s1Array = copyOfStr1.toCharArray();
			 char[] s2Array = copyOfStr2.toCharArray();
			 
			 //Sort the char array
			 Arrays.sort(s1Array);
			 Arrays.sort(s2Array);
			 
			 //Check for equality
			 status = Arrays.equals(s1Array, s2Array);
		 }
		 if(status){
			 System.out.println("Given '"+str+"' and '"+str2+"' are anagrams");
		 }else{
			 System.out.println("Given '"+str+"' and '"+str2+"' are not anagrams");
		 }
		 
		return status;
	}
	
	public static boolean isAnagramV2(String str1,String str2){
		String copyOfStr1 = str1.replaceAll("\\s", "").toLowerCase();
		String copyOfStr2 = str2.replaceAll("\\s", "").toLowerCase();
		
		boolean status = true;
		
		if(copyOfStr1.length()!= copyOfStr2.length()){
			status =false;
		}else{
			
			char[] s1Array = copyOfStr1.toCharArray();
			//Check every character of s1Array is available in copyOfStr2
			for (char c : s1Array) {
				int index = copyOfStr2.indexOf(c);
				if(index!=-1){
					// Remove found char from copyOfStr2
					copyOfStr2=copyOfStr2.substring(0, index)+copyOfStr2.substring(index+1, copyOfStr2.length());
				}else{
					status =false;
					break;
				}
				
			}
		}
		if(status){
			System.out.println("Given '"+str1+"' and '"+str2+"' are anagrams");
		}else{
			System.out.println("Given '"+str1+"' and '"+str2+"' are not anagrams");
		}
		return status;
	}

}
