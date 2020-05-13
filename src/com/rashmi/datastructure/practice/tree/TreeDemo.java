package com.rashmi.datastructure.practice.tree;

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

/*
 * Tree Data Structure Demo
 */
public class TreeDemo {
	
	public static Node root = null;
	
	public static void main(String[] args) {
		
		Node root = new Node(5);
		root.left= new Node(3);
		root.right = new Node(7);
		root.left.left= new Node(13);
		root.left.right = new Node(17);
		root.right.left = new Node(19);
		root.right.right = new Node(27);
		
		traverse(root);
//		traverse(root);
//		find(root,27);
		System.out.println();
		allMaximum(root,13);
	}
	
	private static void traverse(Node temp) {
		if(temp == null) {
			return;
		}
		traverse(temp.left);
		System.out.print(" "+ temp.data);
		traverse(temp.right);
	}

	
	private static void allMaximum(Node temp,int data) {
		if(temp == null) {
			return;
		}
		if(temp.data > data) {
			System.out.print(temp.data+" ");
		
		}
		allMaximum(temp.left,data);
		allMaximum(temp.right,data);
		
	}

	
	private static void find(Node temp,int data) {
		if(temp == null) {
			return;
		}
		find(temp.left,data);
		find(temp.right,data);
		if(temp.data == data) {
			System.out.print("\nItem Found..: "+ temp.data);
			return;
		}
	}
	
	
	
}
