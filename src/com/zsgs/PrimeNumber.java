package com.zsgs;

import java.util.Scanner;

public class PrimeNumber {
	public static void primeNumber(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start number");
		int start = scan.nextInt();
		System.out.println("Enter the end number");
		int end = scan.nextInt();
		primeNumber(start, end);
	}

}
