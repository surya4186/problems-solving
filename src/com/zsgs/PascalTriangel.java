package com.zsgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangel {
	public static List<List<Integer>> pascalTriangel(int numRows) {
		List<List<Integer>> answer = new ArrayList<>();

		answer.add(Arrays.asList(1));

		answer.add(Arrays.asList(1, 1));

		for (int i = 2; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				}

				else {
					row.add(answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j));
				}
			}
			answer.add(row);
		}
		System.out.println(answer);

		return answer;

	}

	public static void main(String[] args) {
		int numRows = 5;
//		pascalTriangel(numRows);
		System.out.println(pascalTriangel(numRows));

	}

}
