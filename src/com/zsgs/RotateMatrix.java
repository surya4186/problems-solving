package com.zsgs;

import java.util.Scanner;

public class RotateMatrix {
	public static void rotateMatrix(int[][] matrix) {
		int len = matrix.length - 1;
		int[][] result = new int[matrix.length][matrix.length];

		int[][] matrix2 = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix2[i][j] = matrix[j][i];

			}
		}
		int len2 = matrix.length - 1;
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				result[i][j] = matrix2[i][len2--];
			}
			len2 = matrix.length - 1;
		}
		printMatrix(result);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
//		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = scan.nextInt();
		System.out.println("Enter the column");
		int col = scan.nextInt();
		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		rotateMatrix(matrix);

	}

}
