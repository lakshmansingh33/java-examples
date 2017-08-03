/**
 * 
 */
package com.string;

/**
 * @author lmuriyal
 *
 */
public class ReverseString {
	public static void main(String[] args) {
		
		reverse("laxmansingh");
		reverseV2("muriyal");

	}

	/**
	 * Convert the string to char array
	 * Swap the first character with the last character and second char with second last char and so on..
	 * Construct new string with the swapped array and render
	 */
	public static void reverse(String str){
		char[] charArray = str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j){
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		String tobeReturned = new String(charArray);
		System.out.println("Reversed string is :"+tobeReturned);
	}
	/*
	 * Create string builder object and from passed string keep appending last character
	 * render the the string
	 */
	public static void reverseV2(String str){
		StringBuilder sb = new StringBuilder();
		
		for(int i= str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		
		System.out.println("Reversed string is :"+sb.toString());
	}
}
