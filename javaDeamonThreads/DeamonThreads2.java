package com.javaDeamonThreads;

public class DeamonThreads2 extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {// cheaking Deamon thread
			System.out.println("Deamon Thread Work..." + Thread.currentThread().isDaemon());
		} else {
			System.out.println("User Thread work.." + Thread.currentThread().getName());
		}
	}
}
