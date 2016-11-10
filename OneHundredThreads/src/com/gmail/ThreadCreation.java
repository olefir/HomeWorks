package com.gmail;

import java.math.BigInteger;

public class ThreadCreation implements Runnable {

	private int number;

	public ThreadCreation(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + "  " + calculateFactorial(number));
	}

	private BigInteger calculateFactorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

}
