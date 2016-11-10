package com.gmail;

public class ThreadCalculate implements Runnable {

	private int[] array;

	public ThreadCalculate(int[] array) {
		super();
		this.array = array;
	}

	@Override
	public void run() {
		long time;
		long duration;
		time = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " has started at:  " + time);
		duration = time;
		System.out.println(Thread.currentThread().getName() + "  have sum:  " + summa(array));
		time = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " has stoped at:  " + time);
		System.out.println(Thread.currentThread().getName() + " has duration:  " + (time - duration));

	}

	public long summa(int array[]) {
		int sum = 0;
		for (int a : array) {
			sum += array[a];
		}
		return sum;
	}
}
