package com.zsgs;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
//		int[] array = { 2, 4, 4, 7, 3, 3, 7, 2, 2, 12, 13, 13, 12, 5 };
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Array Size:");
		int len = scan.nextInt();
		int[] array = new int[len];
		System.out.print("Enter the Array elements:");
		for (int i = 0; i < len; i++) {
			array[i] = scan.nextInt();

		}
		System.out.println(Arrays.toString(array));

		int k = 4;
		sort(array);
		int size = removeDuplicate(array);
		if (size > k) {
			System.out.println(array[k - 1]);

		} else {
			System.out.println(-1);
		}

	}

	private static int removeDuplicate(int[] array) {
		int j = 0;
		int i = 0;
		for (i = 1; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				array[j++] = array[i];

			}
		}
		array[j] = array[i];
		System.out.println(Arrays.toString(array));
		return j;

	}

	private static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int tem = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tem;
		}
		System.out.println(Arrays.toString(array));

	}

}
