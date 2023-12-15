package com.zsgs;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	private static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!(list2.contains(list.get(i)))) {
				list2.add(list.get(i));
			}

		}
		System.out.print("remove Duplicates :");
		System.out.println(list2);

	}

	public static void main(String[] args) {
		System.out.print("Duplicates ArrayList: ");
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 6, 6, 6, 3));
		System.out.println(list);
		removeDuplicate(list);

	}

}
