/**
 * 
 */
package com.collection.custom.implementation;

import java.util.Arrays;

/**
 * @author lmuriyal001
 *
 */
public class CustomArrayList<E> {
	
	private static final int INITIAL_CAPACITY=3;
	private int size;
	private Object[] elementsArray={};
	
	public CustomArrayList(){
		elementsArray = new Object[INITIAL_CAPACITY];
	}
	
	public void add(E e){
		if(size == elementsArray.length){
			ensureCapacity();
		}
		elementsArray[size++]=e;
	}
	
	public E get(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("Index :"+index+" and size is :"+size);
		}
		return (E)elementsArray[index];
	}
	
	public Object remove(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("Index :"+index+" and size is :"+size);
		}
		Object element = elementsArray[index];
		for(int i=index;i<size-1;i++){
			elementsArray[i]=elementsArray[i+1];
		}
		size--;
		return element;
	}
	
	public void display(){
		for(int i=0;i<size;i++){
			System.out.println(elementsArray[i]);
		}
	}
   
   public void ensureCapacity(){
	   int newSize = INITIAL_CAPACITY*2;
	   elementsArray = Arrays.copyOf(elementsArray, newSize);
	   System.out.println("Capacity doubled");
   }
}
