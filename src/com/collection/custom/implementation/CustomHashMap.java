/**
 * 
 */
package com.collection.custom.implementation;

/**
 * @author lmuriyal001
 *
 */
public class CustomHashMap<K,V> {

	private Entry<K,V>[] table;//bucket which hold index
	private int capacity=4;// Initial capacity of custom hash map
	
	// Entry class
	static class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key,V value,Entry<K,V> next){
			this.key=key;
			this.value=value;
			this.next=next;
		}
	}
	
	// Initialization of bucket with initial value
	public CustomHashMap(){
		table = new Entry[capacity];
	}
	
	public int hash(K key){
		return Math.abs(key.hashCode())%capacity;
	}
	
	// put method
	public void put(K key,V value){
		// Null key's are not allowed
		if(key == null){
			return ;
		}
		// get index applying hash function
		int hash = hash(key);
		
		Entry<K,V> newEntry = new Entry<K,V>(key,value,null);
		
		if(table[hash] == null){
			table[hash]= newEntry;
			return;
		}else{
			Entry<K,V> prev =null;
			Entry<K,V> current = table[hash];
			while(current!=null){
				if(current.key.equals(newEntry.key)){
					if(prev == null){ // Assuming we need to override first entry
						newEntry.next=current.next;
						table[hash]=newEntry;
						return;
					}else{
						newEntry.next=current.next;
						prev.next=newEntry;
						return;
					}
				}
				prev=current;
				current=current.next;
			}
		}
	}
	
	public void display(){
		for(int i=0;i<capacity;i++){
			Entry<K,V> value =table[i];
			while(value!=null){
				System.out.println("{ key :"+value.key+" value :"+value.value+" }");
				value = value.next;
			}
		}
	}
	
	public V get(K key){
		int index = hash(key);
		if(table[index]==null){
			return null;
		}else{
			Entry<K,V> temp = table[index];
			while(temp!=null){
				if(temp.key.equals(key)){
					return temp.value;
				}
				temp=temp.next;
			}
		}
		return null;
	}
	
	public boolean remove(K key){
		int index=hash(key);
		
		if(table[index] == null){
			return false;
		}else{
			Entry<K,V> prev = null;
			Entry<K,V> current = table[index];
			while(current!=null){
				if(current.key.equals(key)){
					if(prev == null){
						table[index]=table[index].next;
						return true;
					}else{
						prev.next=current.next;
						return true;
					}
				}
				prev=current;
				current=current.next;
			}
		}
		return false;
	}
}
