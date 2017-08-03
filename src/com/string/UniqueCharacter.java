/**
 * 
 */
package com.string;

/**
 * @author lmuriyal
 *
 */
public class UniqueCharacter {

	public static void main(String[] args) {
		hasUniqueChars("SBC");

	}
	
	public static void hasUniqueChars(String str){
		boolean status = true;
		String lowerCaseString = str.toLowerCase();
		if(str!=null){
			//For each character check first and last index remains same
			for (char c : lowerCaseString.toCharArray()) {
				if(lowerCaseString.indexOf(c) == lowerCaseString.lastIndexOf(c)){
					continue;
				}else{
					status=false;
					break;
				}
			}
		}else{
			status=false;
		}
		if(status){
			System.out.println("String '"+str+"' contains all unique characters");
		}else{
			System.out.println("String '"+str+"' contains duplicate characters");
		}
		
	}

}
