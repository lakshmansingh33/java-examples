/**
 * 
 */
package com.doubly.linked.list;

/**
 * @author lmuriyal
 *
 */
public class Node<T> implements Comparable<T> {

	private T element;
	private Node<T> nextRef;
	private Node<T> prevRef;

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}

	public Node<T> getPrevRef() {
		return prevRef;
	}

	public void setPrevRef(Node<T> prevRef) {
		this.prevRef = prevRef;
	}

	@Override
	public int compareTo(T obj) {
		if(obj == this.getElement()) return 0;
		return 1;
	}

}
