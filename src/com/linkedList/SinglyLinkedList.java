/**
 * 
 */
package com.linkedList;

/**
 * @author lmuriyal
 *
 */
public class SinglyLinkedList<T> {
	
	private Node<T> head;
	
	public static int counter=0;
	
	public void addAtTheEnd(T element){
		Node<T> node = new Node<T>();
		node.setValue(element);
		counter+=1;
		Node<T> temp = head;
		while(true){
			if(temp == null){
				head = node;
				break;
			}else if(temp.getNextRef() == null){
				temp.setNextRef(node);
				break;
			}else{
				temp = temp.getNextRef();
			}
		}
	}
	
	public void addAtTheStart(T element){
		Node<T> node = new Node<T>();
		node.setValue(element);
		counter+=1;
		Node<T> temp = head;
		if(temp == null){
			head = node;
		}else{
			node.setNextRef(temp);
			head = node;
		}
	}
	
	public void addAtThePostion(T element, int postion){
	if(postion==0){
		this.addAtTheStart(element);
	}else if(postion > counter){
		this.addAtTheEnd(element);
	}else{
		Node<T> node = new Node<T>();
		node.setValue(element);
		Node<T> temp = head;
		Node<T> prev = null;
		int i=1;
		while(temp != null && i<postion){
			prev=temp;
			temp=temp.getNextRef();
			i++;
		}
		if(temp == null){
			prev.setNextRef(node);
			node.setNextRef(null);
		}else{
			prev.setNextRef(node);
			node.setNextRef(temp);
		}
	
	}

	}
	
  public void traverse(){
	  Node<T> temp = head;
	  while(true){
		  if(temp == null){
			  break;
		  }
		  System.out.println(temp.getValue()+"-->");
		  temp = temp.getNextRef();
	  }
  }
  
  public void reverse(){
	  System.out.println("Reversing the linked list");
	  Node<T> prev = null;
	  Node<T> curr = head;
	  Node<T> next = null;
	  while(curr != null){
		  next = curr.getNextRef();
		  curr.setNextRef(prev);
		  prev = curr;
		  curr = next;
	  }
	  head = prev;
  }
  
  public void getSize(){
	  System.out.println("The size of linked list is "+counter);
  }
}
