/**
 * 
 */
package com.collection.custom.implementation;

import java.util.NoSuchElementException;

/**
 * @author lmuriyal
 *
 */
public class CustomQueue {
	
	protected int[] queue;
	protected int front,rear,size,len;
	
	// Constructor to initialize the values
	public CustomQueue(int n){
		size=n;
		len=0;
		front=-1;
		rear=-1;
		queue=new int[size];
	}

	//Function to check queue is empty
	public boolean isEmpty(){
		return front ==-1;
	}
	
	//Function to check queue is full
	public boolean isFull(){
		return front ==0 && rear==size-1;
	}
	
	//Function to get the size of queue
	public int getSize(){
		return len;
	}
	
	//Function to get element from front(peek)
	public int peek(){
		if(isEmpty()) throw new NoSuchElementException("Underflow exception");
		return queue[front];
	}
	
	//Function to add element to queue
	public void insert(int item){
		if(rear == -1){
			front=0;
			rear=0;
			queue[rear]=item;
		}
		else if(rear+1>=size) throw new IndexOutOfBoundsException("Overflow exception");
		
		else if(rear+1<size) queue[++rear]=item;
		
		len++;
	}
	
	//Function to remove element from queue
	public int remove(){
		if(isEmpty()) throw new NoSuchElementException("Underflow Exception");
		len --;
		int element = queue[front];
		if(front == rear){
			front = -1;
			rear = -1;
		}else{
			front++;
		}
		return element;
	}
	
	//Function to display queue elements
	public void display(){
		if(isEmpty()) System.out.println("Queue is empty\n");
		else{
			System.out.println("Elements of queue are \n");
			for(int i=front;i<=rear;i++){
				System.out.println(queue[i]+" ");
			}
		}
	}
}
