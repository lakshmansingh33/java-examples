/**
 * 
 */
package com.collection.custom.implementation;

/**
 * @author lmuriyal001
 *
 */
public class CustomHashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		CustomHashMap<String, Integer> map = new CustomHashMap<>();
		
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("A", 100);
		
		map.display();
		
		System.out.println(map.get("C"));
		
		System.out.println(map.remove("Z"));
		
		map.display();
		
		

	}

}
