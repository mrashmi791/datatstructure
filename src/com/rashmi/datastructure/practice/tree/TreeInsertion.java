package com.rashmi.datastructure.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class TreeInsertion {

	public static Node root = null;

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Node temp;
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if (temp.left == null) {
				temp.left = new Node(data);
				break;
			} else {
				q.add(temp.left);
			}
			if (temp.right == null) {
				temp.right = new Node(data);
				break;
			} else {
				q.add(temp.right);
			}
		}
		return root;

	}

	public static void traverse(Node root) {
		if (root == null) {
			return;

		}
		traverse(root.left);
		traverse(root.right);
		System.out.print(root.data + " ");
	}

	public static boolean findElement(Node root, int k) {
		if (root == null) {
			return false;
		}
		if (root.data == k) {
			return true;
		}
		boolean res1 = findElement(root.left, k);
		if (res1)
			return res1;
		boolean res2 = findElement(root.right, k);

		return res2;
	}

	public static void main(String[] args) {

		root = insert(root, 22);
		insert(root, 33);
		insert(root, 21);
		insert(root, 5);
		insert(root, 45);
		insert(root, 76);
		insert(root, 88);
		traverse(root);
		System.out.println();

		if (findElement(root, 45)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
