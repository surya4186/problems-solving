package com.zsgs;

import java.util.ArrayList;
import java.util.Arrays;

public class SudokuSolver {
//	public static int generate(ArrayList<Integer> listRow,ArrayList<Integer> listCol) {
//		for (int i = 1; i <= 9; i++) {
//			if (!(list.contains(i))) {
//				list.add(i);
//				return i;
//			}
//		}
//
//		return 0;
//
//	}

	public static void main(String[] args) {
//		int[][] sudoku = { { 4, 0, 3 }, { 0, 1, 0 }, { 2, 0, 7 } };
//		int[][] sudokuBoard = {
//                {5, 3, 0, 0, 7, 0, 0, 0, 0},
//                {6, 0, 0, 1, 9, 5, 0, 0, 0},
//                {0, 9, 8, 0, 0, 0, 0, 6, 0},
//                {8, 0, 0, 0, 6, 0, 0, 0, 3},
//                {4, 0, 0, 8, 0, 3, 0, 0, 1},
//                {7, 0, 0, 0, 2, 0, 0, 0, 6},
//                {0, 6, 0, 0, 0, 0, 2, 8, 0},
//                {0, 0, 0, 4, 1, 9, 0, 0, 5},
//                {0, 0, 0, 0, 8, 0, 0, 7, 9}
//        };
//
//		ArrayList<Integer> listRow = new ArrayList<>();
//		ArrayList<Integer> listcol = new ArrayList<>();
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 9; j++) {
//				if (sudoku[i][j] != 0) {
//					listRow.add(sudoku[i][j]);
//				}
//				if (sudoku[j][i] != 0) {
//					listcol.add(sudoku[j][i]);
//				}
//
//			}
//			check(sudoku,listRow,listcol);
//
//		}
//
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
////				if (sudoku[i][j] == 0) {
////					sudoku[i][j] = generate(list);
////				}
//				System.out.print(sudoku[i][j] + " ");
//			}
//			System.out.println();
//
//		}
//
//	}
//
//	public static void check(int[][] sudoku,ArrayLijst<Integer> listRow,ArrayList<Integer> listCol) {
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 9; j++) {
//				if (sudoku[i][j] == 0) {
//					sudoku[i][j] = generate(listRow,listCol);
//				}
//			}
//		}
//	}
		int[][] sudokuBoard = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
				{ 0, 9, 8, 0, 0, 0, 0, 6, 0 }, { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
				{ 7, 0, 0, 0, 2, 0, 0, 0, 6 }, { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
				{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		if (solveSudoku(sudokuBoard)) {
			printBoard(sudokuBoard);
		} else {
			System.out.println("No solution exists.");
		}
	}

	private static boolean solveSudoku(int[][] board) {
		int[] emptySpot = findEmptyLocation(board);
		int row = emptySpot[0];
		int col = emptySpot[1];

		if (row == -1 && col == -1) {
			return true;
		}

		for (int num = 1; num <= 9; num++) {
			if (isValid(board, row, col, num)) {
				board[row][col] = num;

				if (solveSudoku(board)) {
					return true;
				}

				board[row][col] = 0;
			}
		}

		return false;
	}

	private static int[] findEmptyLocation(int[][] board) {
		int[] emptySpot = { -1, -1 };

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				if (board[row][col] == 0) {
					emptySpot[0] = row;
					emptySpot[1] = col;
					return emptySpot;
				}
			}
		}

		return emptySpot;
	}

	private static boolean isValid(int[][] board, int row, int col, int num) {

		for (int i = 0; i < 9; i++) {
			if (board[row][i] == num || board[i][col] == num) {
				return false;
			}
		}

		int startRow = 3 * (row / 3);
		int startCol = 3 * (col / 3);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i + startRow][j + startCol] == num) {
					return false;
				}
			}
		}

		return true;
	}

	private static void printBoard(int[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
