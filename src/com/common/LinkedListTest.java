package com.common;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.addFirst(10);
		linkedList.addLast(30);
		System.out.println("Fetching for the first time");
		for (Integer integer : linkedList) {
			System.out.println(integer);
		}
		linkedList.add(1, 20);
		System.out.println("Fetching for the second time");
		for (Integer integer : linkedList) {
			System.out.println(integer);
		}
		linkedList.add(40);
		System.out.println("Fetching for the third time");
		for (Integer integer : linkedList) {
			System.out.println(integer);
		}
		System.out.println("First item in the linked list is "+linkedList.getFirst());
		System.out.println("Last item in the linked list is "+linkedList.getLast());
	}

}
