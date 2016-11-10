package com.gmail;

public class ThreadsMain {

	public static void main(String[] args) {

		Thread[] threads = new Thread[101];
		for (int i = 1; i < threads.length; i++) {
			threads[i] = new Thread(new ThreadCreation(i));
			threads[i].start();

		}
	}

}
