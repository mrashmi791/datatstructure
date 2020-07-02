package com.practice.stack;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class StackImpl {

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
		top = top.next;

	}

	public static int top() {
		return top.data;
	}
	
	public static void search(int data) {
		Node temp = top;
		while (temp != null) {
			if(temp.data == data)  {
			System.out.println(temp.data + " is find ");
			break;
			} 
			temp = temp.next;
		}

	}

	
	public static void main(String[] args) {

		push(9);
		push(89);
		push(45);
		push(34);
		traverse();
		System.out.println();
		search(45);
		System.out.println();
		pop();
		traverse();
	}

}
