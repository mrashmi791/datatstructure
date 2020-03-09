package com.rashmi.datastructure.practice.stack;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class StackDemoBasedOnLinkedList {
	public static Node top = null;

	public static void push(int d) {
		Node node = new Node(d);

		node.next = top;
		top = node;

	}

	public static void traverse() {
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	public static void pop() {
		System.out.println(top.data);
		top = top.next;

	}

	public static int top() {
		return top.data;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements : ");
//		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			push(sc.nextInt());
//		}
		push(5);
		push(15);
		push(52);
		traverse();
		System.out.println();
		pop();
		traverse();
		System.out.println();
		push(14);
		traverse();
		System.out.println();
		System.out.println("top data : " + top());
		sc.close();
	}

}
