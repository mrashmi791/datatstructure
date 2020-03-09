package com.rashmi.datastructure.practice.singlylinklist;

import java.util.Scanner;



class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}
public class createAndDisplay {
	
	public static Node head ;
	public static void create (int d) {
		
		Node node = new Node(d);
		if(head == null) {
			head = node;
			return;
		} else {
			node.next = head;
			head = node;
		}
		
		
	}
	
	public static void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of node which has to be created...");
		int n  = sc.nextInt();
		System.out.println("enter value: ");
		for(int i = 1; i <= n;i++) {
			int num = sc.nextInt();
			create(num);
			
		}
		
		display();
	}

}
