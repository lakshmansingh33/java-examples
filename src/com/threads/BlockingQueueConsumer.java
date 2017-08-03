package com.threads;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueConsumer implements Runnable {
	
	private BlockingQueue<Integer> sharedQueue;
	
	public BlockingQueueConsumer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Consumed element is "+sharedQueue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
