package com.javaDeamonThreads;

public class TestClass {

	public static void main(String[] args) {
	
		TestDeamonThreads t1 = new TestDeamonThreads();
		TestDeamonThreads t2 = new TestDeamonThreads();
		TestDeamonThreads t3 = new TestDeamonThreads();// creating thread
		
		t3.setDaemon(true);//now t3 is Deamon thread
		
		t1.start();
		t2.start();
		t3.start();//starting thread
		
	}

}
