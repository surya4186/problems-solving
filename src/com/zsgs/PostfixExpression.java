package com.zsgs;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
//		String str = "545++/";
		Stack<Integer> stack = new Stack<>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 48 && c <= 57) {

				int number = Character.getNumericValue(c);
				stack.push(number);
//				System.out.println(stack);
			}else if (stack.isEmpty()) {
				break;

			} else {
				int number1 = stack.pop();
				int number2 = stack.pop();
				if (c == '+') {
					stack.push(number1 + number2);
				} else if (c == '-') {
					stack.push(number1 - number2);
				} else if (c == '*') {
					stack.push(number1 * number2);
				} else if (c == '/') {
					stack.push(number2 / number1);
				}
			}

		}

		System.out.println(stack.pop());

	}

}
