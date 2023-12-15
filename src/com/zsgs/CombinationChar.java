package com.zsgs;

import java.util.ArrayList;

public class CombinationChar {

	public static void main(String[] args) {
		String str = "abcdefgh";
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i) + " ");
			for (int j = i + 1; j < str.length(); j++) {
				list.add(str.substring(i, j + 1));
			}
		}
		System.out.println(list);

	}

}
