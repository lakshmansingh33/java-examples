/**
 * 
 */
package com.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @author lmuriyal
 *
 */
public class Java8ForEach {

	/**
	 * @param args
	 */
	
	public static int i=5;
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		
		Java8ForEach obj= null;
		System.out.println(obj.i);
		/*Map<String,String> m = new HashMap<>();
	    m.put("a", "a");

	    Iterator<String> i = m.keySet().iterator();
	    while(i.hasNext()){
	        m.remove("a");
	        System.out.println(i.next());


	    }*/
		
		/*for (int i=0;i<myList.size();i++) {
			System.out.println("Item removing from list is "+myList.get(i));
			myList.remove(i);
		}*/
		
		/*for (Integer integer : myList) {
			System.out.println("Item removing from list is "+integer);
			myList.remove(integer);
		}*/
		
		/*myList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer integer) {
				System.out.println("Value as red "+integer*integer);
			}
			
		})*/;
	}

}
