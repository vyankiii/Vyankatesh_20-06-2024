package com.javaDeamonThreads;

public class TestDeamonThreads extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {// cheaking Deamon thread
			System.out.println("Deamon Thread Work..." + Thread.currentThread());
		} else {
			System.out.println("User Thread work.." + Thread.currentThread());
		}
	}
}
