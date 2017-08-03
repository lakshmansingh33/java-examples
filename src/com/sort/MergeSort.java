/**
 * 
 */
package com.sort;

/**
 * @author lmuriyal
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] array = {5,7,1,3,9,6,8,2};
		System.out.println("Before sorting array is as follows ");
		for (int i : array) {
			System.out.println(i+" ");
		}
		System.out.println("After sorting array is as follows ");
		merge_Sort(array,0,array.length-1);
		for (int i : array) {
			System.out.println(i+" ");
		}

	}
	
	public static void merge_Sort(int[] array,int startIndex,int endIndex){
		
		if(startIndex < endIndex){
			 int middle=(startIndex+endIndex)/2;
			 merge_Sort(array,startIndex,middle);
			 merge_Sort(array,middle+1,endIndex);
			 mergeResults(array,startIndex,middle,endIndex);
		
		}
	}

	private static void mergeResults(int[] arr,int lower,int middle,int last) {
		// Find sizes of two subarrays to be merged
        int n1 = middle - lower + 1;
        int n2 = last - middle;
        /* Create temp arrays */
        int L[] = new int[n1];
		int R[] = new int[n2];
		/*Copy data to temp arrays*/
		for(int i=0;i<n1;++i) 
			L[i]=arr[lower+i];
		
		for(int j=0;j<n2;++j)
			R[j]=arr[middle+1+j];
		
		 /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
		int i=0,j=0;
		// Initial index of merged subarry array
		int k=lower;
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				arr[k]=L[i];
				i++;
				k++;
			}else{
				arr[k]=R[j];
				j++;
				k++;
			}
		}
		/* Copy remaining elements of L[] if any */
			while(i<n1){
				arr[k]=L[i];
				i++;
				k++;
			}
			/* Copy remaining elements of R[] if any */
			 while (j < n2){
				 	arr[k] = R[j];
		            j++;
		            k++;
		        }
		}
}
