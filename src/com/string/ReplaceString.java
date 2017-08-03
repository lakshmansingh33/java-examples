/**
 * 
 */
package com.string;

/**
 * @author lmuriyal
 *
 */
public class ReplaceString {

	public static void main(String[] args) {
		replaceSpace("Lax ma n  ");
		replaceSpaceV2("Lax ma n  ");

	}
	
	public static void replaceSpace(String str){
		char[] charArray = str.toCharArray();
		int spaceCount=0,newlength=0;
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]==' '){
				spaceCount++;
			}
		}
		newlength=charArray.length+(2*spaceCount);
		char[] newArray= new char[newlength];
		for(int i=charArray.length-1;i>=0;i--){
			if(charArray[i]==' '){
				newArray[newlength-1]='0';
				newArray[newlength-2]='2';
				newArray[newlength-3]='%';
				newlength= newlength-3;
			}else{
				newArray[newlength-1] = charArray[i];
				newlength= newlength-1;
			}
		}
		
		System.out.println("Replaced string:"+new String(newArray));
	}
	
	public static void replaceSpaceV2(String str){
		char[] charArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : charArray) {
			if(' '==c){
				sb.append("%20");
			}else{
				sb.append(c);
			}
		}
		System.out.println("Replaced string:"+sb.toString());
	}

}
