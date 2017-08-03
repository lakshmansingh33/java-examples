/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 * 
 */
public class SingletonPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleObject so1 = SingleObject.getInstance();
		SingleObject so2 = SingleObject.getInstance();
		System.out.println("Hascode of first object :"+so1.hashCode());
		System.out.println("Hascode of Second object :"+so2.hashCode());
		if(so1.hashCode() == so2.hashCode()){
			System.out.println("Since both object remains same hence it's singleton class");
		}
	}

}
/*
 * Singleton class can be break in 3 different ways
 * 1) Reflection : To overcome from reflection use enums so that through constructor we can not create different object
 * 2) Clone : To overcome from cloning override clone method and return same object instead of calling super.clone() method
 * 3) Serialization : To overcome from serialization override resolve method and return same object from that method
 */
class SingleObject{
	// Private static field
	private static volatile SingleObject singleObject;
	
	// Private constructor so that object cannot be instantiated from outside
	private SingleObject(){
		
	}
	// Static method which provide object and also ensures thread safty 
	public static SingleObject getInstance(){
		if(singleObject == null){
			synchronized(SingleObject.class){
				if(singleObject == null){
					singleObject = new SingleObject();
				}
			}
		}
		return singleObject;
	}
}
