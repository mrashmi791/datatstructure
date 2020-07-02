package com.rashmi.datastructure.practice.singlylinklist;

public class ReverseList {

	static Node head;
	
	public static void addNode(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		} else {
			Node  temp= head;
			while(temp.next != null) {
				temp = temp.next;
				
			}
			temp.next = node;
		}
	}
	
	public static void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static Node reverse() {
		Node temp = head;
		Node prev = null;
		Node next = null;
		while(temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
			
		}
		head = prev;
		return head;	
	}
	
	public static Node reverseRecursively(Node head) {
		Node temp = head;
		if(head.next == null ) {
			return head;
		}
		temp = reverseRecursively(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
		
	}
	
	
	public static Node reverseLinkedList(Node node) {
//		if (node == null || node.next == null) {
//			return node;
//		}
		if(node.next == null) {
			
		}
 
		Node remaining = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		return remaining;
	}
	public static void main(String[] args) {
		addNode(6);
		addNode(8);
		addNode(22);
		addNode(66);
		addNode(18);
		addNode(2);
		print();
		System.out.println();
		reverse();
//		reverseLinkedList(head);
		print();
		
	}

}
