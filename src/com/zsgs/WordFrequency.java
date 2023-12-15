package com.zsgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
	public static void countFrequency(String str) {
		Map<String, Integer> map = new HashMap<>();
		String words = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				words += str.charAt(i);

			}

			if (i == str.length() - 1 || str.charAt(i) == ' ') {

				map.put(words, map.getOrDefault(words, 0) + 1);
				words = "";
			} else if (!(str.charAt(i) >= 33 && str.charAt(i) <= 47)) {
				words += str.charAt(i);
			}

		}
		System.out.println(map);
	}

	public static void main(String[] args) {
//		String str = "Write a java program that reads a text from the user and counts the frequency of each word in the text";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.nextLine();
		countFrequency(str);

	}

}
