/**
 * 
 */
package com.collection.custom.implementation;

/**
 * @author lmuriyal001
 *
 */
public class CustomArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomArrayList<Integer> arrayList = new CustomArrayList<>();
		
		// Adding elements to custom array list
		arrayList.add(7);
		arrayList.add(9);
		arrayList.add(10);
		arrayList.add(11);
		arrayList.add(12);
		
		//Display all elements from custom array list
		arrayList.display();
		
		// Get specific element from custom arrayList
		System.out.println(arrayList.get(2));
		
		// Delete element from custom arrayList
		arrayList.remove(2);
		
		//Display all elements from custom array list
		arrayList.display();
		
		System.out.println(arrayList.get(1));

	}

}
