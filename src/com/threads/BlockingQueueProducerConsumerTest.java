package com.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueProducerConsumerTest {

	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
		
		BlockingQueueProducer producer = new BlockingQueueProducer(sharedQueue);
		
		BlockingQueueConsumer consumer = new BlockingQueueConsumer(sharedQueue);
		
		Thread p1 = new Thread(producer,"producer");
		Thread c1 = new Thread(consumer,"consumer");
		
		p1.start();
		c1.start();

	}

}
