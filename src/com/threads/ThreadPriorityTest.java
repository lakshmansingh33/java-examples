/**
 * 
 */
package com.threads;

/**
 * @author lmuriyal
 *
 */
public class ThreadPriorityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		
		Mythread t1 = new Mythread();
		t1.start();
		t1.setPriority(9);
		
	}
	
	static class Mythread extends Thread {
		@Override
		public void run() {
			System.out.println("From thread class");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Priority of Thread :"+this.getPriority());
		}
	}

}
