/**
 * 
 */
package com.doubly.linked.list;

/**
 * @author lmuriyal
 *
 */
public class DoublyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	public static int count = 0;

	public Node<T> insertAtFirst(T element){
		Node<T> node = new Node<T>();
		node.setElement(element);
		if(count ==0){
			head = node;
			tail = node;
		}else{
			node.setNextRef(head);
			head.setPrevRef(node);
			head = node;
		}
		count++;
		return node;
	}
	
	public Node<T> insertAtLast(T element){
		Node<T> node = new Node<T>();
		node.setElement(element);
		if(count==0){
			head = node;
			tail = node;
		}else{
			tail.setNextRef(node);
			node.setPrevRef(tail);
			tail= node;
		}
		count++;
		return node;
	}
	
	public void addAfterNode(T element,Node<T> node){
		if(node == null){
			System.out.println("Cannot be added after null node");
		}else if(tail ==node){
			this.insertAtLast(element);
		}else{
			Node<T> newNode = new Node<T>();
			newNode.setElement(element);
			Node<T> nextNode = node.getNextRef();
			nextNode.setPrevRef(newNode);
			newNode.setPrevRef(node);
			newNode.setNextRef(nextNode);
			node.setNextRef(newNode);
		}
		count++;
	}
	
	public void display(){
		Node<T> temp = head;
		if(head == null){
			System.out.println("Doubly linked list is empty");
		}else {
			while(temp!=null){
				System.out.println("Element of the list is "+temp.getElement());
				temp = temp.getNextRef();
			}
		}
	}
	
	public void displayInReverseOrder(){
		Node<T> temp = tail;
		if(head == null){
			System.out.println("Doubly linked list is empty");
		}else {
			while(temp!=null){
				System.out.println("Element of the list is "+temp.getElement());
				temp = temp.getPrevRef();
			}
		}
	}
}
