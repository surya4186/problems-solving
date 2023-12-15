package com.zsgs;

import java.util.Arrays;

public class MaximumGap {

	public static void main(String[] args) {
		int[] array = { 48,58,72,1,2,128,56,1024 };
		sort(array);
		maximumGap(array);

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

	private static void maximumGap(int[] array) {
		int max = 0;
		for (int i = 1; i < array.length; i++) {
			int sum = array[i] - array[i - 1];
			max = Math.max(max, sum);

		}
		System.out.println("Maximum Gap :" + max);

	}

}
