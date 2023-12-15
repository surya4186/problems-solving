package com.zsgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SublistSearch {
	private static boolean searchSublist(ArrayList<Integer> list, ArrayList<Integer> list2) {
		for (int i = 0; i < list.size() - list2.size(); i++) {
			if (list.subList(i, i + list2.size()).equals(list2)) {
				return true;
			}

		}
		return false;

	}

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 7, 8, 2));
//		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first list size");
		int len = scan.nextInt();
		System.out.println("Enter second list size");
		int len2 = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println("Enter first list");
		for (int i = 0; i < len; i++) {
			list.add(scan.nextInt());
		}
		System.out.println("Enter second list");
		for (int i = 0; i < len2; i++) {
			list2.add(scan.nextInt());
		}

		searchSublist(list, list2);
		System.out.println(searchSublist(list, list2));
	}

}
