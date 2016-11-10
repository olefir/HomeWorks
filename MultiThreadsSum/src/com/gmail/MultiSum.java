package com.gmail;

import java.util.Random;

public class MultiSum {

	private static int[] numbersArray = new int[10000000];
	private static int[] numbersArray2 = new int[10000000];
	private static long time;
	private static long duration;
	private static long summaTotal;

	public static void main(String[] args) {

		// Чтобы не создавать метод деления массива для двух потоков,
		// создал два массива

		setRandomNumber(numbersArray);
		setRandomNumber(numbersArray2);

		Thread threadSum1 = new Thread(new ThreadCalculate(numbersArray));
		Thread threadSum2 = new Thread(new ThreadCalculate(numbersArray2));

		threadSum1.start();
		threadSum2.start();

		// Считаем в однопоточном режиме

		time = System.currentTimeMillis();
		System.out.println("OneThread calculation has started.");
		duration = time;

		summaTotal = summa(numbersArray) + summa(numbersArray2);
		System.out.println("Total sum is:   " + summaTotal);

		time = System.currentTimeMillis();
		System.out.println("OneThread has duration:  " + (time - duration));
	}

	private static void setRandomNumber(int a[]) {
		int b;
		for (int w : a) {
			Random num = new Random();
			b = num.nextInt(100) + 1;
			a[w] = b;
		}
	}

	public static long summa(int array[]) {
		int sum = 0;
		for (int a : array) {
			sum += array[a];
		}
		return sum;
	}
}
