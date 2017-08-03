package com.threads;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducer implements Runnable{
	
	private BlockingQueue<Integer> sharedQueue;
	
	public BlockingQueueProducer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			try {
				System.out.println("Producing the element "+i);
				sharedQueue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
