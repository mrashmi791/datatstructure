package com.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left ;
	Node right;
	Node(int d) {
		this.data = d;
		this.left = null;
		this.right = null;
		
	}
}
public class TreeImpl {
	public static Node root = null;
	
	public static Node insert(Node root , int d) {
		if(root == null) {
			return new Node(d);
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Node temp ;
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if(temp.left == null) {
				temp.left = new Node(d);
				break;
			} else {
				q.add(temp.left);
			}
			if (temp.right == null) {
				temp.right = new Node(d);
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

		root = insert(root,43);
		insert(root,56);
		insert(root,34);
		insert(root,33);
		insert(root,78);
		traverse(root);
		System.out.println();

		if (findElement(root, 33)) {
			System.out.println("Yes present");
		} else {
			System.out.println("Not present");
		}
		
	}

}
