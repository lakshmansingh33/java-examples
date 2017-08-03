/**
 * 
 */
package com.doubly.linked.list;

/**
 * @author lmuriyal
 *
 */
public class DoublyLinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		//list.display();
		list.insertAtFirst(10);
		list.insertAtFirst(20);
		Node<Integer> node=list.insertAtFirst(30);
		list.insertAtLast(50);
		list.addAfterNode(70, node);
		list.display();
		System.out.println("==========");
		list.displayInReverseOrder();


	}

}
