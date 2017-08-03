/**
 * 
 */
package com.collection.custom.implementation;

import java.util.NoSuchElementException;

/**
 * @author lmuriyal
 *
 */
public class CustomStack {

	protected int[] arr;
	protected int top,size,len;
	
	// Constructor for initialization
	public CustomStack(int n){
		size = n;
		top =-1;
		len =0;
		arr = new int[size];
	}
	
	//Function to check stack is Empty or not
	public boolean isEmpty(){
		return top == -1;
	}
	
	// Function to check stack is full or not
	public boolean isFull(){
		return top == size-1;
	}
	
	//Function to return element at top without delete
	public int peek(){
		if(isEmpty()){
			throw new NoSuchElementException("Underflow exception");
		}
		return arr[top];
	}
	
	//Function to remove element at the top of the stack
	public int pop(){
		if(isEmpty()) throw new NoSuchElementException("Underflow exception");
		len --;
		return arr[top--];
	}
	
	//Function to add element to stack
	public void push(int n){
		if(isFull()) throw new ArrayIndexOutOfBoundsException("OverFlow exception");
		arr[++top] = n;
		len++;
	}
	
	//Function to display all elements of stack
	public void display(){
		System.out.println("\nStack = ");
		if(len == 0){
			System.out.println("Stack is empty");
			return ;
		}else{
			for(int i=top;i>=0;i--){
				System.out.println(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
	// Function which returns current size of the stack
	public int getSize(){
		return len;
	}
}
