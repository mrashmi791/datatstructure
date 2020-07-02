package com.practice.linkedlist;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class LinkedListImpl {

	public static  Node head ;
	
	public static void create(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	public static void display () {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void delete(int d) {
		 Node temp = head, prev = null; 
	        if (temp != null && temp.data == d)  { 
	            head = temp.next;  
	            return; 
	        } 
	        while (temp != null && temp.data != d)  { 
	            prev = temp; 
	            temp = temp.next; 
	        }     
	  
	        if (temp == null)
	        	return; 
	  
	        prev.next = temp.next;
	}
	public static void main(String[] args) {
		create(4);
		create(5);
		create(9);
		create(21);
		create(32);
		create(0);
		display();
		System.out.println();
		delete(21);
		display();
		
	}

}
