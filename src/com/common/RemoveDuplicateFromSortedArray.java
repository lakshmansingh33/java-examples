package com.common;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] array = {1,1,2,2,3,4,5,5,5};
		array = removeDuplicates(array);
		System.out.println("Printing dupliate removed array");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

	private static int[] removeDuplicates(int[] array) {
		if(array.length<2){
			return array;
		}
		int i=0;
		int j=1;
		
		while(j<array.length){
			if(array[j] == array[i]){
				j++;
			}else{
				i++;
				array[i] = array[j];
				j++;
			}
		}
		
		int[] duplicateRemoved = Arrays.copyOf(array, i+1);
		return duplicateRemoved;
	}

}
