package com.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] inputArrray ={0,1,2,3,5,7,9};
		int searchValue=1;
		int returnValue=binarySearch(inputArrray,searchValue,0,inputArrray.length);
		System.out.println("Search for element "+searchValue+" and we found "+returnValue);

	}

	public static int binarySearch(int[] inputArrray,int searchValue,int leftIndex,int rightIndex){
		int midIndex=(leftIndex+rightIndex)/2;
		
		if(midIndex>=inputArrray.length){
			return -1;
		}
		if(leftIndex>rightIndex){
			return -1;
		}
		int midValue = inputArrray[midIndex];
		
		if(searchValue>midValue){
			leftIndex = midIndex+1;
			return binarySearch(inputArrray, searchValue, leftIndex, rightIndex);
		}else if(searchValue<midValue){
			rightIndex = midIndex-1;
			return binarySearch(inputArrray, searchValue, leftIndex, rightIndex);
		}else {
			return midValue;
		}
	}
}
