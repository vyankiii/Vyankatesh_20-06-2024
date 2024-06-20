package com.javaDeamonThreads;

public class TestDeamonThreads2 {

	public static void main(String[] args) {

		DeamonThreads2 t1 = new DeamonThreads2();
		DeamonThreads2 t2 = new DeamonThreads2();

		t2.setDaemon(true);// now t2 is Deamon thread

		t1.start();
		t2.start();// starting thread

	}

}
