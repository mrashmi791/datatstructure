package com.rashmi.datastructure.practice.singlylinklist;

public class GetNthNode {

	public static Node head ;
	
	/*
	 * Add node in linkedlist...
	 */
	public static void addNode(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		} else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			
		}
	}
	
	/*
	 * Display the element of linkedlist...
	 */
	
	public static void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	/*
	 * Find and display nth node data....
	 */
	
	public static void getNthNodeInList(int k) {
		int count = 0;
		Node temp = head;
		
		while(temp != null) {
			
			
			
			if(count == k) {
				System.out.println(temp.data);
				return;
			}
			count++;
			temp = temp.next;
		}	
		
	}
	
	public static void main(String[] args) {
		addNode(8);
		addNode(22);
		addNode(66);
		addNode(18);
		addNode(2);
		addNode(6);
		display();
		System.out.println();
		getNthNodeInList(4);
		
		
	}

}
