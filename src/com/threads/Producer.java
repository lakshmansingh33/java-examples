package com.threads;

import java.util.Vector;

public class Producer implements Runnable{
	
	private final Vector sharedQueue;
	private final int SIZE;
	
	public Producer(Vector sharedQueue, int sIZE) {
		this.sharedQueue = sharedQueue;
		SIZE = sIZE;
	}

@Override
public void run() {
		for(int i=0;i<7;i++){
			System.out.println("Produced "+i);
			try {
				produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

private void produce(int i) throws InterruptedException {
		while(sharedQueue.size()==SIZE){
			synchronized(sharedQueue){
			System.out.println("Queue is full hence cannot produce the element "+i);	
			sharedQueue.wait();	
		  }
			
		}
		
		synchronized (sharedQueue){
			sharedQueue.add(i);
			sharedQueue.notifyAll();
		}
	}

}
