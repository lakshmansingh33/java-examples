/**
 * 
 */
package com.threads;

/**
 * @author lmuriyal
 *
 */
public class ThreadSyncTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SharedData sd = new SharedData();
		final Thread t = new Thread(){
			@Override
			public void run(){
			 sd.sharedMathod();	
			}
		};
		
		final Thread t1 = new Thread(){
			@Override
			public void run(){
				sd.sharedMathod();
			}
		};
		
		t.start();
		t1.start();
		t1.join();
		System.out.println("Processing completed");

	}

}

class SharedData{
	int i;
	synchronized void sharedMathod(){
		Thread t = Thread.currentThread();
		for(int i=0;i<=1000;i++){
			System.out.println(t.getName()+" prints the value: "+i);
		}
	}
}
