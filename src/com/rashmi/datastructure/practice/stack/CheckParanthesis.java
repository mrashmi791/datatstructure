package com.rashmi.datastructure.practice.stack;

import java.util.Scanner;

class StackData {
	char data;
	StackData next;

	StackData(char ch) {
		this.data = ch;
	}
}

public class CheckParanthesis {

	static StackData top = null;

	public static void push(char ch) {
		StackData new_StackData = new StackData(ch);
		if (top == null) {
			top = new_StackData;
		} else {
			new_StackData.next = top;
			top = new_StackData;
		}

	}

	public static char top() {
		if (top == null) {
			return '*';
		}
		return top.data;
	}

	public static void pop() {
		if (top == null) {
			return;
		} else {
			StackData d = top;
			top = top.next;
			d.next = null;
		}

	}

	public static boolean isEmpty() {
		return top == null;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = 0;
		for (; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				push(c);
			} else {
				switch (c) {
				case ')':
					if (top() == '(') {
						pop();
					} else {
						System.out.println("invalid String");
						return;
					}
					break;
				case '}':
					if (top() == '{') {
						pop();
					} else {
						System.out.println("invalid String");
						return;
					}
					break;

				case ']':
					if (top() == '[') {
						pop();
					} else {
						System.out.println("invalid String");
						return;
					}
					break;
				default:
					System.out.println("invalid");
					break;

				}

			}
		}

		if (i >= str.length() && isEmpty()) {
			System.out.println("valid string");
		} else {
			System.out.println("Invalid..");
		}
	}

}
