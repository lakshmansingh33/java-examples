package com.threads;

import java.util.Vector;

public class ProducerConsumer {

	public static void main(String[] args) {
		Vector sharedQueue = new Vector();
		int size=4;
		Thread producer = new Thread(new Producer(sharedQueue,size),"producer");
		Thread consumer = new Thread(new Consumer(sharedQueue,size),"consumer");
		producer.start();
		consumer.start();

	}

}
