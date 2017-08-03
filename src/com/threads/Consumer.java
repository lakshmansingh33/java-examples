package com.threads;

import java.util.Vector;

public class Consumer implements Runnable{
	private final Vector sharedQueue;
	private final int SIZE;
	
	public Consumer(Vector sharedQueue, int sIZE) {
		this.sharedQueue = sharedQueue;
		SIZE = sIZE;
	}

	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Consumed element is "+consume());
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private int consume() throws InterruptedException {
		while(sharedQueue.isEmpty()){
			synchronized(sharedQueue){
				System.out.println("Queue is Empty hence cannot retrive element");
				sharedQueue.wait();
			}
		}
		synchronized(sharedQueue){
			sharedQueue.notifyAll();
			return (int) sharedQueue.remove(0);
		}
	}
}
