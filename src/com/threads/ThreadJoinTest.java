/**
 * 
 */
package com.threads;

/**
 * @author lmuriyal
 *
 */
public class ThreadJoinTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread started and task is to print : 1 to 2000");
		final Thread t1 = new Thread() {
			@Override
			public void run(){
				for (int i=1;i<=1000;i++) {
					System.out.println("Printing number "+i);
				}
				System.out.println("Printing of 0-1000 completed by thread1");
			}
		};
		
		final Thread t2 = new Thread(){
			
			@Override
			public void run() {
				try {
					t1.join(50);
				}catch(InterruptedException ie){
					System.out.println(ie.getMessage());
				}
				for (int i=1001;i<=2000;i++) {
					System.out.println("Printing number "+i);
				}
				System.out.println("Printing of 1001-2000 completed by thread2");
			
			};
		};
		t1.start();
		t2.start();
		t2.join();
		System.out.println("Printing task finished");
	}

}
