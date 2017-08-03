/**
 * 
 */
package com.linkedList;

/**
 * @author lmuriyal
 *
 */
public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.addAtTheEnd(10);
		list.addAtTheEnd(25);
		list.addAtTheEnd(2);
		list.addAtTheStart(1);
		list.addAtThePostion(99, 2);
		list.traverse();
		list.reverse();
		list.traverse();
		list.getSize();

	}

}
